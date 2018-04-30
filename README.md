# 设计模式的系统性学习实例-HeadFirst设计模式学习笔记

## 1-strategy：策略模式

### 1.1.继承和重写方法

- 定义抽象类Duck，将相同部分quack和swim定义成普通方法，将不同部分display定义成抽象方法。
- 具体的鸭子继承Duck，并实现display方法

### 1.2.出现新的需求：飞行

- 在Duck中定义普通方法fly
- 问题解决

### 1.3.出现新的需求：橡皮鸭、诱饵鸭

- RubberDuck继承Duck，出现问题，橡皮鸭居然在飞行！
- DecoyDuck继承Duck，出现问题，诱饵鸭居然会飞、会叫。。。

尝试解决：重写方法，虽然能够解决问题，但是会导致：

- 代码在多个子类中重复，如重写方法
- 改变父类会“牵一发而动全身”，可能会重写很多方法
- 难以得知鸭子的所有行为，如难以得知所有鸭子的飞行方式
- 运行时的行为不容易改变

### 1.4.多实现接口
将所有行为如飞行、叫等都抽象成接口如何？可以，但会有以下问题：

- 每个子类都需要注意应该实现哪个接口
- 代码在多个子类中重复
- 因为使用多实现接口，每个子类的父类方法有限，无法有效的使用多态的特性
- 难以得知鸭子的所有行为，如难以得知所有鸭子的飞行方式
- 运行时的行为不容易改变

### 1.5.策略模式

**设计原则01：找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要变化的代码混在一起**

变化的部分：fly、quack，将他们抽象出单独的类

**设计原则02：针对接口编程，而不是针对实现类编程**

针对接口编程：将飞行行为、呱呱叫行为抽象为接口；具体的飞行方式和呱呱叫方式抽象为实现类


**设计原则02：多用has-a，少用is-a==》多用组合，少用继承**

将FlyBehavior和QuackBehavior定义成鸭子的成员变量，在方法中以多态的形势调用飞行行为和呱呱叫行为

**子类继承自Duck类**

在构造函数中实例化飞行对象和呱呱叫对象==》在运行时，飞行方法和呱呱叫方法就会调用实际的方法

### 1.6.动态改变行为
新需求：出现模型鸭，初始状态不会飞，当改造之后，就能够火箭进行飞行。

在父类Duck中，通过set方法实现动态的改变行为。

### 1.7.总结

#### 1.7.1.实例总结

1. 将鸭子的可变内容抽象成一组行为，更加专业的说法是一组算法簇，即将一组可变行为抽象成一个算法簇。
2. 这些算法簇中的算法是可以相互替换的，因为他们实现了同一个接口，即一个算法IS-A算法簇的实现类。
3. 客户通过HAS-A关系，使用封装好的多种算法簇，可以十分方便地对算法进行替换。

#### 1.7.2.OO基础

- 抽象
- 封装
- 继承
- 多态

#### 1.7.3.OO设计原则

- OO设计原则01：封装变化
- OO设计原则02：针对接口编程，不针对实现类编程
- OO设计原则03：多用组合，少用继承

#### 1.7.4.策略模式

- 将需要变化的一组行为抽象成一个算法簇。
- 这组行为中的每种行为都是一种算法，这些算法之间可以相互替换。
- 客户通过组合的方式使用封装好的算法簇，当算法发生变化时，并不需要修改客户。

## 2.observer：观察者模式
以气象站为例
### 2.1.错误示例：针对实现编程

1. 定义三个普通类表示三个展示板
2. 在WeatherData中加入三个展示板作为成员变量
3. 在measurementsChanged方法中，获取气温、湿度和气压，然后依次调用3个展示板的update方法进行更新

上述做法的坏处：

1. 针对实现编程，而非接口，导致程序紧耦合
2. 对应每个新增的天气板，都需要修改WeatherData代码
3. 无法在运行时动态的管理天气板
4. 没有封装改变的部分
5. 侵犯了WeatherData类的封装
6. 将气温、湿度和气压作为三个参数传递给天气板，当观测指标发生变化时，需要修改全部的update方法
7. 虽然有三个天气板，但是这三个天气板是具有共同的特点，这里没有体现出来

### 2.2.自定义观察者模式
设计原则：为了交互对象之间的松耦合而努力

1. 针对接口编程：定义主题Subject接口和Observer接口, 主题Subject接口针对观察者Observe接口编程.
2. 将WeatherData看做一个主题，实现Subject接口；将每个天气板看做一个观察者，实现Observer接口
3. Observe接口应该定义一个update方法，方便Subject接口进行多态调用
4. WeatherData实现Subject接口，其中定义一个Observe集合，用于存放所有的观察者
5. XxxDisplay实现Observer接口，其中定义一个Subject成员变量，用于注册和取消注册
6. 将展示方法display抽象成一个接口Display

这么做的好处：

1. 针对接口编程，松耦合
2. 对应每个新增的天气板，无需修改WeatherData代码
3. 可以在运行时动态的管理天气板
4. 封装变化
5. 没有侵犯WeatherData的封装性
6. 三个天气板都实现了同样的接口，体现了抽象特性

欠缺：

1. 将气温、湿度和气压作为三个参数传递给天气板，当观测指标发生变化时，需要修改全部的update方法

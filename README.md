# 设计模式的系统性学习实例-HeadFirst设计模式学习笔记

[TOC]

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


<a href="#top">返回目录</font>
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
5. 将气温、湿度和气压作为三个参数传递给天气板，当观测指标发生变化时，需要修改全部的update方法

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

欠缺：

1. 将气温、湿度和气压作为三个参数传递给天气板，当观测指标发生变化时，需要修改全部的update方法
### 2.3.JDK内置观察者模式

1. Observable（可观察者），相当于我们自定义的主题Subject，在JDK里是一个类。
   所以我们使用内置的观察者模式时，需要继承Observable而不是实现接口。
2. Observer（观察者），与我们自定义的Observer接口类型
3. Observable（可观察者），定义了一个setChange方法，用于标记已经改变的事实，用来对状态进行更加细粒度的控制。
   例如之前的示例，如果天气只要发生一点点变化就通知所有观察者，这是无意义的。
   可能只有当天气变化较为剧烈时，才会通知观察者，这时就用到了setChanged方法，用来标记真正需要通知的消息状态。
4. Observable（可观察者），定义了notifyObservers，即通知所有观察者。
   使用这种方式是“拉取”的形式，也就是说需要观察者主动去从可观察者处拉取数据。
5. Observable（可观察者），还定义了notifyObservers(Obj)，与我们自定义的方法类似。
   使用这种方式是“推送”的形式，也就是说观察者从推送来得数据类获取数据，这种方式能够传递任意类型的数据
   
内置观察者模式缺点：

1. Observable（可观察者）是一个类，并没有履行针对接口编程，限制了复用和使用
2. setChange()方法是protected的，所以无法以组合的方式使用 Observable（可观察者），未被多用组合少用继承的原则

### 2.4.观察者模式总结

1. JDK中其他的观察者模式：Swing的组件、事件、事件监听器。
2. 设计原则：
   封装变化
   多用组合，少用继承
   针对接口编程
   为了交互行为的松耦合而努力
3. 观察者模式：以松耦合方式定义对象之间的一对多关系；这样一来，当一个对象状态改变是，多个对象都会接收到消息
4. 内置观察者模式特点：
   1. Observable（可观察者）是一个类，违背了设计原则
   2. 通过notifyObservers方法实现了“拉取”的获取消息方式；通过notifyObservers(Obj)实现了“推送”的获取消息方式
   3. 定义了setChange()方法，用于标识状态改变，更加灵活地控制发送消息的条件
   4. 有多个观察者时，通知的顺序并非按照关注的顺序进行

<a href="#top">返回目录</font>
## 3.decorator-装饰者模式-以组合咖啡为例
场景
咖啡种类：综合、深焙、低咖啡因、浓缩；配料：牛奶、摩卡、豆浆、奶泡；每种咖啡和配料都有各自的价格。
客户下单时会选择一个咖啡种类+若干个配料，如：双倍摩卡豆浆奶泡咖啡，则需要根据咖啡种类+若干个配料计算出总价钱。
### 3.1.错误设计：每种组合抽象成一个类，继承自饮料类（beverage）
造成的问题：
1. 类爆炸
2. 当某种配料或咖啡种类价格发送变化时，要修改大量的代码
3. 当新增一种配料或者咖啡种类时，又会产生大量的类
4. 违反设计原则：为了交互对象之间的松耦合而努力、封装变化







<a href="#top">返回目录</font>
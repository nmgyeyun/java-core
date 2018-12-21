package org.alpha.javabase.javase.thread;

/**
 * <p>
 *
 * @author liyazhou1
 * @date 2018/12/16
 */
public class ThreadDemo {

    /*

    进程：正在进行中的程序(直译).

    线程：就是进程中一个负责程序执行的控制单元(执行路径)

    一个进程中可以多执行路径，称之为多线程。
    一个进程中至少要有一个线程。

    开启多个线程是为了同时运行多部分代码。
    每一个线程都有自己运行的内容。这个内容可以称为线程要执行的任务。

    多线程好处：解决了多部分同时运行的问题。
    多线程的弊端：线程太多回到效率的降低。

    其实应用程序的执行都是cpu在做着快速的切换完成的。这个切换是随机的。
    JVM启动时就启动了多个线程，至少有两个线程可以分析的出来。
    1，执行main函数的线程，
            该线程的任务代码都定义在main函数中。
    2，负责垃圾回收的线程。


    如何创建一个线程呢？
    创建线程方式一：继承Thread类。
    步骤：
    1，定义一个类继承Thread类。
    2，覆盖Thread类中的run方法。
    3，直接创建Thread的子类对象创建线程。
    4，调用start方法开启线程并调用线程的任务run方法执行。
    可以通过Thread的getName获取线程的名称 Thread-编号(从0开始)
    主线程的名字就是main。


    创建线程的第二种方式：实现Runnable接口。
    1,定义类实现Runnable接口。
    2，覆盖接口中的run方法，将线程的任务代码封装到run方法中。
    3，通过Thread类创建线程对象，并将Runnable接口的子类对象作为Thread类的构造函数的参数进行传递。
        为什么？因为线程的任务都封装在Runnable接口子类对象的run方法中。
        所以要在线程对象创建时就必须明确要运行的任务。
    4，调用线程对象的start方法开启线程。
    实现Runnable接口的好处：
    1，将线程的任务从线程的子类中分离出来，进行了单独的封装。
        按照面向对象的思想将任务的封装成对象。
    2，避免了java单继承的局限性。
    所以，创建线程的第二种方式较为常用。



    死锁：常见情景之一：同步的嵌套。



    静态的同步函数使用的锁是  该函数所属字节码文件对象
    可以用 getClass方法获取，也可以用当前  类名.class 表示。

    同步函数的使用的锁是this；
    同步函数和同步代码块的区别：
    同步函数的锁是固定的this。
    同步代码块的锁是任意的对象。
    建议使用同步代码块。


    线程安全问题产生的原因：
    1，多个线程在操作共享的数据。
    2，操作共享数据的线程代码有多条。

    当一个线程在执行操作共享数据的多条代码过程中，其他线程参与了运算。
    就会导致线程安全问题的产生。

    解决思路；
    就是将多条操作共享数据的线程代码封装起来，当有线程在执行这些代码的时候，
    其他线程时不可以参与运算的。

    必须要当前线程把这些代码都执行完毕后，其他线程才可以参与运算。
    在java中，用同步代码块就可以解决这个问题。

    同步代码块的格式：
    synchronized(对象)
    {
        需要被同步的代码 ；
    }
    同步的好处：解决了线程的安全问题。
    同步的弊端：相对降低了效率，因为同步外的线程的都会判断同步锁。
    同步的前提：同步中必须有多个线程并使用同一个锁。


     */
}

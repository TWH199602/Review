## Thread 多线程
### CPU通过分时运行多个程序；（类似于FPS，通过高速切换给人一种同时运行的感觉）
### 开启多线程
Thread.currentThread().getName();
始终返回当前正在执行的线程名；
Thread.currentThread().getPriority();优先级；
Thread.sleep();休眠；//实例方法需要try/catch异常
Thread.yield();建议cpu进行线程切换；//不是强制切换；
Thread.setPriority(Thread.MAX_PRIORITY);//设置线程优先级（最大）；
Thread.join();阻塞；//顺序执行（等待）；
### 线程同步
### synchronized(对象){};//加锁，同一时间只有一个线程在运行；（临界区）
### wait();//必须出现在同步代码块内部;当满足某种条件让线程等待，不同于sleep，他不消耗计算资源；必须使用加锁的对象触发调用；
### notify();//必须出现在同步代码块内部；随即唤醒一个锁；
### notifyAll();//必须出现在同步代码块内部；唤醒全部的锁；

### 线程中断标记
Thread.currentThread().interrupt;
### isInterrupted 实例方法，返回中断标识，true 被中断 ---- false 未被中断




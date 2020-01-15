package com.yobo.yobo_kotlin.test25_XieCheng

import kotlinx.coroutines.*

/**
 * Created by ZhangBoshi
 * on 2019-12-26
 */


@ObsoleteCoroutinesApi
@InternalCoroutinesApi
fun main() {

    val job1 = GlobalScope.launch(Dispatchers.Unconfined) {
        println("job1所在的线程，name=${Thread.currentThread().name}")
        delay(1000)
        println("job1 delay后所在的线程，name=${Thread.currentThread().name}")

    }
    Thread(Runnable {
        val block = runBlocking {
            val job2 = launch(Dispatchers.Default, CoroutineStart.DEFAULT) {
                println("job2所在的线程，name=${Thread.currentThread().name}")
            }
            val job3 = launch(Dispatchers.IO) {
                println("job3所在的线程，name=${Thread.currentThread().name}")
            }
            val job4 = launch(Dispatchers.Unconfined) {
                println("job4所在的线程，name=${Thread.currentThread().name}")
                delay(1000)
                println("job4 delay后所在的线程，name=${Thread.currentThread().name}")
            }
            val job5 = launch(newSingleThreadContext("newThread1")) {
                println("job5所在的线程，name=${Thread.currentThread().name}")
            }
        }
    }).start()
}


//
//public object Dispatchers {
//    /**
//     * 它由JVM上的共享线程池支持。 默认情况下，使用的最大并行度为此调度程序的CPU内核数，但至少为两个。 
//     */
//    public actual val Default: CoroutineDispatcher = createDefaultDispatcher()
//    /**
//     * 协程分派器，仅限于使用UI对象操作的Main线程。可以直接使用此分派器，也可以通过[MainScope]工厂使用。通常，此类调度程序是单线程的。
//     */
//    public actual val Main: MainCoroutineDispatcher get() = MainDispatcherLoader.dispatcher
//    /**
//     * 不局限于任何特定线程的协程调度程序。也就是哪个线程调用了该协程，就在该线程中运行。
//     */
//    public actual val Unconfined: CoroutineDispatcher = kotlinx.coroutines.Unconfined
//    /**
//     * 这个调度器设计用于将阻塞的IO任务转移到共享线程池。将在此池中创建IO操作的线程，并根据需要将其关闭。
//     * 此调度程序使用的线程数受系统属性“ kotlinx.coroutines.io.parallelism”的值限制。
//     * 它默认为64个线程或内核数（以较大者为准）的限制。
//     */
//    public val IO: CoroutineDispatcher = DefaultScheduler.IO
//}
# Threads-In-Java #concurrency 
"In programming, concurrency is the composition of independently executing processes, while parallelism is the simultaneous 
execution of (possibly related) computations. Concurrency is about dealing with lots of things at once. Parallelism is about 
doing lots of things at once."
In soureCode contains
1.Thread Examples.
   Implements Runnable
   extends Threads

#concurrency
2.Producer Consumer Problem
The producer-consumer problem is a classic synchronization problem in concurrent programming.
it involves two processes, a producer and a consumer, who share a common buffer or queue. The producer's 
task is to generate data items and place them into the buffer, while the consumer's task is to remove and process the data items from the buffer.

To "achieve concurrency and synchronization in the producer-consumer problem", you can use " synchronization mechanisms and nter-thread " such as locks and condition variables. 
In Java, you can use the "synchronized" keyword to protect critical sections of code and ensure mutual exclusion between the producer and consumer.

Unit of Concurrency
As far as I know, concurrency has three levels:

Multiprocessing: Multiple Processors/CPUs executing concurrently. This unit here is a CPU.
Multitasking: Multiple tasks/processes running concurrently on a single CPU. The OS executes these tasks by switching between them very frequently. This unit here is a Process.
Multithreading: Multiple parts of the same program running concurrently.

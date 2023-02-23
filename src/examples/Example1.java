package examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 {

	public static void main(String[] args) {

		
		
		ExecutorService es=Executors.newFixedThreadPool(4);//creating a thread pool of 4 threads.
		for(int i=1;i<=10;i++)
		{
			//Demo d=new Demo(i);
			Runnable r=new Demo(i);//upcasting
			es.execute(r);// calling the execute method of the executorservice to allocate the task.
		}
		
		es.shutdown();
		
		while(!es.isTerminated())// the executorservice will not be terminating until we will call
									// shutdown or shutdownNow method.
		{
			System.out.println("Not Finished Working!!");
		}
		
		
		
		
		/*
		 * 
		 *   JDBC
		 *   Stream API
		 *   
		 *   Concurrency : 
		 *    The ability to run multiple programs in system in parallel to each other.
		 * 
		 * 	Process						 				Thread
		 * 1)is the heavy weighted task					light weighted process executing a specified task.
		 * 
		 * 
		 * 
		 * 
		 * java.util.concurrent package		: Java 5
		 * 
		 *  Better performance of the application because it will speed up the execution of the program.
		 * 
		 * Thread Pool : represented as  a group of threads created by the system waiting for the job to be allocated.
		 * 
		 * 
		 * Thread pool holds the worker thread.
		 * 
		 * Thread thread=new Thread();// manual : 
		 * 
		 * the threads created by the system as per the requirement are referred as WORKER THREADS.
		 * WORKER THREADS can be reused multiple times.
		 * WORKER THREADS are not destroyed after the task is finished.
		 * 
		 * firstly, system pre creates some worker threads and keep it in a (stock) Thread Pool.
		 * 2) It activates it whenever required, allocates the task and after the working.
		 * 3) keeps it back into the thread pool without destroying.
		 * 
		 *  Generally,Thread created by user is automatically destroyed by the garbage collector as the
		 *  working is finished.
		 *  
		 *  But, threads created by the system after the completion of task will be kept in the thread pool to 
		 *  get reutilised whenever required.
		 * 
		 * Executor : Executor interface located in java.util.concurrent package
		 * It will be executing the task allocated by the user.
		 * It will decide automatically that the task allocated would be executing in a new thread,
		 * in a pooled thread or the current thread.
		 * 
		 * ExecutorService :
		 * ExecutorService interface located in java.util.concurrent package
		 * We will be calling the execute() method of ExecutoerService to allocate the threads to execute the tasks.
		 * At last , we will be calling the shutdown() method of executorservice to shut the thread pool.
		 * 
		 * 
		 */

		
	}

}

//private>default>protected>public
class Demo implements Runnable
{
	int value;
	Demo(int value)
	{
		this.value=value;
	}
	
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" : "+value);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName());
		
	}
}
























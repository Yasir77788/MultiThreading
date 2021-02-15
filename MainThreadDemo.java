// This program demonstrates the Main Thread and the use of some of its object methods.
// When a Java program starts up, the main thread begins running immediately. 
// The main thread is the thread from which other “child” threads will be spawned.
// Often, the main thread must be the last thread to finish execution because it performs 
// various shutdown actions.


package multiThreadingPackage;

public class MainThreadDemo
{
	public static void main(String[] args)
	{
		// obtain a reference to the main thread object
		// by calling the method currentThread().
		// currentThread() returns a reference to the thread in which it is called.
		Thread threadObj = Thread.currentThread();
		
		// display the thread-name, its priority, and the name of its group.
		System.out.println("Current Thread is: " + threadObj);
		
		// change the internal name of the thread
		threadObj.setName("My Thread");
		System.out.println("Thread name after change is: " + threadObj);
		
		
		try
		{
			// For loop counts down from five, pausing one second between each line
			// The argument to sleep( ) specifies the delay period in milliseconds.
			for(int i = 9; i > 0; --i)
			{
				System.out.println(i);
				// The sleep() method causes the thread from which it is called to
				// suspend execution for the specified period of milliseconds.
				Thread.sleep(1000);
			}
			
		}
		// The sleep( ) method  might throw an InterruptedException, if some
		// other thread wanted to interrupt this sleeping thread.
		catch(InterruptedException e)
		{
			System.out.println("Main thread is interrupted.");
		}
	}
	
}
// This program creates a thread by implementing Runnable interface and instantiating an object of type 
// Thread. Runnable abstracts a unit of executable code. This class implement a single Runnable method 
// called run(). Inside run() the code that constitutes the thread is defined. The run() method establishes 
// the entry point for another, concurrent thread of execution within the program.

package multiThreadingPackage;

public class ChildThread implements Runnable
{
	Thread threadObj;
	
	public ChildThread()
	{
		// creating the ChildThread object
		// Passing this as the first argument indicates that you want the new thread 
		// to call the run() method on this object.
		threadObj = new Thread(this, "Demo Thread");
		System.out.println("Child Thread: " + threadObj);
	}
	
	// run() is the entry point for the new thread (child thread)
	public void run()
	{
		// For loop counts down from five, pausing one second between each line
		// The argument to sleep( ) specifies the delay period in milliseconds.
		try
		{
			for(int i = 5; i > 0; --i)
			{
				System.out.println("Child thread " + i);
				// The sleep() method causes the thread from which it is called to
				// suspend execution for the specified period of milliseconds.
				Thread.sleep(500);
			}
		}
		
		// The sleep( ) method  might throw an InterruptedException, if some
		// other thread wanted to interrupt this sleeping thread.
		catch(InterruptedException e)
		{
			System.out.println("Child thread is interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
	
	
	
	
}

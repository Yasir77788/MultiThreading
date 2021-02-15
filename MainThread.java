package multiThreadingPackage;

public class MainThread
{
	public static void main(String[] args)
	{
		// create the child thread object
		ChildThread childThreadObj = new ChildThread();
		
		// call start() method to initiates a call to run() of the child thread.
		childThreadObj.threadObj.start();
		
		try
		{
			for(int i = 5; i > 0; --i)
			{
				System.out.println("Main thread " + i);
				// The sleep() method causes the thread from which it is called to
				// suspend execution for the specified period of milliseconds.
				// the main thread will sleep longer the child thread, so it finishes execution 
				// after the child thread
				Thread.sleep(1000);
			}
		}
		
		// The sleep( ) method  might throw an InterruptedException, if some
		// other thread wanted to interrupt this sleeping thread.
		catch(InterruptedException e)
		{
			System.out.println("Main thread is interrupted.");
		}
		System.out.println("Main thread exiting...");
	}
}

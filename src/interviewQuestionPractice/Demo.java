package interviewQuestionPractice;

public class Demo implements Runnable{
	public void run() {
		System.out.println("run  method");
		
	}
	public static void main(String[] args) {
	//	System.out.println("main method");
		Demo demo=new Demo();
		Thread thread =new Thread(demo);
		demo.setDaemonThread();
		thread.start();
		
	}
	private void setDaemonThread() {
		// TODO Auto-generated method stub
		
	}
}
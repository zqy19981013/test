package p6;

public class test {
	
	public static void main(String[] args){
		Thread t1=new YieldThread("�߳�A");
		Thread t2=new YieldThread("�߳�B");
		t1.start();
		t2.start();
	}
}

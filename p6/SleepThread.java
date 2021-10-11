package p6;

public class SleepThread implements Runnable {
public void run() {
	for(int i=0;i<=5;i++) {
		if(i==2) {
			
			//在调用Sleep（）方法时，要么throws Exception声明异常，要么就抛出异常try-catch
			try {
				Thread.sleep(2000);//调用线程方法
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
     	}
		System.out.println("线程一正在输出"+i);
		try {
			Thread.sleep(500);//调用线程方法
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
	}

}

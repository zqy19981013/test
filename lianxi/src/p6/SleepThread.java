package p6;

public class SleepThread implements Runnable {
public void run() {
	for(int i=0;i<=5;i++) {
		if(i==2) {
			
			//�ڵ���Sleep��������ʱ��Ҫôthrows Exception�����쳣��Ҫô���׳��쳣try-catch
			try {
				Thread.sleep(2000);//�����̷߳���
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
     	}
		System.out.println("�߳�һ�������"+i);
		try {
			Thread.sleep(500);//�����̷߳���
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
	}

}

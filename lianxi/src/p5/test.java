package p5;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���������ڲ�����Ϊ�������ݸ�Cat()����
		Cat(new Animal() {
			//ʵ��shout()����
			public void shout() {
				System.out.println("�����ڲ���");
			}
		});
	}

	public static void Cat(Animal an) {
		an.shout();//���ô������an��shout����

	}
}

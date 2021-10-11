package p5;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义匿名内部类作为参数传递给Cat()方法
		Cat(new Animal() {
			//实现shout()方法
			public void shout() {
				System.out.println("匿名内部类");
			}
		});
	}

	public static void Cat(Animal an) {
		an.shout();//调用传入对象an的shout方法

	}
}

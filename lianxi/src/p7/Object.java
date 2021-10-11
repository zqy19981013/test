package p7;

public class Object {
	/*
	 * 构造方法： public Object() 
	 * 成员方法： int hashCode()：返回对象的哈希码值
	 * Class<?>getHashCode():返回该调用者的字节码文件对象。
	 *  String toString():返回该对象的字符串表示形式。
	 * boolean equals():比较两个对象是否相等 
	 * 注意：java.lang下的类可以直接使用，不需要导包。
	 *
	 */
	public static void main(String[] args) {
		// 非静态方法的调用方式： 通过对象名.方法名
		// 1.创建Object类的对象
		Object obj1 = new Object();
		Object obj2 = new Object();
		// 2.测试Object类中的成员方法
		// int hashCode()：返回对象的哈希码值,
		int code1 = obj1.hashCode();
		int code2 = obj2.hashCode();
		System.out.println(code1);
		System.out.println(code2);
		System.out.println("--------------");
		// Class<?>getHashCode():返回该调用者的字节码文件对象。一个类只有一个文件码对象。
		Class<? extends Object> cla1 = obj1.getClass();
		Class<? extends Object> cla2 = obj1.getClass();
		System.out.println(cla1);
		System.out.println(cla2);
		System.out.println("--------------");
		//String toString():返回该对象的字符串表示形式。默认打印的是地址值，但是不同对象的地址值肯定不同
	    //地址值的组成：全类名+@+该对象的哈希码的无符号十六进制。
		String s1=obj1.toString();
		String s2=obj2.toString();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("--------------");
		// boolean equals():比较两个对象是否相等
		boolean e1=obj1.equals(obj2);
		System.out.println(e1);
		
	}

}

package p7;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建Scanner对象，（导包），System.in：输入流，正常键盘输入流
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个字符串：");
		String st = sc.nextLine();// 结束标记是换行符
		System.out.println("字符串为" + st);
		String st1 = sc.next();// 结束标记是空格符
		System.out.println("字符串为" + st1);
	}

}

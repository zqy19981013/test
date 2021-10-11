package p7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;

public class SystemDoem {

	public static void main(String[] args) {

		// 获取当前系统属性
		Properties p1 = System.getProperties();
		System.out.println(p1);
		System.out.println("-------");
		int[] num1 = { 1, 2, 3, 4 };
		int[] num2 = new int[num1.length];
		// 参数：（数组1，源数组的起始位置，目标数组，目标数组的起始位置，长度）
		System.arraycopy(num1, 0, num2, 0, num1.length);
		System.out.println(Arrays.toString(num2));
		System.out.println("----");
		// 获取当前系统的时间
		// 需要掌握的获取时间的非常重要
		Date date = new Date(System.currentTimeMillis());
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		String s = df.format(date);
		System.out.println(s);
	}

}

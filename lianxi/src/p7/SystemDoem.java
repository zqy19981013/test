package p7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;

public class SystemDoem {

	public static void main(String[] args) {

		// ��ȡ��ǰϵͳ����
		Properties p1 = System.getProperties();
		System.out.println(p1);
		System.out.println("-------");
		int[] num1 = { 1, 2, 3, 4 };
		int[] num2 = new int[num1.length];
		// ������������1��Դ�������ʼλ�ã�Ŀ�����飬Ŀ���������ʼλ�ã����ȣ�
		System.arraycopy(num1, 0, num2, 0, num1.length);
		System.out.println(Arrays.toString(num2));
		System.out.println("----");
		// ��ȡ��ǰϵͳ��ʱ��
		// ��Ҫ���յĻ�ȡʱ��ķǳ���Ҫ
		Date date = new Date(System.currentTimeMillis());
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		String s = df.format(date);
		System.out.println(s);
	}

}

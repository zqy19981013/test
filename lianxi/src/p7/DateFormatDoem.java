package p7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDoem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����import java.util.Date;
		// �������ڶ���
		Date date = new Date();
		// ͨ��DateFormat������SimpleDateFormat����ȡ������ʽ����
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		// ͨ������DateFormat����format��������ʽ��Date����
		String s = df.format(date);
		System.out.println(s);
	}

}

package p7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDoem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 导包import java.util.Date;
		// 创建日期对象
		Date date = new Date();
		// 通过DateFormat的子类SimpleDateFormat来获取完整格式日期
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		// 通过调用DateFormat最后的format方法来格式化Date对象
		String s = df.format(date);
		System.out.println(s);
	}

}

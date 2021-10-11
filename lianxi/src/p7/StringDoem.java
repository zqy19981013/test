package p7;

public class StringDoem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "adbcdefg  ";
		String str1 = "ad bc";
		// 分割成若干字符串
		String[] st = str1.split("");
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
		// 从第3个截取到末尾的结果
		System.out.println("返回一个新字符串：" + str.substring(3));
		// 从第3个开始截取到第6位结束的结果，不包含6
		System.out.println("返回一个新字符串：" + str.substring(3, 6));
		// System.out.println("比较两个字符：" + str.equals(str1));
		// System.out.println("字符串长度为0返回：" + str.isEmpty());
		// System.out.println("判断字符串是否与指定的字符开头：" + str.startsWith("adbc"));
		// System.out.println("判断是否与指定的字符结尾：" + str.endsWith("fg"));
		// System.out.println("判断字符串是否包含指定序列：" + str.contains("e"));
		// System.out.println("返回一个新的字符串" + str.replace("dbc", " bcd"));
		// System.out.println("去除原字符串首尾两端的空格：" + str.trim());
		// System.out.println("转换为大写字母：" + str.toUpperCase());
		// System.out.println("转换小写字母：" + str.toLowerCase());
		// System.out.println("返回int参数的字符串形式：" + String.valueOf(7));
		// char a[] = str.toCharArray();
		// System.out.println("将字符串转换成字符组：" + a[1]);
		// System.out.println("数组的长度为：" + str.length());
		// System.out.println("字符串中最后出现的索引：" + str.lastIndexOf('d'));
		// System.out.println("返回字符串index位置上的字符：" + str.charAt(0));
		// System.out.println("字符串第一次出现的索引：" + str.indexOf('c'));
	}

}

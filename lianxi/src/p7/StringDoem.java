package p7;

public class StringDoem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "adbcdefg  ";
		String str1 = "ad bc";
		// �ָ�������ַ���
		String[] st = str1.split("");
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
		// �ӵ�3����ȡ��ĩβ�Ľ��
		System.out.println("����һ�����ַ�����" + str.substring(3));
		// �ӵ�3����ʼ��ȡ����6λ�����Ľ����������6
		System.out.println("����һ�����ַ�����" + str.substring(3, 6));
		// System.out.println("�Ƚ������ַ���" + str.equals(str1));
		// System.out.println("�ַ�������Ϊ0���أ�" + str.isEmpty());
		// System.out.println("�ж��ַ����Ƿ���ָ�����ַ���ͷ��" + str.startsWith("adbc"));
		// System.out.println("�ж��Ƿ���ָ�����ַ���β��" + str.endsWith("fg"));
		// System.out.println("�ж��ַ����Ƿ����ָ�����У�" + str.contains("e"));
		// System.out.println("����һ���µ��ַ���" + str.replace("dbc", " bcd"));
		// System.out.println("ȥ��ԭ�ַ�����β���˵Ŀո�" + str.trim());
		// System.out.println("ת��Ϊ��д��ĸ��" + str.toUpperCase());
		// System.out.println("ת��Сд��ĸ��" + str.toLowerCase());
		// System.out.println("����int�������ַ�����ʽ��" + String.valueOf(7));
		// char a[] = str.toCharArray();
		// System.out.println("���ַ���ת�����ַ��飺" + a[1]);
		// System.out.println("����ĳ���Ϊ��" + str.length());
		// System.out.println("�ַ����������ֵ�������" + str.lastIndexOf('d'));
		// System.out.println("�����ַ���indexλ���ϵ��ַ���" + str.charAt(0));
		// System.out.println("�ַ�����һ�γ��ֵ�������" + str.indexOf('c'));
	}

}

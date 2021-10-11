package p7;

public class Object {
	/*
	 * ���췽���� public Object() 
	 * ��Ա������ int hashCode()�����ض���Ĺ�ϣ��ֵ
	 * Class<?>getHashCode():���ظõ����ߵ��ֽ����ļ�����
	 *  String toString():���ظö�����ַ�����ʾ��ʽ��
	 * boolean equals():�Ƚ����������Ƿ���� 
	 * ע�⣺java.lang�µ������ֱ��ʹ�ã�����Ҫ������
	 *
	 */
	public static void main(String[] args) {
		// �Ǿ�̬�����ĵ��÷�ʽ�� ͨ��������.������
		// 1.����Object��Ķ���
		Object obj1 = new Object();
		Object obj2 = new Object();
		// 2.����Object���еĳ�Ա����
		// int hashCode()�����ض���Ĺ�ϣ��ֵ,
		int code1 = obj1.hashCode();
		int code2 = obj2.hashCode();
		System.out.println(code1);
		System.out.println(code2);
		System.out.println("--------------");
		// Class<?>getHashCode():���ظõ����ߵ��ֽ����ļ�����һ����ֻ��һ���ļ������
		Class<? extends Object> cla1 = obj1.getClass();
		Class<? extends Object> cla2 = obj1.getClass();
		System.out.println(cla1);
		System.out.println(cla2);
		System.out.println("--------------");
		//String toString():���ظö�����ַ�����ʾ��ʽ��Ĭ�ϴ�ӡ���ǵ�ֵַ�����ǲ�ͬ����ĵ�ֵַ�϶���ͬ
	    //��ֵַ����ɣ�ȫ����+@+�ö���Ĺ�ϣ����޷���ʮ�����ơ�
		String s1=obj1.toString();
		String s2=obj2.toString();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("--------------");
		// boolean equals():�Ƚ����������Ƿ����
		boolean e1=obj1.equals(obj2);
		System.out.println(e1);
		
	}

}

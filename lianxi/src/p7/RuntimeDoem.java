package p7;

import java.io.IOException;

public class RuntimeDoem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����Runtime��ʵ������
		Runtime run = Runtime.getRuntime();
		// �򿪼��±�
		try {
			run.exec("notepad.ext");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

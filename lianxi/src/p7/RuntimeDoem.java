package p7;

import java.io.IOException;

public class RuntimeDoem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建Runtime的实例对象
		Runtime run = Runtime.getRuntime();
		// 打开记事本
		try {
			run.exec("notepad.ext");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.biz.grade;

import java.io.*;

public class GradeExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameFile = "src/com/biz/grade/영어이름들.txt";

		FileReader fr;
		BufferedReader buffer;

		try {
			fr = new FileReader(nameFile);
			// FileReader로 읽은 데이터를 String형으로
			// 변호나시켜서 읽기 위한 클래스
			buffer = new BufferedReader(fr);

			while (true) {
				String strLine = buffer.readLine();
				if (strLine == null) {
					break;
				}
				System.out.println(strLine);
			}
			// 코드 자체가 end 되는 부분
			// buffer.close(); , fr.close()하지 않아도 문제가 없다.
			// (읽기만해서?)
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

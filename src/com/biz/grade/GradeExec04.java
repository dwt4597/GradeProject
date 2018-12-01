package com.biz.grade;

import java.io.*;
import java.util.*;

//열혈자바 : 730,810쪽 Stream은 나중에 네트워크 배우면서 배움. fileReader, filewriter와 사용법은 비슷?같음

public class GradeExec04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[200];

		String nameFile = "src/com/biz/grade/영어이름들.txt";

		FileReader fr;
		BufferedReader buffer;

		try {
			fr = new FileReader(nameFile);
			buffer = new BufferedReader(fr);
			for (int i = 0; i < names.length; i++) {
				String nameLine = buffer.readLine();
				if (nameLine == null) {
					break;
				}
				names[i] = nameLine;
			} // 배열에 담기
				// 담긴 배열 이후에, 파일 읽기를 끝내고, 다른 코드를 계속 실행해야 할 경우
				// 가급적(원칙적으로) buffer와 fr을 close()한다.
			buffer.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // try end
		
		int namesC = names.length;
		int intIndex = (int)(Math.random() * namesC);
		
		System.out.println("다음 제시된 단어를 입력하시오 ");
		System.out.println(names[intIndex]);
		
		Scanner scanner = new Scanner(System.in);
		String inputName = scanner.nextLine();
		
		if(names[intIndex].contains(inputName)) {
			System.out.println("맞았습니다.");
		}
		
	}
}
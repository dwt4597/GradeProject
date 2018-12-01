package com.biz.grade;

import java.io.*;
import java.util.*;

//열혈자바 : 730,810쪽 Stream은 나중에 네트워크 배우면서 배움. fileReader, filewriter와 사용법은 비슷?같음

public class GradeExec05 {

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
			// =============================================================================
			// names 배열의 임의의 위치에 있는 문자열을
			// :을 기준으로 잘라서
			// 우리말 이름을 보여주고
			// 영어이름을 입력받아
			// 맞추는 코드를 작성하시오.

		int namesC = names.length;
		int intIndex = (int) (Math.random() * namesC);

		String[] NaNum = names[intIndex].split(":");
		// NaNum [0] = 숫자
		// NaNum [1] = 영문자
		// NaNum [2] = 우리말

		// System.out.println("영어이름 : " + Eng[1]);
		try {
			System.out.println("우리말 이름 ㅡ>" + NaNum[2]);
			Scanner scanner = new Scanner(System.in);
			String inputName = scanner.nextLine();
			if (NaNum[1].equalsIgnoreCase(inputName)) {
				System.out.println("맞았다.");
			} else {
				System.out.println("틀렸다.");
				System.out.println(names[intIndex]);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("오류남");
		}

		// if (names[intIndex].contains(inputName)) {
		// System.out.println("맞았습니다.");
		// }
		// ==============================================================================
	}
}
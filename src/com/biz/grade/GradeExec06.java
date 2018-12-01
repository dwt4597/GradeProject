package com.biz.grade;

import java.io.*;
import java.util.*;

import com.biz.grade.vo.*;

public class GradeExec06 {

	/*
	 * 영어이름들.txt 파일을 읽어서 각 라인을 :을 기준으로 자른 후, sVO 리스트에 추가하시오. (1:Korea:대한민국)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameFile = "src/com/biz/grade/영어이름들.txt";

		List<StudentVO> sVO = new ArrayList();
		FileReader fr;
		BufferedReader buffer;

		try {
			fr = new FileReader(nameFile);
			buffer = new BufferedReader(fr);

			while (true) {
				String strline = buffer.readLine();
				if (strline == null) {
					break;
				}
				String[] strlines = strline.split(":");
				if (strlines.length > 2) {
					// 문서에 38:Adamm:
					// 같이 비어있는것도 있다.
					// ==3은 , 2,1,4는 오류나니 부등호로
					StudentVO vo = new StudentVO();
					vo.setStrNum(strlines[0]);
					vo.setStrEngName(strlines[1]);
					vo.setStrKorName(strlines[2]);
					sVO.add(vo);
				}

			}
			buffer.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (StudentVO vo : sVO) {
			System.out.println(vo);
		}
	}
}

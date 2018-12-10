package com.biz.gradeclasses;

import java.util.*;

import com.biz.grade.vo.*;

public class GradeReader02 {

	private String nameFile = "src/com/biz/grade/우리말이름.txt";

	//선언
	List<StudentVO> stList;

	// 생성자
	// 리턴값(void. int, String)이 없는 method
	// 외부에서 클래스를 사용해서 객체를 생성할 때
	// 호출되는 method이다.
	// ex) GradeReader02 g = new GradeReader02();

	public GradeReader02() {

	}

	// 2번째 생성자
	// nameFile이라는 String형 매개변수를 갖는다.
	// GradeReader02 g = new GradeReader02("우리말.txt");이런 형식으로 호출이됨
	// 외부에서 파일 이름을 전달해서
	// 파일이름에 구속되지 않는 클래스를 만들기 위한
	// 방법이다.
	public GradeReader02(String nameFile) {
		this.nameFile = nameFile;
		this.stList = new ArrayList();
	}
	
	//Test를 위한 method
	public void makeNames() {
		stList = new ArrayList();
		StudentVO vo = new StudentVO();
		vo.setStrKorName("홍길동");
		
		stList.add(vo);
	}
}

package com.biz.grade;

import java.io.*;
import java.util.*;

import com.biz.grade.vo.*;
import com.biz.gradeservice.*;

public class GradeExec08 {

	/*
	 * 영어이름들.txt 파일을 읽어서 
	 * 각 라인을 :을 기준으로 자른 후, 
	 * sVO 리스트에 추가하시오. (1:Korea:대한민국)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceClass serv = new ServiceClass();
		serv.makesplit();
		serv.makescore();
		serv.spso();
	}
}

package com.biz.controller;

import java.util.ArrayList;
import java.util.List;

import com.biz.model.ScoreVO;

public class ScoreExec_04 {

	public static void main(String[] args) {

		List<ScoreVO> scList=new ArrayList<ScoreVO>();
		
		scList.add(new ScoreVO("1", 90, 70, 94));
		scList.add(new ScoreVO("2", 85, 80, 58));
		scList.add(new ScoreVO("3", 95, 40, 75));
		scList.add(new ScoreVO("4", 96, 90, 47));
		scList.add(new ScoreVO("5", 97, 80, 98));
		scList.add(new ScoreVO("6", 94, 54, 48));
		
		int scLen =scList.size();
		for(int i=0;i<scLen;i++) {
			// scList의 i위치에 담긴 주소 복사
			ScoreVO vo= scList.get(i);
			
			int intTotal= vo.getKor();
			intTotal+=vo.getEng();
			intTotal+=vo.getMath();
			
			vo.setTotal(intTotal);
			vo.setAcerage(intTotal/3);
		}
		for(ScoreVO vo:scList) {
			System.out.println(vo.toString());
		}
	}

}

package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

    	List<Goods> gArray = new ArrayList<Goods>();	//중복o순서o 배열
    	
    	Scanner sc = new Scanner(System.in);

    	
    	
    	
    	
    	System.out.println("상품을 입력해주세요. (종료 q)");
    	while(true) {
    		String str = sc.nextLine();	//값 입력 nextLine은 줄단위로 입력받음
    		if(str.equals("q")) {
    			System.out.println("[입력완료]");
    			System.out.println("======================================");
    			break;				//true면 멈춘다.
    		}else {					//true가 아닌경우
    			String [] sArray = str.split(",");	// 줄단위로 입력받은 값을 , 로 구분하여 sArray에 담는다.
    			int price = Integer.parseInt(sArray[1]);	//입력받은 sArray의 값을 Integer로 형변환한다.
    			int count = Integer.parseInt(sArray[2]);	//입력받은 sArray의 값을 Integer로 형변환한다.
			gArray.add( new Goods(sArray[0], price, count) );	//sArray의 배열에 값을 Goods객체에 넣음
    		}
    	}
    	
    	int sum = 0;
    	
    	for(int i = 0; i < gArray.size(); i++) {
    		System.out.println(gArray.get(i));
    		sum += gArray.get(i).getCount();
    		
    	}
    	System.out.println("모든 상품의 갯수는 " + sum + "개 입니다.");
    	
    	
    	
    	
    	
    	sc.close();
    }

}

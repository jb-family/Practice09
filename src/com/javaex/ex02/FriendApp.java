package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	
    	List<Friend> fArray = new ArrayList<Friend>();
    	String name;
    	String hp;
    	String school;
    	
    	for(int i = 0; i < 3; i++) {
    		name = sc.next();
    		hp = sc.next();
    		school = sc.next();
    		
    		fArray.add(new Friend(name, hp, school));	//add로 객체생성하면 배열생성됨.
    	}
    	
    	for(Friend info : fArray) {
    		System.out.println(info.toString());
    	}
    		
    
    	
    	
    	
    	
    	
    	
    	sc.close();
    }

}

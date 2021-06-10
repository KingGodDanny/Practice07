package com.javaex.ex02;

public class Duck extends Bird {

	//필드--------------------------------------------------------
	

	
	//생성자-----------------------------------------------------
	
	
	
	//메소드(게터세터)--------------------------------------------
		
		
	//메소드(일반)---------------------------------------------------
	
    public void sing() {
    	System.out.println("오리(" + getName() + ")가 소리내어 웁니다.");
    
    }

    public void fly() {
    	System.out.println("오리(" + getName() + ")가 날지 않습니다..");
    }
    
    public void showName() {
    	System.out.println("오리의 이름은 " + getName() + "입니다.");
    }

}

//겟네임으로 한 이유는 private String name가 부모의 필드명이고 부모는 스스로 본인의 객체를
//생성할수 없기때문에 자식이 super.getName과  setName을 이용하여 값을 받고 그것을 부모자식의
//같은 메소드를 이용하여 출력하기 위함이다.
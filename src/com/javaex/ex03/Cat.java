package com.javaex.ex03;

public class Cat implements Soundable {

	public String sound() {
		return "야옹";		
	}
	
}


//인터페이스 클래스인 Soundable.java에 public String sound(제목만 가능!);가 
//코딩되어있고 그것들을 임플리먼트한 동물들도 똑같이 public String sound(파라미터도 동일)
//넣어줘야한다.

//리턴값이 없을경우 public void sound지만 String이기 때문에 return하고 문자열을 넣어줘야한다.
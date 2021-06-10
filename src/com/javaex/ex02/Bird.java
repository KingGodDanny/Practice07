package com.javaex.ex02;

public abstract class Bird {
	
	//필드
    private String name;
    
    //생성자
    public Bird() {
		
	}

	public Bird(String name) {
		
		this.name = name;
	}

	
	//메소드겟터셋터
	protected String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//메소드일반
	
	public abstract void sing();
	
	public abstract void fly();
	
	public abstract void showName();
}

//추상클래스는 필드를 생성하고 메소드를 생성할수 있지만
//스스로의 객체는 만들수 없다. 

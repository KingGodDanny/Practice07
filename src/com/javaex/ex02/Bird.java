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

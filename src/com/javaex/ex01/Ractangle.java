package com.javaex.ex01;

public class Ractangle extends Shape{
	
	private int width;
	private int height;
	
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	
	
	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}

	//시선이 부모쪽만 열려있기때문에 값을 변경하여 다운캐스팅을 하기위해서 메소드 겟터셋터 넣어주었다.

	public void draw() {
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");                                                                        
	}
		
	

}

//public class Ractangle extends Shape{
//	
//	private int width;
//	private int height;
//	
//	public Ractangle(String fillColor, int width, int height){
//		super(fillColor);
//		this.width=width;
//		this.height=height;
//	}
//	
//	public void showInfo(){
//		System.out.println("[사각형]#면색:" +super.fillColor+ " "
//				+ " #가로:" + width 
//				+" #세로:" + height + "그렸습니다.");                                                                        
//	}
		

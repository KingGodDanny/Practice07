package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

//		Shape s = new Shape("빨강");
//		이걸 지우는 이유는 추상화인 부모클래스가 abstract를 가지고 추상클래스가 
//		되버리면 부모는 자식에게 다 물려줘버리고 힘이없어 자신을 사용할수없게된다.
//		그리고 부모와 자식모두 그 메소드를 가지고있어야 오류나지않고
//		부모에게 시선이 가있지만 자식의 메소드를 출력할수있게된다.
		
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
		
		
		
		
		//sr1을 그리는 메소드 호출
		
		((Ractangle)sr1).setWidth(12);  //다운캐스팅을 이용하여 가로와 세로의 값을 변경하고
		((Ractangle)sr1).setHeight(10);
		sr1.draw();						//시선을 부모인 Shape로 향하지만 섞어쓰기 오버라이딩으로 인해 Rectangle의 draw를 그릴수 있게된다.
		
		//sr1의 가로크기 출력
		
		
		System.out.println("sr1의 가로는 " + ((Ractangle)sr1).getWidth() + " 입니다.");
		
		
	}
}

	
//public class ShapeApp {
//
//	public static void main(String[] args) {
//
//		Shape s = new Shape("빨강");
//		Circle c1 = new Circle("녹색", 10);
//		Ractangle r1 = new Ractangle("빨강", 4, 4);
//		Shape sr1 = new Ractangle("빨강", 4, 4);
//		
//		
//		
//		//sr1을 그리는 메소드 호출
//		
//
//		
//		//sr1의 가로크기 출력
//		
//		
//	}
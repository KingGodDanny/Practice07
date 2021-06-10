package com.javaex.ex03;

public class SoundApp {

    public static void main(String[] args) {
        printSound( new Cat() );
        printSound( new Dog() );
        printSound( new Sparrow() );
        printSound( new Duck() );
    }

    public static void printSound( Soundable soundable ) {
        
    	System.out.println(soundable.sound());
    	
    }
    
}

// 위의 메인메소드에서 printSound( new Cat() );는 결국
//printSound( Cat c = new Cat();) 일것이고 같은 클래스안에서 메소드에서 
//메소드를 불러오는 상황인것같다. 

//1-> 밑에 메소드 printSound가 위의 메인메소드안에
//2-> printSound를 호출할것이고 그 메소드안에 new 된 동물들이 담길것이고 
//3-> 그것들을 인터페이스Soundable의 변수 soundable에 담을것이다
//4->그리고 시선은 부모 but 자식들의 sound메소드를 출력하여라.
//5->같은 클래스에 메소드가 다른메소드안에 담겨 호출되고 하는일들이 Static으로 인하여
//   스택 위의 구간인 스태틱구간에 올라가있기 때문인것같다.
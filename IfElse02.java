package jb01.part07;

/*
	1. 조건연산자 연습
	2. 분기문 if-else연습
	3. AND : & , && 연산자
	4. OR : |, || 연산자
*/

public class IfElse02{
    public static void main(String[] args){
        int x=1, y=2;

        // & --> and 연산자
        if(x==3 & y==2){
            System.out.println("x=1이고 y=2입니다.");
        }
        // | --> or 연산자
        if(x==1 | y==3){
            System.out.println("x=1이거나 y=3입니다.");
        }
        // && --> and 연산자
        if(x==3 && y==2){
            System.out.println("x=1이고 y=2입니다.");
        }
        // || --> or 연산자
        if(x==1 || y==3){
            System.out.println("x=1이거나 y=3입니다.");
        }
		/* 1. &&와 &, ||와 |는 수행결과는 같으나
			2. 내부적으로는 엄격히 다르다.
				--> &와 |는 : 전부수행
				--> &&와 ||는 : 전자가 결과를 에측 가능할 경우 일부 수행하지 않음
		*/

    }
}
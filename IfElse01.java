package jb01.part07;

/*
	1. 비교연산자 연습
	2. 분기문 if - else 연습
*/

public class IfElse01{
    public static void main(String[] args){
        boolean b1= true;
        boolean b2;

        b2 = !b1;
        int x =1;
        int y =2;

        //if-else같이 쓴 경우
        //if(조건문) <- 조건문은 반드시 boolean type data를 사용
        if(x<y){
            //if(0){ <-- 코멘트 풀고 컴파일 에러 확인해보기
            System.out.println("x = " + x + ", y = " + y + " y가 크네요");
        } else {
            System.out.println("x = " + x + ", y = " + y + " x가 크네요");
        }

        x=y;
        //if문 단독 사용
        if(x==y){
            // if(x=y){ <--코멘트 풀고 컴파일 에러 확인해보기
            System.out.println("x = " + x + ", y = " + y + " x,y는 같아요");
        }

        //if - elseif 사용의 경우
        if(b2){
            System.out.println("if의 조건문이 b2=false 입니다.");
        } else if(b1){
            System.out.println("if의 조건문이 b1=true 입니다.");
        }
    }
}
package jb01.part06;
/*
	1. ++, -- : 증가, 감 연선자
	2. % : 나머지 연산자
	3. 3항 연산자
*/

public class OperatorTest{
    public static void main(String[] args){
        int value =1;

        value ++;
        System.out.println(value);
        ++value ;
        System.out.println(value);

        value --;
        System.out.println(value);
        --value ;
        System.out.println(value);

        //증가감소연산자 사용 --> 코멘트를 풀면서 출력결과를 확인
        int temp = value++; // temp = value++ 의미 : value의 값을 temp 대입 후 자기자신 1증가
        // int temp = value--; // temp = value-- 의미 : value의 값을 temp 대입 후 자기자신 1감소
        // int temp = ++value; // temp = value++ 의미 : value의 값을 자기자신 1증가 후 temp 대입
        // int temp = --value; // temp = value++ 의미 : value의 값을 자기자신 1감소 후 temp 대입
        System.out.println("temp : " + temp);
        System.out.println("value : " + value);
        //나머지 연산자 사용
        int temp01 = 5%2, temp02 = 5%3;
        System.out.println("나머지 연산자 5%2 -->" + temp01);
        System.out.println("나머지 연산자 5%3 -->" + temp02);

        //삼항연산자 :: (조건)? 조건이 참일때 : 조건이 거짓일때;
        int temp03 = (1<=2) ? 3:4;
        System.out.println("삼항연산자 : (1<=2) ? 3:4 --> " + temp03);
        // int temp04 = (1=< 2) ? 3: 4; <--compile error 확인
    }
}

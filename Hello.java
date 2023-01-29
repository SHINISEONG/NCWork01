//package jb01.part02;

public class Hello
{
    public static void main(String[] args){
        System.out.println("Hello Java :: 안녕 자바");
    }
}

/*
	<<주의사항 및 약속사항>>
	1. class name 과 file name은 동일해야 한다.(대소문자 구분)
		ex) public class Hello면 --> Hello.java (File name)
	2. 대소문자를 구별
	3. 실행시 public static void main(String[] args)필요
	4. System.out.println(~~~); --> ~~~ 출력
	5. Hello.java 컴파일 후 Hello.class(ByteCode) 생성 확인

	<<Consonle에서 compile & run>>
	2. compile
		1) file 저장 디렉토리 이동 후 javac [확장자 포함 file name]
			c:\work>javac Hello.java
		2) classfile 생성확인 (Hello.class)
			c:\work>dir

	3. run
		3) class확장자를 제외한 FileName
			c:\work>java Hello(.class<-생략)

			<<EditPlus 환경설정 : 컴파일, 실행등록하기>>
			-->문서/영구적 설정에서 등록할 수 있음.
 */
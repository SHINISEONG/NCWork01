//package jb03.part08;

public class User03 
{
	///field
	String name;
	int javaLevel;


	public User03(){
		System.out.println("나는 기본 생성자 내용을 아무것도 안넣을때만 내가 등장하지 MAN~~");
		name = "홍길동";
		javaLevel = 9;
	}


	public User03(String str){
		System.out.println("나는 String을 인자로 받아 name을 초기화 하는 생성자");
		name = str;
	}
	
	public User03(int i){
		System.out.println("나는 int를 인자로 받아 javaLevel을 초기화 하는 생성자");
		javaLevel = i;
	}

	public User03(String str, int i){
		System.out.println("나는 String과 int를 인자로 받아 name, javaLevel을 초기화 하는 생성자");
		name = str;
		javaLevel = i;
	}

	public String getName(){
		return name;
	}
	public int getJavaLevel(){
		return javaLevel;
	}
///Main Method
	public static void main(String[] args) 
	{
		System.out.println("=======================");
		User03 user01 = new User03();
		System.out.println("name : " + user01.getName());
		System.out.println("javaLevel : " + user01.getJavaLevel());

		System.out.println("=======================");
		User03 user02 = new User03("신희성");
		System.out.println("name : " + user02.getName());
		System.out.println("javaLevel : " + user02.getJavaLevel());

		System.out.println("=======================");
		User03 user03 = new User03(1);
		System.out.println("name : " + user03.getName());
		System.out.println("javaLevel : " + user03.getJavaLevel());

		System.out.println("=======================");
		User03 user04 = new User03("신희성",1);
		System.out.println("name : " + user04.getName());
		System.out.println("javaLevel : " + user04.getJavaLevel());

	}//end of main
}//end of class

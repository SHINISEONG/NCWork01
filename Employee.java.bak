//package jb04.part03;

public class  Employee
{


	String part, name;
	int age,baseSalary;

	public Employee(){
		System.out.println("Emp 의 default Constructor");
	}
	public Employee(String name){
		this.name=name;
		System.out.println("Emp의 name을 입력받는 Constructor");
	}
	public Employee(String name, String part){
		this(name);
		this.part = part;
		System.out.println("Emp의 name, part를 받는 Constructor");
	}
	public Employee(String name, String part, int age){
		this(name, part);
		this.age=age;
		System.out.println("Emp의 name, part, age를 받는 Constructor");
	}

	public int salary(){
		System.out.println("Emp의 salary() method");
		baseSalary=100;
		return baseSalary;
	}
	public int salary(int i){
		System.out.println("수퍼로 제대로 레퍼런스 됐어!");
		baseSalary=i;
		return baseSalary;
	}
}//end of class

//package jb04.part03;

public class  Employee
{


	String part, name;
	int age,baseSalary;

	public Employee(){
		System.out.println("Emp �� default Constructor");
	}
	public Employee(String name){
		this.name=name;
		System.out.println("Emp�� name�� �Է¹޴� Constructor");
	}
	public Employee(String name, String part){
		this(name);
		this.part = part;
		System.out.println("Emp�� name, part�� �޴� Constructor");
	}
	public Employee(String name, String part, int age){
		this(name, part);
		this.age=age;
		System.out.println("Emp�� name, part, age�� �޴� Constructor");
	}

	public int salary(){
		System.out.println("Emp�� salary() method");
		baseSalary=100;
		return baseSalary;
	}
	public int salary(int i){
		System.out.println("���۷� ����� ���۷��� �ƾ�!");
		baseSalary=i;
		return baseSalary;
	}
}//end of class

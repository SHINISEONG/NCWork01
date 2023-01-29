//package jb04.part03;
public class  Manager extends Employee
{
	int salary;

	public Manager(){
		System.out.println("Manager의 default Constructor");
	}
	public Manager(String name){
		super(name);
		System.out.println("Manager의 name을 받는 Constructor");
	}
	public Manager(String name, String part){
		this(name);
		this.part=part;
		System.out.println("Manager의 name,part를 받는 Constructor");
	}
	public Manager(String name, String part, int age){
		super(name,part);
		this.age=age;
		System.out.println("Manager의 name, part, age를 받는 Constructor");
	}
	public Manager(String name, String part, int age, int salary){
		this(name, part, age);
		this.salary = salary;
		System.out.println("Manager의 name,part,age,salary을 받는 Constructor");
	}
	public int salary(int i){
		super.salary(i);
		System.out.println("manager의 salary method");
		baseSalary = i;
		return baseSalary;
	}
		public int salary(int i, String j){
		System.out.println(j);
		baseSalary = i;
		return baseSalary;
	}

	public void callSalary(){
		System.out.println("Employee의 기본급은" + super.salary());
		System.out.println("Manager의 기본급은" + this.salary());
		System.out.println("Manager의 기본급은" + salary());
	}

	public static void main(String args[]){
		//Manager m1 = new Manager("홍길동");
		
		//Manager m2 = new Manager("홍길동","EJB");
		
		//Manager m3 = new Manager("홍길동","EJB",25);
		
		Manager m4 = new Manager("홍길동","EJB",25,300);
		
		System.out.print("\n");
		
		System.out.println("ㄹㄹ " + m4.salary(999));
	//	m4.callSalary();
		
	}
}


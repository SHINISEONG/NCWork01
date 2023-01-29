//package jb05.part05.test03;
abstract class   BusCharge
{
	///Field
	String section;
	///Constructor
	public BusCharge(){
	}
	public BusCharge(String section){
		this.section = section;
	}
	public void information(){
		System.out.println("버스요금안내");
	}
	public abstract void charge();

}

class Student extends BusCharge{
	public Student(){
		super("학생");
	}
	public void charge(){
		System.out.println("300원");
	}
} //end of class

class Adult extends BusCharge{
	public Adult(){
		super("킹반인");
	}
	public void charge(){
		System.out.println("500원");
	}
} //end of class

class Old extends BusCharge{
	public Old(){
		super("으르신");
	}
	public void charge(){
		System.out.println("공짜에유~");
	}
} //end of class

public class Display02
{
	///main method
	public static void main(String[] args){
		BusCharge bc1 = new Student();
		BusCharge bc2 = new Adult();
		BusCharge bc3 = new Old();

		bc1.information();
		System.out.println(bc1.section);
		bc1.charge();

		bc2.information();
		System.out.println(bc2.section);
		bc2.charge();

		bc3.information();
		System.out.println(bc3.section);
		bc3.charge();
		
	}
}
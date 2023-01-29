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

public class Display01
{
	///main method
	public static void main(String[] args){
		Student b1 = new Student();
		Adult b2 = new Adult();
		Old b3 = new Old();

		b1.information();
		System.out.println(b1.section);
		b1.charge();

		b2.information();
		System.out.println(b2.section);
		b2.charge();

		b3.information();
		System.out.println(b3.section);
		b3.charge();
		
	}
}
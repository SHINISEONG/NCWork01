//package jb05.part06;
class  Super
{
	///Method
	public vod a(){
		System.out.println("Super : a()");
	}
}

class Sub extends Super{
	///Method
	public void a(){
		System.out.println("overriding�� Sub : a()");
	}

	public void b(){
		System.out.println("sub : b()");
	}
}

public class CastingComplete{
	///main Method
	public static void main(String[] args){

		System.out.println("\n����� Super s1 = new Super()�κ�");
		Super s1 = new Super();
		s1.a();

		System.out.println("\n����� Sub s2 = new Sub()�κ�");
		Sub s2 = new Sub();
		s2.a();
		s2.b();

		System.out.println("\n ����� Super s3= new Sub()�κ�");
		Super s3 = new Sub();
		s3.a();

	}
}

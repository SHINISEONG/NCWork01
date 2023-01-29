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
		System.out.println("overriding된 Sub : a()");
	}

	public void b(){
		System.out.println("sub : b()");
	}
}

public class CastingComplete{
	///main Method
	public static void main(String[] args){

		System.out.println("\n여기는 Super s1 = new Super()부분");
		Super s1 = new Super();
		s1.a();

		System.out.println("\n여기는 Sub s2 = new Sub()부분");
		Sub s2 = new Sub();
		s2.a();
		s2.b();

		System.out.println("\n 여기는 Super s3= new Sub()부분");
		Super s3 = new Sub();
		s3.a();

	}
}

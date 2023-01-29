package jb04.part07.outer;
public class  Son3 extends jb04.part07.Father
{
	public Son3(){
		System.out.println(this.name);
		System.out.println(bank);
		//System.out.println(branch);
		//System.out.prinln(password);

		System.out.println(this.getBranch());
		System.out.println(getPassword(0));
	}
}

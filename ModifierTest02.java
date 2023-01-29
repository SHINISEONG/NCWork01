//package jb05.part03;
class  TopSecret02
{
	///field
	private int secretNo = 7777;
	///constructor
	public TopSecret02(){
	}

	///method
	//getterMethod
	public int getSecretNo(int pwd){
		if (pwd == 0)
		{
			return secretNo;
		} else{
			return 0;
		}
	}
}//end of class

public class ModifierTest02{
	///main method
	public static void main(String[] args){
		TopSecret02 topSecret = new TopSecret02();
		System.out.println(topSecret.getSecretNo(0));
	}//end of main
}//end of class
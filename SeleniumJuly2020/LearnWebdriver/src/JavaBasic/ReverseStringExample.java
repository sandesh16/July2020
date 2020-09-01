package JavaBasic;

public class ReverseStringExample {

	public static void main(String[] args) {
		String str="Selenium";
		int i=str.length();
		
	//	StringBuffer obj=new StringBuffer();
		StringBuilder obj=new StringBuilder();
		for (int j=i-1; j >=0; j--) 
		{
			obj=obj.append(str.charAt(j));
		}

			System.out.println(obj);
	}

}

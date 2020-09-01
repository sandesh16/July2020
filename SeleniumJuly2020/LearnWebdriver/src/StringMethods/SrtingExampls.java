package StringMethods;



public class SrtingExampls {

	public static void main(String[] args) {
	
		String str="SeleniUm";
		
		
		  System.out.println("lenght is :"+str.length());
		  System.out.println("character value :"+ str.charAt(1)); //-index always start
		  System.out.println(str.concat(" webdriver"));
		  System.out.println(str.startsWith("Sel"));
		  System.out.println(str.endsWith("Ium"));
		  
		  String str1="Selenium"; System.out.println(str.equals(str1));
		  System.out.println(str.contains("S"));
		  System.out.println("index of "+str.indexOf("m"));
		  
		  String str3=""; System.out.println(str3.isEmpty());
		  System.out.println(str.replace("e", "a"));
		  //System.out.println(str.replace("Selenium", "Webdriver"));
		  System.out.println(str.substring(7));
		  
		  System.out.println(str.toLowerCase()); System.out.println(str.toUpperCase());
		  
		  String str4="           testing      "; System.out.println(str4.trim());
		 
		
		char[]CHAR_ARRAY=str.toCharArray();
		for (int i = 0; i < CHAR_ARRAY.length; i++)
		{
			System.out.println("index " +i + "is:"+ CHAR_ARRAY[i]);
		}
		
		
	}

}

package JavaBasic;

public class StringbufferExample {

	public static void main(String[] args) {
	
	//StringBuffer sb=StringBuffer("Selenium");
		
		StringBuilder sb =new StringBuilder("Selenium");
		
		sb.insert(8, " Webdriver");
		sb.delete(5, 8);
		sb.append(" test");
		
		System.out.println(sb);
		
		

	}

}

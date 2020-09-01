package JavaBasic;

public class StringbufferDemo {

	public static void main(String[] args) {
	StringBuffer sb =new  StringBuffer("Selenium");
		
		sb.insert(8, " Webdriver");
		sb.delete(5, 8);
		sb.append(" test");
		
		System.out.println(sb);

	}

}

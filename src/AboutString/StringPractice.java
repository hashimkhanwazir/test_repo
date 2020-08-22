package AboutString;

public class StringPractice {
	
	public static void main(String []args)
	{
		String string1="My name is ";
		String string2="Hashim";
		String string3="Khan Abdul Wali Khan";
		
		System.out.println(string1 + string2);
		
		System.out.println(string1.concat(string2));
		
		StringBuilder sb=new StringBuilder();
		
		sb.append("Baheej Hashim");
		sb.append(" WILL COME SOON");
		
		System.out.println(sb);
		
		char[] array= {'a','p','p','l','e','i','s','a','f','r','u','i','t'};
		
		String message1=new String(array);
		
		System.out.println(message1.length());
		
		System.out.println(message1);
		
		String message2="appleoftheearth";
		
		String message3="appldfdfdfoftheearth";
		
		for(int a=0;a<message1.length();a++)
		{
			System.out.println(array[a]);
		}
		System.out.println("The lower case is : "+message1.toLowerCase());
		System.out.println("The upper case is : "+message1.toUpperCase());
		System.out.println("The message 2 is : "+message2);
		System.out.println("string with no spaces : "+message2.trim());
		
		System.out.println(message2.indexOf('i'));
		System.out.println(message2.charAt(5));
		System.out.println(message2.substring(5, 9));
		System.out.println(message2==message3);        ///// false
		System.out.println(message2.startsWith("app")); //// yes
		System.out.println(message2.replace("string","apples"));
		System.out.println("this is new addition in the content");
      
		
		
		
		
		
		
 		
		
		
		
		
		
		
	}

}

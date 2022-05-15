package StringMethod;

public class StringMethod {
	
	public static void main(String args[]) 
	{
		String str   = "Java Developer",str1  = "Java Developer",str2  = "JAVA DEVELOPER";
		String fname = "Deepa", lname = "Lakshmi";
		String Str = "Hello";
		char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
		String Str1 = " ";
	    String myStr2 = "";
	    String myStr = "       Hello World!        ";
		char obj = str.charAt(2);
		int obj1 = str.codePointAt(0);
		int obj2 = str.codePointBefore(1);
	    int obj3 = str.codePointCount(0, 8);
	    myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
		System.out.println("PrintString                 : "+str);
		System.out.println("String Length               : "+str.length());
		System.out.println("Uppercase                   : "+str.toUpperCase());
		System.out.println("Lowercase                   : "+str.toLowerCase());
		System.out.println("String Index                : "+str.indexOf("D"));
		System.out.println("CharAt Function             : "+obj);
		System.out.println("CodePointAt                 : "+obj1);
		System.out.println("CodePointBefore             : "+obj2);
		System.out.println("CodePointCount              : "+obj3);
		System.out.println("String Compare              : "+str.compareTo(str1));
		System.out.println("StringCompareIgnoreCase     : "+str.compareToIgnoreCase(str2));
		System.out.println("StringConcat                : "+fname.concat(lname));
		System.out.println("Contains                    : "+str.contains("per"));    
		System.out.println("Contains                    : "+str.contains("Hi"));
		System.out.println("Content Equals              : "+str.contentEquals("Java Developer")); 
		System.out.println("Content Equals              : "+str.contentEquals("Hello"));
		System.out.println("Returned String             : "+ myStr2); 
		System.out.println("Endswith                    : "+str.endsWith("Dev"));
		System.out.println("Endswith                    : "+str.endsWith("oper"));
		System.out.println("Equals                      : "+str.equals(str1));
		System.out.println("Equals                      : "+str.equals(fname)); 
		System.out.println("EqualsIgnoreCase            : "+str.equalsIgnoreCase(str2));
		System.out.println("EqualsIgnoreCase            : "+str.equalsIgnoreCase(fname));
		System.out.println("HashCode                    : "+str.hashCode());
		System.out.println("Startswith                  : "+str.startsWith("Ja"));   
		System.out.println("Startswith                  : "+str.startsWith("ade"));
		System.out.println("Trim                        : "+myStr);
	    System.out.println("Trim                        : "+myStr.trim());
	    System.out.println("BeforeReplce                : "+Str);
	    System.out.println("StringReplace               : "+Str.replace('l', 'p'));
	    System.out.println("Empty                       : "+str.isEmpty());
	    System.out.println("Blank                       : "+Str1.isBlank());
	    
	}

}

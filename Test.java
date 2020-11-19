package incubyte.Datatech.Private.Limited;

import java.util.Scanner;
class StringCalculator{
	int add(String s) {
		if(s.isEmpty()) {
			return 0;
		}else if(s.length()==1) {
			return Integer.parseInt(s);
		}else {
			return Integer.parseInt(String.valueOf(s.charAt(0)))+Integer.parseInt(String.valueOf(s.charAt(2)));
		}
	}
}
public class Test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	StringCalculator obj=new StringCalculator();
	System.out.println(obj.add(s));
}
}

package incubyte.Datatech.Private.Limited;

import java.util.Scanner;
class StringCalculator{
	int add(String s) {
		if(s.isEmpty()) {
			return 0;
		}else {
			int sum=0;
			char ch[]=s.toCharArray();
			for(int i=0;i<s.length();i++) {
				if(ch[i]>=48 && ch[i]<=57){
					sum=sum+Character.getNumericValue(ch[i]);
				}
			}
			return sum;
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

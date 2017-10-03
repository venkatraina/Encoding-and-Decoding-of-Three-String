import java.util.*;
public class DecodingString {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n[]=new int[3];
		String in1="";
		String in2="";
		String in3="";
		System.out.println("Enter The three Encoded Strings :");
		String s1=in.next();
		String s2=in.next();
		String s3=in.next();
		
		String s="";
		for(int j=0;j<s3.length();j++) {
			if(Character.isUpperCase(s3.charAt(j))) {
				s+=Character.toLowerCase(s3.charAt(j));
			}else {
				s+=Character.toUpperCase(s3.charAt(j));
			}
		}
		s3=s;
		System.out.println("Enter The Length Of The Original Strings :");
		for(int i=0;i<3;i++) {
			n[i]=in.nextInt();
		}
		for(int i=0;i<3;i++) {
			int f=0;
			int m=0;
			int l=0;
			int t=n[i]/3;
			if(n[i]%3==0) {
				f=t;
				m=t;
				l=t;
			}else if(n[i]%3==1) {
				f=t;
				m=t+1;
				l=t;
			
			}else if(n[i]%3==2) {
				f=t+1;
				m=t;
				l=t+1;
			}
		
			if(i==0) {
				in1+=s1.substring(0,f);
				s1=s1.substring(f);
				in1+=s2.substring(0,m);
				s2=s2.substring(m);
				in1+=s3.substring(0,l);
				s3=s3.substring(l);
				
			}else if(i==2) {
				in3+=s2.substring(0,f);
				s2=s2.substring(f);
				in3+=s3.substring(0,m);
				s3=s3.substring(m);
				in3+=s1.substring(0,l);
				s1=s1.substring(l);
				
			}else if(i==1) {
				in2+=s3.substring(0,f);
				s3=s3.substring(f);
				in2+=s1.substring(0,m);
				s1=s1.substring(m);
				in2+=s2.substring(0,l);
				s2=s2.substring(l);
				
				
			}			
		}
		System.out.println("Decoded Strings are :");
		System.out.println(in1+"\n"+in2+"\n"+in3);
		in.close();

	}

}

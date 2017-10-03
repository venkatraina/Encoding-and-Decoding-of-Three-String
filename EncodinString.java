import java.util.*;

public class EncodinString {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String ar[]=new String[3];
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("Enter the three Strings :");
		for(int i=0;i<3;i++) {
			ar[i]=in.next();
		}
		for(int i=0;i<ar.length;i++) {
			if(ar[i].length()%3==0) {
				int t=ar[i].length()/3;
				al.add(ar[i].substring(0,t));
				ar[i]=ar[i].substring(t);
				al.add(ar[i].substring(0,t));
				al.add(ar[i].substring(ar[i].length()-t));


			}else if(ar[i].length()%3==1) {
				int t=ar[i].length()/3;
				al.add(ar[i].substring(0,t));
				ar[i]=ar[i].substring(t);
				al.add(ar[i].substring(0,t+1));
				al.add(ar[i].substring(ar[i].length()-t));
				
			}else if(ar[i].length()%3==2) {
				int t=ar[i].length()/3;
				al.add(ar[i].substring(0,t+1));
				ar[i]=ar[i].substring(t+1);
				al.add(ar[i].substring(0,t));
				al.add(ar[i].substring(t));
				
			}
		}
		
		String out1=al.get(0)+al.get(4)+al.get(8);
		String out2=al.get(1)+al.get(5)+al.get(6);
		String out3=al.get(2)+al.get(3)+al.get(7);
		String s="";
		for(int i=0;i<out3.length();i++) {
			if(Character.isUpperCase(out3.charAt(i))) {
				s+=Character.toLowerCase(out3.charAt(i));
			}else {
				s+=Character.toUpperCase(out3.charAt(i));
			}
		}
		out3=s;
		System.out.println("Encoded String are :");
		System.out.println(out1);
		System.out.println(out2);
		System.out.println((out3));
		in.close();
		
		

	}

}
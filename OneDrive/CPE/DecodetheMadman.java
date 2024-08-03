import java.util.*;
public class DecodetheMadman {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		String s1="qwertyuiopasdfghjklzxcvbnm";//output
		String s4="QWERTYUIOPASDFGHJKLZXCVBNM";
		String f[]=s.split("");
		String s1="ertyuiop[]dfghjkl;'cvbnm,.";//input
		String s3="ERTYUIOP[]DFGJKL;'CVBNM,.";
		String f1[]=s1.split("");
		String f2[]=s3.split("");
		
		String in=sc.nextLine();
		String[] in1=in.split("");
		String[] in2=new String[in1.length];
		for(int i=0;i<in2.length;i++){
			in2[i]=" ";
		}
		for(int i=0;i<in1.length;i++){
			for(int j=0;j<f.length;j++){
				if(in1[i].equals(f1[j]) || in.charAt(i)+32==s1.charAt(j)){
					in2[i]=f[j];
				}
			}
			System.out.print(in2[i]);
		}
    }
}

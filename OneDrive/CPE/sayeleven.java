import java.util.*;
public class sayeleven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        	String a=sc.next();
	        if(a.equals("0")){
	        	System.exit(0);
	        }
	        String[] s=a.split("");
	        int[] x=new int[s.length];
	        for(int i=0;i<x.length;i++){
	        	x[i]=Integer.parseInt(s[i]);
	        }
	        int c1=0,c2=0,d=0;
	        for(int i=0;i<x.length;i++){
	        	if(i%2==0){
	        		c1+=x[i];
	        	}
	        	if(i%2==1){
	        		c2+=x[i];
	        	}
	        }
	        d=c1-c2;
	        if(d%11==0){
	        	System.out.println(a+" is a multiple of 11.");
	        }
	        else{
	        	System.out.println(a+" is not a multiple of 11.");
	        }
			
        }
   }
}

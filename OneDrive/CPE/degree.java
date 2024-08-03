import java.util.*;
public class degree {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String a=sc.nextLine();
			String b[]=a.split("");
			int c=1;
			if(a.equals("0"))break;
			if(f(b)%9==0){
				System.out.println(a+" is a multiple of 9 and has 9-degree "+c(b,c)+".");
			}
			else{
				System.out.println(a+" is not a multiple of 9.");
			}
		}
    }
    static int c(String b[],int c){
    	int x=f(b);
    	while(x!=9){
    		c++;
    		String d=Integer.toString(x);
    		String v[]=d.split("");
    		x=f(v);
    	}
    	return c;
    	
    }
    static int f(String b[]){
    	int sum=0;
    	for(int i=0;i<b.length;i++){
    		int x=Integer.parseInt(b[i]);
    		sum+=x;
    	}
    	return sum;
    }
}
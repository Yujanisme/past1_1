import java.util.*;
public class Fibonaccimal {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int[] s=new int[40];
		for(int i=0;i<40;i++){
			s[i]=fi(i+2);
		}
		for(int k=0;k<x;k++){
			int n=sc.nextInt();
			int c=n;
			System.out.print(n+" = ");
			for(int i=39;i>=0;i--){
				if(s[i]<=n){
					if(s[i]<=c){
						c=c-s[i];
						System.out.print(1);
					}
					else{
						System.out.print(0);
					}
				}
			}
			System.out.println(" (fib)");
		}
    }
    static int fi(int a){
    	if(a==2){
    		return 1;
    	}
    	if(a==3){
    		return 2;
    	}
    	else{
    		return fi(a-1)+fi(a-2);
    	}
    }
}
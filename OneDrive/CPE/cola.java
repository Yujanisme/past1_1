import java.util.*;
public class cola {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int N=n;
		int remain=0;
		int total=0;
		if(n%3==2){
			N=n+1;
			while(N/3>=1){
				total+=N;
				N=N/3+N%3;
			}
			total+=N;
			total=total-1;
			System.out.println(total);
		}
		else if(n%3==1){
			N=N+2;
			while(N/3>=1){
				total+=N;
				N=N/3+N%3;
			}
			total+=N;
			total=total-2;
			if(N<2){
				total=0;
				turn(n,total);
			}
			else{
				System.out.println(total);
			}
		}
		else{
			turn(n,total);
		}
    }
    static void turn(int n,int total){
    	while(n/3>=1){
    		total+=n;
    		n=n/3+n%3;
    	}
    	total+=n;
    	System.out.println(total);
    }
}

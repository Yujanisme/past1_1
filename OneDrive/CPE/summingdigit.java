import java.util.*;
public class summingdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	int n=sc.nextInt();
        	summ(n);
        }
    }
    static int summ(int n){
    	int t=0,sum=0;
    	while(n/10>0){
        	t=n%10;
        	n=n/10;
        	sum+=t;
        }
        sum+=n;
        if(sum>=10){
        	summ(sum);
        }
        else if(sum<10 && sum>0){
        	System.out.println(sum);
        }
        return sum;
    }
}
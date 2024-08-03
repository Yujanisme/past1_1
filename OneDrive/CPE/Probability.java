import java.util.*;
public class Probability {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int c=sc.nextInt();//case
		for(int k=0;k<c;k++){
			int n=sc.nextInt();//人數
			double p=sc.nextDouble();
			double q=1-p;
			int i=sc.nextInt();//獲勝者
			double e=((Math.pow(q,i-1))*p)/(1-Math.pow(q,n));
			if(p==0){
				System.out.println("0.0000");
			}
			else{
				System.out.printf("%5.4f",e);
				System.out.println();
			}
		}
    }
}

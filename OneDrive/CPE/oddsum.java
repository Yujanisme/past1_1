import java.util.*;
public class oddsum {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();//case
		int count=0;
		int sum=0;
		for(int j=0;j<a;j++){
			int b=sc.nextInt();
			int c=sc.nextInt();
			sum=0;
			for(int i=b;i<=c;i++){
				if(i%2==1){
					sum+=i;
				}
			}
			count++;
			System.out.println("Case "+count+": "+sum);
		}
		
		
    }
}

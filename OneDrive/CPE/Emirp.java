import java.util.*;
public class Emirp {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int d=n;
			int b=0;
			int c=0;
			int n1=n;
			while(n>0){
				n=n/10;
				c++;
			}
			int count=0,count1=0;//如果count=2是質數
			//先確定n是不是質數
			for(int i=1;i<=d;i++){
				int a=d%i;
				if(a==0){
					count++;
				}
			}
			if(count==2){
				for(int i=c;i>0;i--){
					b+=(n1%10)*Math.pow(10,i-1);
					n1=n1/10;
				}
				for(int i=b;i>=1;i--){
					int e=b%i;
					if(e==0){
						count1++;
					}
				}
				if(count1==2){
					System.out.println(d+" is emirp.");
				}
				else{
					System.out.println(d+" is prime.");
				}
			}
			else{
				System.out.println(d+" is not prime.");
			}
		}
    }
}
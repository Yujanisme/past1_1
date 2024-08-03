import java.util.*;
public class Hartals {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ca=sc.nextInt();
		for(int f=0;f<ca;f++){
			int n=sc.nextInt();//day
			int p=sc.nextInt();//how many parties
			int[] p1=new int[p];
			int[] day=new int[n+1];
			int count=0;
			for(int i=0;i<p;i++){
				int h=sc.nextInt();
				p1[i]=h;
			}
			if(n%7==0){
				for(int k=0;k<p1.length;k++){
					for(int i=0;i<n+1;i++){
						if((i%7!=0 && i%7!=6) && i%p1[k]==0){
							day[i]=1;
						}
					}
				}
				for(int x:day){
					if(x==1){
						count++;
					}
				}
				System.out.println(count);
			}
			else{
				for(int k=0;k<p1.length;k++){
					for(int i=0;i<=n;i++){
						if((i%7!=0 && i%7!=6) && i%p1[k]==0){
							day[i]=1;
						}
					}
				}
				for(int x:day){
					if(x==1){
						count++;
					}
				}
				System.out.println(count);
			}
		}
    }
}
import java.util.*;
public class cheapestbase {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//case
		for(int k=0;k<n;k++){
			int a=k+1;
			System.out.println("Case "+a+":");
			int cost[]=new int[37];
			for(int i=0;i<36;i++){
				cost[i]=sc.nextInt();
			}
			int u=sc.nextInt();
			int cal[]=new int[u];//­nºâªº¼Æ¦r
			for(int i=0;i<u;i++){
				cal[i]=sc.nextInt();
			}
			for(int i=0;i<u;i++){
				int changemoney[]=new int[37];
				
				for(int j=2;j<37;j++){
					int d=cal[i];
					while(d>0){
						int t=d%j;;
						d=d/j;
						changemoney[j]+=cost[t];
					}				
				}
				int mini=changemoney[2];
				for(int j=3;j<37;j++){
					if(changemoney[j]<mini){
						mini=changemoney[j];
					}
				}
				System.out.print("Cheapest base(s) for number "+cal[i]+":");
				for(int j=2;j<37;j++){
					if(changemoney[j]==mini){
						System.out.print(" "+j);
					}
				}
				System.out.println();
			}
			if(k!=n-1)System.out.println();
		}
    }
}

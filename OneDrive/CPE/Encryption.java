import java.util.*;
public class Encryption {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();//case
		for(int i=0;i<k;i++){
			int n=sc.nextInt();
			int[] s=new int[10];
			int[] s1=new int[16];
			int count1=1,count2=0;
			int g=n;
			for(int j=0;n>1;j++){
				if(n%2==1){
					count1++;
				}
				if(n==1){
					count1++;
				}
				n=n/2;
			}
			String n1=String.valueOf(g);
			String nn[]=n1.split("");
			for(int j=0;j<nn.length;j++){
				int x=Integer.parseInt(nn[j]);
				if(x!=1 && x!=2 && x!=0)count2++;
				if(x==1 || x==2){
					count2++;
					continue;
				}
				for(int c=0;x>1;c++){
					if(x%2==1){
						count2++;
					}
					if(x==1){
						count2++;
					}
					x=x/2;
				}
			}
			System.out.println(count1+" "+count2);
		}
    }
}

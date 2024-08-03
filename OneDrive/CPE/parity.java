import java.util.*;
public class parity {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			else if(n==1){
				System.out.println("The parity of 1 is 1 (mod 2).");
			}
			else{
				int[] s=new int[60];
				int count=1;
				for(int i=0;i<s.length;i++){
					s[i]=2;
				}
				for(int i=0;n>1;i++){
					s[i]=n%2;
					if(s[i]==1){
						count++;
					}
					n=n/2;
					if(n==1){
						s[i+1]=1;
					}
				}
				System.out.print("The parity of ");
				for(int i=s.length-1;i>=0;i--){
					if(s[i]!=2){
						System.out.print(s[i]);
					}
					else{
						continue;
					}
				}
				System.out.println(" is "+count+" (mod 2).");
			}
		}
    }
}

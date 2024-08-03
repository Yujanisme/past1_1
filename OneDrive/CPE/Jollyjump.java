import java.util.*;
public class Jollyjump {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] f=new int[n];
		int[] f1=new int[n-1];
		int count=1;
		String c=" ";
		for(int i=0;i<n;i++){
			int a=sc.nextInt();
			f[i]=a;
		}
		for(int i=0;i<n-1;i++){
			f1[i]=Math.abs(f[i+1]-f[i]);
		//	System.out.print(f1[i]);
		}
		Arrays.sort(f1);
		for(int i=0;i<f1.length;i++){
			if(f1[i]!=i+1){
				c="Not";
				break;
			}
		}
		if(c.equals("Not")){
			System.out.print("Not jolly");
		}
		else{
			System.out.print("Jolly");
		}
		
    }
}

import java.util.*;
public class derivative498 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		//int a=Integer.parseInt(x);
		int sum=0;
		String f=sc.nextLine();
		String f1[]=f.split(" ");
		int f2[]=new int[f1.length];
		int c=f1.length-1;
		for(int i=0;i<f1.length;i++){
			System.out.print(f1[i]);
		}
		for(int i=0;i<f1.length;i++){
			f2[i]=Integer.parseInt(f1[i]);
		}
		for(int i=0;i<f1.length;i++){
			sum=f2[i]*c*x;
			c--;
		}
		System.out.println(sum);
    }
}

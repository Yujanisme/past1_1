import java.util.*;
public class Dvide {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			long a=sc.nextInt();
			long b=sc.nextInt();
			int count=1;
			long temp=a;
			String j=" ";
			if(b!=0 && b!=1 && a>b && temp>b){
				while(temp>1){
					if(temp%b!=0){
						j="Boring!";
						break;
					}
					temp=temp/b;
				}
				if(j.equals("Boring!")){
					System.out.println("Boring!");
				}
				else{
					while(a>1){
						System.out.print(a+" ");
						a=a/b;					
					}
					System.out.println(1);
				}
			}
			else{
				System.out.println("Boring!");
			}
		}
    }
}

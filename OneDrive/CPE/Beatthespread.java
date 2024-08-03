import java.util.*;
public class Beatthespread {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int c=sc.nextInt();
		for(int i=0;i<c;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a>b){
				if((a+b)%2==0){
					int x=(a+b)/2;
					int y=a-x;
					System.out.println(x+" "+y);
				}
				else{
					System.out.println("impossible");
				}
			}
			else {
				System.out.print("impossible");
			}
		}
    }
}

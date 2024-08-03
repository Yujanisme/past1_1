import java.util.*;
public class squarenumber {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int count=0;
			if(a==0 && b==0){
				break;
			}
			else{
				for(int i=a;i<=b;i++){
					int x=(int)(Math.sqrt(i));
					if(i==x*x){
						count++;
					}
				}
			}
			System.out.println(count);			
		}		
    }
}

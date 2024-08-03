import java.util.*;
public class steps_uva10642 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//case
		for(int k=0;k<n;k++){
			int x0=sc.nextInt();
			int y0=sc.nextInt();
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			Long cal=0L;
			while(x0!=x1 || y0!=y1){
				int c=x0+y0;
				if(x0>=y0 && x0!=c){
					x0++;
					y0--;
					cal++;
				}
				else if(x0==c){
					c++;
					x0=0;
					y0=c;
					cal++;
				}
				else if(x0<y0){
					x0++;
					y0--;
					cal++;
				}
			}
			System.out.println("Case "+(k+1)+": "+cal);
    	}
    }
}
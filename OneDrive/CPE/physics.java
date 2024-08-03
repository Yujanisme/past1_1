import java.util.*;
public class physics {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int t=sc.nextInt();
			int v=sc.nextInt();
			int a=1;
			int v0=v-t*a;
			int s=v0*2*t+(a*4*t*t)/2;
			System.out.println(s);
		}
    }
}

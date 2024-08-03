import java.util.*;
public class hotelInfinite {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long p=sc.nextLong();
		long d=sc.nextLong();
		long c=0;
		for(long i=p;c<d;p++){
			c=c+p;
		}
		System.out.print(p-1);
    }
}

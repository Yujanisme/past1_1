import java.util.*;
public class GCD {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)break;
			else{
				int G=0;
				for(int i=1;i<n;i++){
					for(int j=i+1;j<=n;j++){
						G+=GCD(i,j);
					}
				}
				System.out.println(G);
			}
		}
    }
    static int GCD(int a,int b){
    	int r=0;
    	for(int i=a;i>=1;i--){
    		if(a%i==0 && b%i==0){
    			r=i;
    			break;
    		}
    	}
    	return r;
    }
}
import java.util.*;
public class Largestsquare {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//case
		int M=sc.nextInt();
		int N=sc.nextInt();
		int Q=sc.nextInt();//´X¦æ´ú¸Õ
		String s[][]=new String[M][N];
		
		for(int i=0;i<M;i++){
			String st=sc.next();
			String f[]=st.split("");
			s[i]=f;
		}
		System.out.println(M+" "+N+" "+Q);
		for(int h=0;h<Q;h++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			String x=s[a][b];
			int i;
			for(i=1;i<M;i++){
    			String ss="tru";
	    		for(int j=a-i;j<=a+i && ss.equals("tru");j++){
	    			for(int k=b-i;k<=b+i;k++){
	    				if(j<0 || k<0 || j>=M || k>=N || !s[j][k].equals(x)){
	    					ss="fal";
	    					break;
	    				}
	    			}
	    		}
	    		if(!ss.equals("tru")){
	    			break;
	    		}
    		}
	    	System.out.println(2*i-1);
		}
    }
}

import java.util.*;
public class fourthpoint {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			double x1=0,y1=0,y2=0,x22=0,y22=0,x3=0,y3=0;
			double x2=0;
			double s[]=new double[8];
			for(int i=0;i<8;i++){
				s[i]=sc.nextDouble();
			}
			int b=0,j=1;
			int i;
			int k=0;
			for(i=0;i<5;i+=2){
				String ju=" ";
				j=i+1;
				for(k=i+2;k<7;k+=2){
					b=k+1;
					if(s[i]==s[k] && s[j]==s[b]){
						ju="stop";
						x2=s[i];
						y2=s[j];
						x22=s[k];
						y22=s[b];
						break;
					}
				}
				if(ju.equals("stop")){
					break;
				}
			}
			int p;
			for(p=0;p<7;p++){
				if(p!=i && p!=j && p!=k && p!=b){
					x1=s[p];
					y1=s[p+1];
					break;
				}
			}
			int h;
			for(h=0;h<7;h++){
				if(h!=i && h!=j && h!=k && h!=b && h!=p &&h!=p+1){
					x3=s[h];
					y3=s[h+1];
					break;
				}
			}
			double x4=x1+x3-x2;
			double y4=y1+y3-y2;
			System.out.printf("%4.3f %4.3f",x4,y4);
		}
    }
}

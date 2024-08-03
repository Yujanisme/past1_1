import java.util.*;
public class SymmetricMatrix {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=Integer.parseInt(sc.next());
		int count=1;
		for(int i=0;i<c;i++){
			String nf=sc.next();
			String nff=sc.next();
			int n=Integer.parseInt(sc.next());
			String s=" ";
			int[][] a=new int[n][n];
			for(int j=0;j<n;j++){
				for(int h=0;h<n;h++){
					a[j][h]=sc.nextInt();
				}
			}
			if(n%2==0){
				for(int j=0;j<n;j++){
					for(int h=0;h<n/2;h++){
						if(a[j][h]<0){
							s="Non";
							break;
						}
						if(a[j][h]!=a[n-1-j][n-1-h]){
							s="Non";
							break;
						}
					}
				}
				//System.out.println("Test #"+count+"Symmetric.");
			}
			else{
				for(int j=0;j<n;j++){
					for(int h=0;h<n/2;h++){
						if(a[j][h]<0){
							s="Non";
							break;
						}
						if (a[j][h]!=a[n-j-1][n-h-1]){
							s="Non";
							break;
						}
					}
				}
			}
			if(s.equals("Non")){
				System.out.println("Test #"+count+": Non-symmetric");
			}
			else{
				System.out.println("Test #"+count+"Symmetric");
			}
			count++;
		}
    }
}
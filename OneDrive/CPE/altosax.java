import java.util.*;
public class altosax {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++){
			String mu=sc.next();
			int finger[]=new int[10];//現在的
			int last[]=new int[10];//上一個
			int write[]=new int[10];//紀錄
			for(int j=0;j<last.length;j++){
				last[j]=0;
				write[j]=0;
			}
			String fi[][]=
			{
				{"c","0111001111"},
				{"d","0111001110"},
				{"e","0111001100"},
				{"f","0111001000"},
				{"g","0111000000"},
				{"a","0110000000"},
				{"b","0100000000"},
				{"C","0010000000"},
				{"D","1111001110"},
				{"E","1111001100"},
				{"F","1111001000"},
				{"G","1111000000"},
				{"A","1110000000"},
				{"B","1100000000"}	
			};
			String mu2[]=mu.split("");
			for(int j=0;j<mu2.length;j++){
				for(int k=0;k<fi.length;k++){
					if(mu2[j].equals(fi[k][0])){
						for(int s=0;s<fi[k].length;s++){
							String[] x=fi[k][1].split("");
							for(int b=0;b<x.length;b++){
								finger[b]=Integer.parseInt(x[b]);
							}
						}
		/*				System.out.println();
						for(int s=0;s<write.length;s++){
							System.out.print(finger[s]+" ");
						}*/
						break;
					}
				}
				for(int k=0;k<finger.length;k++){
					if(finger[k]==1 && last[k]==0){
						write[k]=write[k]+1;
					}
				}
				for(int k=0;k<finger.length;k++){
					last[k]=finger[k];
				}
			}
			for(int k=0;k<write.length;k++){
				System.out.print(write[k]);
				if(k!=write.length-1){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    }
}

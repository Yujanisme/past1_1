import java.util.*;
public class uva10189 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int field=0;
		while(sc.hasNext()){
			int m=sc.nextInt();//°ª
			int n=sc.nextInt();//¼e
			if(m==0 && n==0){
				break;
			}
			if(field!=0)System.out.println();
			char[][] map=new char[m+2][n+2];
			for(int i=0;i<m+2;i++){
				for(int j=0;j<n+2;j++){
					map[i][j]='0';
				}
			}
			for(int i=1;i<m+1;i++){
				String in=sc.next();
				int k=0;
				for(int j=1;j<n+1;j++){
					map[i][j]=in.charAt(k);
					k++;
				}
			}
			char c='*',h='.';
			for(int i=1;i<m+1;i++){
				for(int j=1;j<n+1;j++){
					int count=0;
					if(map[i][j]==h){
						if(map[i-1][j-1]==c)count++;
						if(map[i-1][j]==c)count++;
						if(map[i-1][j+1]==c)count++;
						if(map[i][j-1]==c)count++;
						if(map[i][j+1]==c)count++;
						if(map[i+1][j-1]==c)count++;
						if(map[i+1][j]==c)count++;
						if(map[i+1][j+1]==c)count++;
						
						map[i][j]=(char)(count+'0');
					}
				}
			}
			System.out.print("Field #"+(field+1)+":");
			System.out.println();
			for(int i=1;i<m+1;i++){
				for(int j=1;j<n+1;j++){
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
			field++;
		}
    }
}

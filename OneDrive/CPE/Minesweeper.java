import java.util.*;
public class Minesweeper {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();//高
		int n=sc.nextInt();//寬
		String[][] map=new String[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				map[i][j]=sc.next();
			}
		}
		for(int i=0;i<m;i++){
			int count=0;
			for(int j=0;j<n;j++){
				if(i-1>=0 && i+1<m && j-1>=0 && j+1<n){
					if(map[i][j].equals(".")){
						for(int k=0;k<9;k++){
							if(map[i-1][j-1].equals("*") || map[i-1][j].equals("*") || map[i-1][j+1].equals("*") || map[i][j-1].equals("*") || map[i][j+1].equals("*") || map[i+1][j-1].equals("*") || map[i+1][j].equals("*") || map[i+1][j+1].equals("*")){
								count++;
							}
						}
						map[i][j]=Integer.toString(count);
					}
				}
				else if(map[i][j].equals(".") && i==0 && j==0){
					for(int k=0;k<4;k++){
						if(map[i][j+1].equals("*") || map[i+1][j].equals("*") || map[i+1][j+1].equals("*")){
								count++;
						}
					}
					map[i][j]=Integer.toString(count);
				}
				else if(map[i][j].equals(".") && i==0 && j==n-1){
					for(int k=0;k<4;k++){
						if(map[i][j-1].equals("*") || map[i+1][j-1].equals("*") || map[i+1][j].equals("*")){
							count++;
						}
					}
					map[i][j]=Integer.toString(count);
				}
				else if(map[i][j].equals(".") && i==m-1 && j==0){
					for(int k=0;k<4;k++){
						if(map[m-2][0].equals("*") || map[m-2][1].equals("*") || map[m-1][1].equals("*")){
							count++;
						}
					}
				}
				else if(map[i][j].equals(".") && i==m-1 && j==n-1){
					for(int k=0;k<4;k++){
						if(map[m-2][n-1].equals("*") || map[m-2][n-2].equals("*") || map[m-1][n-2].equals("*")){
							count++;
						}
					}
					map[i][j]=Integer.toString(count);
				}
				else if(map[i][j].equals(".") && i==0 && j>0 && j<n-1){//最上排
					for(int k=0;k<5;k++){
						if(map[i-1][j].equals("*") || map[i-1][j+1].equals("*") || map[i][j+1].equals("*") || map[i+1][j].equals("*") || map[i+1][j+1].equals("*")){
							count++;
						}
					}
					map[i][j]=Integer.toString(count);
				}
				else if(map[i][j].equals(".") && i==m-1 && j>0 && j<n-1){//最下排
					for(int k=0;k<5;k++){
						if(map[i-1][j-1].equals("*") || map[i-1][j].equals("*") || map[i-1][j+1].equals("*") || map[i][j-1].equals("*") || map[i][j+1].equals("*")){
							count++;
						}
					}
					map[i][j]=Integer.toString(count);
				}
				else if(map[i][j].equals(".") && j==0 && i>0 && i<m-1){//最左排
					for(int k=0;k<5;k++){
						if(map[i-1][j].equals("*") || map[i-1][j+1].equals("*") || map[i][j+1].equals("*") || map[i+1][j].equals("*") || map[i+1][j+1].equals("*")){
							count++;
						}
					}
					map[i][j]=Integer.toString(count);
				}
				else if(map[i][j].equals(".") && j==n-1 && i>0 && i<m-1){//最下排
					for(int k=0;k<5;k++){
						if(map[i-1][j-1].equals("*") || map[i-1][j].equals("*") || map[i][j-1].equals("*") || map[i+1][j-1].equals("*") || map[i+1][j].equals("*")){
							count++;
						}
					}
					map[i][j]=Integer.toString(count);
				}
			}
		}
		for(String x[]:map){
			for(String y:x){
				System.out.print(y);
			}
			System.out.println();
		}
    }
}

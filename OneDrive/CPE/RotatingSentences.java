import java.util.*;
public class RotatingSentences {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String f[][]=new String[101][101];
		
		int line=0,max=0,i=0,record=0;//line是紀錄列數，max是紀錄最長的那列幾個字，i是換列，record是紀錄哪列最長
		while(sc.hasNext()){
			String s=sc.nextLine();//輸入一列字串
			String s1[]=s.split("");
			f[i]=s1;//把切割後的字串存入陣列
			i++;//換列
			line++;//(紀錄)增加列數
			max=(max>s.length())? max:s.length();//找出最長的那列有幾個字
			record=max>s.length()? record:i-1;//找出最長的是哪列
		}
		//印出90度的陣列
		for(int k=0;k<max;k++){
			for(int j=line-1;j>=0;j--){
				if(k>f[j].length){//如果列的大小大於該行長度
					if(j>record){//判斷原本陣列第j列是在最長的上還下
						System.out.print(" ");//下的話90度後多餘的要補空白
						continue;
					}
					else{
						 continue;//上的話則繼續印列
					}
				}
				if(f[j][k]!="null"){//判斷第(j,k)格是否為null
					System.out.print(f[j][k]);//不是的話就印出
				}
			}
			System.out.println();
		}
	}
}
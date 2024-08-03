import java.util.*;
public class Hashmat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        	String[] s=new String[2];//設一個字串陣列,可儲存字串或整數
        	long[] s1=new long[2];//設一個整數型態陣列，用來運算
        	for(int i=0;i<s.length;i++){
        		s[i]=sc.next();//把數字存入陣列
        		if(s[i].equals("End")){//如果遇到"End"
        			System.exit(0);//就結束程式
        		}
        		s1[i]=Long.parseLong(s[i]);//沒遇到"End"就把s陣列的東西轉換成整數存入s1陣列
        	}
        	long c=Math.abs(s1[1]-s1[0]);//後面減前面
        	System.out.println(c);//輸出且換行
        }
    }
}

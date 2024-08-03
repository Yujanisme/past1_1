import java.util.*;
public class Vito  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();//有幾筆資料要測試
        
        for(int i=0;i<a;i++){
        	int b=sc.nextInt();//一筆資料中有幾個數字
        	int s[]=new int[b];//設定一個陣列
        	for(int j=0;j<s.length;j++){
        		s[j]=sc.nextInt();//把數字存入陣列裡
        	}
        	Arrays.sort(s);//由小排到大
        	int mid=b/2;//得知中位數是第幾個位置
        	int total=0;//最一開始為零
        	for(int x=0;x<b;x++){
        		if(x<mid){total+=s[mid]-s[x];}
				else{
					total+=s[x]-s[mid];
				}
        	}
        	System.out.println(total);
        }
    }
}

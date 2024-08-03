import java.util.*;
public class com {
        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
       	//System.out.print("請輸入第一個單字:");
        String first=sc.nextLine();
        //System.out.print("第二個單字:");
        String second=sc.nextLine();
        int i,j;
        
        String[] f=first.split("");
        String[] s=second.split("");
        
        for(i=0;i<f.length;i++){
        
        for(j=0;j<s.length;j++){
        	if(f[i].equals(s[j])){
        	
        	System.out.print(s[j]);}
        	}
        }
        }
}
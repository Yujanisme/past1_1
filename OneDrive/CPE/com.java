import java.util.*;
public class com {
        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
       	//System.out.print("�п�J�Ĥ@�ӳ�r:");
        String first=sc.nextLine();
        //System.out.print("�ĤG�ӳ�r:");
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
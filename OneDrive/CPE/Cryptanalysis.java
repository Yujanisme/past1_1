import java.util.*;
public class Cryptanalysis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[] s=new int[26];
        for(int i=0;i<26;i++){
        	s[i]=0;
        }
        for(int i=0;i<n+1;i++){
        	String t=sc.nextLine();
        	char[] f=t.toCharArray();//String to Char
        	for(int j=0;j<f.length;j++){
        		int c=f[j];//char to ASCII
        		if(c>=65 && c<=90){
        			s[c-65]++;
        		}
        		else if(c>=97 && c<=122){
        			s[c-97]++;
        		}
        		else{
        		continue;
        		}
        	}
        }
        int max=0;
        for(int i=0;i<26;i++){
        	if(s[i]>max){
        		max=s[i];
        	}
        }
        for(int i=max;i>0;i--){
        	for(int j=0;j<26;j++){
        		if(s[j]==i){
        			System.out.println((char)(j+65)+" "+i);
        		}
        	}
        }
    }
}
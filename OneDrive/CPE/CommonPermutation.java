import java.util.*;
public class CommonPermutation {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String a=sc.nextLine();
			String b=sc.nextLine();
			int[] eng=new int[26];//儲存第一個陣列的字母個數
			int[] eng1=new int[26];//儲存第二個陣列的字母個數
			char[] a1=a.toCharArray();
			char[] b1=b.toCharArray();
			for(int i=0;i<a1.length;i++){
				int x=a1[i];
				if(x>=65 && x<=90){
					x=x+32;
				}
				if(x>=97 && x<=122){
					eng[x-97]++;
				}
			}
			for(int i=0;i<b1.length;i++){
				int y=b1[i];
				if(y>=65 && y<=90){
					y=y+32;
				}
				if(y>=97 && y<=122){
					eng1[y-97]++;
				}
			}
		for(int i=0;i<26;i++){
			if(eng[i]!=0 && eng1[i]!=0){
				int less=eng[i]<eng1[i]? eng[i]:eng1[i];
				for(int j=0;j<less;j++){
					System.out.print((char)(i+97));
				}
			}
    	}
    	System.out.println();
    }}
}
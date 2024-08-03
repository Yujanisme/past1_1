import java.util.*;
public class sequence2B {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=1;
		while(sc.hasNext()){
			int s=sc.nextInt();
			int[] f=new int[s];
			int[] f1=new int[s];
			int[] add=new int[s*(s+1)/2];//用來儲存相加的數字
			String a=" ";
			int x=0;
			for(int i=0;i<s;i++){
				f[i]=sc.nextInt();
				f1[i]=f[i];
			}
			int c=0;
			for(int j=0;j<f1.length;j++){
				for(int k=j;k<f.length;k++){
					x=f[j]+f1[k];
					add[c]=x;
					c++;
				}
			}
			Arrays.sort(add);
			for(int i=0;i<add.length-1;i++){
				if(add[i]==add[i+1]){
					a="non";
					break;
				}
			}
			if(a.equals("non")){
				System.out.println("Case #"+count+": It is not a B2-Sequence.");
			}
			else{
				System.out.println("Case #"+count+": It is a B2-Sequence.");
			}
			count++;
			System.out.println();
		}
    }
}

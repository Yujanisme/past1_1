import java.util.*;
public class midnight_uva10057 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();//���U�ӴX�ӼƦr
			int[] s=new int[n];
			int A=0,A1=0,count=1;
			for(int i=0;i<n;i++){
				s[i]=sc.nextInt();
			}
			Arrays.sort(s);
			//�䤤���
			if(n%2==0){//n�����Ʈɦ���Ӥ����
				A=s[n/2-1];
				A1=s[n/2];
			}
			else{
				A=s[(n+1)/2-1];
			}
			//�p��B�����t��
			if(n%2==0){
				int[] s2=new int[2*n];	
				for(int i=0;i<s2.length;i++){
					if(i>s.length-1){
						s2[i]=Math.abs(s[i-s.length]-A1);
					}
					else{
						s2[i]=Math.abs(s[i]-A);
					}
				}
				Arrays.sort(s2);
				System.out.println(s2.length);
				for(int i=0;i<s2.length-1;i++){
					if(s2[i]!=s2[i+1]){
						break;
					}
					else{
						count++;
					}
				}
				System.out.println(A+" "+count+" "+(A1-A+1));
			}
			else{
				int[] s2=new int[n];
				for(int i=0;i<s2.length;i++){
					s2[i]=Math.abs(s[i]-A);
				}
				Arrays.sort(s2);
				System.out.println(s2.length);
				for(int i=0;i<s2.length-1;i++){
					if(s2[i]!=s2[i+1]){
						break;
					}
					else{
						count++;
					}
				}
				System.out.println(A+" "+count+" 1");
			}
		}
    }
}

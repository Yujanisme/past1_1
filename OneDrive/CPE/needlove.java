import java.util.*;
public class needlove {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//case
		
		for(int g=0;g<n;g++){
			String s1=sc.next();
			String f1[]=s1.split("");
			int z1[]=new int[f1.length];
			String s2=sc.next();
			String f2[]=s2.split("");
			int z2[]=new int[f2.length];
			int x1=0,x2=0;
			String j=" ";
			//��s1,s2�����Q�i��
			for(int i=0;i<f1.length;i++){
				z1[i]=Integer.parseInt(f1[i]);
				x1+=z1[i]*(int)Math.pow(2,f1.length-1-i);
			}
			for(int i=0;i<f2.length;i++){
				z2[i]=Integer.parseInt(f2[i]);
				x2+=z2[i]*(int)Math.pow(2,f2.length-1-i);
			}
			//�䤽�]��
			while(x2!=0){//�l�Ƭ�0�N���ɤF
				int t=x2;
				x2=x1%x2;//�b�l�ƥ�����0���e���_�����l��
				x1=t;//�������p���ơA�̫�|�O���X�̤j���]��
			}
			if(x2==0 && x1!=1){//�̤j���]�Ƥ���1
				System.out.println("Pair #"+(g+1)+": All you need is love!");
			}
			else{
				System.out.println("Pair #"+(g+1)+": Love is not all you need!");
			}
		}
    }
}

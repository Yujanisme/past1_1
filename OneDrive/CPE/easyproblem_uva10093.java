import java.util.*;
public class easyproblem_uva10093 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String s=sc.next();
			char[] s1=s.toCharArray();
			int sum=0;
			int max=1;
			for(int i=0;i<s1.length;i++){
				int x=s1[i];
				int c=0;
				if(x>=48 && x<=57){//��J�O�Ʀr
					c=x-48;
				}
				else if(x>=65 && x<=90){//��J�OA~Z(10~35)
					c=x-55;
				}
				else if(x>=97 && x<=122){//��J�Oa~z(36~61)
					c=x-61;
				}
				sum+=c;//�֥[�b�@ �_
				max=c>max ? c:max;//�����r�����̤j��
			}
			for(int i=max;i<=62;i++){//�q�̤j�Ʀr���r�����W�P�_
				if(i==62){//�]���̤j�i��O62�i��A�ҥH�p�Gi��62�o�ӼƦr�N���|���i��
					System.out.println("such number is impossible!");
					break;
				}
				if(sum%i==0){//x�i��Ʀr�ۥ[�|����x-1������
					System.out.println(i+1);
					break;
				}
			}
		}		
    }
}

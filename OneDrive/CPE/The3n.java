import java.util.*;
public class The3n {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	while(sc.hasNextInt()){
    		int count=0;
    		int a=sc.nextInt();//�p��
    		int b=sc.nextInt();//�j��
    		int d=Math.abs(a-b);
    		int c=0;
    		int s[]=new int[d+1];//�x�s�C�ӼƦr��cycle length
    		if(a<b){
    			for(int i=a;i<=b;i++){//�p��C�ӼƦr��cycle length
    				c=i;
       				while(c>0){//��Ʀr�j��1�ɷ|�}�l�p��	
    					if(c==1){//�p�G�Ʀr��1�A���K�B����
    						c=1;
    						count++;//1�]��@��
    						break;
    					}
    					if(c%2==1){//�Ʀr���_�ƪ��B��
    						c=c*3+1;
    					}
    					else {
    						c=c/2;//�Ʀr�����ƪ��B��
    					}
    					count++;//�C�������B�ⳣ�|+1
    				}
    				s[i-a]=count;//��cycle length�s��S�}�C
    				count=0;
    		}
    		Arrays.sort(s);//�Ѥp�ƨ�j
    		System.out.printf("%d %d %d\r\n",a,b,s[d]);//��X�̫�@�ӼƦr(�̤j��)
    		}
    		else{
    			for(int i=b;i<=a;i++){//�p��C�ӼƦr��cycle length
    				c=i;
       				while(c>0){//��Ʀr�j��1�ɷ|�}�l�p��	
    					if(c==1){//�p�G�Ʀr��1�A���K�B����
    						c=1;
    						count++;//1�]��@��
    						break;
    					}
    					if(c%2==1){//�Ʀr���_�ƪ��B��
    						c=c*3+1;
    					}
    					else {
    						c=c/2;//�Ʀr�����ƪ��B��
    					}
    					count++;//�C�������B�ⳣ�|+1
    				}
    				s[i-b]=count;//��cycle length�s��S�}�C
    				count=0;
    		}
    		Arrays.sort(s);//�Ѥp�ƨ�j
    		System.out.printf("%d %d %d\r\n",a,b,s[d]);//��X�̫�@�ӼƦr(�̤j��)
    		}
   		}
   }
}
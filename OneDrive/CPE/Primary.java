import java.util.*;
public class Primary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        int x=sc.nextInt();//��J��Ӿ��
        int y=sc.nextInt();
        int carry=0,count=0;//���]�wcarry�Mcount��0
        if(x==0 && y==0)break;//�p�G��ӼƦr����0�h���B�@
        
        while(x!=0 || y!=0){//�Y�䤤�@�Ӥ���0�h�h���[�k
        	carry=(x%10+y%10)>9? 1:0;//x�My%10�O���F�n���̫�@�ӼƦr�A�Y���ӼƦr�j��9�N�i��=>carry=1
        	if((x/10%10==9 && y/10%10!=0)){
        		x=x/10;
        		y=y/10;
        	}
        	else if((x/10%10==9 && y/10%10==0)){
        		x=x/10;
        		y=carry+y/10;
        	}
        	else{
        		x=carry+x/10;//���Ʀr�ѤU��
        		y=y/10;
        	}
        	if(carry==1){
        		count++;//�C�P�_�@��carry=1�Acount�N�|�W�[(�p�⦳�h�֭Ӷi��)
        	}
        	System.out.printf("%-10d %-10d %d",x,y,carry);
        	System.out.println();
        }
        
        if(count==0){
        	System.out.println("No carry operation.");
        }
        else if(count==1){
        	System.out.println("1 carry operation.");
        }
        else{
        	System.out.println(count+" carry operations.");//��X���G
        }	
        }
        
    }
}


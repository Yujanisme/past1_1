import java.util.*;
public class Banglanumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=1;
        while(sc.hasNextLong()){
        	long a=sc.nextLong();//input number�A�]���Ʀr�ܤj�ҥH�n��Long
        	if(a/1000000000>0){//�p�G�j��1000000000�N�n���ⳡ����
        		long b=(a/1000000000)*100;//���b�������A���H10�~��p��e�b��
        		a=a%1000000000;
        		if(a==0){
       				System.out.printf("%4d. ",count);
       				print(b);
       				System.out.print("kuti\r\n");
       				count++;
       			}
       			else{
       				if(a<10000000){
       					System.out.printf("%4d. ",count);
	        			print(b);//�p��e�b��
	        			System.out.print("kuti ");
	        			print(a);
	        			remain(a);
	        			System.out.print("\r\n");
	        			count++;
       				}
       				else{
	       				System.out.printf("%4d. ",count);
		        		print(b);//�p��e�b��
		        		print(a); //�p���b��
			        	remain(a);//�]���j��9��ƪ��ܫe�b�������Oshata�A�ҥH��S����쪺�t�~��
		        		System.out.print("\r\n");
		        		count++;
       				}
	        	}
       		}
       		else if(a==0){
       			System.out.printf("%4d. ",count);
       			System.out.print("0\r\n");
       			count++;
       		}
        	else{
        		if(a%10000000==0){
        			a=a/10000000;
        			System.out.printf("%4d. ",count);
        			System.out.print(a+" kuti\r\n");
        			count++;
        		}
        		else{
	        		System.out.printf("%4d. ",count);
		        	print(a);
		        	remain(a);
		        	System.out.print("\r\n");
		        	count++;
	        	}
        	} 
   		}	
   }
        
   static void print(long a){
   		kuti(a);
	    a=a%10000000;//��a���l��=��kuti�h��
	    lakh(a);
	    a=a%100000;//��lakh�]�h��
	    hajar(a);
	    a=a%1000;//��hajar�h��
	    shata(a);
   }
    static void kuti(long a){
    	long b=a/10000000;//�p��kuti�Ӽ�
    	if(b>0){//�j��0�~�|�L�X�F��
    		System.out.print(b+" kuti ");
    	}
    }
    static void lakh(long a){
    	long b=a/100000;//�p��lakh�Ӽ�
    	if(b>0){
    		System.out.print(b+" lakh ");
    	}
    	
    }
    static void hajar(long a){
    	long b=a/1000;//�p��hajar�Ӽ�
    	if(b>0){
    		System.out.print(b+" hajar ");
    	}
    }
    static void shata(long a){
    	long b=a/100;//�p��shata�Ӽ�
    	if(b>0){
    		System.out.print(b+" shata ");
    	}
    }
    static void remain(long a){
    	long b=a%100;//�p��Ѿl��
    	if(b>0){
    		System.out.print(b);	
    	}
    }
}
import java.util.*;
public class Banglanumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=1;
        while(sc.hasNextLong()){
        	long a=sc.nextLong();//input number，因為數字很大所以要用Long
        	if(a/1000000000>0){//如果大於1000000000就要分兩部分算
        		long b=(a/1000000000)*100;//把後半部扣掉再乘以10才能計算前半部
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
	        			print(b);//計算前半部
	        			System.out.print("kuti ");
	        			print(a);
	        			remain(a);
	        			System.out.print("\r\n");
	        			count++;
       				}
       				else{
	       				System.out.printf("%4d. ",count);
		        		print(b);//計算前半部
		        		print(a); //計算後半部
			        	remain(a);//因為大於9位數的話前半部結尾是shata，所以把沒有單位的另外做
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
	    a=a%10000000;//取a的餘數=把kuti去掉
	    lakh(a);
	    a=a%100000;//把lakh也去掉
	    hajar(a);
	    a=a%1000;//把hajar去掉
	    shata(a);
   }
    static void kuti(long a){
    	long b=a/10000000;//計算kuti個數
    	if(b>0){//大於0才會印出東西
    		System.out.print(b+" kuti ");
    	}
    }
    static void lakh(long a){
    	long b=a/100000;//計算lakh個數
    	if(b>0){
    		System.out.print(b+" lakh ");
    	}
    	
    }
    static void hajar(long a){
    	long b=a/1000;//計算hajar個數
    	if(b>0){
    		System.out.print(b+" hajar ");
    	}
    }
    static void shata(long a){
    	long b=a/100;//計算shata個數
    	if(b>0){
    		System.out.print(b+" shata ");
    	}
    }
    static void remain(long a){
    	long b=a%100;//計算剩餘的
    	if(b>0){
    		System.out.print(b);	
    	}
    }
}
import java.util.*;
class arr{
    arr(int []s,int m){
    	for(int j=0;j<s.length;j++){
	        for(int i=0;i<s.length-1;i++){
	        	int a=s[i]%m;
	        	int b=s[i+1]%m;
	            if(a > b){
	                int temp=s[i+1];
	                s[i+1]=s[i];
	                s[i]=temp;
	            }
	            else if(a==b){
	            	if(s[i]%2==0 && s[i+1]%2==1){//s[i+1]要在s[i]前面
		                int temp=s[i+1];
		                s[i+1]=s[i];
		                s[i]=temp;
		            }
		            else if(s[i+1]%2==-1 && s[i]%2==0){
		            	int temp=s[i+1];
		                s[i+1]=s[i];
		                s[i]=temp;
		            }
		            else if(((s[i]%2==1 && s[i+1]%2==1)||(s[i]%2==-1 && s[i+1]%2==-1)) && s[i]<s[i+1]){
		                int temp=s[i+1];
		                s[i+1]=s[i];
		                s[i]=temp;
		             }
		             else if(s[i]%2==0 && s[i+1]%2==0 && s[i]>s[i+1]){
		                 int temp=s[i+1];
		                 s[i+1]=s[i];
		                 s[i]=temp;
		             }
	            }
	        }
    	}
	    for(int i=0;i<s.length;i++){
	    	System.out.println(s[i]);
	    }
    }
}

public class sortsortsort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
			int n=sc.nextInt();
			int m=sc.nextInt();
			if(n==0 && m==0){
				System.out.println(n+" "+m);
				break;
			}
			int s[]=new int[n];
			for(int i=0;i<n;i++){
				s[i]=sc.nextInt();
			}
			System.out.println(n+" "+m);
			arr a=new arr(s,m);
		}
    }
}
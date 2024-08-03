import java.util.*;
public class The3n {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	while(sc.hasNextInt()){
    		int count=0;
    		int a=sc.nextInt();//
    		int b=sc.nextInt();//
    		int d=Math.abs(a-b);
    		int c=0;
    		int s[]=new int[d+1];//纗–计cycle length
    		if(a<b){
    			for(int i=a;i<=b;i++){//璸衡–计cycle length
    				c=i;
       				while(c>0){//讽计1穦秨﹍璸衡	
    					if(c==1){//狦计1ぃ獽氨ゎ
    						c=1;
    						count++;//1衡Ω
    						break;
    					}
    					if(c%2==1){//计计笲衡
    						c=c*3+1;
    					}
    					else {
    						c=c/2;//计案计笲衡
    					}
    					count++;//–Ω暗Ч笲衡常穦+1
    				}
    				s[i-a]=count;//рcycle lengthS皚
    				count=0;
    		}
    		Arrays.sort(s);//パ逼
    		System.out.printf("%d %d %d\r\n",a,b,s[d]);//块程计(程)
    		}
    		else{
    			for(int i=b;i<=a;i++){//璸衡–计cycle length
    				c=i;
       				while(c>0){//讽计1穦秨﹍璸衡	
    					if(c==1){//狦计1ぃ獽氨ゎ
    						c=1;
    						count++;//1衡Ω
    						break;
    					}
    					if(c%2==1){//计计笲衡
    						c=c*3+1;
    					}
    					else {
    						c=c/2;//计案计笲衡
    					}
    					count++;//–Ω暗Ч笲衡常穦+1
    				}
    				s[i-b]=count;//рcycle lengthS皚
    				count=0;
    		}
    		Arrays.sort(s);//パ逼
    		System.out.printf("%d %d %d\r\n",a,b,s[d]);//块程计(程)
    		}
   		}
   }
}
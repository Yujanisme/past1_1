import java.util.*;
public class Primary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        int x=sc.nextInt();//块ㄢ俱计
        int y=sc.nextInt();
        int carry=0,count=0;//砞﹚carry㎝count0
        if(x==0 && y==0)break;//狦ㄢ计常0玥ぃ笲
        
        while(x!=0 || y!=0){//璝ㄤいぃ0玥暗猭
        	carry=(x%10+y%10)>9? 1:0;//x㎝y%10琌璶程计璝ê计9碞秈=>carry=1
        	if((x/10%10==9 && y/10%10!=0)){
        		x=x/10;
        		y=y/10;
        	}
        	else if((x/10%10==9 && y/10%10==0)){
        		x=x/10;
        		y=carry+y/10;
        	}
        	else{
        		x=carry+x/10;//计逞
        		y=y/10;
        	}
        	if(carry==1){
        		count++;//–耞Ωcarry=1count碞穦糤(璸衡Τぶ秈)
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
        	System.out.println(count+" carry operations.");//块挡狦
        }	
        }
        
    }
}


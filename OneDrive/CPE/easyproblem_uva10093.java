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
				if(x>=48 && x<=57){//块琌计
					c=x-48;
				}
				else if(x>=65 && x<=90){//块琌A~Z(10~35)
					c=x-55;
				}
				else if(x>=97 && x<=122){//块琌a~z(36~61)
					c=x-61;
				}
				sum+=c;//仓 癬
				max=c>max ? c:max;//魁ダ程
			}
			for(int i=max;i<=62;i++){//眖程计ダ┕耞
				if(i==62){//程秈琌62秈┮狦i62硂计碞ぃ穦Τ秈
					System.out.println("such number is impossible!");
					break;
				}
				if(sum%i==0){//x秈计穦单x-1计
					System.out.println(i+1);
					break;
				}
			}
		}		
    }
}

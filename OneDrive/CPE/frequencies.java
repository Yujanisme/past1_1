import java.util.*;
public class frequencies {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String s=sc.nextLine();
			int[] save=new int[122];//存ascii，一格對應一個字母
			int max=0;
			for(int i=0;i<s.length();i++){
				save[s.charAt(i)]++;//記錄一次加一次
			}
			for(int i=0;i<save.length;i++){
				max=save[i]>max ? save[i]:max;
			}
			for(int i=1;i<=max;i++){
				for(int j=save.length-1;j>47;j--){
					if(save[j]==i){
						System.out.println(j+" "+i);
					}
				}
			}
		}
    }
}

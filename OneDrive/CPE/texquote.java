import java.util.*;
public class texquote {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		while(sc.hasNext()){
			String s=sc.nextLine();
			String s1[]=s.split("");
			for(int i=0;i<s1.length;i++){
				if(s1[i].equals("\"")){
					if(count%2==0){
						s1[i]="``";
						count++;
					}
					else{
						s1[i]="''";
						count++;
					}
				}
			}
			for(int i=0;i<s1.length;i++){
				System.out.print(s1[i]);
			}
			System.out.println();
		}
	}
} 
       
 
         
 
  
 
  
 
   

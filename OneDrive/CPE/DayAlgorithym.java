import java.util.*;
public class DayAlgorithym {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int y=(2010*365)+(2010/4)-(2010/100)+(2010/400);
			int m=sc.nextInt();
			int d=sc.nextInt();
			
			switch(m-1){
				case 11:y+=30;
				case 10:y+=31;
				case 9:y+=30;
				case 8:y+=31;
				case 7:y+=31;
				case 6:y+=30;
				case 5:y+=31;
				case 4:y+=30;
				case 3:y+=31;
				case 2:y+=28;
				case 1:y+=31;
			}
			y+=d;
	        System.out.print(y);
			switch(y%7){
				case 0:System.out.println("Sunday");break;
				case 1:System.out.println("Monday");break;
				case 2:System.out.println("Tuesday");break;
				case 3:System.out.println("Wednesday");break;
				case 4:System.out.println("Thursday");break;
				case 5:System.out.println("Friday");break;
				case 6:System.out.println("Saturday");break;
			}
			y=0;
		}
    }
}

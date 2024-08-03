import java.util.*;
public class die_game {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
		
			int n=sc.nextInt();
			if(n==0)break;
			int die[][]=new int[3][4];
			for(int i=0;i<die.length;i++){
				for(int j=0;j<die[0].length;j++){
					die[i][j]=0;
				}
			}
			die[0][0]=2;
			die[1][0]=1;
			die[2][0]=5;
			die[1][1]=4;
			die[1][2]=6;
			die[1][3]=3;
			for(int i=0;i<n;i++){
				String direction=sc.next();
				int t=0;
				switch(direction){
					case "north" :  t=die[0][0];
									die[0][0]=die[1][0];
									die[1][0]=die[2][0];
									die[2][0]=die[1][2];
									die[1][2]=t;
									break;
									
					case "south" :  t=die[2][0];
									die[2][0]=die[1][0];
									die[1][0]=die[0][0];
									die[0][0]=die[1][2];
									die[1][2]=t;
									break;
									
					case "west" :   t=die[1][0];
									die[1][0]=die[1][1];
									die[1][1]=die[1][2];
									die[1][2]=die[1][3];
									die[1][3]=t;
									break;
									
					case "east" :   t=die[1][0];
									die[1][0]=die[1][3];
									die[1][3]=die[1][2];
									die[1][2]=die[1][1];
									die[1][1]=t;
									break;
				}	
			}
			System.out.println(die[1][0]);
		}
    }
}

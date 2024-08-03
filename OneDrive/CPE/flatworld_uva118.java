import java.util.*;
public class flatworld_uva118 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();//座標邊界
		while(sc.hasNext()){
			int x=sc.nextInt();
			int y=sc.nextInt();//初始座標
			String dir=sc.next();//初始方向
			String d=sc.next();//指令列
			String r[]={"N","E","S","W"};
			String com[]=d.split("");
			for(int i=0;i<com.length;i++){
				if(com[i].equals("R")){
					for(int j=0;j<r.length;j++){
						if(r[j].equals(dir) && j<r.length-1){
							dir=r[j+1];
						//	System.out.println(x+" "+y+" "+dir);
							break;
						}
						else if(r[j].equals(dir) && j==r.length-1){
							dir=r[0];
						//	System.out.println(x+" "+y+" "+dir);
							break;
						}
					}
				}
				else if(com[i].equals("L")){
					for(int j=0;j<r.length;j++){
						if(r[j].equals(dir) && j>0){
							dir=r[j-1];
						//	System.out.println(x+" "+y+" "+dir);
							break;
						}
						else if(r[j].equals(dir) && j==0){
							dir=r[r.length-1];
						//	System.out.println(x+" "+y+" "+dir);
							break;
						}
					}
				}
				else if(com[i].equals("F")){
					switch(dir){
						case "N" : y++;
					//			   System.out.println(x+" "+y+" "+dir);
								   break;
						case "S" : y--;
					//			   System.out.println(x+" "+y+" "+dir);
								   break;
						case "E" : x++;
					//			   System.out.println(x+" "+y+" "+dir);
								   break;
						case "W" : x--;
					//			   System.out.println(x+" "+y+" "+dir);
								   break;
					}
					
					if(x<0 || y<0 || x>x1 || y>y1){
						if(x<0){
							System.out.println((x+1)+" "+y+" "+dir+" LOST");
						}
						else if(x>x1){
							System.out.println((x-11)+" "+y+" "+dir+" LOST");
						}
						else if(y<0){
							System.out.println(x+" "+(y+1)+" "+dir+" LOST");
						}
						else if(y>y1){
							System.out.println(x+" "+(y-1)+" "+dir+" LOST");
						}
						break;
					}
				}
				if(i==com.length-1){
					System.out.println(x+" "+y+" "+dir);
				}
			}
		}
    }
}

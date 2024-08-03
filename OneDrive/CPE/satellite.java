import java.util.*;
public class satellite {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			double r=sc.nextDouble();
			double angle=sc.nextDouble();
			String unit=sc.next();
			double an=0;
			if(unit.equals("min")){
				an=angle/60;//1 minute = 60 degree
			}
			else{
				an=angle;
			}
			while(an>360){
				an-=360;
			}
			if(an>180){
				an=360-an;
			}
			double arc=2*(r+6440)*(Math.PI)*an/360;
			double chord=2*(r+6440)*(Math.sin(an/2*(Math.PI)/180));//
			System.out.printf("%.6f %.6f",arc,chord);
		}
    }
}

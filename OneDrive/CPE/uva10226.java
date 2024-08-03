import java.util.*; 
public class uva10226 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        sc.nextLine();
        for(int g=0;g<n;g++){
            String s[]=new String[1000000];
            int f=0;
            while(sc.hasNext()){
                s[f]=sc.nextLine();
                if(s[f].equals("")&&f>1){
                	break;
                }
                f++;
            }
            double x[]=new double[f];
            String c[]=new String[f];
            for(int i=0;i<c.length;i++){
            	c[i]=s[i];
            }
            Arrays.sort(c);
            int count=1,j=0,all=0;
            for(int i=0;i<c.length-1;i++){
                if(c[i].equals(c[i+1])){
                    count++;
                }
                else{
                    x[j]=count;
                    count=1;
                    j++;
                }
                if(i==c.length-2){
                	x[j]=count;
                }
            }
            for(int i=0;i<x.length;i++){
                all+=x[i];
            }
            for(int i=0;i<x.length;i++){
                x[i]=x[i]/all*100;
            }
            int b=0;
            for(int i=0;i<c.length-1;i++){
                if(!c[i].equals(c[i+1])&& !c[i].equals("")){
                    System.out.print(c[i]+" ");
                    System.out.printf("%6.4f",x[b]);
                    System.out.println();
                    b++;
                }
                if(i==c.length-2){
                	System.out.print(c[i+1]+" ");
                	System.out.printf("%6.4f",x[b]);
                	System.out.println();
                }
            }
            if(g!=n-1)System.out.println();
    	}
    }
}
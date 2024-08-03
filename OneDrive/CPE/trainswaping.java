import java.util.*;
public class trainswaping {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//case
		for(int u=0;u<n;u++){
			int L=sc.nextInt();//´X­Ó¼Æ¦r
			int arr[]=new int[L];
			for(int i=0;i<arr.length;i++){
				arr[i]=sc.nextInt();
			}
			int count=0;
			int inx=arr.length-2;
			for(int i=0;i<arr.length-1;i++){
				if(arr[i]>arr[i+1]){
					int temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
					count++;
					for(int x:arr){
						System.out.print(x+" ");
					}
					System.out.print(inx);
					System.out.println();
				}
				if(i==inx){
					inx=i-1;
					i=-1;
				}
			}
			System.out.println("Optimal train swapping takes "+count+" swaps.");
		}
    }
}

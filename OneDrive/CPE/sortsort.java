import java.util.*;
import java.lang.*;
class arr implements Comparable<arr>{
	Scanner sc=new Scanner(System.in);
	int v,mod;
	arr(int i,int m){
		this.v=i;
		this.mod=i%m;
	}
	public String toString(){
		return Integer.toString(this.v);
	}
	public int compareTo(arr a){//正值是排後面的，負值排前面
		if(this.mod != a.mod){
			return this.mod<a.mod ? -1:1;
		}
		else{
			if(this.v%2==0 && a.v%2==0){
				return this.v>a.v ? 1:-1;
			}
			else if(this.v%2 != 0 && a.v%2==0){
				return -1;
			}
			else if(this.v%2==0 && a.v%2!=0){
				return 1;
			}
			else {
				return this.v<a.v ? 1:-1;
			}
		}
	}
}
public class sortsort {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int m=sc.nextInt();
			if(n==0 && m==0){
				System.out.println("0 0");
				break;
			}
			arr s[]=new arr[n];
			for(int i=0;i<n;i++){
				s[i]=new arr(sc.nextInt(),m);
			}
			System.out.println(n+" "+m);
			Arrays.sort(s);
			for(int i=0;i<s.length;i++){
				System.out.println(s[i].toString());
			}
		}
    }
}
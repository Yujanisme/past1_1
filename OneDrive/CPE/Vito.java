import java.util.*;
public class Vito  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();//���X����ƭn����
        
        for(int i=0;i<a;i++){
        	int b=sc.nextInt();//�@����Ƥ����X�ӼƦr
        	int s[]=new int[b];//�]�w�@�Ӱ}�C
        	for(int j=0;j<s.length;j++){
        		s[j]=sc.nextInt();//��Ʀr�s�J�}�C��
        	}
        	Arrays.sort(s);//�Ѥp�ƨ�j
        	int mid=b/2;//�o������ƬO�ĴX�Ӧ�m
        	int total=0;//�̤@�}�l���s
        	for(int x=0;x<b;x++){
        		if(x<mid){total+=s[mid]-s[x];}
				else{
					total+=s[x]-s[mid];
				}
        	}
        	System.out.println(total);
        }
    }
}

import java.util.*;
public class listofconquest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();//��J���X�Ӹ��
        String[] s=new String[3];//�@�ӥΨ��x�s��a�A��ӥΨ��x�s�W�r
        String[] s1=new String[a];//�x�s��a�W�r
        int index=0,count=0,c=0;
        for(int j=0;j<a;j++){
        	for(int i=0;i<s.length;i++){
        		s[i]=sc.next();
        	}
        	s1[j]=s[0];
        }
        Arrays.sort(s1);
        for(int i=0;i<a;i++){
        	c=print(index,count,a,c,s1);//2 
        	if(c==a){
        		break;
        	}
        	index=c;
        	count=0;
        }
    }
    static int print(int index,int count,int a,int c,String[] s1){
    	for(int i=c;i<a;i++){
        	if(s1[c].equals(s1[i])){
        		index++;
        		count++;
        	}
        }
        System.out.println(s1[c]+" "+count);
        return index;//c
    }
}

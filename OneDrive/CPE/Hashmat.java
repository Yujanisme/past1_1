import java.util.*;
public class Hashmat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        	String[] s=new String[2];//�]�@�Ӧr��}�C,�i�x�s�r��ξ��
        	long[] s1=new long[2];//�]�@�Ӿ�ƫ��A�}�C�A�ΨӹB��
        	for(int i=0;i<s.length;i++){
        		s[i]=sc.next();//��Ʀr�s�J�}�C
        		if(s[i].equals("End")){//�p�G�J��"End"
        			System.exit(0);//�N�����{��
        		}
        		s1[i]=Long.parseLong(s[i]);//�S�J��"End"�N��s�}�C���F���ഫ����Ʀs�Js1�}�C
        	}
        	long c=Math.abs(s1[1]-s1[0]);//�᭱��e��
        	System.out.println(c);//��X�B����
        }
    }
}

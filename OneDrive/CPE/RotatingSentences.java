import java.util.*;
public class RotatingSentences {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String f[][]=new String[101][101];
		
		int line=0,max=0,i=0,record=0;//line�O�����C�ơAmax�O�����̪������C�X�Ӧr�Ai�O���C�Arecord�O�������C�̪�
		while(sc.hasNext()){
			String s=sc.nextLine();//��J�@�C�r��
			String s1[]=s.split("");
			f[i]=s1;//����Ϋ᪺�r��s�J�}�C
			i++;//���C
			line++;//(����)�W�[�C��
			max=(max>s.length())? max:s.length();//��X�̪������C���X�Ӧr
			record=max>s.length()? record:i-1;//��X�̪����O���C
		}
		//�L�X90�ת��}�C
		for(int k=0;k<max;k++){
			for(int j=line-1;j>=0;j--){
				if(k>f[j].length){//�p�G�C���j�p�j��Ӧ����
					if(j>record){//�P�_�쥻�}�C��j�C�O�b�̪����W�٤U
						System.out.print(" ");//�U����90�׫�h�l���n�ɪť�
						continue;
					}
					else{
						 continue;//�W���ܫh�~��L�C
					}
				}
				if(f[j][k]!="null"){//�P�_��(j,k)��O�_��null
					System.out.print(f[j][k]);//���O���ܴN�L�X
				}
			}
			System.out.println();
		}
	}
}
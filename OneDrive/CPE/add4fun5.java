class vendor{
	public String name;//�����W�r
	protected int price;//�]�w����
	protected int scord;//�]�w����
	protected String meal[]={"����","����"} ;//�]�w���\
	vendor(String a,int b,int c){//��l�ƩҦ��]�w
		this.name=a;
		this.price=b;
		this.scord=c;
	}
	protected void upprice(boolean b){
		if(b==true){//if booleaan is true more hp and mp
			this.upscord(false);
		}//if boolean is false only morehp
		this.price=this.price+1000;//�D�حn������
	}
	protected void upscord(boolean b){
		if(b==true){//if boolean is true  more hp and mp
			this.upprice(false);//if boolean is false only morehp
		}
		this.scord=this.scord+1;
	}
	protected void sopentertain(){
		int num=((int)(Math.random()*10000))%meal.length;//�H����ܩ۫ݶ���(�H�U�P�z)
		System.out.println(this.name+"����S�O�۫�"+this.meal[num]);//��X�۫ݶ���(�H�U�P�z)
	}
	protected String sopinformation(){
		String info="�\�U����:"+this.name+" ��������:"+this.price+" ��������:"+this.scord+"�۫ݶ��ج�:";
		for(String str:this.meal){
			info+=str+",";
		}
		return info;
	}
}
class diner extends vendor{
	protected static String meal[]={"���o�\�]","�B�N�O"};
	diner(String a,int b,int c){
		super(a,b,c);
		for(int i=0;i<super.meal.length;i++){
			this.meal=Arrays.copyOf(this.meal,this.meal.length+1);
			this.meal[this.meal.length-1]=super.meal[i];//��s�ޯ�[�i�h(�H�U�P�z)
		}
	}
	protected void sopentertain(){
		int num=((int)(Math.random()*10000))%meal.length;//�H����ܩ۫ݶ���(�H�U�P�z)
		System.out.println(this.name+"����S�O�۫�"+this.meal[num]);//��X�۫ݶ���(�H�U�P�z)
	}
	protected String sopinformation(){
		String info="�\�U����:"+this.name+" ��������:"+this.price+" ��������:"+this.scord+"�۫ݶ��ج�:";
		for(String str:this.meal){
			info+=str+",";
		}
		return info;
	}
}
class restaurant extends diner{
	protected String meal[]={"���G"};
	restaurant(String a,int b,int c){
		super(a,b,c);
		for(int i=0;i<super.meal.length;i++){
			this.meal=Arrays.copyOf(this.meal,this.meal.length+1);
			this.meal[this.meal.length-1]=super.meal[i];
		}
	}
	protected void sopentertain(){
		int num=((int)(Math.random()*10000))%meal.length;//�H����ܩ۫ݶ���(�H�U�P�z)
		System.out.println(this.name+"����S�O�۫�"+this.meal[num]);//��X�۫ݶ���(�H�U�P�z)
	}
	protected String sopinformation(){
		String info="�\�U����:"+this.name+" ��������:"+this.price+" ��������:"+this.scord+"�۫ݶ��ج�:";
		for(String str:this.meal){
			info+=str+",";
		}
		return info;
	}
}
class fine_dining_restaurant extends diner{
	protected String meal[]={"�J�|"};
	fine_dining_restaurant(String a,int b,int c){
		super(a,b,c);
		for(int i=0;i<super.meal.length;i++){
			this.meal=Arrays.copyOf(this.meal,this.meal.length+1);
			this.meal[this.meal.length-1]=super.meal[i];
		}
	}
	protected void sopentertain(){
		int num=((int)(Math.random()*10000))%meal.length;//�H����ܩ۫ݶ���(�H�U�P�z)
		System.out.println(this.name+"����S�O�۫�"+this.meal[num]);//��X�۫ݶ���(�H�U�P�z)
	}
	protected String sopinformation(){
		String info="�\�U����:"+this.name+" ��������:"+this.price+" ��������:"+this.scord+"�۫ݶ��ج�:";
		for(String str:this.meal){
			info+=str+",";
		}
		return info;
	}
}
public class add4fun5 {
    public static void main(String[] args) {
        restaurant a = new restaurant("�����]",100,3);
        System.out.println(a.sopinformation());
        a.upprice(false);
        System.out.println(a.sopinformation());
        a.upprice(true);
        System.out.println(a.sopinformation());
        a.upscord(false);
        System.out.println(a.sopinformation());
        a.upscord(true);
        System.out.println(a.sopinformation());
        a.sopentertain();
        a.sopentertain();
        a.sopentertain();
        a.sopentertain();
        a.sopentertain();
    }
}
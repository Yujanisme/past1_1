class vendor{
	public String name;//食物名字
	protected int price;//設定價錢
	protected int scord;//設定評分
	protected String meal[]={"飲料","茶水"} ;//設定附餐
	vendor(String a,int b,int c){//初始化所有設定
		this.name=a;
		this.price=b;
		this.scord=c;
	}
	protected void upprice(boolean b){
		if(b==true){//if booleaan is true more hp and mp
			this.upscord(false);
		}//if boolean is false only morehp
		this.price=this.price+1000;//題目要的公式
	}
	protected void upscord(boolean b){
		if(b==true){//if boolean is true  more hp and mp
			this.upprice(false);//if boolean is false only morehp
		}
		this.scord=this.scord+1;
	}
	protected void sopentertain(){
		int num=((int)(Math.random()*10000))%meal.length;//隨機選擇招待項目(以下同理)
		System.out.println(this.name+"今日特別招待"+this.meal[num]);//輸出招待項目(以下同理)
	}
	protected String sopinformation(){
		String info="餐廳種類:"+this.name+" 平均價錢:"+this.price+" 平均評分:"+this.scord+"招待項目為:";
		for(String str:this.meal){
			info+=str+",";
		}
		return info;
	}
}
class diner extends vendor{
	protected static String meal[]={"奶油餐包","冰淇淋"};
	diner(String a,int b,int c){
		super(a,b,c);
		for(int i=0;i<super.meal.length;i++){
			this.meal=Arrays.copyOf(this.meal,this.meal.length+1);
			this.meal[this.meal.length-1]=super.meal[i];//把新技能加進去(以下同理)
		}
	}
	protected void sopentertain(){
		int num=((int)(Math.random()*10000))%meal.length;//隨機選擇招待項目(以下同理)
		System.out.println(this.name+"今日特別招待"+this.meal[num]);//輸出招待項目(以下同理)
	}
	protected String sopinformation(){
		String info="餐廳種類:"+this.name+" 平均價錢:"+this.price+" 平均評分:"+this.scord+"招待項目為:";
		for(String str:this.meal){
			info+=str+",";
		}
		return info;
	}
}
class restaurant extends diner{
	protected String meal[]={"水果"};
	restaurant(String a,int b,int c){
		super(a,b,c);
		for(int i=0;i<super.meal.length;i++){
			this.meal=Arrays.copyOf(this.meal,this.meal.length+1);
			this.meal[this.meal.length-1]=super.meal[i];
		}
	}
	protected void sopentertain(){
		int num=((int)(Math.random()*10000))%meal.length;//隨機選擇招待項目(以下同理)
		System.out.println(this.name+"今日特別招待"+this.meal[num]);//輸出招待項目(以下同理)
	}
	protected String sopinformation(){
		String info="餐廳種類:"+this.name+" 平均價錢:"+this.price+" 平均評分:"+this.scord+"招待項目為:";
		for(String str:this.meal){
			info+=str+",";
		}
		return info;
	}
}
class fine_dining_restaurant extends diner{
	protected String meal[]={"蛋糕"};
	fine_dining_restaurant(String a,int b,int c){
		super(a,b,c);
		for(int i=0;i<super.meal.length;i++){
			this.meal=Arrays.copyOf(this.meal,this.meal.length+1);
			this.meal[this.meal.length-1]=super.meal[i];
		}
	}
	protected void sopentertain(){
		int num=((int)(Math.random()*10000))%meal.length;//隨機選擇招待項目(以下同理)
		System.out.println(this.name+"今日特別招待"+this.meal[num]);//輸出招待項目(以下同理)
	}
	protected String sopinformation(){
		String info="餐廳種類:"+this.name+" 平均價錢:"+this.price+" 平均評分:"+this.scord+"招待項目為:";
		for(String str:this.meal){
			info+=str+",";
		}
		return info;
	}
}
public class add4fun5 {
    public static void main(String[] args) {
        restaurant a = new restaurant("牛排館",100,3);
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
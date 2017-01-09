package Chapter02;

public class Goods {
	
	String name;
	protected int price;
	int countStock;
	int countSold;
	
//	default 접근 제어(public, protected, private 로 접근 지정하지 않은 경우 ) 
	 String GetName(){
		return name;
	}
	
	void discount(int percentage){
		price= price - (price*percentage);
	}
}

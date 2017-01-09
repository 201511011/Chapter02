
public class Goods2 {
	public static int countofgoods;
	
	private String name;
	private int price;
	private int countsold;
	private int countstock;
	
//	기본 생성자
	public Goods2(){
//		System.out.println("기본 생성자 호출");
		Goods2.countofgoods++;
		
	}
	
//	우선순위는 파라미터라 파라미터에 파라미터 이름을 넣게 된다. 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price<0){
			price=0;
		}
		this.price = price;
	}
//	return 값이 있고, 파리미터가 없는 메소드 
	public int getCountsold() {
		return countsold;
	}
	
//	return 값이 없고, 파라미터가 있는 메소드 
	public void setCountsold(int countsold) {
		this.countsold = countsold;
	}
	public int getCountstock() {
		return countstock;
	}
	public void setCountstock(int countstock) {
		this.countstock = countstock;
	}
	
//	return 값이 없고 파라미터도 없는 메소드
	public void showInfo(){
		System.out.println("name:"+name+","+" price:"+price+","+" countstock:"+countstock);
	}
	
	public double calcDiscountPrice(double rate){
		double discountprice=price*rate;
		return discountprice;
//		return price*rate;
	}
}

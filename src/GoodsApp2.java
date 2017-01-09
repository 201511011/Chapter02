
public class GoodsApp2 {
	public static void main(String[] args) {
		Goods2 camera = new Goods2();
		camera.setName("canon");
		System.out.println(camera.getName());

//		객체 변수에 바로 접근하면 잘못 된 데이터를 세팅할 수 있는 가능성
//		Goods.price=-1
		
		camera.setPrice(-1);
		System.out.println(camera.getPrice());
		
//		static 변수 테스트
		Goods2 goods1=new Goods2();
		System.out.println(Goods2.countofgoods);
		
		Goods2 goods2=new Goods2();
		System.out.println(Goods2.countofgoods);
		
		Goods2 goods3=new Goods2();
		System.out.println(Goods2.countofgoods);
		
		//메소도 호출
		goods3.setName("tv");
		goods3.setPrice(5000000);
		goods3.setCountsold(50);
		goods3.setCountstock(10000);
		
		goods3.showInfo();
		double discountprice=goods3.calcDiscountPrice(0.8);
		System.out.println(discountprice);
	}
		
	
}

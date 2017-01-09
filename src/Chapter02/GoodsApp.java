package Chapter02;

public class GoodsApp {
	
	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.name="nikon";
//		camera.name=new String("nikon");
//		private은 외부에서 접근 x 
//		protected는 같은 패키지에서 접근 가능  + 자식 클래스에서 접근 가능 
//		default는 같은 패키지에서 접근 가능 
		camera.countSold=10;
		camera.price=4000000;
		camera.countSold=100;
		camera.countStock=50;
		String a=camera.GetName();
		System.out.println(a);
	}
}

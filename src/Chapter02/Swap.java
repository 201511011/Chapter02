package Chapter02;

public class Swap {
	
	public static void main(String[] args) {
		
		int i=10;
		int j=20;
		
		System.out.println(j+"+"+i);
		
		Swap(i,j);
		
		System.out.println(j+"+"+i);
	}
//	변수는 stack에 저장되기 때문에 값이 변경되지 않는다. 
	public static void Swap(int a, int b){
		int temp =a;
		a=b;
		b=temp;
		
	}
}

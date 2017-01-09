package Chapter02;

public class Swap02 {

public static void main(String[] args) {
		
		Value i = new Value();
		Value j = new Value();
		i.val = 10;
		j.val = 20;
		
		System.out.println(i.val + j.val );
		swap(i,j);
		System.out.println(i.val +"+"+ j.val );
			
	}
// 객체는 jvm 의 heap 영역에 생기기 때문에 값이 변경 된다.

	static void swap( Value a , Value b){
		int temp=a.val;
		a.val=b.val;
		b.val=temp;
	}
}

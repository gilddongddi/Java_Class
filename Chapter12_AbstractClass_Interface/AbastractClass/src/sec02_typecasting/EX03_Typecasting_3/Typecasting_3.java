//캐스팅의 가능 여부를 확인할 수 있는 instanceof
package sec02_typecasting.EX03_Typecasting_3;

/*캐스팅의 기능 여부를 확인할 수 있는 instanceof*/

class A{}
class B extends A {}

public class Typecasting_3 {
	public static void main(String[] args) {
		//instanceof
		A aa = new A();
		A ab = new B();
		
		System.out.println(aa instanceof A);
		System.out.println(ab instanceof A);
		
		System.out.println(aa instanceof B);
		System.out.println(ab instanceof B);

		if(aa instanceof B) {
			B b = 
		}
		
	}
}

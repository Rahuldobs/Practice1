class Addition{
	static int add(int a, int b) {
		return a+b;
	}
	static int add(int a, int b, int c) {
		return a+b+c;
	}
}
public class MethodOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Addition.add(10, 20));
		System.out.println(Addition.add(10, 20, 30));
	}

}


		// OUTPUT-
		//30
		//60
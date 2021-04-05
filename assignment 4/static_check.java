public class static_check{
	int n;
	static_check(int m){
		this.n = m;
		System.out.println("This is the constructor block");
	}
	static{
		System.out.println("This is the static block");
	}
	public static void main(String args[]){
		static_check sc = new static_check(10);
	}
}
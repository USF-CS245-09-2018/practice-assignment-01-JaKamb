public class FactorialRecursive implements Factorial{
	public static void main(String args[]){
		FactorialRecursive yo = new FactorialRecursive();
		System.out.println(yo.factorial(5));
	}
	public FactorialRecursive(){
	}
	
	public int factorial(int n){
		if(n==1){
			return 1;
		}
		return n * factorial(n-1);
	}
}
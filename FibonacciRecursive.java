public class FibonacciRecursive implements Fibonacci{
	public static void main(String args[]){
		FibonacciRecursive yo = new FibonacciRecursive();
		System.out.println(yo.fibonacci(6));
	}
	public FibonacciRecursive(){
	}
	
	public int fibonacci(int n){
		if(n <= 1) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
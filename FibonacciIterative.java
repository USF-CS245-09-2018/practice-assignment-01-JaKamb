public class FibonacciIterative implements Fibonacci{
	public static void main(String args[]){
		FibonacciIterative yo = new FibonacciIterative();
		System.out.println(yo.fibonacci(6));
	}
	public FibonacciIterative(){
	}
	
	public int fibonacci(int n){
		if(n <= 1) {
			return n;
		}
		int fib = 1;
		int prev = 1;
		
		for(int i=2; i<n; i++) {
			int temp = fib;
			fib+= prev;
			prev = temp;
		}
		return fib;
	}
}
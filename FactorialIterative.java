public class FactorialIterative implements Factorial{
	public static void main(String args[]){
		FactorialIterative yo = new FactorialIterative();
		System.out.println("5");
		System.out.println(yo.factorial(5));
	}

	public FactorialIterative(){
	}
	
	public int factorial(int n){
		int sol = 1;
		for(int i = 1; i <= n; i++){
			sol = sol * i;
		}
		return sol;
	}
}
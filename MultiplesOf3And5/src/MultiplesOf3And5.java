
public class MultiplesOf3And5 {

	public static void main(String[] args) {
		MultiplesOf3And5 run = new MultiplesOf3And5();
	}

	public MultiplesOf3And5() {
		// TODO Auto-generated constructor stub
		System.out.println(multiples(10));
	}
	
	private int sum5(int n) {
		int total = 0; 
		for (int i = 0; i < n; i+=5) {
			total += i;
		}
		return total;
	}
	
	private int sum3(int n) {
		int total = 0;
		for (int i = 0; i < n; i+=3) {
			total += i;
		}
		return total;
	}
	
	private int multiples(int n) {
		return sum5(n) + sum3(n);
	}
}

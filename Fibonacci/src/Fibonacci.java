
public class Fibonacci {

	private int temp1 = 1;
	private int temp2 = 1;
	//main funkcktion
	public static void main(String[] args) {
		Fibonacci run = new Fibonacci();
		run.Run();
	}

	public void Run() {
		// TODO Auto-generated constructor stub
		printNumber(11);
	}

	private void printNumber(int n) {
		printStart();

		for (int i = 3; i <= n; i++) {
			printNext();
		}
	}

	private void printStart() {
		System.out.println(temp1);
		System.out.println(temp2);
	}

	private void printNext() {
		int temp = 0;
		temp = temp1 + temp2;
		temp1 = temp2;
		temp2 = temp;
		System.out.println(temp);
	}


}

public class NestedLoop {
	public static void main(String[] args) {
		int count = 1;
		for(int i = 1 ; i<=9 ; i++){
			for (int j = 1; j <= 9; j++){
				System.out.println("Count ="+(count++));
			}
		}
	}
}
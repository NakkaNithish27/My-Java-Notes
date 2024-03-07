

class Demo {
	public static void main(String[] args) {
		int i = 12345;
		int j = 0;
		while (i != 0) {
			j = i % 10;
			i = i / 10;
			System.out.println(j);
		}
	}
}




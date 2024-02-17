@FunctionalInterface
interface A {
	public int show(int x, int y);
}


class Demo {
	public static void main(String[] args) {
		A obj = (x, y) -> x + y;


		// A obj = new A() {
		// 	public int show(int x, int y) {
		// 		return x + y;
		// 	}
		// };
		obj.show(5, 6);
	}

}

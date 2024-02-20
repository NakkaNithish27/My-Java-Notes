import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
	int age ;
	String name;
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " : " + this.age;
	}
	@Override
	public int compareTo(Student that) {
		/*Swapping based on age*/
		if (this.age > that.age)
			return 1;  //swap
		else
			return -1;  //don't swap
	}
}
class Demo {
	public static void main(String[] args) {
		List <Student> studs = new ArrayList<>();


		Comparator<Student> com = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				/*Swapping based on age*/
				if (o1.age > o2.age)
					return 1;  //swap
				else
					return -1;  //don't swap
			}
		};
		studs.add(new Student(21, "Nithish"));
		studs.add(new Student(23, "Phani"));
		studs.add(new Student(43, "Suresh"));
		studs.add(new Student(26, "Rajesh"));
		studs.add(new Student(24, "Satish"));

// Collections.sort(studs, com);
		Collections.sort(studs);

		System.out.println(studs);

	}
}





public class TestStudent {

	public static void main(String[] args) {
		Student t = new Student("Dreamy bull","222 Somewhere");
		System.out.println(t);
		
		
		t.setAddress("Behind You");
		System.out.println(t);
		System.out.println(t.getName());
		System.out.println(t.getAddress());
		
		
		
		t.addCourseGrade("INT107", 25);
		t.addCourseGrade("INT108", 79);
		t.addCourseGrade("MSC202", 69);
		t.printGrade();
		
		System.out.printf("The average grade is %.2f%n",t.getAverageGrade());

	}

}

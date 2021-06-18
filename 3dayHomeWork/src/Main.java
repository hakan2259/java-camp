
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("engin");
		instructor.setLastName("demirog");
		instructor.setNationalIdentity("12345");
		instructor.setEmail("engindemirog@gmail.com");
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("hakan");
		student.setLastName("sandal");
		student.setNationalIdentity("54321");
		student.setEmail("hakan.sandal9@hotmail.com");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.delete(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
	
		
		

	}

}

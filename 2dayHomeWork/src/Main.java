
public class Main {

	public static void main(String[] args) {
		Category category1 = new Category(1,"Programlama");
		
		
		Course course1 =new Course(1,1,"Yaz�l�m Geli�tirme Yeti�tirme Kamp� (C# + Angular)","Engin Demirog","imageUrl1");
		Course course2 =new Course(1,1,"Yaz�l�m Geli�tirme Yeti�tirme Kamp� (JAVA + React)","Engin Demirog","imageUrl2");
		Course course3 =new Course(1,1,"Programlama Giri� i�in Temel Kurs","Engin Demirog","imageUrl3");

		
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses) {
			System.out.println("Kategori id :" + course.categoryId + " Title : " + course.title + " E�itmen : " + course.teacher);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.finishAndContinue();
		courseManager.previousLesson();
		
		
		

	}

}

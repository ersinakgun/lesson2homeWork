package homework2;

public class Main {

	public static void main(String[] args) {
		
		
		Courses courses1 = new Courses(29, "C#", "Engin Hoca");
		
		Courses courses2 = new Courses(41, "Java+React", "Engin Hoca");
		
		Courses courses3 = new Courses(82, "Programalama Giri�", "Kerem Hoca");
		
		
		//3 elemanl� Courses 'imiz var. Bunlar� Diziye ekledik
		Courses[] coursess = {courses1, courses2, courses3};
		
		
		//foreach ile listeledik
		for (Courses courses : coursess) {
			System.out.println(courses.name);
		}
		
		System.out.println("----------------2.�rnek---------------------");
		
		
		Teacher teacher1 = new Teacher(10, "Engin", "Demiro�");
		Teacher teacher2 = new Teacher(11, "Kerem", "Var��");
		Teacher teacher3 = new Teacher(12, "Ersin", "Akg�n");
		
		Teacher[] teachers = {teacher1, teacher2, teacher3};
		
		
		for (Teacher teacher : teachers) {
			System.out.println(teacher.id);
		}
		System.out.println("----------------�� S�n�f�---------------------");
		
		CoursesManager coursesManager = new CoursesManager();
		coursesManager.addCourse(courses1);
		coursesManager.deleteCourse(courses2);
		
		System.out.println("----------------�� S�n�f�2---------------------");
		
		TeacherManager teacherManager = new TeacherManager();
		teacherManager.addToTeacher(teacher2);
		teacherManager.deleteToTeacher(teacher3);
	}

}

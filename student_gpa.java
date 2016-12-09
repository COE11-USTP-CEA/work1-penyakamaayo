import java.util.List;

class student_gpa{
	public static void main(String[] args){
		/*
		student penya = new student();
		penya.setName("Benjo Gaburno");
		penya.setDept("CEA");

		subject oop_class = new subject();
		oop_class.setSubjectName("Object Oriented Programming");
		oop_class.setGrade(75.00f);
		penya.addSubject(oop_class);

		subject intgc_class = new subject();
		intgc_class.setSubjectName("intgconometry");
		intgc_class.setGrade(61.17f);
		penya.addSubject(intgc_class);

		System.out.println("Student is " + penya.getName());
		System.out.println("Dept: " + penya.getDept());
		
		System.out.println("Subjects of Student");
		System.out.println("-------------------");
		List<subject> subjects_ni_abs = penya.getSubjects();
		
		for(subject s : subjects_ni_abs){
			System.out.println(" -- Subject: " + s.getSubjectName());
			System.out.println("    Grade is " + s.getGrade());
		}
		*/
		
		
		student penya = new student();
		penya.setName("Stephen Peña");
		penya.setDept("CEA");

		subject oop_class = new subject();
		oop_class.setSubjectName("Object Oriented Programming");
		oop_class.setGrade(89.00f);
		penya.addSubject(oop_class);

		subject intgc_class = new subject();
		intgc_class.setSubjectName("Integral Calculus");
		intgc_class.setGrade(88.42f);
		penya.addSubject(intgc_class);

		System.out.println("Student is " + penya.getName());
		System.out.println("Dept: " + penya.getDept());
		
		System.out.println("Subjects of Student");
		System.out.println("-------------------");
		List<subject> subjects_ni_penya = penya.getSubjects();
		
		for(subject s : subjects_ni_penya){
			System.out.println(" -- Subject: " + s.getSubjectName());
			System.out.println("    Grade is " + s.getGrade());
		}
	
	}
}
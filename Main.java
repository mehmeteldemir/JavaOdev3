package inheritanceOdev;

public class Main {

	public static void main(String[] args) {
	PrimarySchoolStudent ilkokul = new PrimarySchoolStudent();
	ilkokul.schoolName="Hürriyet Ýlkokulu.";
	
	MiddleSchoolStudent ortaokul = new MiddleSchoolStudent();
	ortaokul.schoolName="Hürriyet Orta Okulu";
	
	HighSchoolStudent lise = new HighSchoolStudent();
	lise.schoolName="Anafartalar Lisesi.";
	
	Student[] students = {ilkokul, ortaokul, lise};
	for	(Student student : students) {
		System.out.println(student.schoolName);
	}

}
}

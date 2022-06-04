class Studentv4{
	int rollno;
	String name;
	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}
	void displayRecord() {
		System.out.println(rollno +" "+ name);
	}
}
public class CreatObject4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentv4 s1 = new Studentv4();
		Studentv4 s2 = new Studentv4();
		
		s1.insertRecord(2050, "Ram");
		s2.insertRecord(2252, "Rohit");
		
		s1.displayRecord();
		s2.displayRecord();
	}

}

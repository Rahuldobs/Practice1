class Studentv3{
	int id;
	String name;
}
public class CreatObject3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentv3 section1 = new Studentv3();
		section1.id=2150;
		section1.name= "Ravi";
		
		Studentv3 section2 = new Studentv3();
		section2.id=2140;
		section2.name="Bhidu";
		
		System.out.println(section1.id+" "+section1.name);
		System.out.println(section2.id+" "+section2.name);
		
	}

}

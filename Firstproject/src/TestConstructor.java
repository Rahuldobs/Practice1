class Perimeter{
	int length;
	int breadth;
	//Default Constructor
	Perimeter()
	{
		length= 0;
		breadth=0;
	}
	// parameterized Constructor
	Perimeter (int l, int b)
	{
		length = l;
		breadth= b;
	}
	void cal_perimeter()
	{
		int peri;
		peri= 2*(length+breadth);
		System.out.println("Perimeter of Rectangle is "+ peri);
	}
}

public class TestConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perimeter p1= new Perimeter(); // Default Constructor
		Perimeter p2 = new Perimeter(10,20);
		p1.cal_perimeter();
		p2.cal_perimeter();
	}
}

// OUTPUT--
//Perimeter of Rectangle is 0
//Perimeter of Rectangle is 60
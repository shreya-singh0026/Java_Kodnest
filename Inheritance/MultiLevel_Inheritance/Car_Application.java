
public class Car_Application {

	public static void main(String[] args) {
		Sedan s=new Sedan();
		s.regno=1234;
		s.move();
		s.name="saloon";
		s.otherName();
		
		Car c=new Car();
		c.regno=4123;
		c.move();
		c.specificType();
		
		Vehicle v=new Vehicle();
		v.regno=9873;
		v.move();
		
		/*
		Vehicle v=new Vehicle();
		v.regno=12;
		v.move();
		v.specificType(); //belong to child class so not able to access
		v.otherName();//belong to child class so not able to access

		
		Car c=new Car();
		c.regno=4123;
		c.move();
		c.type=4;
		c.specificType();
		c.otherType();//belong to child class so not able to access
		
		Sedan s=new Sedan();
		s.regno=1234;
		s.move();
		s.type=4;
		s.specificType();
		s.name="saloon";
		s.otherName();
		*/
	}

}

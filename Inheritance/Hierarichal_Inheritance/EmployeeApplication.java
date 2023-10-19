import java.security.spec.EdDSAParameterSpec;

public class EmployeeApplication {

	public static void main(String[] args) {
		Employee e=new Employee();
//		e.name="Shreya";
//		e.salary=11222;
//		System.out.println(e.name + " "+e.salary);
//		e.work();
		e.info("Alfaz", 2);
		
		Developer d=new Developer();
//		d.name="Singh";
//		d.salary=23222;
//		System.out.println(d.name + " "+d.salary);
//		d.work();
		d.info("Alvida", 4);

		Manager m=new Manager();
//		m.name="Chanchal";
//		m.salary=11222000;
//		System.out.println(m.name + " "+m.salary);
//		m.work();
		m.info("Archana", 9);

		Test_Engineer t=new Test_Engineer();
//		t.name="Priys";
//		t.salary=2228789;
//		System.out.println(t.name + " "+t.salary);
//		t.work();
		t.info("Subhramanyam", 5);

		Team_lead l=new Team_lead();
//		l.name="Shreya";
//		l.salary=11222;
//		System.out.println(l.name + " "+l.salary);
//		l.work();//shortcut for writing print statement for all
		l.info("Kasamiri", 7);
		
	}

}

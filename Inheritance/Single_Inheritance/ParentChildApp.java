//SINGLE INHERITANCE 
public class ParentChildApp {

	public static void main(String[] args) {
		//child class can access parent class method too because of extends keywords
		Child c=new Child();      
				System.out.println(c.eyeColor);
				c.hobby();
				c.cry();
		
		
		//parent class can access child class methods
		/*
		Parent p = new Parent();
		System.out.println(p.eyeColor);
		p.hobby();
		p.cry();    //can't access because it is child method
		*/
		
		//parent reference can be used to hold child object bt cant acces child method
		/*
		Parent p = new Child();
		System.out.println(p.eyeColor);
		p.hobby();
		p.cry();   //can't access because it is child method  
		*/

				
		//parent reference can be used to hold child object bt child reference can't be used to hold parent object
		//Child c=new Parent()//not possible

	}

}

package Interface;

public interface I01 {

	/*
	    1- interface is not a class, interface is an interface.
	    2- interface is a storage for "abstract methods" and "public" "static" "final" variables.
	    3- Normally we can store "abstract methods" and "public" "static" "final" variables
	       in an "abstract class" but abstract class does not support multiple inheritance.
	       Because of that JAVA creates interfaces and interfaces can be used in multiple inheritance.
	    4- interfaces do not have "constructors" because of that we can not create objects from interfaces.
	    5- All variables in an interface are automatically "public", "static" and "final". 
	       a) int x= 12; and public int x= 12 are completely same.  
	       
	    6- One of the differences between interfaces and abstract classes is in interface all variables is
	       automatically "public" "static" "final" you can not use any other keywords.
	       However, we can put every kind of variables in an abstract class, all are allowed.   
	 */
	
	                                           //VARIABLES
	int x = 12;
	public int y = 12;
	
	char c= 'A';
	//c= 'B';     =>> c variable is automatically final because of that we can not change it's value.
	 
	//char d;     =>> it is not allowed because final things must be initialized.  

	String s= "Ali Can";  // =>> You can access the Ali Can just by using interface name, no need to create 
	                      //     any objects to access Ali Can because all variables are "static" in an interface.
	
	
	int m = 23;
	public int n = 23;
	public static int l = 23;
	public final static int k = 23;
	
	// ==>> These variables are completely same. No need to declare these keywords.
	
	
	                                              //METHODS
	
	// In interfaces all methods are abstract as default
	// In interfaces all methods are public as default
	// In interfaces all methods are not static and final as default because these cannot be acceptable in inheritance.
	
	// void add(int x, int y) {}      =>>interfaces can contain just abstract methods. Body is the problem.
	
    public void add(int x, int y);
	abstract void divide(int x, int y);  //if you want you may use abstract keyword or not.
	
}

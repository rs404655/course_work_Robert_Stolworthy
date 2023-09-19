
import java.io.*; 
import java.util.*;

/**
 * @author rstolworthy
 *
 */
public class Employee implements Cloneable{
	
	private String name;
	private int no;
	private int age;
	private String state;
	private int employeeZip;
	private String advisors;
	
	// default constructor
	public Employee() {
		
		// set variables to null or 0
		name = null;
		no = 0;
		age = 0;
		state = null;
		employeeZip = 0;
		advisors = null;
		
		
	} // close default
	
 
	
    /**
     * Copy Constructor
     * @param o
     * @return none
     * @precondition o is not null and an instanceof Employee
     */
    public Employee(Object o) {
		
    	// test preconditions
		if ( o == null) {
			return;
		}
		
		if(o instanceof Employee) {
			
			// creates new object
			Employee e = (Employee) o;
			
			// copies variables to new object
			this.name = new String(e.name);
			this.no = e.no;
			this.age = e.age;
			this.state = new String(e.state);
			this.employeeZip = e.employeeZip;
			this.advisors = e.advisors;
			
		}
		
		else {
			
			return;
			
		}
		
    } // close copy constructor
    
    /**
     * Clone
     * @return an Employee object
     *
     */
    public Employee clone() {
    	
    	
    	Employee em;
    	
    	try {
    		
    		// copies objects parameters
    		em = (Employee) super.clone();
			this.name = new String(em.name);
			this.no = em.no;
			this.age = em.age;
			this.state = new String(em.state);
			this.employeeZip = em.employeeZip;
			this.advisors = em.advisors;
    		
    	}
    	
    	catch(CloneNotSupportedException e) {
    		
    		System.out.println(e.getMessage());
    		
    		throw new RuntimeException("This class does not implement Cloneable.");
    		
    	}
    	
    	// return statement
    	return em;
    	
    }

    
    // get and set funcitons
	public String getAdvisors() {
		return advisors;
	}

	public void setAdvisors(String advisors) {
		this.advisors = advisors;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getEmployeeZip() {
		return employeeZip;
	}

	public void setEmployeeZip(int employeeZip) {
		this.employeeZip = employeeZip;
	}
    

   
    /**
     * equals function to see if an Employees number are equal to each other
     *@precondition is that the obj should not be null and should be an instance of the Employee class
     *@param obj The Employee we are checking the equality of
     *@return the boolean of the equality
     *
     */
    public boolean equals(Object obj) {
    	
    	// precondition check
    	if (obj instanceof Employee &&  obj != null ){
    		
    		// checks the equality of the two objects
    		Employee em = (Employee) obj;
    		
    		// return statement
    		return (em.no == no);
    		
    	}
    	
    	else {
    		
    		// return statement
    		return false;
    		
    	}
    	
    } // close equals
    
   
    
    public static void main(String[] args) {
    	
    	// creates first employee using default constructor
    	Employee em1 = new Employee();
    	
    	// print statement to show default parameters
    	System.out.println(em1.getNo() + " " + em1.getAge());
    	
    	
    	// creates new Employee object
    	Employee em2 = new Employee();
    	
    	// use set functions to fill out employee 2
    	em2.setName("Robert");
    	em2.setNo(2);
    	em2.setAge(19);
    	em2.setState("NM");
    	em2.setEmployeeZip(88001);
   
    	// test toString method with em2
    	System.out.println(em2.toString());
    	
    	// creates array to fill advisor numbers for employee 3
    	int[] advisorsEm3 = {3, 4, 6};
    	
    	// creates new Employee object
    	Employee em3 = new Employee();
    	
    	// set fuunctions to fill out employee 3
    	em3.setName("Jarrod");
    	em3.setNo(3);
    	em3.setAge(18);
    	em3.setState("NM");
    	em3.setEmployeeZip(88001);
    	
    	// toString em3
    	System.out.println(em3.toString());
    	
    	// test equals func with em2 and em3 should be false
    	System.out.println("em2.equals(em3)? " + em2.equals(em3));
    	
    	// uses copy constructor to create em4 with em2
    	Employee em4 = new Employee(em2);
    	
    	// toString em4
    	System.out.println(em4.toString());
    	
    	// tests equals func with em2 and em4 should be true
    	System.out.println("em2.equals(em4)? " + em2.equals(em4));

    	// creates a string
    	String line1 = "";
   
    	
    	// prints em2 and em3 distinct advisors
    	System.out.println("All advisors for em2 and em3: " + line1);
    	
    	// creates a string
        String line2 = "";
 
    	// prints em2 and em4 distinct advisors
    	System.out.println("All advisors for em2 and em4: " + line2);
    	
    	// creates new employee by deep copying em2 using clone func
    	Employee em5 = em2.clone();

        // creates string
    	String advisorsEm5String = "";
    	
    	
    	// prints em5 name, no, age, state, zip, and advisor numbers by using get functions
    	System.out.println(em5.getName() + ", " + em5.getNo() + ", " + em5.getAge() + ", " + em5.getState() + ", " + em5.getEmployeeZip() + ", " + advisorsEm5String );

    } // close main
   
} // close class

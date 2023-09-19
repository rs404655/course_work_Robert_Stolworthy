
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
	private int[] advisors;
	
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
			
			// creates integer array to hold the old objects advisor numbers
			int[] advs = e.getAdvisors();
			
			// creates integer array the same size as the old objects array
			int[] advs2 = new int[advs.length];
			
			// for loop that fills array with old objects array values
			for(int g = 0; g < advs.length; g++) {
				
				advs2[g] = advs[g];
				
			}
			
			// sets new objects array to copied values
			this.advisors = advs2;
			
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
			
			// creates integer array to hold the objects advisor numbers
			int[] advs = em.getAdvisors();
			
			// creates integer array the same size as the objects array
			int[] advs2 = new int[advs.length];
			
			// fills integer array with objects advisor numbers
			for(int g = 0; g < advs.length; g++) {
				
				advs2[g] = advs[g];
				
			}
			
			// copies array to object
			this.advisors = advs2;
    		
    	}
    	
    	catch(CloneNotSupportedException e) {
    		
    		System.out.println(e.getMessage());
    		
    		throw new RuntimeException("This class does not implement Cloneable.");
    		
    	}
    	
    	// return statement
    	return em;
    	
    }

    
    // get and set funcitons
	public int[] getAdvisors() {
		return advisors;
	}

	public void setAdvisors(int[] advisors) {
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
     * toString function
     *@return a string with all of Employees variables
     */
    public String toString() {
    	
    	// creates array with objects advsir numbers
    	int[] advNums = getAdvisors();
    	
    	// creates a string
    	String advisorsString = "";
    	
    	// fills the string with integer values from the objects advisor numbers
    	for( int i = 0; i < advNums.length; i++) {
    		
    		advisorsString = advisorsString + advNums[i] + " ";
    		
    	}
    	
    	// returns string with objects variables
    	return "Employee's name = " + getName() + ", Employee's no = " + getNo() + ", age = " + getAge() + ", state = " + getState() + ", zip code = " + getEmployeeZip() + ", advisor #'s = " +  advisorsString;
    	
    } // close toString
    
    
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
    
    /**
     * getAllAdvisors takes two Employees advisor arrays and returns distinct advisor numbers
     * @precondition neither e1 nor e2 are null
     * @param e1 The first Employee
     * @param e2 The second Employee
     * @return an array with distinct advisor numbers of the combined Employees
     */
    public static int[] getAllAdvisors(Employee e1, Employee e2) {
    	
    	// two arrays to hold the two objects seperate advisor numbers
    	int[] advs1 = e1.getAdvisors();
    	int[] advs2 = e2.getAdvisors();
    	
    	//HashSet to be filled with advisor numbers
    	HashSet<Integer> set = new HashSet<Integer>();
    	
    	// inputs non repeat advisor numbers from first employee
    	for(int i = 0; i < advs1.length; i++) {
    		
    		set.add(advs1[i]);
    		
    		
    	}
    	
    	// inputs non repeat advisor numbers from second employee
        for(int k = 0; k < advs2.length; k++) {
    		
    		set.add(advs2[k]);
    		
    	}
        
        // creates integer to hold the values of the hashset
        int[] advs3 = new int[set.size()];
        
        // creates an increment counter
        int count = 0;
        
        // fills array advs3 with hashset values
        for(Integer j : set) {
        	
        	advs3[count] = j;
        	count++;
        	
        }
        
        // return statement
        return advs3;
    	
    } // close getAllAdvisors
    
    public static void main(String[] args) {
    	
    	// creates first employee using default constructor
    	Employee em1 = new Employee();
    	
    	// print statement to show default parameters
    	System.out.println(em1.getNo() + " " + em1.getAge());
    	
    	// creates array to fill advisor numbers for employee 2
    	int[] advisorsEm2 = {2, 5, 3};
    	
    	// creates new Employee object
    	Employee em2 = new Employee();
    	
    	// use set functions to fill out employee 2
    	em2.setName("Robert");
    	em2.setNo(2);
    	em2.setAge(19);
    	em2.setState("NM");
    	em2.setEmployeeZip(88001);
    	em2.setAdvisors(advisorsEm2);
    	
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
    	em3.setAdvisors(advisorsEm3);
    	
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
    	
    	// creates arrays to hold distinct advisor numbers from em2 & em3 and em2 & em4
    	int[] intArr = getAllAdvisors( em2, em3 );
    	int[] intArr2 = getAllAdvisors( em2, em4 );
    	
    	// creates a string
    	String line1 = "";
    	
    	// fills string with distinct advisors from em2 and em3
    	for( int index1 = 0; index1 < intArr.length; index1++ ){
    	
    		line1 = line1 + intArr[index1] + " ";
    		
    	}
    	
    	// prints em2 and em3 distinct advisors
    	System.out.println("All advisors for em2 and em3: " + line1);
    	
    	// creates a string
        String line2 = "";
    	
        // fills string with distinct advisors from em2 and em4
    	for( int index2 = 0; index2 < intArr2.length; index2++ ){
    	
    		line2 = line2 + intArr2[index2] + " ";
    		
    	}
    	
    	// prints em2 and em4 distinct advisors
    	System.out.println("All advisors for em2 and em4: " + line2);
    	
    	// creates new employee by deep copying em2 using clone func
    	Employee em5 = em2.clone();
    	
    	// creates array to hold em5 advisor numbers
        int[] advsEm5 = em5.getAdvisors();
    	
        // creates string
    	String advisorsEm5String = "";
    	
    	// fills string with em5 advisor numbers
    	for( int index3 = 0; index3 < advsEm5.length; index3++) {
    		
    		advisorsEm5String = advisorsEm5String + advsEm5[index3] + " ";
    		
    	}
    	
    	// prints em5 name, no, age, state, zip, and advisor numbers by using get functions
    	System.out.println(em5.getName() + ", " + em5.getNo() + ", " + em5.getAge() + ", " + em5.getState() + ", " + em5.getEmployeeZip() + ", " + advisorsEm5String );

    } // close main
   
} // close class

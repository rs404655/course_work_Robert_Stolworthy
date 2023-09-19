
import java.io.*; 
import java.util.*;


/**
 * @author rstolworthy
 *
 */
public class EmployeeSet{

	private final int INITIAL_CAPACITY = 10;
	private int manyItems;
	private Employee[] employees;
	
	
	//default constructor
	public EmployeeSet(){
		
		manyItems = 0;
		employees = new Employee[INITIAL_CAPACITY];
		
	}
	
	/**
	 * Copy Constructor
	 * @param obj
	 * @precondition obj is not null and an instance of EmployeeSet
	 * 
	 */
	public EmployeeSet(Object obj) {
		
		if ( obj == null) {
			return;
		}
		
		if(obj instanceof EmployeeSet) {
			
			// creates new object
			EmployeeSet e = (EmployeeSet) obj;
			
			// creates variable to hold the size of the collection
			int num = e.manyItems;
			
			// creates integer array the same size as the old objects array
            employees = new Employee[num];
			
			// for loop that fills array with old objects array values
			for(int g = 0; g < employees.length; g++) {
				
				employees[g] = e.employees[g];
				
			}
			
		}
		
		else {
			
			return;
			
		}
		
    } // close copy constructor
	
	/**
	 * Size determines the amount of items in collection
	 * @return manyItems
	 */
	public int size() {
		return manyItems;
	} // close size
	
	/**
	 * getCapacity returns the size of the collection
	 * @return the length of collection
	 */
	public int getCapacity() {
		return employees.length;
	} // close get capacity
	
	/**
	 * add adds an Employee object to an EmployeeSet collection
	 * @param a
	 * 
	 */
	public void add(Employee a) {
		
		if(manyItems == employees.length) {
			
			ensureCapacity((manyItems + 1)*2);
			
		}
		
		employees[manyItems] = a;
		manyItems++;
		
	}
    
        /**
	 * remove determines if their is a matching emNo in collection and removes if true
	 * @return true if eno is in collection
         * @return false if eno is not in collection
	 */
	public boolean remove(int eno) {
		
		int index;
		
		for(index = 0; (index < manyItems) && (eno != employees[index].getNo()); index++);
		
		if(index == manyItems)
			return false;
		
		else {
			manyItems--;
			employees[index] = employees[manyItems];
			return true;
		}
		
	}
	

        /**
	 * ensureCapacity makes sure there is space for more objects
	 * @param minimumCapacity
	 */
	private void ensureCapacity(int minimumCapacity) {
		
		Employee[] biggerArray;
		
                // if the current capacity is less than the minimum create a larger array, copy values, and set as array
		if(employees.length < minimumCapacity) {

			biggerArray = new Employee[minimumCapacity];
			System.arraycopy(employees, 0, biggerArray, 0, manyItems);
			employees = biggerArray;

		}
		
	} //close ensureCapacity
	
	/**
	 * contains determines if their is a matching emNo in collection
	 * @return true if eno is in collection
         * @return false if eno is not in collection
	 */
	public boolean contains(int eno){
		
		for(int i = 0; i < employees.length; i++) {
			
			if( eno == employees[i].getNo()) {
				return true;
			}
			

		}
		
		return false;
		
	}
	
	public static void main(String[] args) throws IOException{
		
                // create new Employee set to hold core_dataset.csv
		EmployeeSet target = new EmployeeSet();
		
	
		System.out.println("Creating EmployeeSet 'target' with core_dataset.csv");
		
                //Create FileReader and BufferReader to read core_dataset.csv
		FileReader fileReader = new FileReader("core_dataset.csv");
		BufferedReader inputStream = new BufferedReader(fileReader);
		
                //String to hold values
		String line;

                //skip line
		inputStream.readLine();
		
                // while loop that creates an Employee object and fills it with values from file then puts it in
                // an EmployeeSet
		while((line = inputStream.readLine()) != null) {
			
			Employee e = new Employee();
			
			String[] info = line.split(",");
			
			e.setName(info[0] + info[1]);
			e.setNo(Integer.parseInt(info[2]));
			e.setState(info[3]);
			e.setEmployeeZip(Integer.parseInt(info[4]));
			e.setAge(Integer.parseInt(info[5]));
			e.setAdvisors(info[6]);
			
			target.add(e);
			
		} // close while
		
                // test size() and getCapacity()
		System.out.println("Target's size = " + target.size());
		System.out.println("Target's capacity = " + target.getCapacity());
		
                // create new EmployeeSet
		EmployeeSet walmart = new EmployeeSet();
		
                // create 10 Employees for walmart
		Employee a = new Employee();
		Employee b = new Employee();
		Employee c = new Employee();
		Employee d = new Employee();
		Employee f = new Employee();
		Employee g = new Employee();
		Employee h = new Employee();
		Employee i = new Employee();
		Employee j = new Employee();
		Employee k = new Employee();
		
                // using add() add employees to walmart collection
		walmart.add(a);
		walmart.add(b);
		walmart.add(c);
		walmart.add(d);
		walmart.add(f);
		walmart.add(g);
		walmart.add(h);
		walmart.add(i);
		walmart.add(j);
		walmart.add(k);
		
		System.out.println();
		System.out.println("Walmart's size = " + walmart.size());
		System.out.println("Walmart's capacity = " + walmart.getCapacity());
		
                // test ensureCapacity() through add()
		Employee l = new Employee();
		walmart.add(l);
		
		System.out.println("Walmart's new size = " + walmart.size());
		System.out.println("Walmart's new capacity = " + walmart.getCapacity());
	    
            // test remove()
	    Employee m = new Employee();
	    m.setNo(110);
	    
	    walmart.add(m);
	    System.out.println("Walmart's new size = " + walmart.size());
	    
	    walmart.remove(110);
	    
	    System.out.println("Walmart's new size after removing 110 employees = " + walmart.size());
	    
            // test ensureCapacity() directly
	    walmart.ensureCapacity(25);
	    System.out.println("Walmart's new capacity = " + walmart.getCapacity());
	    
	    // test contains()
	    f.setNo(991);
	    
	    System.out.println("Does walmart contain employeeNo 991? " + walmart.contains(991));
	    
            // test copy Constructor
	    EmployeeSet kmart = new EmployeeSet(walmart);
	    
		System.out.println("kmart's capacity = " + kmart.getCapacity());
		
	} // close main()
	
}

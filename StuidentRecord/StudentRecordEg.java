package StuidentRecord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class StudentRecordEg implements Comparable{
	String name;
	int rollNumber;
	String address;
	
	StudentRecordEg(String name, int rollNumber, String address){
		this.name = name;
		this.rollNumber = rollNumber;
		this.address = address;
		
	}
     public String toString() {
    	 return this.rollNumber +" " + this.name + " " + this.address;
    	 
     }
		
	public static void main(String[] args) {
		List stud = new ArrayList();
		
		stud.add(new StudentRecordEg("Arun",298411165 , "Avadi" ));
		stud.add(new StudentRecordEg("Nagoor",298411166 , "Parris" ));
		stud.add(new StudentRecordEg("Siva",298411157 , "Perambur" ));
		stud.add(new StudentRecordEg("PP",298411156 , "Avd" ));
		
		Collections.sort(stud);
		
		
		System.out.println("After Sorting By Roll Number\n");
		for (int i=0; i<stud.size(); i++)
			System.out.println(stud.get(i));

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.rollNumber - ((StudentRecordEg)o).rollNumber;
	}

}

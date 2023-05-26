package ListCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {
	
	public static void main(String[] args) {
		
		List<String> friendList = new ArrayList<>();
		friendList.add("Sam");
		friendList.add("Ram");
		friendList.add("sri");
		friendList.add("Arun");
		friendList.add("Siva");
		friendList.add("Raja");
		friendList.add("Praku");
		
		System.out.println("Mr Friends List ::" + friendList);
		
		System.out.println("Mr Friends names are given below ::");
		
		for(String name : friendList) {
			System.out.println(name);
		}
	
	System.out.println("My Best Friend is:: " + friendList.get(3));
	
	List<Integer> numberList = new LinkedList<>();
	numberList.add(1);
	numberList.add(2);
	numberList.add(3);
	numberList.add(4);
	
	
    System.out.println("Name Linked List:: " + numberList);
    
    System.out.println("The numbers are as follows:");
    for(int number : numberList){
      System.out.println(number);
    }

    List<String> namesLinkedList = new LinkedList<>();
    namesLinkedList.add("A");
    namesLinkedList.add("B");
    namesLinkedList.add("C");
    namesLinkedList.add("D");

    System.out.println("Names Linked List:: " + namesLinkedList);
    
    
    numberList.remove(0);
    namesLinkedList.remove(0);
    
    System.out.println("Numbers Array List :" + numberList);
    System.out.println("Name Linked List :" + namesLinkedList);
    
    if(friendList.get(0).equals("Arun")) {
    	System.out.println("Yes there is a Match !!");
    }
    }
    
}

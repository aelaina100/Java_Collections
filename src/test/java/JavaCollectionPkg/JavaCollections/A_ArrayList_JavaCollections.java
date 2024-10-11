package JavaCollectionPkg.JavaCollections;
import java.util.ArrayList;

import org.testng.Assert;

//Pre-requisite: You HAVE to study "A_ApreRequisite.java" class file under 'StreamExamples' pkg situated under "JavaStreams" project.

public class A_ArrayList_JavaCollections {

	public static void main(String[] args) {
		
		//Java Collections contain the 3 interfaces of: List, Set, & Map.
		
		/*List Interface. [Elements are added in order. Elements could be duplicates]
		 
			Implemented by the following classes:
				- ArrayList
				- LinkedList
				- Vector                                */
		
		// This example illustrates the ArrayList class which is one of the most popular & used class in the 'List' interface.
		// Once one is familiar with the 'ArrayList' class, then the rest of the 2 classes (LinkedList & Vector) become very 
		// easy to figure out.
		
		// So let's create an ArrayList class (which automatically implements the 'List' interface) in order to apply the 
		//methods in the 'List' interface on the elements stored in the ArrayList class (in order to organize these elements)
		
		ArrayList<String> arrayList= new ArrayList<String>();
		arrayList.add("Ahmad");
		arrayList.add("yansin");
		arrayList.add("çenk");
		arrayList.add("Benar");
		arrayList.add("Benar");  // a duplicate value will be added to the ArrayList as it accepts duplicate values.
		
		 // or:   // List<String> arrlist=  Arrays.asList("Ahmad", "yansin");
		System.out.println(arrayList);          // displaying with brackets ["Ahmad","yansin"]
		//or: arrayList.stream().forEach(s-> System.out.println(s));  // output: Ahmad yansin
		
		System.out.println("------------------------------"); 
		// .add(int index, String element)  <<===== this is an existing method !
		// So you can add an element to the arrayList at a specific index.
		arrayList.add(0,"pre-name");
		System.out.println(arrayList);
		
		//Now, removing can be done via index or via specifying the string directly
		arrayList.remove(1);       //via index
		System.out.println(arrayList);
		
		arrayList.remove("yansin");      //via specifying the element itself       //.remove(Object:o): boolean
		System.out.println(arrayList);
	
       
		//Now, let's display the 1st index of the arraylist !
		System.out.println(arrayList.get(1));   // As opposed to array[1] for Arrays (Fixed-length) data structure.
		
		 // See how flexible ArrayLists are !. This is why Programmers use ArrayLists alot & only !!
		
		//Displaying the 0 index of the arrayList
		System.out.println(arrayList.get(0));   // As opposed to array[0] for Arrays (Fixed-length) data structure.
		System.out.println("************");
		
		
		//Check whether "yansin" element exists in the arrayList
		String element= "çenk";
		boolean bool= arrayList.contains(element);    // so .contains() in the arrayList does that directly & easily !
		Assert.assertTrue(bool, "The element of: " + element + " does NOT exist in the arrayList");
		System.out.println("The element of: " + element + " Exist in the arrayList at the index of: " + arrayList.indexOf(element));
		// However, doing that in arrays (Fixed-length data structure) requires looping through the elements, grabbing each element
		 // & comparing it.
		//Also, the method of .indexOf() is for both "String" & "ArrayList" classes ONLY. [If element does not exist, -1 is returned]
		
		//****************************************************************************************************************
		//Now, display the index of the element "Benar" in the above created ArrayList ?
		System.out.println("************");
		String someElement= "Benaroppo";
		
		int index= arrayList.indexOf(someElement);
		if(index==-1)
		{
		System.out.println(" The element: [ " + someElement+ " ] does NOT exist in the ArrayList"); 
		}
		else
		{
		 System.out.println("The element: [ " + someElement+ " ] is in the: " + index + " index");
		}
		
		//Also:   .isEmpty()  .size()  could be applied to ArrayLists.
        
}}

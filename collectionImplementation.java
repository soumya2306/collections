package epam;

import java.util.List;
import java.util.Scanner;

public class collectionImplementation{
	 public static void main(String[] args) {
	      try{
	    String s[]={"My", "Custom", "Implementation","for","first","time","on","giving","a","project"};
	    Object o;
	    int i=0;
	    collections a= new collections();
	    List lst=a.myList(s);
	    System.out.println("The list is: "+lst);
	    ArrayList al=new ArrayList(s);
	    Scanner sin=new Scanner(System.in);
	    System.out.println("enter the elements position to be fetched");
	    int z=sin.nextInt();
	    o=al.get(z);
	    System.out.println("The fetched element is: "+o);
	    String s1="Collection";
	    o=al.set(6,s1);
	    System.out.println("The set element in place of Implementation is: "+s1);
	    System.out.println("Now the new list is: "+lst);
	    i=al.size();
	    System.out.println("The size of the array list is: "+i);
	    }
	    catch(Exception e){
	    	System.out.println("exception caught");
	    }
	  }
	  }



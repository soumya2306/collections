package epam;
import java.util.*;
public class collections {

	  public static List myList(Object[] a) {
	     return new ArrayList(a);
	  }
	}
	  class ArrayList extends AbstractList{
	  
	private Object[] x;

	ArrayList(Object[] array) {
	    x = array;
	}
	public Object get(int index) {
	    return x[index];
	}
	public Object set(int index, Object element) {
	    Object oldVal = x[index];
	    x[index] = element;
	    return oldVal;
	}
	public int size() {
	    return x.length;
	}
	  }
	  
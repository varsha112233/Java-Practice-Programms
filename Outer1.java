package classes;

public class Outer1 {
	 class Inner {
	        void display() {
	            System.out.println("Inner Class");
	        }
	    }
	

	public class Main {

	public static void main(String[] args) {
		 Outer outerObj = new Outer();
	          Outer.Inner innerObj = outerObj.new Inner();
	        innerObj.display();
	    }
	}
	
	}

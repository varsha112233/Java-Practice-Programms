package classes;

public class Outer2 {
	void outerMethod() {
        class LocalInner {
            void display() {
                System.out.println("Local Inner Class");
            }
        }
        LocalInner localInnerObj = new LocalInner();
        localInnerObj.display();
    }


public class Main {

	public static void main(String[] args) {
		Outer outerObj = new Outer();
        outerObj.outerMethod();
	}


	}

}

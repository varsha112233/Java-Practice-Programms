package functionalInterface;
@FunctionalInterface
interface IOne
{
	void call();
}
@FunctionalInterface
interface ITwo
{
	int add(int a ,int b);
}

public class FunInEx 

{
         public static void main(String[] args) {
             IOne i1 = ()->System.out.println("Sample");
             i1.call();
            
             ITwo t=(i,j)->i+j;
             t.add(7, 8);
     	}
     

	}


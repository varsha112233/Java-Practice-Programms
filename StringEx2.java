package string;
public class StringEx2 {
        public static void main(String[] args) {
        	String s1=new String("hello");
    		String s2=new String("world");
    		String s3=new String("hello");
    		System.out.println(s1+" "+s2+" "+s3);
    		//System.out.println(s1.concat("kamatchi"));
    		//s1=s1.concat(" kitty");
    		System.out.println(s1+" "+s2+" "+s3);
             if(s1==s3)
             {
            	 System.out.println("yes");
             }
             else
             {
            	 System.out.println("No");
             }
             if(s1.equals(s3))
             {
            	 System.out.println("yes");
             }
             else
             {
            	 System.out.println("no");
             }
    	}

    }

package constructs;

public ConstEx()
{
	System.out.println("constructor example");
}

public ConstEx(int a)
{
	a++;
	System.out.println(a);
}
void call(String msg)
{
	System.out.println(msg);
}
int add(int a,int b)
{
	return a+b;
}
char show()
{
	return 'a';
}
public static void main(String[] args) {
 
	ConstEx on=new ConstEx();
    ConstEx on2 = new ConstEx(3);
    on.call("Welcome");
    System.out.println(on.add(10,11));
    char ch=on.show();
    System.out.println(ch);
}

}

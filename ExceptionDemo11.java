package kk.Exception.org;

class MeraException extends Exception
{
	private int ex;
	public MeraException(int ex)
	{
		super();
		this.ex=ex;
	}

	@Override
	public String toString() 
	{
		return "MeraException [ex=" + ex + "]";
	}
}
public class ExceptionDemo11 
{
    void sum(int a,int b)throws MeraException
    {
    	if(a<0)
    	{
    		throw new MeraException(a);
    	}
    	else
    	{
    		System.out.println("The addition is"+(a+b));
    	}
    }
	public static void main(String[] args) throws MeraException 
	{
		ExceptionDemo11 ex=new ExceptionDemo11();
		ex.sum(-10, 10);
		

	}

}

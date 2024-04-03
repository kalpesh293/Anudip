package ClassObject;

public class ExampleMin 
{
	  public boolean minFunction(int n, int m) //n=a, m=b
      {// if m is min then return true and if n is min then result false
    	  boolean min;
    	  //n*m=3.5*9=31.5
    	  if(n>m)
    	  {
    		  min=true;
    	  }
    	  else 
    	  {
    		  min=false;
    	  }
    	  return min;
      }
	public static void main(String[] args) 
	{
	  ExampleMin ex=new ExampleMin();
  	  boolean result=ex.minFunction(5,9);
  	  System.out.println("Minimum Value: " + result);

	}

}

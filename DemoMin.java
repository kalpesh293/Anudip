package ClassObject;

public class DemoMin 
{
	public float minFunction(double n, int m) //n=a, m=b
    {// if m is min then return true and if n is min then result false
  	  double min;
  	  //n*m=3.5*9=31.5
  	  if(n>m)
  	  {
  		  min=m;
  	  }
  	  else {
  		  min= n;
  	  }
  	  return (float) min;
    }
	public static void main(String[] args)
	{
	  DemoMin ex=new DemoMin();
   	  double result=ex.minFunction(3.5,9);
   	  System.out.println("Minimum Value: " + result);

	}
}

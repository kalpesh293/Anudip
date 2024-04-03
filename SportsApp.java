/*Write a Java program to create a base class Sports with a method called play(). Create three subclasses: Football, Basketball, and
Rugby. Override the play() method in each subclass to play a specific statement for each sport.*/

package Lab4.kk.org;

class Sports
{
    public void play() 
    {
        System.out.println("Playing  sport");
    }
}

class Football extends Sports
{
    @Override
    public void play() 
    {
        System.out.println("Playing football");
    }
}

class Basketball extends Sports 
{
    @Override
    public void play()
    {
        System.out.println("Playing basketball");
    }
}

class Rugby extends Sports 
{
    @Override
    public void play() 
    {
        System.out.println("Playing rugby");
    }
}
public class SportsApp 
{
	public static void main(String[] args) 
	{
		Sports football = new Football();
        Sports basketball = new Basketball();
        Sports rugby = new Rugby();

        football.play(); 
        basketball.play(); 
        rugby.play();

	}
}

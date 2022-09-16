import java.util.Scanner;
public class PowersOfiCalculator 
{
  public static void main(String[] args)
  {
    
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to the Powers of i Calculator!");
    System.out.println("Please enter your power of i: i^");
    int usersPower = input.nextInt();

    int usersRemainder = usersPower % 4;
    String evaluation = "unknown"; 

    if (usersRemainder == 0) 
    {
      evaluation = "1";
    }
    else if (usersRemainder == 1)
    {
      evaluation = "i";
    }
    else if (usersRemainder == 2)
    {
      evaluation = "-1";
    }
    else if (usersRemainder == 3)
    {
      evaluation = "-i";
    }
    
    System.out.println("i^" + usersPower + " = " + evaluation);
    
  }

}

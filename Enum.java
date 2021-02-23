import java.util.Scanner;
class Enumprograme
{         

 enum gender
{
     male, MALE, FEMALE,female
}
    public static void main(String args[ ])
  {
 
     Scanner sc=new Scanner(System.in);
    String c=sc.next();
  for(String s:gender)
 {
    if( s.equals(c))
    {
          System.out.println("It is presented");
    }
   else
  {
      System.out.println("It is presented");
}
}
}
}
 
        
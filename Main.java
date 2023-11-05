import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
    double totalk=0;
    double totalc=0;
    double totalf=0;
    double totalp=0;
    Double fixer=0.0;    
    //fixer.parseDouble(n);
    //food.set_carb(fixer);
    {
      Scanner scan= new Scanner(System.in);
      System.out.println("What did you eat today?");
      
      int z=-1;
      while(z!=0)
      {
      Food food= new Food();
      String x=scan.nextLine();
      food.set_name(x);
      
      System.out.println("How many carbs? (g)");
      double y= scan.nextDouble();
      food.set_carb(y);
      totalc= totalc +food.get_carb();
      
      
      System.out.println("How many fat? (g)");
      y= scan.nextDouble();
      food.set_fat(y);
      totalf= totalf+ food.get_fat();
      
      System.out.println("How many protein? (g)");
      y= scan.nextDouble();
      food.set_protein(y);
      totalp= totalp+ food.get_protein();
      
      
      food.set_kcal();
      totalk= totalk+food.get_kcal();
      
      
      System.out.print(food.name);
      System.out.print(", " +food.carb);
      System.out.print(", " +food.fat);
      System.out.print(", " +food.protein);
      System.out.println(", " +food.kcal);
      
      System.out.println("Did you eat anything else?)");
      System.out.println("0. No");
      System.out.println("1. Yes");
      z= scan.nextInt();
    }
      System.out.println("You had " +totalk+ " calories today.");
      System.out.println("You had " +totalc+ "g carbs today.");
      System.out.println("You had " +totalf+ "g fat today.");
      System.out.println("You had " +totalp+ "g protein today.");
      
    }
}
 }
public class Food 
  {
    String name;
    double kcal;
    double carb, fat, protein;
    
    public void set_name(String n)
    {
      name = n;
    }
    
    public void set_kcal()  {
      double k = (4 * (carb + protein) + (9 * fat));
      if (k % 5 > 0)
        k = k + (5 - (k % 5));
      kcal = k;
    }
    public void set_carb(double c)  {
      carb = c;
    }
    public void set_fat(double f)  {
      fat = f;
    }
    public void set_protein(double p)  {
      protein = p;
    }
    
    public void get_name()
    {
      System.out.println(name);
    }
    
    public double get_carb()  {
      return carb;
    }
    public double get_fat()  {
      return fat;
    }
    public double get_protein()  {
      return protein;
    }
    public double get_kcal()
    {
        return kcal;
    }
  }

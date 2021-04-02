package Day12;
public abstract class Shape {
   public abstract void draw(); //no body for abstract method

   public void paint() {
      System.out.println("shae is painted");
   }
    public Shape(){
         System.out.println("shape is default constructor");

      }

}
//only public or protected  for abstract method
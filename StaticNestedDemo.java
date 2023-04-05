class outer
{
  static int x=10;
  int y=20;
  private static int z=30;
static class inner
{  
   void display()
          {
               System.out.println(x);
              outer obj=new outer();
               System.out.println(obj.y);
               System.out.println(z);
         }
     } 
}
class StaticNestedDemo
{
    public static void main(String[] args)
  {
       outer.inner obj1=new outer.inner();
       obj1.display();
       outer obj=new outer();
       System.out.println(obj.y);
   }
}
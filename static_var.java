
public class static_var{
    static int a= 40;
    int b= 50;
     
     void simpleDisplay(){
         System.out.println(a);
         System.out.println(b);
         
     }
     static void staticDisplay()
         {
             System.out.println(a);
             
         }
         
         public static void main(String[] args)
         {
             static_var obj= new static_var();
             obj.simpleDisplay();
             
            static_var.staticDisplay();
             staticDisplay();
         }
}

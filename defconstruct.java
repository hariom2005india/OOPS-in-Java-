class Geeks{
  int id;
  string name;
Geeks(){
    System.out.println("Hariom");}
     Geeks(String name,int id){
  this.name=name;
      this.id=id;
     }
}

class cosntruct{
 public static void main(String[]args){
   Geek geek1= new Geeks("Hariom",7);
   System.out.println("Geek name" + geek1.name+ " Geekid"+geek1.id)
 }
  
}

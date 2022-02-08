package meet;
import org.A;
import edu.B;
import com.C;
class Meet{
       int x,y,z;
       public Meet(){

       x=88;
y=8;
System.out.println("tis is constructor meet");

}
void div(){

z=x/y;
System.out.println("ans of div is ="+z);
}
  
public static void main(String args[]){
    A obj=new A();
   B obj2=new B();
   C obj3=new C();
   Meet obj4=new Meet();

obj.add();
obj1.sub();
obj3.mult();
obj4.div();
}




}
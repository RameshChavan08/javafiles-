import java.util.*;

class collage{
    int regno;
    collage(){
        Scanner inp=new Scanner(System.in);
        regno=inp.nextInt();
    }
    void print(){
        System.out.println(regno);
    }
}
class details extends collage{
    String name;
    char grade;
    details(int a,String b,char c){
        Scanner inp2=new Scanner(System.in);
        name=inp2.nextLine();
        grade=inp2.next().charAt(0);
        regno=inp2.nextInt();
    }
    void print(){
        System.out.println("name:"+name);
        System.out.println("regno:"+regno);
        System.out.println("grade:"+grade);
    }
}
public class inheritence2 {
    public static void main(String[] args) {
        collage obj1=new collage();
        obj1.print();
        details obj2=new details(1,"abc",'m');
        obj2.print();
    }
}
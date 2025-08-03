// Java OOP Task 1 – Student Class and Object Creation
// This program creates a Student class with basic profile info,
// then uses object-oriented principles to create and display student data.
            //----------04.08.2025----------//
class Student {
    String name;
    int id;
    String Dept;

    public Student(String name,int id,String Dept){
        this.name=name;
        this.id=id;
        this.Dept = Dept;
    }
    public void Display(){
        System.out.printf("Name : %s\n",name);
        System.out.printf("ID : %d\n",id);
        System.out.printf("Dept : %s\n",Dept);
    }
}

public class StudentManagementSystem {
   public static void main(String[] var0) {
      Student var1 = new Student("Shibloo", 288, "CSE");
      Student var2 = new Student("Mahmuda", 278, "PHY");
      var1.Display();
      var2.Display();
   }
}

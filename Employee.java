public class Employee{
    String Name;
    int Year;
    String Address;

    public Employee(String name, int year, String address) {
        Name = name;
        Year = year;
        Address = address;
    }
    public void printstmnt(){
            System.out.println(Name+" "+Year+" "+Address);
        }


    public static void main(String args[]){
        Employee First = new Employee("Robert",1994,"64C - WallsStreet");
        Employee Second = new Employee("Sam",2000,"68D - WallsStreet");
        Employee Third = new Employee("John",1999,"26B - WallsStreet");
        First.printstmnt();
        Second.printstmnt();
        Third.printstmnt();
    }
}
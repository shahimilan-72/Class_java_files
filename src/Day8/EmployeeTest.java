package Day8;

public class EmployeeTest
{
    public static void main(String [] args)
    {
        Employee obj = new Employee();
        obj.setEmployeeName("John");
        System.out.println(obj.getEmployeeName());
        obj.setAge(26);
        System.out.println(obj.getAge());

    }
}

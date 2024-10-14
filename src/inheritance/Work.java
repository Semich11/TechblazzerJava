//package inheritance;
//
//public class Work {
//    private String name;
//    private String birthDate;
//    private String endDate;
//
//    public Work(String name, String birthDate, String endDate) {
//        this.name = name;
//        this.birthDate = birthDate;
//        this.endDate = endDate;
//    }
//
//    public static void main(String[] args){
//        HourlyEmployee employee = new HourlyEmployee();
//    }
//
//    public int getAge(){
//        return 0;
//    }
//
//    public double collectPay(){
//        return 0.0;
//    }
//
//    public void terminate(String endDate){
//    }
//}
//
//
//class Employee extends Work {
//    private long employeeId;
//    private String hireDate;
//}
//
//class SalariedEmployee extends Employee{
//    private double annualSalary;
//    private boolean isRetired;
//
//    public void retire(){
//
//    }
//}
//
//class HourlyEmployee extends Employee{
//    private double hourlyPayRate;
//
//    public HourlyEmployee(double hourlyPayRate) {
////        super()
//        this.hourlyPayRate = hourlyPayRate;
//    }
//
//    public void getDoublePay(){
//
//    }
//}

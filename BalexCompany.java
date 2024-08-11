
public class BalexCompany {
 private static final double MINIMUM_WAGE = 8.00;
 private static final int MAX_HOURS = 60;
 public static void calculatePay(double basePay, int hoursWorked) {
 if (basePay < MINIMUM_WAGE) {
 System.out.println("Error: Base pay is less than minimum wage");
 return;
 }
 if (hoursWorked > MAX_HOURS) {
 System.out.println("Error: Hours worked exceeds maximum allowed");
 return;
 }
 double pay;
 if (hoursWorked <= 40) {
 pay = hoursWorked * basePay;
 } else {
 int overtimeHours = hoursWorked - 40;
 double regularPay = 40 * basePay;
 double overtimePay = overtimeHours * basePay * 1.5;
 pay = regularPay + overtimePay;
 }
 System.out.println("Total pay: " + pay);
 }
 public static void main(String[] args) {
 Employee[] employees = {
 new Employee(7.8, 35),
 new Employee(8.2, 47),
 new Employee(10.0, 73)
 };
 for (Employee employee : employees) {
 System.out.println("Employee base pay: " + employee.basePay + ", hours worked: " +
employee.hoursWorked);
 calculatePay(employee.basePay, employee.hoursWorked);
 }
 }
}
class Employee {
 double basePay;
 int hoursWorked;
 public Employee(double basePay, int hoursWorked) {
 this.basePay = basePay;
 this.hoursWorked = hoursWorked;
 }
}
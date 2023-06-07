public class WorkerFixSalary extends Employee{

    private double averageSalary;

    public WorkerFixSalary(String name, int age, double salary) {
        super(name,age,salary);
        averageSalary = averageSalaryCalculate(salary);
    }

    @Override
    double averageSalaryCalculate(double salary) {
        averageSalary = salary;
        return averageSalary;
    }

    @Override
    public String toString() {
        return "WorkerFixSalary{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", fix salary=" + salary +
                ", average salary=" + averageSalary +
                '}';
    }
}
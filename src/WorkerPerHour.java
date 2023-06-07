public class WorkerPerHour extends Employee {
    private double averageSalary;
    public WorkerPerHour(String name, int age, double salary) {
        super(name, age, salary);
        averageSalary = averageSalaryCalculate(salary);
    }

    @Override
    double averageSalaryCalculate(double salary) {
        averageSalary = 20.8 * 8 * salary;
        return averageSalary;
    }

    @Override
    public String toString() {
        return "WorkerPerHour{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary per hour=" + salary +
                ", average salary=" + averageSalaryCalculate(salary) +
                '}';
    }
}

/*Описать в базовом классе абстрактный метод для расчёта среднемесячной заработной платы.
            Для «повременщиков» формула для расчета такова:
            «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»,
            для работников с фиксированной оплатой
             «среднемесячная заработная плата = фиксированная месячная оплата».*/
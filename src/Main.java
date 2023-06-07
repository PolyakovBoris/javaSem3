public class Main {
    public static void main(String[] args) {

        Employee[] emploies = {new WorkerFixSalary("Oleg", 25, 10000),
                                 new WorkerFixSalary("Ivan", 26, 11000),
                                 new WorkerFixSalary("Max", 29, 9000),
                                 new WorkerPerHour("Alex", 24, 150),
                                 new WorkerPerHour("Den", 22, 110)
                                };
        for (Employee worker: emploies) {
            System.out.println(worker);
        }
    }
}
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<BaseEmployee> employees = List.of(
                new Worker(50_000d),
                new Worker(60_000d),
                new Worker(70_000d),
                new Worker(80_000d),
                new Worker(90_000d),
                new Freelancer(700d),
                new Freelancer(800d),
                new Freelancer(900d),
                new Freelancer(1000d),
                new Freelancer(1100d)
        );

        employees.stream()
                .sorted(Comparator.comparing(BaseEmployee::calculateSalary))
                .forEach(employee -> System.out.println(employee.calculateSalary()));

    }
}

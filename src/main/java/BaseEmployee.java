public abstract class BaseEmployee{

    private final Double salary;

    protected BaseEmployee(Double salary) {
        this.salary = salary;
    }

    public abstract Double calculateSalary();

    public Double getSalary() {
        return salary;
    }
}

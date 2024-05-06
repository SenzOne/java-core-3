public class Worker extends BaseEmployee {

    protected Worker(Double salary) {
        super(salary);
    }

    @Override
    public Double calculateSalary() {
        return getSalary();
    }
}

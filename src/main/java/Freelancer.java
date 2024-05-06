public class Freelancer extends BaseEmployee {

    public Freelancer(Double incomePerHour) {
        super(incomePerHour);
    }

    @Override
    public Double calculateSalary() {
        return 20.8 * 8 * getSalary();
    }
}

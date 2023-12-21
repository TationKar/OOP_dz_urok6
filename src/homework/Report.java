package homework;

public class Report implements Reporting {
    @Override
    public void report(User user) {
        System.out.println(user.getName() + "'s User Report");
    }
}

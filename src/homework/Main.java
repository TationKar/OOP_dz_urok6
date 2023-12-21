package homework;

public class Main{
    public static void main(String[] args){

        UserValid userValid = new UserValid();
        User user = userValid.validName();

        Report report = new Report();
        report.report(user);

        Persister persister = new Persister();
        persister.save(user);
    }
}
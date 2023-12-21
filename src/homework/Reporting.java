package homework;

public interface Reporting<E extends User> {
    void report(E user);
}

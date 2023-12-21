package homework;

import java.util.Scanner;

public class UserValid {
    public User validName() {
        System.out.print("Please enter a username: ");
        User user = new User(new Scanner(System.in).nextLine());

        if (!user.getName().isEmpty())
            return user;
        else
            throw new IllegalArgumentException("Incorrect data has been entered!");
    }
}

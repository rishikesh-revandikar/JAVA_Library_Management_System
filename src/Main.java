import com.rishikesh.library.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Rishikesh Revandikar","abc@gmail.com","1234567890");
        System.out.println("Name: "+user.getName());
        System.out.println("Email: "+user.getEmail());
        System.out.println("Phone Number: "+user.getPhoneNumber());
    }
}
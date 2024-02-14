public class Main {
    public static void main(String[] args) {
        User user1 = new User("Robert De Niro");
        User user2 = new User("Al Pacino");

        System.out.println(user1);
        System.out.println(user2);

        boolean valid = user1.validUserId();
        boolean valid2 = user2.validUserId();
        System.out.println(valid);
        System.out.println(valid2);


    }
}

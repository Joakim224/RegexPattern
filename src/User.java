import java.util.Random;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class User {
    private String fullName;
    private String userId;
    private Random random;
    private StringBuilder digits;

    public User(String fullName) {
        this.digits = new StringBuilder();
        this.random = new Random();
        this.fullName = fullName;
        this.userId = generateUserId(fullName);
    }

    public boolean validUserId() {
        String pattern = "^[a-z]{4}\\d{4}$";
        Pattern userIdPattern = Pattern.compile(pattern);
        Matcher validUserId = userIdPattern.matcher(userId);

        if(validUserId.matches()) {
            return true;
        }
        return false;
    }

    public String generateUserId(String fullName) {
        String firstTwoCharacters = fullName.substring(0,2);
        String lastTwoCharacters = fullName.substring(fullName.length() - 2);

        for (int i = 0; i < 4; i++) {
            digits.append(random.nextInt(10));
        }

        return firstTwoCharacters.toLowerCase() + lastTwoCharacters.toLowerCase() + digits;
    }

    public String toString() {
        return "Username: " + fullName +
                ", user ID: " + userId;
    }
}

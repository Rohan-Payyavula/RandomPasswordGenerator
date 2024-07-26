import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String CHAR_LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPERCASE = CHAR_LOWERCASE.toUpperCase();
    private static final String DIGIT = "0123456789";
    private static final String SPECIAL_CHAR = "!@#$%^&*()-_+={}[]|:;<>,.?/";

    private static final String PASSWORD_ALLOW_BASE = CHAR_LOWERCASE + CHAR_UPPERCASE + DIGIT + SPECIAL_CHAR;
    private final SecureRandom secureRandom;
    private final int length;
    public PasswordGenerator(int Length){
        secureRandom = new SecureRandom();
        this.length = Length;
    }

    public String generatePassword(){
        if(length <1){
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        String password = "";
        for(int i = 0; i < length; i++){
            int rndCharAt = secureRandom.nextInt(PASSWORD_ALLOW_BASE.length());
            password = password + PASSWORD_ALLOW_BASE.charAt(rndCharAt);
        }
        return password;
    }

}

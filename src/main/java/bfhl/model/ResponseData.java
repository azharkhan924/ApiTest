package bfhl.model;
import java.util.List;

public class ResponseData {

    private boolean is_success;
    private String user_id;
    private String email;
    private String roll_number;

    private List<String> numbers;
    private List<String> alphabets;
    private List<String> highest_alphabet;

    public ResponseData(
            boolean is_success,
            String user_id,
            String email,
            String roll_number,
            List<String> numbers,
            List<String> alphabets,
            List<String> highest_alphabet
    ) {
        this.is_success = is_success;
        this.user_id = user_id;
        this.email = email;
        this.roll_number = roll_number;
        this.numbers = numbers;
        this.alphabets = alphabets;
        this.highest_alphabet = highest_alphabet;
    }

    public boolean isIs_success() {
        return is_success;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getEmail() {
        return email;
    }

    public String getRoll_number() {
        return roll_number;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public List<String> getAlphabets() {
        return alphabets;
    }

    public List<String> getHighest_alphabet() {
        return highest_alphabet;
    }
}
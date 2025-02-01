public class Main{
    public static void main(String[] args) {
        int points = 100;

        String passOrFail = (points >= 75) ? "PASS" : "FAIL";
        //if >75 pass, <75 fails

        System.out.println(passOrFail);
    } 
}
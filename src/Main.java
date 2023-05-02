public class Main {
    public static void main(String[] args) {

        String result = makePassword(16);

        System.out.println(result);

    }

    public static String makePassword(int length){
        String passwords = "";

        for (int i = 0; i < length - 2; i++){
            passwords = passwords + RandomGeneration.randomCharacter
                    ("aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUxXyYzZ");
        }

        String randomDigit = RandomGeneration.randomCharacter("1234567890");
        passwords = RandomGeneration.insertAtRandom(passwords,randomDigit);
        String randomSymbol = RandomGeneration.randomCharacter("!@#$%^&*");
        passwords = RandomGeneration.insertAtRandom(passwords, randomSymbol);
        return passwords;
    }

}
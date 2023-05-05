public class Main {
    public static void main(String[] args) {

        String result = makePassword(16);// still need to add prompts that makes sense, this one works some how

        System.out.println(result);
        //how about creating a copy functionality where if you click, it auto copies the result so i do not have to move the mouse highlighting

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

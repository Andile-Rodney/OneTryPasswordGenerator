public class RandomGeneration {

    public static String randomCharacter(String characters){
        int n = characters.length();
        int r = (int) (n * Math.random());
        return characters.substring(r, r+1);
    }

    public static String insertAtRandom(String str, String toInsert){
        int n = str.length();
        int r = (int)(n * Math.random());
        return str.substring(0, r) + toInsert + str.substring(r);
    }
}

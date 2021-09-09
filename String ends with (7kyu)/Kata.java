public class Kata {

    public static boolean solution(String str, String ending) {
        if(str.length() - ending.length() < 0) return false;
        return str.substring(str.length() - ending.length()).equals(ending);
    }
}
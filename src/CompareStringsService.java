public class CompareStringsService {

    public String compare(String a, String b) {
        String result;
        if (a.equals(b)) {
            result = "Строки идентичны";
        } else {
            result = "Строки неидентичны";
        }
        return result;
    }
}
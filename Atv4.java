public class Atv4 {
    public static void main(String[] args) {
        String input = "Hello";
        String resultado = processar(input);
        System.out.println("" + resultado);
    }

    public static String processar(String s) {
        if (s == null)
            return null;
        else {
            String maiusculas = s.toUpperCase();
            return maiusculas;
        }
    }
}

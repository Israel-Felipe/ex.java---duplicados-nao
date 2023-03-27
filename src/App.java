public class App {
    public static void main(String[] args) {
        String[] array1 = {"maçã", "banana", "laranja", "uva", "abacaxi"};
        String[] array2 = {"pera", "banana", "abacate", "maçã", "abacaxi"};
        
        for (String item1 : array1) {
            for (String item2 : array2) {
                if (item1.equals(item2)) {
                    System.out.println(item1);
                    break;
                }
            }
        }
    }
}
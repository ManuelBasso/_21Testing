public class Main {
    public static void main(String[] args) {
        //Metodo per calcolare lunghezza di una stringa.
        String name = "Manuel";
        System.out.println("Length string = " + stringLength(name));
    }

    public static Integer stringLength(String a) {
        if (a == null){
            return null;
        }
        return a.length();
    }
}

public class NoParameterAndNoReturnType {

    public static void main(String[] args) {
        furniture();
    }

    public static void /* THIS IS CALLED NO RETURN TYPE */ furniture(/* INSIDE THIS IS CALLED PARAMETER */) {
        System.out.println("Bed");
        System.out.println("Dining table");
        System.out.println("Chair");
    }
}
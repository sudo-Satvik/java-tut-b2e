package basic_oops;

public class W_Getter {
    int id = 1001;

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        W_Getter getter = new W_Getter();
        System.out.println(getter.getId());
    }
}

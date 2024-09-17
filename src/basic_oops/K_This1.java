package basic_oops;

class K_This1 {
    int rollNo;
    String name;
    float fees;
    K_This1(int rollNo, String name, float fees){
        this.rollNo = rollNo;
        this.name = name;
        this.fees = fees;
    }
    public static void main(String[] args) {
        K_This1 th = new K_This1(12, "Satvik", 5000.00f);
        int rollNo1 = th.rollNo;
        String name1 = th.name;
        float fees = th.fees;
        System.out.println(rollNo1+" "+name1+" "+fees);
    }
}
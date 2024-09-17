package c_advance_oops.generic_classes;

public class GenericClass {
    public static void main(String[] args) {
//        Bajaj anda = new Bajaj("5257");         // This can only accept string type

//        What if I have to create that one which accept any class I enter? We use Generic Classes
        Cat cat1 = new Cat(12);         // Dry class ~ bcz I haven't mentioned the specific type
        Cat cat2 = new Cat("Arabian");  // Dry class ~ bcz I haven't mentioned the specific type
//        Instead I have to do this which is a good practice
        Cat<Integer> cat3 = new Cat<>(1207);
        System.out.println(cat3.getId());
    }
}

class Cat<E>{
    E id;
    public Cat(E id){
        this.id = id;
    }
    E getId(){
        return id;
    }
}

class Bajaj{
    String pulsar;
    public Bajaj(String pulsar){
        this.pulsar = pulsar;
        System.out.println(this.pulsar);
    }
}

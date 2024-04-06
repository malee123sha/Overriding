public class Tree {
    void gain()  {
        System.out.println("Growing!");
    }
}
class Mango extends Tree {
    @Override
    void gain() {
        System.out.println("Growing Slowly!");
    }
}
class Trs {
    public static void main(String[] args) {
        Mango m = new Mango();
        m.gain();
    }
}

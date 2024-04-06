public class centralBank {
    int getRateOfInterest() {
        return 2;
    }
}
class BOC extends centralBank  {
    @Override
    int getRateOfInterest() {
        return 8;
    }
}
class NSB extends centralBank  {
    @Override
    int getRateOfInterest() {
        return 5;
    }
}
class HNB extends centralBank   {
    @Override
    int getRateOfInterest() {
        return 9;
    }
}
class testOverride {
    public static void main(String[] args) {
        BOC b = new BOC();
        NSB n = new NSB();
        HNB h = new HNB();
        System.out.println("BOC Rate of Interest is :-"+b.getRateOfInterest());
        System.out.println("NSB Rate of Interest is :-"+n.getRateOfInterest());
        System.out.println("HNB Rate of Interest is :-"+h.getRateOfInterest());
    }
}



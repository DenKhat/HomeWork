public class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width = 10;
        mybox1.heigth = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.heigth = 6;
        mybox2.depth = 9;

        vol = mybox1.volume();
        System.out.println("Oбъeм равен " + vol);

        vol = mybox2.volume();
        System.out.println("Oбъeм равен " + vol);
    }
}


public class Box {
    double width;
    double heigth;
    double depth;
    Box(double w, double h, double d) {
        width = w;
        heigth = h;
        depth = d;
    }

    Box() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        heigth = 10;
        depth = 10;
    }

    double volume() {
        return width * heigth * depth;
    }
    void setDim(double w, double h, double d){
        width = w;
        heigth = h;
        depth = d;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        mybox.width = 10;
        mybox.heigth = 20;
        mybox.depth = 15;

        vol = mybox.width * mybox.heigth * mybox.depth;
        System.out.println("Oбъeм равен " + vol);
    }
}













public class LifeTime {
    public static void main(String[] args) {
        int x;
        for (x=0; x<3; x++) {
        int y=-1;//иницилизируется переменная y;
            System.out.println("y теперь равно "+ y);
            y=100;
            System.out.println("y теперь равно " +y);// пример демонстрирует срок действия  переменной
    }

}
    }

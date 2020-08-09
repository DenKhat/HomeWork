public class BeA {
        int k;

        void  showk(){
            System.out.println("k: " + k);
        }
        void sum(){
            System.out.println("i+j+k: " + (i+j+k));
        }
    }

    public class SimpleInheritance {
        public static void main(String[] args) {
            A superOb = new A();
            B subOb = new B();

            // суперкласс может использоваться самостоятельно
            superOb.i = 10;
            superOb.j = 20;
            System.out.println("Coдepжимoe объекта superOb : ");
            superOb.showij();
            System.out.println();

            // Подкласс имеет доступ ко всем открытым членам
            // своего класса
            subOb.i = 7;
            subOb.j = 8;
            subOb.k = 9;
            System.out.println("Coдepжимoe объекта subOb : ");
            subOb.showij();
            subOb.showk();

            System.out.println();
            System.out.println("Cyмaм i, j и k в объекте subOb");
            subOb.sum();

        }
    }







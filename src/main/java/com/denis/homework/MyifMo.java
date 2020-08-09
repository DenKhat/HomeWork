public class MyifMo {
    class  MyIFImo implements MyIf{
        // Реализован метод getNumber()
        // А вызов метода getString разрешается по умолчанию
        public int getNumber() {
            return 100;
        }
    }
    class  MyIFImo2 implements MyIf{
        // Реализован метод getNumber()
        // А вызов метода getString разрешается по умолчанию
        public int getNumber() {
            return 100;
        }
        public String getString(){
            return "Это другая символьная строка.";
        }
    }




    class DefaultMethodDemo {
        public static void main(String[] args) {
            MyIFImo obj = new MyIFImo();

            System.out.println(obj.getNumber());
// Метод getStrinq () также можно вызвать,
            System.out.println(obj.getString());
        }
    }










}

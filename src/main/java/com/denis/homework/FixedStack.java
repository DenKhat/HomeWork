        class FixedStack implements IntStack{
        private int stck[];
        private int tos;
        // выделить память и инициализировать стек
        FixedStack(int size){
            stck = new int [size];
            tos = -1;
        }

        // разместить элемент в стеке
        public void push(int item) {
            if(tos == stck.length-1)
                System.out.println("Cтeк заполнен.");
            else
                stck[++tos] = item;
        }

        // извлечь элемент из стека
        public int pop() {
            if(tos < 0){
                System.out.println("Стек не загружен.");
                return 0;
            }
            else return stck[tos--];
        }
    }














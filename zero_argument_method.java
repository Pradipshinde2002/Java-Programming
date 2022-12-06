class zero_argument {
    public static void v_method(int a) {
        System.out.println("No of arguments:" +a);
        for (int i = 0; i < a; i++) {
            System.out.println(i + " ");
            //System.out.println();
        }

    }


        public static void main(String[] args) {
            v_method(100);
        }
    }

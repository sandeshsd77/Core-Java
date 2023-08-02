package practice;


    public class Aa {
        int a;
        String b;
        Aa(){
            this.a=10;
            this.b="Sandesh";
            System.out.println(a+" "+ b);
        }
        Aa(Aa ref){
            a = ref.a;
            b = ref.b;
            System.out.println(a+" "+ b);
        }

    }
    class Bb {
        public static void main (String [] args){
            Aa r = new Aa();
            Aa r2 = new Aa(r);

        }
    }


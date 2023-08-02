package practice;

public class CopyConstructor02 {
        int productId;
        String productName;
        String productDescription;

        CopyConstructor02(int pId, String pName, String pDescription){
            productId = pId;
            productName = pName;
            productDescription = pDescription;
        }

        //copy constructor
        public CopyConstructor02(CopyConstructor02 copyConstructor02) {
            productId = copyConstructor02.productId;
            productName = copyConstructor02.productName;
            productDescription= copyConstructor02.productDescription;
        }

        public static void main(String[] args) {
            CopyConstructor02 copyConstructor02 = new CopyConstructor02(101, "Camera","Its PTZ camera");
            int productId1 = copyConstructor02.productId;
            System.out.println(productId1);

            CopyConstructor02 copyConstructor022 = new CopyConstructor02(copyConstructor02);
            int productId2 = copyConstructor022.productId;
            System.out.println(productId2);

        }

    }

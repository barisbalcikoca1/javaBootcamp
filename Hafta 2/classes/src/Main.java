public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(); //customerManagerın kendisi stack te tutulurken
        customerManager.add();//add fonskiyonu heap de tutulur.
        customerManager.remove();
        customerManager.update();

        int [] sayilar1 = new int[] {1,2,3};
        int [] sayilar2 = new int[] {4,5,6};

        sayilar2= sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);
    }
}

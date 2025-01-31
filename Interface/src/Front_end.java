public class Front_end implements Junior,Middle{

    @Override
    public void learn(){
        System.out.println("Front-end:--Junior--");
        System.out.println("Yeni Front-end dillerini oyrenir ve praktika edir.");
    }


    @Override
    public void develop(){
        System.out.println("Front-end:--Middle--");
        System.out.println("Front0end uzre serbest proqram kodlayir.");

    }

    public static void getInfo(){
        Junior.info();
        Middle.info();
        Senior.info();

    }


}

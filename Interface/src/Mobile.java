public class Mobile implements Junior,Middle{
    @Override
    public void learn(){
        System.out.println("Mobile:--Junior--");
        System.out.println("Yeni proqramlasdirma dilleri oyrenir.");

    }

    @Override
    public void develop(){
        System.out.println("Mobile:--Middle--");
        System.out.println("Mobil tetbiqleri inkisaf etdirir.");

    }

}

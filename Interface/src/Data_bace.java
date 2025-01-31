public class Data_bace implements Junior,Middle,Senior{
    @Override
    public void learn(){
        System.out.println("Data bace:--Junior--");
        System.out.println("Data bace-nin ilkin adddimlarini praktika edir ve ozunu inkisaf etdirir. ");
    }

    @Override
    public void develop(){
        System.out.println("Data bace:--Middle--");
        System.out.println("Qurulan data bace-i isleyir.");
    }

    @Override
    public void specialist(){
        System.out.println("Data bace:--Senior--");
        System.out.println("Data bace-i planlasdirir.");

    }

}

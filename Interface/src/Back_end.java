public class Back_end implements Junior,Middle,Senior{

    @Override
    public void learn(){
        System.out.println("Back-end:--Junior--");
        System.out.println("Back-end developer yeni texnologiyalar oyrenir.");
    }

    @Override
    public void develop(){
        System.out.println("Back-end:--Middle--");
        System.out.println("Musteqil sekilde verilen standart tapsirigi icra  edir.");
    }

    @Override
    public void specialist(){
        System.out.println("Back-end:--Senior--");
        System.out.println("Sistemi qurur.");
    }

}

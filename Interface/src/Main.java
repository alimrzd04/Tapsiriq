public class Main {
    public static void main(String[] args) {
        Front_end front = new Front_end();
        front.learn();
        front.develop();
        Front_end.getInfo();
        System.out.println();

        Back_end back = new Back_end();
        back.learn();
        back.develop();
        back.specialist();
        System.out.println();

        Data_bace data = new Data_bace();
        data.learn();
        data.develop();
        data.specialist();

        System.out.println();
        Mobile mob = new Mobile();
        mob.learn();
        mob.develop();
    }
}
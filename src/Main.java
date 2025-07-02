public class Main {
    public static void main(String[] args) {
        Clock relogiobr = new RelogioBR();
        relogiobr.setSegundo(0);
        relogiobr.setMinuto(0);
        relogiobr.setHora(15);

        System.out.println(relogiobr.getTempo());
        System.out.println(new RelogioUSA().convert(relogiobr).getTempo());
    }
}
public class Main {
    public static void main(String[] args) {
        String [] mass = {"I", "II"};


Animal y = Animal.valueOf(mass[1]);
        int a = Integer.parseInt(Animal.valueOf(mass[0]).getTranslation());
        int b = Integer.parseInt(y.getTranslation());
        int result = a+b;
        System.out.println(result);
        int tens = 100%10;
        System.out.println(tens);
    }
}

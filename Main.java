public class Main {
    public static void main(String[] args) {

        byte days = 10;
        short weeks = 300;
        int mounths = 24;
        long years = 3;
        float plays = 2;
        double work = 5;



        var Weight1Boxer = 78.2;
        var Weight2Boxer = 82.7;

        System.out.println("общий вес бойцов " + (Weight1Boxer + Weight2Boxer));
        System.out.println("разница в весе " + (Weight2Boxer - Weight1Boxer));



        var BananaKkl = 80;
        var MilkKkl = 105;
        var IceCreamKkl = 100;
        var EggKkl = 70;

        double EatKkl = ((BananaKkl*5) + (MilkKkl*2) + (IceCreamKkl*2) + (EggKkl*4));
        double Kilograms = (EatKkl/1000);

        System.out.println(EatKkl + " гр");
        System.out.println(Kilograms + " кг");



        var Kilogram = 1000;

        float Midl = ((500+250)/2);
        int Lose1Weight = ((Kilogram*7)/500);
        int Lose2Weight = ((Kilogram*7)/250);
        float Lose3Weight = ((Kilogram*7)/Midl);

        System.out.println(Lose1Weight + " дней");
        System.out.println(Lose2Weight + " дней");
        System.out.println(Lose3Weight + " дней");



        var Masha = 67760;
        var Denis = 83690;
        var Kris = 76230;

        int NewMasha = (Masha*110/100);
        int NewDenis = (Denis*110/100);
        int NewKris = (Kris*110/100);
        int OldYearMasha = (Masha*12);
        int OldYearDenis = (Denis*12);
        int OldYearKris = (Kris*12);
        int NewYearMasha = (NewMasha*12);
        int NewYearDenis = (NewDenis*12);
        int NewYearKris = (NewKris*12);
        int YearDifMasha = (NewYearMasha-OldYearMasha);
        int YearDifDenis = (NewYearDenis-OldYearDenis);
        int YearDifKris = (NewYearKris-OldYearKris);

        System.out.println("Маша теперь получает "+ (NewMasha) +". Годовой доход вырос на " + YearDifMasha + " рублей.");
        System.out.println("Денис теперь получает "+ (NewDenis) +". Годовой доход вырос на " + YearDifDenis + " рублей.");
        System.out.println("Кристина теперь получает "+ (NewKris) +". Годовой доход вырос на " + YearDifKris + " рублей.");



    }
}

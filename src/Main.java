public class Main {
    public static void main(String[] args)
    {

        int ticket = 1800; //стоимость билета
        int Miles = 20; // количество рублей для 1 бонусной мили

        int bonusMiles = ticket / Miles;

        System.out.println(bonusMiles);
    }
}
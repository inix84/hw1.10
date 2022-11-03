//package objects;
public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев","Толстой");
        Author StevenKing = new Author("Стивен","Кинг");

        Book voinaIMir = new Book("Война и Мир", levTolstoy, 2020);
        Book siyanie = new Book("Сияние", StevenKing, 2002);

        //System.out.println(voinaIMir.getClass());


        System.out.println(voinaIMir);
        System.out.println(siyanie);

        voinaIMir.setPublicationYear(2022);

        System.out.println(voinaIMir);

    }

}
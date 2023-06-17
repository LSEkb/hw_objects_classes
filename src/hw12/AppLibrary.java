package hw12;

public class AppLibrary {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        System.out.println("levTolstoy = " + levTolstoy.toString());
        Author alexNTolstoy = new Author("Алексей Н.", "Толстой");
        System.out.println("alexNTolstoy = " + alexNTolstoy.toString());
        Book annaKarenina = new Book("Анна Каренина", levTolstoy, 1878);
        System.out.println("AnnaKarenina = " + annaKarenina.toString());
        Book aelita = new Book("Аэлита", alexNTolstoy, 1923);
        System.out.println("Aelita = " + aelita.toString());
        System.out.println(aelita.hashCode());
        aelita.setPublishingYear(1938);
        System.out.println("Aelita = " + aelita.getPublishingYear() + " авторская редакция");
        System.out.println(aelita.hashCode());
        if (!levTolstoy.equals(alexNTolstoy)) {
            System.out.println("разные писатели");
        } else {
            System.out.println("один и тот же писатель");
        }


    }


}


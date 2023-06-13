package hw12;

public class AppLibrary {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        System.out.println("levTolstoy = " + levTolstoy.getFirstName() + " " + levTolstoy.getLastName());
        Author alexNTolstoy = new Author("Алексей Н.", "Толстой");
        System.out.println("alexNTolstoy = " + alexNTolstoy.getFirstName() + " " + alexNTolstoy.getLastName());
        Book annaKarenina = new Book("Анна Каренина", levTolstoy, 1878);
        System.out.println("AnnaKarenina = " + annaKarenina.getBookName() + ", " + annaKarenina.getAuthorName().getFirstName()+ annaKarenina.getAuthorName().getLastName() + ", " + annaKarenina.getPublishingYear());
        Book aelita = new Book("Аэлита", alexNTolstoy, 1923);
        System.out.println("Aelita = " + aelita.getBookName() + ", " + aelita.getAuthorName().getFirstName() + aelita.getAuthorName().getLastName() +", " + aelita.getPublishingYear());
        aelita.setPublishingYear(1938);
        System.out.println("Aelita = " + aelita.getPublishingYear() + " авторская редакция");

    }
}

public class Main {

        public static void main(String[] args) {
            Book[] books = new Book[2];
            Author JoanneRowling = new Author("Joanne", "Rowling");
            Book harryPotter = new Book(JoanneRowling,  "Harry Potter and the Philosopher's Stone", 1993);
            books[0] = harryPotter;

            Author dmitriEmec = new Author("Dmitri", "Emec");
            Book tanyaGrotter = new Book(dmitriEmec, "Tanya Grotter and magic double bass",2002);

    System.out.println(harryPotter.getBookName() +", "+ harryPotter.getCreateYear() +", "+ harryPotter.getAuthor().getSecondName() +" "+harryPotter.getAuthor().getFirstMame());
    System.out.println(tanyaGrotter.getBookName() +", "+ tanyaGrotter.getCreateYear() +", "+ tanyaGrotter.getAuthor().getSecondName() +" "+ tanyaGrotter.getAuthor().getFirstMame());


        }

    }
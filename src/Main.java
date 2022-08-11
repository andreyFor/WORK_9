public class Main {

        public static void main(String[] args) {
            Book[] books = new Book[2];
            Author joanneRowling = new Author("Joanne", "Rowling");
            Book harryPotter = new Book(joanneRowling,  "Harry Potter and the Philosopher's Stone", 1993);
            books[0] = harryPotter;

            Author dmitriEmec = new Author("Dmitri", "Emec");
            Book tanyaGrotter = new Book(dmitriEmec, "Tanya Grotter and magic double bass",2002);
            books[1] = tanyaGrotter;
            tanyaGrotter.setCreateYear(1943);

            //System.out.println(harryPotter.getBookName() +", "+ harryPotter.getCreateYear() +", "+ harryPotter.getAuthor().getSecondName() +" "+harryPotter.getAuthor().getFirstMame());
            //System.out.println(tanyaGrotter.getBookName() +", "+ tanyaGrotter.getCreateYear() +", "+ tanyaGrotter.getAuthor().getSecondName() +" "+ tanyaGrotter.getAuthor().getFirstMame());


               for (Book book : books) {
                System.out.println(book);
            }

        }

    }
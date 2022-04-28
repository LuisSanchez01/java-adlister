import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        ArrayList<Quote> quotes = new ArrayList<>();
        Author neilGaiman = new Author(1L, "Neil Gaiman");
        Author marcelProust = new Author(2L, "Marcel Proust");

        Quote quote1 = new Quote(1L, "The real voyage of discovery consists not in seeking new " +
                "landscapes, but in having new eyes.", marcelProust);
        Quote quote2 = new Quote(2L, "I hope that in this year to come, you make mistakes. " +
                "Because if you are making mistakes...you're Doing something.", neilGaiman);

        quotes.add(quote1);
        quotes.add(quote2);

        for(Quote quote : quotes){
            System.out.println(quote.getAuthor().getAuthor_name() + "said:" + quote.getContent());
        }
    }
}

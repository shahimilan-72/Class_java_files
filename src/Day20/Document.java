package Day20;
import java.util.Arrays;
import java.util.List;

public class Document {


    private List<Page> pages;

    public String getPageContent(int pageNumber) {
        pages = Arrays.asList(new Page("content1"), new Page("content 2"), new Page("content 3"));
        return this.pages.get(pageNumber).getContent();
    }

    public static void printPages(Document doc, int[] pageNumbers) {
        Arrays.stream(pageNumbers)
                .map(doc::getpageContent)
                .forEach(Printers::print);
    }
    public static void main (String[]args){
            Document doc = new Document();
            int[] pageNumbers = {1, 2, 3};
            printPages(doc, pageNumbers);

    }
}
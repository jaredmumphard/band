package Week8;



public class Kindle {

    private int totalPages;
    private int currentPage;

    public Kindle (int numberOfPages) {

        totalPages = numberOfPages;
        currentPage = 1;

    }//end of constructor

    public String toString() {
        return "Page " + currentPage + " of " + totalPages;
    }//end of the toString method

    public void turnPages(){
        turnPages(1);
    }//end of turnPages
    public void turnPages(int numberOfPage){
        if ((currentPage + numberOfPage) <= totalPages) {
            currentPage += numberOfPage;
        } else {
            System.out.println("Turning " + numberOfPage + " pages would take you past the last page.");
            currentPage = totalPages;
            System.out.println("You are now on             : " + toString());
        }//end of if-else
    }//end of turnPages

}//end of the Kindle class


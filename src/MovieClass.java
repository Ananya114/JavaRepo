
class Movie{
    private final String name;
    private final String studio;
    private final String rating;
    public Movie(String name, String studio, String rating) {
        this.name = name;
        this.studio=studio;
        this.rating=rating;
    }
    public Movie(String name, String studio) {
        this.name = name;
        this.studio=studio;
        this.rating="PG";
    }
    public String getName(){
        return name;
    }
    public Movie[] getPG(Movie[] movieList){
        Movie[] PGMovieList=new Movie[movieList.length];
        int index=0;
        for (Movie m: movieList){
            if (m.rating.equals("PG")) {
                PGMovieList[index]=m;
                index++;
            }
        }
        return PGMovieList;
    }
}

public class MovieClass {
    public static void main(String[] args) {
        Movie movie1=new Movie("Casino Royale", "Eon Productions", "PG-13");
        Movie movie2=new Movie("Deadpool", "Sony Movies");
        Movie movie3=new Movie("Interstellar", "Magic Movies");
        Movie[] movieList=new Movie[3];
        movieList[0]=movie1; movieList[1]=movie2; movieList[2]=movie3;
        for (Movie m: (movieList[0].getPG(movieList))){
            if (m!=null)
                System.out.print(m.getName()+" ");
        }
    }
}

package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    public Movie(String movieName, double rating, int numRatings, int revenue){
        this.movieName = movieName;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }
    public void movieToString(){
        System.out.println("Movie: "+this.movieName);
        System.out.println("Rating: "+this.rating);
        System.out.println("Number of ratings: "+this.numRatings);
        System.out.println("Revenue: "+this.revenue);
        System.out.println("");
    }
    public String getMovieName(){
        return this.movieName;
    }
    public int getRevenue(){
        return this.revenue;
    }
    public void addRating(double rating){
        this.rating = this.rating*this.numRatings;
        this.numRatings += 1;
        this.rating = this.rating+rating;
        this.rating = this.rating/this.numRatings;
    }
    public double getRating(){
        return this.rating;
    }
    public boolean compareRatings(Movie movie){
        if(this.rating > movie.getRating()){
            return true;
        }
        return false;
    }
    public Movie pirateMovie(){
        return new Movie(this.movieName, this.rating, this.numRatings, this.revenue);
    }
}
    
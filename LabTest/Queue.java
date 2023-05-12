import java.util.ArrayList; // amar

public class Queue {
    private ArrayList<Movie> movies;
    public Queue(){
        movies= new ArrayList<Movie>();
    }
    public void addMovie(String title, int rating){
        movies.add(new Movie(title, rating));
    }
    public void removeMovie(String title){
        for(int i=(movies.size()-1);i>=0;i--){
            if(movies.get(i).getTitle().equalsIgnoreCase(title)){
                movies.remove(i);
            }
        }
    }
    public String toString(){
        String s="You have "+movies.size()+" movies in your queue:";
        s+="\n"+"\n";
        for(Movie name: movies){
            s+=name.getTitle()+" ";
            for (int i=0;i<name.getRating();i++){
                s+="*";
            }
            s+="\n";
        }
        return s;
    }
}

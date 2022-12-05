import java.util.ArrayList;

public class Flight {
    
    public Flight(){

    }

    public int [] findMoviePair(int [] movies, int flightDuration){
        int totalDesiredDuration = flightDuration - 30;
        int max = -1;
        int j = 0;
        int pair [] = new int[2];
        for (int i=0; i<movies.length; i++){
            for (int movie : movies){
                int pairDuration = movie + movies[i];
                if (pairDuration <= totalDesiredDuration && pairDuration>max){
                    pair[0] = i;
                    pair[1] = j;
                }
            }
        }
        return pair;
    }
    
    public static void main(String[] args){
        Flight flight = new Flight();
        int movies [] = {90,85,75,60,120,150,125};
        int pair [] = flight.findMoviePair(movies, 250);
        System.out.println(pair[0] + "\t" + pair[1]);
    }
}

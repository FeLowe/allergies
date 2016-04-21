import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Allergies{
  public static ArrayList<String> findAllergies(Integer score) {
    ArrayList<String> allergiesList = new ArrayList<String>();
    HashMap<Integer, String> allergiesScore = new HashMap<Integer, String>();
    allergiesScore.put(1, "eggs");
    allergiesScore.put(2, "peanuts");
    allergiesScore.put(4, "shellfish");
    allergiesScore.put(8, "strawberries");
    allergiesScore.put(16, "tomatoes");
    allergiesScore.put(32, "chocolate");
    allergiesScore.put(64, "pollen");
    allergiesScore.put(128, "cats");

    allergiesList.add(allergiesScore.get(score));

    Integer scoreCounter = 128;
    do {
      if (score / scoreCounter >= 1){
        allergiesList.add(allergiesScore.get(scoreCounter));
        score %= scoreCounter;
      }

      scoreCounter /= 2;
    } while (scoreCounter >= 1);


    return allergiesList;
  }
}

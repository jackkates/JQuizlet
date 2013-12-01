import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Creator: jackkates
 * Date: 12/1/13
 */
public class Quizlet {

    private String clientID;
    private Gson gson;

    public Quizlet(String clientID) {
        this.clientID = clientID;
        this.gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
    }


}




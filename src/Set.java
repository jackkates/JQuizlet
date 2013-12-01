import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Creator: jackkates
 * Date: 12/1/13
 */
public class Set {

    public int id;
    public String title;
    @SerializedName("created_by") public String creator;
    public int termCount;
    public String[] subjects;
    public String description;
    @SerializedName("terms") List<Card> cards;
}

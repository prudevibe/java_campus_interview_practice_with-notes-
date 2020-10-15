import java.util.*;

public class ceser_cypher {

    String input_message;
    int key;

    ceser_cypher()
    {

    }
    ceser_cypher(String ip,int a)
    {
        this.input_message = ip;
        this.key = a;
    }
    public static Character rtchatValue(int a)
    {
        int k = a%26;
        return (char)k;
    }
}
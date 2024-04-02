package testcases;
import org.testng.annotations.Test;
import utilities.JSONDataRead;
import java.io.IOException;
import java.text.ParseException;
public class JsonData {
    @Test
    public void readTestData() throws IOException, ParseException, org.json.simple.parser.ParseException {
        JSONDataRead data_json=new JSONDataRead();
        for(int i=0;i<7;i++){
            data_json.getUserCreds(i);
            System.out.println(data_json.getEmail());
            System.out.println(data_json.getPassword());
            System.out.println("\n");
        }
    }
}

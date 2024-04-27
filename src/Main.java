import com.google.gson.Gson;
import models.*;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();
        Resume myResume = gson.fromJson(new FileReader("src/kalebWalker.json"), Resume.class);

        String resumeJson = gson.toJson(myResume);
        System.out.println(resumeJson);
    }
}

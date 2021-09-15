import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class lineSplitExample {
    public static void main(String[] args) throws IOException {
        var fileName = "jerseys.txt";
        var studentJerseys = Paths.get(fileName);
        var studentNames = new ArrayList<String>();
        var jerseyNumbers = new ArrayList<Integer>();
        var studentLines = Files.readAllLines(studentJerseys);
        for (var line : studentLines){
            var splitLine = line.split(",");
            studentNames.add(splitLine[0]);
            var jerseyNum = Integer.parseInt(splitLine[1]);
            jerseyNumbers.add(jerseyNum);
        }
        for (int i = 0; i< studentNames.size(); i++) {
            System.out.println("Student: "+ studentNames.get(i) + " Jersey Number: " + jerseyNumbers.get(i));
        }
    }
}

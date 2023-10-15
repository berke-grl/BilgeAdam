import java.io.*;
import java.util.ArrayList;

public class BgReader {
    private String filePath;
    FileReader fileReader;

    public BgReader(String filePath) {
        this.filePath = filePath;
    }

    int character;

    public ArrayList<String> readWords() throws IOException {

        fileReader = new FileReader(filePath);
        ArrayList<String> words = new ArrayList<>();
        StringBuilder strBuilder = new StringBuilder();

        int character;

        while ((character = fileReader.read()) != -1) {
            char c = (char) character;
            strBuilder.append(c);
            if (c == ' ') {
                words.add(strBuilder.toString());
                strBuilder = new StringBuilder();
            }
        }
        //to adding last word
        if (!strBuilder.isEmpty()) {
            words.add(strBuilder.toString());
        }

        fileReader.close();

        return words;
    }

    String readLineAt(int searchedLineNumber) throws IOException {

        fileReader = new FileReader(filePath);
        StringBuilder strBuilder = new StringBuilder();
        StringBuilder searchedLine = new StringBuilder();

        int currentChar;
        int lineNumber = 1;

        while ((currentChar = fileReader.read()) != -1) {

            char c = (char) currentChar;
            strBuilder.append(c);

            if(c == '\n'){
                lineNumber++;
                strBuilder = new StringBuilder();
            }

            if (searchedLineNumber == lineNumber && c != '\n') {
                searchedLine.append(c);
            }
        }
        return searchedLine.toString();
    }
}
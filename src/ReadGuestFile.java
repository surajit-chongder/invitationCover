import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadGuestFile {
    private final String fileName;

    public ReadGuestFile(String file) {
        this.fileName = file;
    }

    public List readGuest() throws IOException {
        BufferedReader crunchifyBuffer;
        List<ArrayList<String>> list = new ArrayList<>();
        String crunchifyLine;
        crunchifyBuffer = new BufferedReader(new FileReader(this.fileName));
        while ((crunchifyLine = crunchifyBuffer.readLine()) != null) {
            list.add(crunchifyArrayList(crunchifyLine));
        }
        return list;
    }

    public ArrayList<String> crunchifyArrayList(String crunchifyString) {
        ArrayList<String> crunchifyResult = new ArrayList<>();
        if (crunchifyString != null) {
            String[] splitData = crunchifyString.split(",");
            Collections.addAll(crunchifyResult, splitData);
        }
        return crunchifyResult;
    }

}

package Loop.hackerank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MapkoMaino {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {

            String s = br.readLine();
            int num   = Integer.parseInt(br.readLine());

            phoneBook.put(s, num);

        }

        String s;
        List<String> query = new ArrayList<>();
        while ((s = br.readLine()) != null && !s.isEmpty()){
            query.add(s);
        }

        for (String queryS : query){

            if (phoneBook.containsKey(queryS)){
                System.out.println(queryS + "=" + phoneBook.get(queryS));
            }else {
                System.out.println("Not found");
            }

        }

        br.close();
    }
}

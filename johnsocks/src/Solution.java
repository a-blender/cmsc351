import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.net.*;
import com.google.gson.*;

import org.json.JsonObject;

public class Solution {
    /*
     * Complete the function below.
     * Base url: https://jsonmock.hackerrank.com/api/movies/search/?Title=
     */

    static String[] getMovieTitles(String substr) {

        // query
        URL url = null;
        try {

            url = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr);
            JSONObject json = readJsonFromUrl(url);
            String _Query = url.getQuery();
            _Query.
        }
        catch (Exception e) {
            e.printStackTrace();
        }


        // add move titles to titles array
        String titles[] = new String[total];

        // sort array
        Arrays.sort(titles); // is this asc order?
        return titles;
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String[] res;
        String _substr;
        try {
            _substr = in.nextLine();
        } catch (Exception e) {
            _substr = null;
        }

        res = getMovieTitles(_substr);
        for(int res_i=0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }
}
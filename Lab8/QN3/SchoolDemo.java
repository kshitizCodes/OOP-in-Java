package QN3;

import java.util.HashMap;
import java.util.Map;

public class SchoolDemo {
    public static void main() {
        Map<String, School> map = new HashMap<>();

        String[][] schools = {
                {"1", "Academia", "College", "Lalitpur"},
                {"2", "Khwopa", "College", "Bhaktapur"},
                {"3", "Prime", "College", "Kathmandu"},
                {"4", "Prasadi", "High", "Lalitpur"},
                {"5", "Shankerdev", "College", "Kathmandu"},
                {"6", "United", "High", "Lalitpur"},
                {"7", "Gems", "Secondary", "Lalitpur"}
        };
        School school0 = new School(Integer.parseInt(schools[0][0]), schools[0][1], schools[0][2], schools[0][3]);
        School school1 = new School(Integer.parseInt(schools[1][0]), schools[1][1], schools[1][2], schools[1][3]);
        School school2 = new School(Integer.parseInt(schools[2][0]), schools[2][1], schools[2][2], schools[2][3]);
        School school3 = new School(Integer.parseInt(schools[3][0]), schools[3][1], schools[3][2], schools[3][3]);
        School school4 = new School(Integer.parseInt(schools[4][0]), schools[4][1], schools[4][2], schools[4][3]);
        School school5 = new School(Integer.parseInt(schools[5][0]), schools[5][1], schools[5][2], schools[5][3]);
        School school6 = new School(Integer.parseInt(schools[6][0]), schools[6][1], schools[6][2], schools[6][3]);

    }
}

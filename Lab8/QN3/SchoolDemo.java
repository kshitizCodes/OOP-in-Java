package QN3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SchoolDemo {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> Lalitpur = new HashMap<>();
        Map<String, ArrayList<String>> Bhaktapur = new HashMap<>();
        Map<String, ArrayList<String>> Kathmandu = new HashMap<>();

        String[][] schools = {
                {"1", "Academia", "College", "Lalitpur"},
                {"2", "Khwopa", "College", "Bhaktapur"},
                {"3", "Prime", "College", "Kathmandu"},
                {"4", "Prasadi", "High", "Lalitpur"},
                {"5", "United", "High", "Lalitpur"},
                {"6", "Ascol", "High", "Kathmandu"},
                {"7", "Gems", "Secondary", "Lalitpur"},
                {"8", "Shankerdev", "College", "Kathmandu"},
        };
        School school0 = new School(Integer.parseInt(schools[0][0]), schools[0][1], schools[0][2], schools[0][3]);
        School school1 = new School(Integer.parseInt(schools[1][0]), schools[1][1], schools[1][2], schools[1][3]);
        School school2 = new School(Integer.parseInt(schools[2][0]), schools[2][1], schools[2][2], schools[2][3]);
        School school3 = new School(Integer.parseInt(schools[3][0]), schools[3][1], schools[3][2], schools[3][3]);
        School school4 = new School(Integer.parseInt(schools[4][0]), schools[4][1], schools[4][2], schools[4][3]);
        School school5 = new School(Integer.parseInt(schools[5][0]), schools[5][1], schools[5][2], schools[5][3]);
        School school6 = new School(Integer.parseInt(schools[6][0]), schools[6][1], schools[6][2], schools[6][3]);
        School school7 = new School(Integer.parseInt(schools[7][0]), schools[7][1], schools[7][2], schools[7][3]);

        School[] objects = {school0, school1, school2, school3, school4, school5, school6, school7};

        ArrayList<String> lalitpurArr = new ArrayList<>();
        ArrayList<String> bhaktapurArr = new ArrayList<>();
        ArrayList<String> kathmanduArr = new ArrayList<>();
        String district;
        for (School s : objects) {
            district = s.getDistrict();
            if (Objects.equals(district, "Lalitpur")) {
                lalitpurArr.add(s.getName());
            } else if (Objects.equals(district, "Bhaktapur")) {
                bhaktapurArr.add(s.getName());
            } else if (Objects.equals(district, "Kathmandu")) {
                kathmanduArr.add(s.getName());
            }
        }
        Lalitpur.put("Lalitpur", lalitpurArr);
        Bhaktapur.put("Bhaktapur", bhaktapurArr);
        Kathmandu.put("Kathmandu", kathmanduArr);

        System.out.print("Lalitpur -> ");
        Lalitpur.forEach((key, value) -> System.out.print(value));
        System.out.println();
        System.out.print("Bhaktapur -> ");
        Bhaktapur.forEach((key, value) -> System.out.print(value));
        System.out.println();
        System.out.print("Kathmandu -> ");
        Kathmandu.forEach((key, value) -> System.out.print(value));
        System.out.println();
    }
}

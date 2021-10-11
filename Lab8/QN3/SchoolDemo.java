package QN3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolDemo {
    public static void main(String[] args) {
        School academia = new School(101, "Academia", School.SchoolType.COLLEGE, "Lalitpur");
        School prime = new School(102, "Prime", School.SchoolType.COLLEGE, "Kathmandu");
        School united = new School(103, "United", School.SchoolType.PLUS2, "Lalitpur");
        School khwapa = new School(104, "Khwapa", School.SchoolType.COLLEGE, "Bhaktapur");
        School prasadi = new School(105, "Prasadi", School.SchoolType.PLUS2, "Lalitpur");
        School gems = new School(106, "GEMS", School.SchoolType.SECONDARY, "Lalitpur");
        School shankarDev = new School(102, "Shankar Dev", School.SchoolType.COLLEGE, "Kathmandu");
        School ascol = new School(102, "Ascol", School.SchoolType.COLLEGE, "Kathmandu");

        School[] schools = new School[]{academia, prasadi, prime, united, khwapa, prasadi, gems, shankarDev, ascol};
        Map<String, List<School>> schoolMap = new HashMap<>();
        for (School s : schools) {
            schoolMap.putIfAbsent(s.getDistrict(), new ArrayList<>());
            schoolMap.get(s.getDistrict()).add(s);
        }
        schoolMap.forEach((key, value) -> System.out.println(key + "\t:\t" + value));
    }
}

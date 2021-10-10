package QN2;

import java.util.Arrays;
import java.util.TreeSet;

public class Tokenize {
    String[] string;
    TreeSet<String> set;

    Tokenize(String toTokenize) {
        this.string = toTokenize.split(" ");
        set = new TreeSet<>();
        set.addAll(Arrays.asList(this.string));
    }

    public void print() {
        set.forEach(s -> {
            System.out.println(s);
        });
    }
}

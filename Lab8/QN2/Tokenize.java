package QN2;

import java.util.TreeSet;

public class Tokenize {
    String[] string;
    TreeSet<String> set;

    Tokenize(String toTokenize) {
        this.string = toTokenize.split(" ");
        set = new TreeSet<>();
        for (String s : this.string) {
            set.add(s);
        }
    }

    public void print() {
        set.forEach(s -> {
            System.out.println(s);
        });
    }

}

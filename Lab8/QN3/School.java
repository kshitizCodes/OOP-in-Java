package QN3;

public class School {
    public enum SchoolType {
        PRIMARY, SECONDARY, PLUS2, COLLEGE;
    }

    private final int code;
    private final String name;
    private final SchoolType type;
    private final String district;

    public School(int code, String name, SchoolType type, String district) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.district = district;
    }

    public String getDistrict() {
        return district;
    }

    @Override
    public String toString() {
        return name + "[" + code + "]";
    }
}

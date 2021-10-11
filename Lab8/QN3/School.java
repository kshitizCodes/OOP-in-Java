package QN3;

public class School {
    public enum SchoolType {
        PRIMARY, SECONDARY, PLUS2, COLLEGE;
    }

    private int code;
    private String name;
    private SchoolType type;
    private String district;

    public School(int code, String name, SchoolType type, String district) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.district = district;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return name + "[" + code + "]";
    }
}

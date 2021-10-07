package QN3;

public class School {
    private final int code;
    private final String name;
    private final String type;
    private final String district;

    School(int code, String name, String type, String district) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.district = district;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDistrict() {
        return district;
    }
}

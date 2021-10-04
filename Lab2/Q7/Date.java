package Q7;

class Date {
    int year;
    int month;
    int day;

    Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    int isBefore(Date d) {
        if (year == d.year && month == d.month && day == d.day) {
            return 0;
        }
        if (year < d.year) {
            return 1;
        } else if (year >= d.year) {
            if (month < d.month) {
                return 1;
            } else if (month >= d.month) {
                if (day < d.day) {
                    return 1;
                }
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}


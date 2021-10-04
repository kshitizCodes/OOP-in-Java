package QN1;

class PersonDemo {
    public static void main(String[] args) {
        try {
            Person p = new Person(5, "best", "ware");
            p.setMemberID(-1);
            p.setFirstName("Hello");
            p.setLastName("World!");
        } catch (StringEmptyOrNullException e) {
            System.out.println("String empty of null");
        } catch (MemberIDLessThanZeroException e) {
            System.out.println("Member ID less than or equals to 0.");
        }
    }
}

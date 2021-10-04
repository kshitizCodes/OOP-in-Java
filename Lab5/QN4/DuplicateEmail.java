//package QN4;
//
//class DuplicateEmail extends EmailCreation {
//    public void duplicateEmail() throws NameException {
//        String domain = "@abc.com.np";
//        int i = 0;
//        StringBuilder email = new StringBuilder();
//        for (String s : name) {
//            String[] arr = s.toLowerCase().split(" ");
//            if (arr.length < 2) {
//                throw new NameException("Full name not supplied.");
//            }
//            if (arr.length == 2) {
//                email.append(arr[0].substring(0, 1)).append(arr[1]).append("1").append(domain);
//            } else if (arr.length == 3) {
//                email.append(arr[0].substring(0, 1)).append(arr[1].substring(0, 1)).append(arr[2]).append("1").append(domain);
//            }
//            i++;
//        }
//    }
//}
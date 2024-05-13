public class Department {
    private String departmentId;
    private String departmentName;
    static String nextId;

    public Department(String departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public boolean validateDepartmentNAme(String departmentName) {

        for(int i = 1; i < departmentName.length(); i ++){

            if (Character.isLetter(departmentName.charAt(i)) && Character.isSpace(departmentName.charAt(i))) {

                continue;

            } else {

                return false;
            }
        }
        return true;
    }
}

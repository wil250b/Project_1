public class Department {
    private String departmentId;
    private String departmentName;
    private static int nextId = 1;


    public Department(String departmentId, String departmentName) {
        if (validateDepartmentName(departmentName)) {
            this.departmentId = departmentId;
            this.departmentName = departmentName;
        } else {
                this.departmentId = null;
                this.departmentName = null;
        }
    }

    /**
     * Takes a department name and makes sure it only contains letters or spaces
     * @param departmentName
     * @return returns true if the department name is valid
     */
    public boolean validateDepartmentName(String departmentName) {
        boolean check = false;
        for (int i = 1; i < departmentName.length(); i++){
            if (!Character.isLetter(departmentName.charAt(i)) || Character.isSpace(departmentName.charAt(i))) {
                check = true;
            }
        }
        return check;
    }
}

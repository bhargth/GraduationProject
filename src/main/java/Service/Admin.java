package Service;

public class Admin {
    private long adminID;
    private String name;
    private String adminUserName;
    private String password;

    public Admin() {
    }

    public Admin(long adminID, String name, String adminUserName, String password) {
        this.adminID = adminID;
        this.name = name;
        this.adminUserName = adminUserName;
        this.password = password;
    }

    public long getAdminID() {
        return adminID;
    }

    public void setAdminID(long adminID) {
        this.adminID = adminID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminID=" + adminID +
                ", name='" + name + '\'' +
                ", adminUserName='" + adminUserName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

package com.example.GraduationProject.Business.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Administrator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long adminID;
    private String name;
    private String adminUserName;
    private String password;

    public Administrator() {
    }

    public Administrator(long adminID, String name, String adminUserName, String password) {
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

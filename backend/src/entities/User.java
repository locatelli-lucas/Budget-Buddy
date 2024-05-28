package entities;

import java.util.Date;

public class User {
    int userId;
    String name;
    Date birthDate;
    String email;
    double monthlyIncome;
    String password;
    double balance;
    int reportGap;

    public User(String name, Date birthDate, String email, double monthlyIncome, String password, double balance, int reportGap) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.monthlyIncome = monthlyIncome;
        this.password = password;
        this.balance = balance;
        this.reportGap = reportGap;
    }

    public User(int userId, String name, Date birthDate, String email, double monthlyIncome, String password, double balance, int reportGap) {
        this.userId = userId;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.monthlyIncome = monthlyIncome;
        this.password = password;
        this.balance = balance;
        this.reportGap = reportGap;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getReportGap() {
        return reportGap;
    }

    public void setReportGap(int reportGap) {
        this.reportGap = reportGap;
    }


}

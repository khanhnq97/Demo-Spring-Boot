package com.example.demo.dto;

import java.time.LocalDate;

public class EmployeeDto {
    private String firstName;
    private String lastName;
    private double hourlyPay;
    private LocalDate hireDate;
    private String phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public EmployeeDto(String firstName, String lastName, double hourlyPay, LocalDate hireDate, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyPay = hourlyPay;
        this.hireDate = hireDate;
        this.phoneNumber = phoneNumber;
    }
}
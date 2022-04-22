package com.company;

public class Patient_Card
{
    private int id;
    private String first_name;
    private String second_name;
    private String gender;
    private int age;

    public void setId(int id)
    {
        this.id=id;
    }

    public void setFirstName(String patient_first_name)
    {
        this.first_name=patient_first_name;
    }

    public void setSecondName(String patient_second_name)
    {
        this.second_name=patient_second_name;
    }

    public void setGender(String patient_gender)
    {
        this.gender=patient_gender;
    }

    public void setAge(int patient_age)
    {
        this.age=patient_age;
    }

    public int getId()
    {
        return this.id;
    }

    public int getAge()
    {
        return this.age;
    }

    public String getFirstName()
    {
        return this.first_name;
    }

    public String getSecondName()
    {
        return this.second_name;
    }

    public String getGender()
    {
        return this.gender;
    }
}

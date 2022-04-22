package com.company;

import java.util.ArrayList;

public class Hospital
{
    ArrayList<Patient_Card> cards=new ArrayList<>();

    public void add_card(int id,String firstName,String secondName,String gender,int age)
    {
        Patient_Card patient=new Patient_Card();
        patient.setAge(age);
        patient.setFirstName(firstName);
        patient.setSecondName(secondName);
        patient.setGender(gender);
        patient.setId(id);
        cards.add(patient);
    }
    public Patient_Card get_card_by_id(int id)
    {
        for (int i=0;i<cards.size();i++)
        {
            if (cards.get(i).getId()==id)
            {
                return cards.get(i);
            }
        }
        return null;
    }
}

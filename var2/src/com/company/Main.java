package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Hospital test=new Hospital();
        test.add_card(2,"Ivan","Ivanovich","Male",30);
        System.out.println(test.get_card_by_id(2).getFirstName());
    }
}

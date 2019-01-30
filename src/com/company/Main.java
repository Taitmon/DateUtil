package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Date dateY2K = new Date(1, 1, 2000);

        System.out.println("The date is: " + dateY2K.getDay() + dateY2K.getMonth() + dateY2K.getYear());

        System.out.println("The date is: " + dateY2K.getFormattedDate());

        Date date = new Date(3, 10, 2006);
        System.out.println("The date is: " + date.getFormattedDate());

        Date date2 = new Date(18, 5, 2010);
        System.out.println("The date is: " + date2.getFormattedDate());

        Date date3 = new Date(13, 12, 2018);
        System.out.println("The date is: " + date3.getFormattedDate());
    }
}

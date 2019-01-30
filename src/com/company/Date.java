package com.company;

public class Date
{


    private int day;
    private int month;
    private int year;

    public Date (int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    public String getFormattedDate()
    {
        String formattedDate = "Format Failed";
        if (getMonth() < 10 || getDay() < 10)
        {
            if (getMonth() < 10 && getDay() < 10)
            {
                formattedDate = getYear() + "-" + "0" + getMonth() + "-" + "0" + getDay();
            }
            if (getMonth() >= 10 && getDay() < 10)
            {
                formattedDate = getYear() + "-" + getMonth() + "-" + "0" + getDay();
            }
            if (getMonth() < 10 && getDay() >= 10)
            {
                formattedDate = getYear() + "-" + "0" + getMonth() + "-" + getDay();
            }
        }
        else
        {
            formattedDate = getYear() + "-" + getMonth() + "-" + getDay();
        }
        return formattedDate;
    }


}

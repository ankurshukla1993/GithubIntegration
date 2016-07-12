package com.example.ankur.githubintegration;

/**
 * Created by Ankur on 7/9/2016.
 */
public class Committer
{
    private String email;

    private String name;

    private String date;

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [email = "+email+", name = "+name+", date = "+date+"]";
    }
}

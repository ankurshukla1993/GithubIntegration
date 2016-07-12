package com.example.ankur.githubintegration;

/**
 * Created by Ankur on 7/9/2016.
 */
public class Stats
{
    private String total;

    private String additions;

    private String deletions;

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public String getAdditions ()
    {
        return additions;
    }

    public void setAdditions (String additions)
    {
        this.additions = additions;
    }

    public String getDeletions ()
    {
        return deletions;
    }

    public void setDeletions (String deletions)
    {
        this.deletions = deletions;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", additions = "+additions+", deletions = "+deletions+"]";
    }
}
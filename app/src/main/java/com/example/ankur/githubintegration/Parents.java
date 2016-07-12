package com.example.ankur.githubintegration;

/**
 * Created by Ankur on 7/9/2016.
 */
public class Parents
{
    private String sha;

    private String url;

    public String getSha ()
    {
        return sha;
    }

    public void setSha (String sha)
    {
        this.sha = sha;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [sha = "+sha+", url = "+url+"]";
    }
}

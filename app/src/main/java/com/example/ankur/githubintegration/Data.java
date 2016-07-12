package com.example.ankur.githubintegration;

/**
 * Created by Ankur on 7/9/2016.
 */
public class Data
{
    private String html_url;

    private Files[] files;

    private Author author;

    private Parents[] parents;

    private Commit commit;

    private String sha;

    private Stats stats;

    private String comments_url;

    private Committer committer;

    private String url;

    public String getHtml_url ()
    {
        return html_url;
    }

    public void setHtml_url (String html_url)
    {
        this.html_url = html_url;
    }

    public Files[] getFiles ()
    {
        return files;
    }

    public void setFiles (Files[] files)
    {
        this.files = files;
    }

    public Author getAuthor ()
    {
        return author;
    }

    public void setAuthor (Author author)
    {
        this.author = author;
    }

    public Parents[] getParents ()
    {
        return parents;
    }

    public void setParents (Parents[] parents)
    {
        this.parents = parents;
    }

    public Commit getCommit ()
    {
        return commit;
    }

    public void setCommit (Commit commit)
    {
        this.commit = commit;
    }

    public String getSha ()
    {
        return sha;
    }

    public void setSha (String sha)
    {
        this.sha = sha;
    }

    public Stats getStats ()
    {
        return stats;
    }

    public void setStats (Stats stats)
    {
        this.stats = stats;
    }

    public String getComments_url ()
    {
        return comments_url;
    }

    public void setComments_url (String comments_url)
    {
        this.comments_url = comments_url;
    }

    public Committer getCommitter ()
    {
        return committer;
    }

    public void setCommitter (Committer committer)
    {
        this.committer = committer;
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
        return "ClassPojo [html_url = "+html_url+", files = "+files+", author = "+author+", parents = "+parents+", commit = "+commit+", sha = "+sha+", stats = "+stats+", comments_url = "+comments_url+", committer = "+committer+", url = "+url+"]";
    }
}

package com.example.ankur.githubintegration;

/**
 * Created by Ankur on 7/9/2016.
 */
public class Files
{
    private String additions;

    private String status;

    private String blob_url;

    private String filename;

    private String patch;

    private String raw_url;

    private String changes;

    private String deletions;

    public String getAdditions ()
    {
        return additions;
    }

    public void setAdditions (String additions)
    {
        this.additions = additions;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getBlob_url ()
    {
        return blob_url;
    }

    public void setBlob_url (String blob_url)
    {
        this.blob_url = blob_url;
    }

    public String getFilename ()
    {
        return filename;
    }

    public void setFilename (String filename)
    {
        this.filename = filename;
    }

    public String getPatch ()
    {
        return patch;
    }

    public void setPatch (String patch)
    {
        this.patch = patch;
    }

    public String getRaw_url ()
    {
        return raw_url;
    }

    public void setRaw_url (String raw_url)
    {
        this.raw_url = raw_url;
    }

    public String getChanges ()
    {
        return changes;
    }

    public void setChanges (String changes)
    {
        this.changes = changes;
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
        return "ClassPojo [additions = "+additions+", status = "+status+", blob_url = "+blob_url+", filename = "+filename+", patch = "+patch+", raw_url = "+raw_url+", changes = "+changes+", deletions = "+deletions+"]";
    }
}

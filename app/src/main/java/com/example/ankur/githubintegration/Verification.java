package com.example.ankur.githubintegration;

/**
 * Created by Ankur on 7/9/2016.
 */
public class Verification
{
    private String reason;

    private String verified;

    private String payload;

    private String signature;

    public String getReason ()
    {
        return reason;
    }

    public void setReason (String reason)
    {
        this.reason = reason;
    }

    public String getVerified ()
    {
        return verified;
    }

    public void setVerified (String verified)
    {
        this.verified = verified;
    }

    public String getPayload ()
    {
        return payload;
    }

    public void setPayload (String payload)
    {
        this.payload = payload;
    }

    public String getSignature ()
    {
        return signature;
    }

    public void setSignature (String signature)
    {
        this.signature = signature;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [reason = "+reason+", verified = "+verified+", payload = "+payload+", signature = "+signature+"]";
    }
}
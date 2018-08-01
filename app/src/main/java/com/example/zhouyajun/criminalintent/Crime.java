package com.example.zhouyajun.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID uuid;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        uuid = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }
}

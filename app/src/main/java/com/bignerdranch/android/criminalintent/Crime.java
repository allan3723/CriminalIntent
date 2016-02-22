package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private int mHour, mMinute;
    private boolean mSolved;
    private String mSuspect;
    private long mContactId;
    private CharSequence mFormatDate, mFormatTime, mTimeDate;

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public CharSequence getFormatDate() {
        mFormatDate = android.text.format.DateFormat.format("EEE, MMM dd, yyyy", mDate);

        return mFormatDate;
    }

    public void setHour(int hour) {
        mHour = hour;
    }

    public void setMinute(int minute) {
        mMinute = minute;
    }

    public void updateHourMinute() {
        mDate.setHours(mHour);
        mDate.setMinutes(mMinute);
    }

    public CharSequence getFormatTime() {
        mFormatTime = android.text.format.DateFormat.format("kk:mm zzz", mDate);

        return mFormatTime;
    }

    public CharSequence getTimeDate() {
        mTimeDate = android.text.format.DateFormat.format("EEE, MMM dd, yyyy 'at' kk:mm zzz",
                mDate);
        return mTimeDate;
    }

    public long getContactId() {
        return mContactId;
    }

    public String getPhotoFileName() {
        return "IMG_" + getId().toString() + ".jpg";
    }

    public void setContactId(long contactId) {
        mContactId = contactId;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}


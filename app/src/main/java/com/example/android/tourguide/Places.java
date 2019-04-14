package com.example.android.tourguide;


class Places {

    private static final int NO_IMAGE_PROVIDED = -1;
    private final String mPlace;
    private final String mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    public Places(String place, String description, int imageResourceId) {
        mPlace = place;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }


    public String getPlace() {
        return mPlace;
    }


    public String getDescription() {
        return mDescription;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mPlace='" + mPlace + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}


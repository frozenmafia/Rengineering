package com.facebook.imagepipeline.image;

import android.net.Uri;
/* loaded from: classes6.dex */
public class OriginalEncodedImageInfo {
    public static final OriginalEncodedImageInfo EMPTY = new OriginalEncodedImageInfo();
    private final Object mCallerContext;
    private final int mHeight;
    private final EncodedImageOrigin mOrigin;
    private final int mSize;
    private final Uri mUri;
    private final int mWidth;

    private OriginalEncodedImageInfo() {
        this.mUri = null;
        this.mOrigin = EncodedImageOrigin.NOT_SET;
        this.mCallerContext = null;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mSize = -1;
    }

    public OriginalEncodedImageInfo(Uri uri, EncodedImageOrigin encodedImageOrigin, Object obj, int i, int i2, int i3) {
        this.mUri = uri;
        this.mOrigin = encodedImageOrigin;
        this.mCallerContext = obj;
        this.mWidth = i;
        this.mHeight = i2;
        this.mSize = i3;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getSize() {
        return this.mSize;
    }

    public Uri getUri() {
        return this.mUri;
    }

    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public EncodedImageOrigin getOrigin() {
        return this.mOrigin;
    }
}

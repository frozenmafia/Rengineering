package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import o.Fragment;
import o.getNextAnim;
import o.onShouldSaveFragmentState;
import o.requireActivity;
/* loaded from: classes4.dex */
public class BitmapMemoryCacheKey implements requireActivity {
    private final long mCacheTime;
    private final Object mCallerContext;
    private final int mHash;
    private final ImageDecodeOptions mImageDecodeOptions;
    private final requireActivity mPostprocessorCacheKey;
    private final String mPostprocessorName;
    private final ResizeOptions mResizeOptions;
    private final RotationOptions mRotationOptions;
    private final String mSourceString;

    @Override // o.requireActivity
    public boolean isResourceIdForDebugging() {
        return false;
    }

    public BitmapMemoryCacheKey(String str, ResizeOptions resizeOptions, RotationOptions rotationOptions, ImageDecodeOptions imageDecodeOptions, requireActivity requireactivity, String str2, Object obj) {
        this.mSourceString = (String) str.getClass();
        this.mResizeOptions = resizeOptions;
        this.mRotationOptions = rotationOptions;
        this.mImageDecodeOptions = imageDecodeOptions;
        this.mPostprocessorCacheKey = requireactivity;
        this.mPostprocessorName = str2;
        this.mHash = getNextAnim.valueOf(Integer.valueOf(str.hashCode()), Integer.valueOf(resizeOptions != null ? resizeOptions.hashCode() : 0), Integer.valueOf(rotationOptions.hashCode()), imageDecodeOptions, requireactivity, str2);
        this.mCallerContext = obj;
        this.mCacheTime = onShouldSaveFragmentState.valueOf().values();
    }

    @Override // o.requireActivity
    public boolean equals(Object obj) {
        if (obj instanceof BitmapMemoryCacheKey) {
            BitmapMemoryCacheKey bitmapMemoryCacheKey = (BitmapMemoryCacheKey) obj;
            return this.mHash == bitmapMemoryCacheKey.mHash && this.mSourceString.equals(bitmapMemoryCacheKey.mSourceString) && Fragment.AnonymousClass7.toString(this.mResizeOptions, bitmapMemoryCacheKey.mResizeOptions) && Fragment.AnonymousClass7.toString(this.mRotationOptions, bitmapMemoryCacheKey.mRotationOptions) && Fragment.AnonymousClass7.toString(this.mImageDecodeOptions, bitmapMemoryCacheKey.mImageDecodeOptions) && Fragment.AnonymousClass7.toString(this.mPostprocessorCacheKey, bitmapMemoryCacheKey.mPostprocessorCacheKey) && Fragment.AnonymousClass7.toString(this.mPostprocessorName, bitmapMemoryCacheKey.mPostprocessorName);
        }
        return false;
    }

    @Override // o.requireActivity
    public int hashCode() {
        return this.mHash;
    }

    @Override // o.requireActivity
    public boolean containsUri(Uri uri) {
        return getUriString().contains(uri.toString());
    }

    @Override // o.requireActivity
    public String getUriString() {
        return this.mSourceString;
    }

    public String getPostprocessorName() {
        return this.mPostprocessorName;
    }

    public String toString() {
        return String.format(null, "%s_%s_%s_%s_%s_%s_%d", this.mSourceString, this.mResizeOptions, this.mRotationOptions, this.mImageDecodeOptions, this.mPostprocessorCacheKey, this.mPostprocessorName, Integer.valueOf(this.mHash));
    }

    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public long getInBitmapCacheSince() {
        return this.mCacheTime;
    }
}

package com.facebook.fresco.animation.bitmap;

import android.graphics.Bitmap;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public interface BitmapFrameCache {

    /* loaded from: classes4.dex */
    public interface FrameCacheListener {
        void onFrameCached(BitmapFrameCache bitmapFrameCache, int i);

        void onFrameEvicted(BitmapFrameCache bitmapFrameCache, int i);
    }

    void clear();

    boolean contains(int i);

    FragmentActivity.AnonymousClass1<Bitmap> getBitmapToReuseForFrame(int i, int i2, int i3);

    FragmentActivity.AnonymousClass1<Bitmap> getCachedFrame(int i);

    FragmentActivity.AnonymousClass1<Bitmap> getFallbackFrame(int i);

    int getSizeInBytes();

    void onFramePrepared(int i, FragmentActivity.AnonymousClass1<Bitmap> anonymousClass1, int i2);

    void onFrameRendered(int i, FragmentActivity.AnonymousClass1<Bitmap> anonymousClass1, int i2);

    void setFrameCacheListener(FrameCacheListener frameCacheListener);
}

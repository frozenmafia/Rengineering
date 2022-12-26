package com.facebook.fresco.animation.bitmap.cache;

import android.graphics.Bitmap;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public class NoOpCache implements BitmapFrameCache {
    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public void clear() {
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public boolean contains(int i) {
        return false;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public FragmentActivity.AnonymousClass1<Bitmap> getBitmapToReuseForFrame(int i, int i2, int i3) {
        return null;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public FragmentActivity.AnonymousClass1<Bitmap> getCachedFrame(int i) {
        return null;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public FragmentActivity.AnonymousClass1<Bitmap> getFallbackFrame(int i) {
        return null;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public int getSizeInBytes() {
        return 0;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public void onFramePrepared(int i, FragmentActivity.AnonymousClass1<Bitmap> anonymousClass1, int i2) {
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public void onFrameRendered(int i, FragmentActivity.AnonymousClass1<Bitmap> anonymousClass1, int i2) {
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public void setFrameCacheListener(BitmapFrameCache.FrameCacheListener frameCacheListener) {
    }
}

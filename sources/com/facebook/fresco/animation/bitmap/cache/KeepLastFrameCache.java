package com.facebook.fresco.animation.bitmap.cache;

import android.graphics.Bitmap;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.imageutils.BitmapUtil;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public class KeepLastFrameCache implements BitmapFrameCache {
    private static final int FRAME_NUMBER_UNSET = -1;
    private BitmapFrameCache.FrameCacheListener mFrameCacheListener;
    private FragmentActivity.AnonymousClass1<Bitmap> mLastBitmapReference;
    private int mLastFrameNumber = -1;

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public void onFramePrepared(int i, FragmentActivity.AnonymousClass1<Bitmap> anonymousClass1, int i2) {
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public FragmentActivity.AnonymousClass1<Bitmap> getCachedFrame(int i) {
        synchronized (this) {
            if (this.mLastFrameNumber == i) {
                return FragmentActivity.AnonymousClass1.toString(this.mLastBitmapReference);
            }
            return null;
        }
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public FragmentActivity.AnonymousClass1<Bitmap> getFallbackFrame(int i) {
        FragmentActivity.AnonymousClass1<Bitmap> anonymousClass1;
        synchronized (this) {
            anonymousClass1 = FragmentActivity.AnonymousClass1.toString(this.mLastBitmapReference);
        }
        return anonymousClass1;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public FragmentActivity.AnonymousClass1<Bitmap> getBitmapToReuseForFrame(int i, int i2, int i3) {
        FragmentActivity.AnonymousClass1<Bitmap> anonymousClass1;
        synchronized (this) {
            anonymousClass1 = FragmentActivity.AnonymousClass1.toString(this.mLastBitmapReference);
            closeAndResetLastBitmapReference();
        }
        return anonymousClass1;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public boolean contains(int i) {
        boolean z;
        synchronized (this) {
            if (i == this.mLastFrameNumber) {
                z = FragmentActivity.AnonymousClass1.ah$a(this.mLastBitmapReference);
            }
        }
        return z;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public int getSizeInBytes() {
        int sizeInBytes;
        synchronized (this) {
            FragmentActivity.AnonymousClass1<Bitmap> anonymousClass1 = this.mLastBitmapReference;
            sizeInBytes = anonymousClass1 == null ? 0 : BitmapUtil.getSizeInBytes(anonymousClass1.HaptikSDK$c());
        }
        return sizeInBytes;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public void clear() {
        synchronized (this) {
            closeAndResetLastBitmapReference();
        }
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public void onFrameRendered(int i, FragmentActivity.AnonymousClass1<Bitmap> anonymousClass1, int i2) {
        int i3;
        synchronized (this) {
            if (anonymousClass1 != null) {
                if (this.mLastBitmapReference != null && anonymousClass1.HaptikSDK$c().equals(this.mLastBitmapReference.HaptikSDK$c())) {
                    return;
                }
            }
            FragmentActivity.AnonymousClass1.valueOf(this.mLastBitmapReference);
            BitmapFrameCache.FrameCacheListener frameCacheListener = this.mFrameCacheListener;
            if (frameCacheListener != null && (i3 = this.mLastFrameNumber) != -1) {
                frameCacheListener.onFrameEvicted(this, i3);
            }
            this.mLastBitmapReference = FragmentActivity.AnonymousClass1.toString(anonymousClass1);
            BitmapFrameCache.FrameCacheListener frameCacheListener2 = this.mFrameCacheListener;
            if (frameCacheListener2 != null) {
                frameCacheListener2.onFrameCached(this, i);
            }
            this.mLastFrameNumber = i;
        }
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public void setFrameCacheListener(BitmapFrameCache.FrameCacheListener frameCacheListener) {
        this.mFrameCacheListener = frameCacheListener;
    }

    private void closeAndResetLastBitmapReference() {
        int i;
        synchronized (this) {
            BitmapFrameCache.FrameCacheListener frameCacheListener = this.mFrameCacheListener;
            if (frameCacheListener != null && (i = this.mLastFrameNumber) != -1) {
                frameCacheListener.onFrameEvicted(this, i);
            }
            FragmentActivity.AnonymousClass1.valueOf(this.mLastBitmapReference);
            this.mLastBitmapReference = null;
            this.mLastFrameNumber = -1;
        }
    }
}

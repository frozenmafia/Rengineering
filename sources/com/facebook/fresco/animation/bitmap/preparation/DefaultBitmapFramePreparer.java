package com.facebook.fresco.animation.bitmap.preparation;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.fresco.animation.backend.AnimationBackend;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.fresco.animation.bitmap.BitmapFrameRenderer;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import java.util.concurrent.ExecutorService;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public class DefaultBitmapFramePreparer implements BitmapFramePreparer {
    private static final Class<?> TAG = DefaultBitmapFramePreparer.class;
    private final Bitmap.Config mBitmapConfig;
    private final BitmapFrameRenderer mBitmapFrameRenderer;
    private final ExecutorService mExecutorService;
    private final SparseArray<Runnable> mPendingFrameDecodeJobs = new SparseArray<>();
    private final PlatformBitmapFactory mPlatformBitmapFactory;

    public DefaultBitmapFramePreparer(PlatformBitmapFactory platformBitmapFactory, BitmapFrameRenderer bitmapFrameRenderer, Bitmap.Config config, ExecutorService executorService) {
        this.mPlatformBitmapFactory = platformBitmapFactory;
        this.mBitmapFrameRenderer = bitmapFrameRenderer;
        this.mBitmapConfig = config;
        this.mExecutorService = executorService;
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.BitmapFramePreparer
    public boolean prepareFrame(BitmapFrameCache bitmapFrameCache, AnimationBackend animationBackend, int i) {
        int uniqueId = getUniqueId(animationBackend, i);
        synchronized (this.mPendingFrameDecodeJobs) {
            if (this.mPendingFrameDecodeJobs.get(uniqueId) != null) {
                FragmentActivity.toString(TAG, "Already scheduled decode job for frame %d", Integer.valueOf(i));
                return true;
            } else if (bitmapFrameCache.contains(i)) {
                FragmentActivity.toString(TAG, "Frame %d is cached already.", Integer.valueOf(i));
                return true;
            } else {
                FrameDecodeRunnable frameDecodeRunnable = new FrameDecodeRunnable(animationBackend, bitmapFrameCache, i, uniqueId);
                this.mPendingFrameDecodeJobs.put(uniqueId, frameDecodeRunnable);
                this.mExecutorService.execute(frameDecodeRunnable);
                return true;
            }
        }
    }

    private static int getUniqueId(AnimationBackend animationBackend, int i) {
        return (animationBackend.hashCode() * 31) + i;
    }

    /* loaded from: classes4.dex */
    class FrameDecodeRunnable implements Runnable {
        private final AnimationBackend mAnimationBackend;
        private final BitmapFrameCache mBitmapFrameCache;
        private final int mFrameNumber;
        private final int mHashCode;

        public FrameDecodeRunnable(AnimationBackend animationBackend, BitmapFrameCache bitmapFrameCache, int i, int i2) {
            this.mAnimationBackend = animationBackend;
            this.mBitmapFrameCache = bitmapFrameCache;
            this.mFrameNumber = i;
            this.mHashCode = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.mBitmapFrameCache.contains(this.mFrameNumber)) {
                    FragmentActivity.toString(DefaultBitmapFramePreparer.TAG, "Frame %d is cached already.", Integer.valueOf(this.mFrameNumber));
                    synchronized (DefaultBitmapFramePreparer.this.mPendingFrameDecodeJobs) {
                        DefaultBitmapFramePreparer.this.mPendingFrameDecodeJobs.remove(this.mHashCode);
                    }
                    return;
                }
                if (prepareFrameAndCache(this.mFrameNumber, 1)) {
                    FragmentActivity.toString(DefaultBitmapFramePreparer.TAG, "Prepared frame frame %d.", Integer.valueOf(this.mFrameNumber));
                } else {
                    FragmentActivity.valueOf(DefaultBitmapFramePreparer.TAG, "Could not prepare frame %d.", Integer.valueOf(this.mFrameNumber));
                }
                synchronized (DefaultBitmapFramePreparer.this.mPendingFrameDecodeJobs) {
                    DefaultBitmapFramePreparer.this.mPendingFrameDecodeJobs.remove(this.mHashCode);
                }
            } catch (Throwable th) {
                synchronized (DefaultBitmapFramePreparer.this.mPendingFrameDecodeJobs) {
                    DefaultBitmapFramePreparer.this.mPendingFrameDecodeJobs.remove(this.mHashCode);
                    throw th;
                }
            }
        }

        private boolean prepareFrameAndCache(int i, int i2) {
            FragmentActivity.AnonymousClass1<Bitmap> bitmapToReuseForFrame;
            int i3 = 2;
            try {
                if (i2 == 1) {
                    bitmapToReuseForFrame = this.mBitmapFrameCache.getBitmapToReuseForFrame(i, this.mAnimationBackend.getIntrinsicWidth(), this.mAnimationBackend.getIntrinsicHeight());
                } else if (i2 != 2) {
                    return false;
                } else {
                    bitmapToReuseForFrame = DefaultBitmapFramePreparer.this.mPlatformBitmapFactory.createBitmap(this.mAnimationBackend.getIntrinsicWidth(), this.mAnimationBackend.getIntrinsicHeight(), DefaultBitmapFramePreparer.this.mBitmapConfig);
                    i3 = -1;
                }
                boolean renderFrameAndCache = renderFrameAndCache(i, bitmapToReuseForFrame, i2);
                FragmentActivity.AnonymousClass1.valueOf(bitmapToReuseForFrame);
                return (renderFrameAndCache || i3 == -1) ? renderFrameAndCache : prepareFrameAndCache(i, i3);
            } catch (RuntimeException e) {
                FragmentActivity.values(DefaultBitmapFramePreparer.TAG, "Failed to create frame bitmap", e);
                return false;
            } finally {
                FragmentActivity.AnonymousClass1.valueOf((FragmentActivity.AnonymousClass1<?>) null);
            }
        }

        private boolean renderFrameAndCache(int i, FragmentActivity.AnonymousClass1<Bitmap> anonymousClass1, int i2) {
            if (FragmentActivity.AnonymousClass1.ah$a(anonymousClass1) && DefaultBitmapFramePreparer.this.mBitmapFrameRenderer.renderFrame(i, anonymousClass1.HaptikSDK$c())) {
                FragmentActivity.toString(DefaultBitmapFramePreparer.TAG, "Frame %d ready.", Integer.valueOf(this.mFrameNumber));
                synchronized (DefaultBitmapFramePreparer.this.mPendingFrameDecodeJobs) {
                    this.mBitmapFrameCache.onFramePrepared(this.mFrameNumber, anonymousClass1, i2);
                }
                return true;
            }
            return false;
        }
    }
}

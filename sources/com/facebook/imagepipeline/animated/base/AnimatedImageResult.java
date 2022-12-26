package com.facebook.imagepipeline.animated.base;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.transformation.BitmapTransformation;
import java.util.List;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public class AnimatedImageResult {
    private BitmapTransformation mBitmapTransformation;
    private List<FragmentActivity.AnonymousClass1<Bitmap>> mDecodedFrames;
    private final int mFrameForPreview;
    private final AnimatedImage mImage;
    private FragmentActivity.AnonymousClass1<Bitmap> mPreviewBitmap;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AnimatedImageResult(AnimatedImageResultBuilder animatedImageResultBuilder) {
        this.mImage = (AnimatedImage) animatedImageResultBuilder.getImage().getClass();
        this.mFrameForPreview = animatedImageResultBuilder.getFrameForPreview();
        this.mPreviewBitmap = animatedImageResultBuilder.getPreviewBitmap();
        this.mDecodedFrames = animatedImageResultBuilder.getDecodedFrames();
        this.mBitmapTransformation = animatedImageResultBuilder.getBitmapTransformation();
    }

    private AnimatedImageResult(AnimatedImage animatedImage) {
        this.mImage = (AnimatedImage) animatedImage.getClass();
        this.mFrameForPreview = 0;
    }

    public static AnimatedImageResult forAnimatedImage(AnimatedImage animatedImage) {
        return new AnimatedImageResult(animatedImage);
    }

    public static AnimatedImageResultBuilder newBuilder(AnimatedImage animatedImage) {
        return new AnimatedImageResultBuilder(animatedImage);
    }

    public AnimatedImage getImage() {
        return this.mImage;
    }

    public int getFrameForPreview() {
        return this.mFrameForPreview;
    }

    public FragmentActivity.AnonymousClass1<Bitmap> getDecodedFrame(int i) {
        synchronized (this) {
            List<FragmentActivity.AnonymousClass1<Bitmap>> list = this.mDecodedFrames;
            if (list != null) {
                return FragmentActivity.AnonymousClass1.toString(list.get(i));
            }
            return null;
        }
    }

    public boolean hasDecodedFrame(int i) {
        boolean z;
        synchronized (this) {
            List<FragmentActivity.AnonymousClass1<Bitmap>> list = this.mDecodedFrames;
            if (list != null) {
                z = list.get(i) != null;
            }
        }
        return z;
    }

    public BitmapTransformation getBitmapTransformation() {
        return this.mBitmapTransformation;
    }

    public FragmentActivity.AnonymousClass1<Bitmap> getPreviewBitmap() {
        FragmentActivity.AnonymousClass1<Bitmap> anonymousClass1;
        synchronized (this) {
            anonymousClass1 = FragmentActivity.AnonymousClass1.toString(this.mPreviewBitmap);
        }
        return anonymousClass1;
    }

    public void dispose() {
        synchronized (this) {
            FragmentActivity.AnonymousClass1.valueOf(this.mPreviewBitmap);
            this.mPreviewBitmap = null;
            FragmentActivity.AnonymousClass1.valueOf(this.mDecodedFrames);
            this.mDecodedFrames = null;
        }
    }
}

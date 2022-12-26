package com.facebook.imagepipeline.animated.base;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.transformation.BitmapTransformation;
import java.util.List;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public class AnimatedImageResultBuilder {
    private BitmapTransformation mBitmapTransformation;
    private List<FragmentActivity.AnonymousClass1<Bitmap>> mDecodedFrames;
    private int mFrameForPreview;
    private final AnimatedImage mImage;
    private FragmentActivity.AnonymousClass1<Bitmap> mPreviewBitmap;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AnimatedImageResultBuilder(AnimatedImage animatedImage) {
        this.mImage = animatedImage;
    }

    public AnimatedImage getImage() {
        return this.mImage;
    }

    public FragmentActivity.AnonymousClass1<Bitmap> getPreviewBitmap() {
        return FragmentActivity.AnonymousClass1.toString(this.mPreviewBitmap);
    }

    public AnimatedImageResultBuilder setPreviewBitmap(FragmentActivity.AnonymousClass1<Bitmap> anonymousClass1) {
        this.mPreviewBitmap = FragmentActivity.AnonymousClass1.toString(anonymousClass1);
        return this;
    }

    public int getFrameForPreview() {
        return this.mFrameForPreview;
    }

    public AnimatedImageResultBuilder setFrameForPreview(int i) {
        this.mFrameForPreview = i;
        return this;
    }

    public List<FragmentActivity.AnonymousClass1<Bitmap>> getDecodedFrames() {
        return FragmentActivity.AnonymousClass1.ah$a(this.mDecodedFrames);
    }

    public AnimatedImageResultBuilder setDecodedFrames(List<FragmentActivity.AnonymousClass1<Bitmap>> list) {
        this.mDecodedFrames = FragmentActivity.AnonymousClass1.ah$a(list);
        return this;
    }

    public BitmapTransformation getBitmapTransformation() {
        return this.mBitmapTransformation;
    }

    public AnimatedImageResultBuilder setBitmapTransformation(BitmapTransformation bitmapTransformation) {
        this.mBitmapTransformation = bitmapTransformation;
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<o.FragmentActivity$1<android.graphics.Bitmap>>, o.FragmentActivity$1<android.graphics.Bitmap>] */
    public AnimatedImageResult build() {
        try {
            return new AnimatedImageResult(this);
        } finally {
            FragmentActivity.AnonymousClass1.valueOf(this.mPreviewBitmap);
            this.mPreviewBitmap = null;
            FragmentActivity.AnonymousClass1.valueOf(this.mDecodedFrames);
            this.mDecodedFrames = null;
        }
    }
}

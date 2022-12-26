package com.facebook.fresco.animation.bitmap.wrapper;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.fresco.animation.bitmap.BitmapFrameRenderer;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public class AnimatedDrawableBackendFrameRenderer implements BitmapFrameRenderer {
    private static final Class<?> TAG = AnimatedDrawableBackendFrameRenderer.class;
    private AnimatedDrawableBackend mAnimatedDrawableBackend;
    private AnimatedImageCompositor mAnimatedImageCompositor;
    private final BitmapFrameCache mBitmapFrameCache;
    private final AnimatedImageCompositor.Callback mCallback;

    public AnimatedDrawableBackendFrameRenderer(BitmapFrameCache bitmapFrameCache, AnimatedDrawableBackend animatedDrawableBackend) {
        AnimatedImageCompositor.Callback callback = new AnimatedImageCompositor.Callback() { // from class: com.facebook.fresco.animation.bitmap.wrapper.AnimatedDrawableBackendFrameRenderer.1
            @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.Callback
            public void onIntermediateResult(int i, Bitmap bitmap) {
            }

            @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.Callback
            public FragmentActivity.AnonymousClass1<Bitmap> getCachedBitmap(int i) {
                return AnimatedDrawableBackendFrameRenderer.this.mBitmapFrameCache.getCachedFrame(i);
            }
        };
        this.mCallback = callback;
        this.mBitmapFrameCache = bitmapFrameCache;
        this.mAnimatedDrawableBackend = animatedDrawableBackend;
        this.mAnimatedImageCompositor = new AnimatedImageCompositor(animatedDrawableBackend, callback);
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameRenderer
    public void setBounds(Rect rect) {
        AnimatedDrawableBackend forNewBounds = this.mAnimatedDrawableBackend.forNewBounds(rect);
        if (forNewBounds != this.mAnimatedDrawableBackend) {
            this.mAnimatedDrawableBackend = forNewBounds;
            this.mAnimatedImageCompositor = new AnimatedImageCompositor(forNewBounds, this.mCallback);
        }
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameRenderer
    public int getIntrinsicWidth() {
        return this.mAnimatedDrawableBackend.getWidth();
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameRenderer
    public int getIntrinsicHeight() {
        return this.mAnimatedDrawableBackend.getHeight();
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameRenderer
    public boolean renderFrame(int i, Bitmap bitmap) {
        try {
            this.mAnimatedImageCompositor.renderFrame(i, bitmap);
            return true;
        } catch (IllegalStateException e) {
            FragmentActivity.toString(TAG, e, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i));
            return false;
        }
    }
}

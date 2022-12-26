package com.facebook.imagepipeline.animated.base;

import android.graphics.Bitmap;
/* loaded from: classes4.dex */
public interface AnimatedImage {
    public static final int LOOP_COUNT_INFINITE = 0;

    void dispose();

    boolean doesRenderSupportScaling();

    Bitmap.Config getAnimatedBitmapConfig();

    int getDuration();

    AnimatedImageFrame getFrame(int i);

    int getFrameCount();

    int[] getFrameDurations();

    AnimatedDrawableFrameInfo getFrameInfo(int i);

    int getHeight();

    int getLoopCount();

    int getSizeInBytes();

    int getWidth();
}

package com.facebook.imagepipeline.animated.factory;

import android.content.Context;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.drawable.DrawableFactory;
/* loaded from: classes4.dex */
public interface AnimatedFactory {
    DrawableFactory getAnimatedDrawableFactory(Context context);

    ImageDecoder getGifDecoder();

    ImageDecoder getWebPDecoder();
}

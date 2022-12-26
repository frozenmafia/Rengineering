package com.facebook.imagepipeline.animated.factory;

import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.core.ExecutorSupplier;
import com.facebook.imagepipeline.image.CloseableImage;
import java.util.concurrent.ExecutorService;
import o.requireActivity;
import o.setSharedElementNames;
/* loaded from: classes4.dex */
public class AnimatedFactoryProvider {
    private static AnimatedFactory sImpl;
    private static boolean sImplLoaded;

    public static AnimatedFactory getAnimatedFactory(PlatformBitmapFactory platformBitmapFactory, ExecutorSupplier executorSupplier, CountingMemoryCache<requireActivity, CloseableImage> countingMemoryCache, boolean z, ExecutorService executorService) {
        if (!sImplLoaded) {
            try {
                sImpl = (AnimatedFactory) Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(PlatformBitmapFactory.class, ExecutorSupplier.class, CountingMemoryCache.class, Boolean.TYPE, setSharedElementNames.class).newInstance(platformBitmapFactory, executorSupplier, countingMemoryCache, Boolean.valueOf(z), executorService);
            } catch (Throwable unused) {
            }
            if (sImpl != null) {
                sImplLoaded = true;
            }
        }
        return sImpl;
    }
}

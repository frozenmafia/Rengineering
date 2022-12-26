package com.facebook.imagepipeline.request;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.core.NativeCodeSetup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.FragmentActivity;
import o.requireActivity;
/* loaded from: classes4.dex */
public abstract class BasePostprocessor implements Postprocessor {
    public static final Bitmap.Config FALLBACK_BITMAP_CONFIGURATION = Bitmap.Config.ARGB_8888;
    private static Method sCopyBitmap;

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public String getName() {
        return "Unknown postprocessor";
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public requireActivity getPostprocessorCacheKey() {
        return null;
    }

    public void process(Bitmap bitmap) {
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public FragmentActivity.AnonymousClass1<Bitmap> process(Bitmap bitmap, PlatformBitmapFactory platformBitmapFactory) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = FALLBACK_BITMAP_CONFIGURATION;
        }
        FragmentActivity.AnonymousClass1<Bitmap> createBitmapInternal = platformBitmapFactory.createBitmapInternal(width, height, config);
        try {
            process(createBitmapInternal.HaptikSDK$c(), bitmap);
            return createBitmapInternal.clone();
        } finally {
            FragmentActivity.AnonymousClass1.valueOf(createBitmapInternal);
        }
    }

    public void process(Bitmap bitmap, Bitmap bitmap2) {
        internalCopyBitmap(bitmap, bitmap2);
        process(bitmap);
    }

    private static void internalCopyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (NativeCodeSetup.getUseNativeCode() && bitmap.getConfig() == bitmap2.getConfig()) {
            try {
                if (sCopyBitmap == null) {
                    sCopyBitmap = Class.forName("com.facebook.imagepipeline.nativecode.Bitmaps").getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
                }
                sCopyBitmap.invoke(null, bitmap, bitmap2);
                return;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e4);
            }
        }
        new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
    }
}

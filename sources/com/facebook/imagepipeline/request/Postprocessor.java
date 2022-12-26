package com.facebook.imagepipeline.request;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import o.FragmentActivity;
import o.requireActivity;
/* loaded from: classes4.dex */
public interface Postprocessor {
    String getName();

    requireActivity getPostprocessorCacheKey();

    FragmentActivity.AnonymousClass1<Bitmap> process(Bitmap bitmap, PlatformBitmapFactory platformBitmapFactory);
}

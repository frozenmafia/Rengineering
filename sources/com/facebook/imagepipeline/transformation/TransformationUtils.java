package com.facebook.imagepipeline.transformation;

import android.graphics.Bitmap;
import android.os.Build;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public final class TransformationUtils {
    public static boolean maybeApplyTransformation(BitmapTransformation bitmapTransformation, FragmentActivity.AnonymousClass1<Bitmap> anonymousClass1) {
        if (bitmapTransformation == null || anonymousClass1 == null) {
            return false;
        }
        Bitmap HaptikSDK$c = anonymousClass1.HaptikSDK$c();
        if (Build.VERSION.SDK_INT >= 12 && bitmapTransformation.modifiesTransparency()) {
            HaptikSDK$c.setHasAlpha(true);
        }
        bitmapTransformation.transform(HaptikSDK$c);
        return true;
    }
}

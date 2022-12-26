package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class BitmapDrawableKt {
    public static final BitmapDrawable toDrawable(Bitmap bitmap, Resources resources) {
        runAnimators.ag$a(bitmap, "<this>");
        runAnimators.ag$a(resources, "resources");
        return new BitmapDrawable(resources, bitmap);
    }
}

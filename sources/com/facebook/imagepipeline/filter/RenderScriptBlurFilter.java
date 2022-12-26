package com.facebook.imagepipeline.filter;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import o.Fragment;
/* loaded from: classes6.dex */
public abstract class RenderScriptBlurFilter {
    public static final int BLUR_MAX_RADIUS = 25;

    public static void blurBitmap(Bitmap bitmap, Bitmap bitmap2, Context context, int i) {
        bitmap.getClass();
        bitmap2.getClass();
        context.getClass();
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i > 0 && i <= 25));
        RenderScript renderScript = null;
        try {
            RenderScript renderScript2 = (RenderScript) RenderScript.create(context).getClass();
            try {
                ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript2, Element.U8_4(renderScript2));
                Allocation allocation = (Allocation) Allocation.createFromBitmap(renderScript2, bitmap2).getClass();
                Allocation allocation2 = (Allocation) Allocation.createFromBitmap(renderScript2, bitmap).getClass();
                create.setRadius(i);
                create.setInput(allocation);
                create.forEach(allocation2);
                allocation2.copyTo(bitmap);
                create.destroy();
                allocation.destroy();
                allocation2.destroy();
                if (renderScript2 != null) {
                    renderScript2.destroy();
                }
            } catch (Throwable th) {
                th = th;
                renderScript = renderScript2;
                if (renderScript != null) {
                    renderScript.destroy();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean canUseRenderScript() {
        return Build.VERSION.SDK_INT >= 17;
    }
}

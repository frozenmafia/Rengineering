package com.facebook.imagepipeline.bitmaps;

import android.graphics.Bitmap;
import o.onGetHost;
/* loaded from: classes4.dex */
public class SimpleBitmapReleaser implements onGetHost<Bitmap> {
    private static SimpleBitmapReleaser sInstance;

    public static SimpleBitmapReleaser getInstance() {
        if (sInstance == null) {
            sInstance = new SimpleBitmapReleaser();
        }
        return sInstance;
    }

    private SimpleBitmapReleaser() {
    }

    @Override // o.onGetHost
    public void release(Bitmap bitmap) {
        bitmap.recycle();
    }
}

package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
/* loaded from: classes4.dex */
class PreverificationHelper {
    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean shouldUseHardwareBitmapConfig(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }
}

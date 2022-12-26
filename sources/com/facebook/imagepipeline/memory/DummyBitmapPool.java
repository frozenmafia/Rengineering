package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.memory.MemoryTrimType;
/* loaded from: classes4.dex */
public class DummyBitmapPool implements BitmapPool {
    @Override // o.onNewIntent
    public void trim(MemoryTrimType memoryTrimType) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.getSupportFragmentManager
    public Bitmap get(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // o.getSupportFragmentManager, o.onGetHost
    public void release(Bitmap bitmap) {
        bitmap.getClass();
        bitmap.recycle();
    }
}

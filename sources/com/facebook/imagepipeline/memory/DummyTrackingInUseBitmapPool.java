package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.memory.MemoryTrimType;
import java.util.Set;
import o.Fragment;
/* loaded from: classes4.dex */
public class DummyTrackingInUseBitmapPool implements BitmapPool {
    private final Set<Bitmap> mInUseValues = Fragment.OnStartEnterTransitionListener.values();

    @Override // o.onNewIntent
    public void trim(MemoryTrimType memoryTrimType) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.getSupportFragmentManager
    public Bitmap get(int i) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
        this.mInUseValues.add(createBitmap);
        return createBitmap;
    }

    @Override // o.getSupportFragmentManager, o.onGetHost
    public void release(Bitmap bitmap) {
        bitmap.getClass();
        this.mInUseValues.remove(bitmap);
        bitmap.recycle();
    }
}

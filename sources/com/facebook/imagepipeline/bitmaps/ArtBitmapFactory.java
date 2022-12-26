package com.facebook.imagepipeline.bitmaps;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.core.CloseableReferenceFactory;
import com.facebook.imagepipeline.memory.BitmapPool;
import com.facebook.imageutils.BitmapUtil;
import o.Fragment;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public class ArtBitmapFactory extends PlatformBitmapFactory {
    private final BitmapPool mBitmapPool;
    private final CloseableReferenceFactory mCloseableReferenceFactory;

    public ArtBitmapFactory(BitmapPool bitmapPool, CloseableReferenceFactory closeableReferenceFactory) {
        this.mBitmapPool = bitmapPool;
        this.mCloseableReferenceFactory = closeableReferenceFactory;
    }

    @Override // com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory
    public FragmentActivity.AnonymousClass1<Bitmap> createBitmapInternal(int i, int i2, Bitmap.Config config) {
        Bitmap bitmap = this.mBitmapPool.get(BitmapUtil.getSizeInByteForBitmap(i, i2, config));
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(bitmap.getAllocationByteCount() >= (i * i2) * BitmapUtil.getPixelSizeForBitmapConfig(config)));
        bitmap.reconfigure(i, i2, config);
        return this.mCloseableReferenceFactory.create(bitmap, this.mBitmapPool);
    }
}

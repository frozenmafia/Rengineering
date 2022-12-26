package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.util.Pools;
import androidx.core.util.Preconditions;
import com.facebook.imagepipeline.memory.BitmapPool;
import com.facebook.imageutils.BitmapUtil;
/* loaded from: classes4.dex */
public class ArtDecoder extends DefaultDecoder {
    public ArtDecoder(BitmapPool bitmapPool, int i, Pools.SynchronizedPool synchronizedPool) {
        super(bitmapPool, i, synchronizedPool);
    }

    @Override // com.facebook.imagepipeline.platform.DefaultDecoder
    public int getBitmapSize(int i, int i2, BitmapFactory.Options options) {
        return BitmapUtil.getSizeInByteForBitmap(i, i2, (Bitmap.Config) Preconditions.checkNotNull(options.inPreferredConfig));
    }
}

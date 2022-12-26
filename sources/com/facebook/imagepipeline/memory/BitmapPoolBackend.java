package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.imageutils.BitmapUtil;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public class BitmapPoolBackend extends LruBucketsPoolBackend<Bitmap> {
    private static final String TAG = "BitmapPoolBackend";

    @Override // com.facebook.imagepipeline.memory.LruBucketsPoolBackend, com.facebook.imagepipeline.memory.PoolBackend
    public void put(Bitmap bitmap) {
        if (isReusable(bitmap)) {
            super.put((BitmapPoolBackend) bitmap);
        }
    }

    @Override // com.facebook.imagepipeline.memory.LruBucketsPoolBackend, com.facebook.imagepipeline.memory.PoolBackend
    public Bitmap get(int i) {
        Bitmap bitmap = (Bitmap) super.get(i);
        if (bitmap == null || !isReusable(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    @Override // com.facebook.imagepipeline.memory.PoolBackend
    public int getSize(Bitmap bitmap) {
        return BitmapUtil.getSizeInBytes(bitmap);
    }

    protected boolean isReusable(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            FragmentActivity.toString(TAG, "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        } else if (bitmap.isMutable()) {
            return true;
        } else {
            FragmentActivity.toString(TAG, "Cannot reuse an immutable bitmap: %s", bitmap);
            return false;
        }
    }
}

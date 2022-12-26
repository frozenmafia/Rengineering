package com.facebook.imagepipeline.bitmaps;

import android.graphics.Bitmap;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public class GingerbreadBitmapFactory extends PlatformBitmapFactory {
    @Override // com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory
    public FragmentActivity.AnonymousClass1<Bitmap> createBitmapInternal(int i, int i2, Bitmap.Config config) {
        return FragmentActivity.AnonymousClass1.ah$a(Bitmap.createBitmap(i, i2, config), SimpleBitmapReleaser.getInstance());
    }
}

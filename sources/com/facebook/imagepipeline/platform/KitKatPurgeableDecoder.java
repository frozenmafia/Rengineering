package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.memory.FlexByteArrayPool;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import o.Fragment;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {
    private final FlexByteArrayPool mFlexByteArrayPool;

    public KitKatPurgeableDecoder(FlexByteArrayPool flexByteArrayPool) {
        this.mFlexByteArrayPool = flexByteArrayPool;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public Bitmap decodeByteArrayAsPurgeable(FragmentActivity.AnonymousClass1<PooledByteBuffer> anonymousClass1, BitmapFactory.Options options) {
        PooledByteBuffer HaptikSDK$c = anonymousClass1.HaptikSDK$c();
        int size = HaptikSDK$c.size();
        FragmentActivity.AnonymousClass1<byte[]> anonymousClass12 = this.mFlexByteArrayPool.get(size);
        try {
            byte[] HaptikSDK$c2 = anonymousClass12.HaptikSDK$c();
            HaptikSDK$c.read(0, HaptikSDK$c2, 0, size);
            return (Bitmap) Fragment.AnonymousClass8.values(BitmapFactory.decodeByteArray(HaptikSDK$c2, 0, size, options), "BitmapFactory returned null");
        } finally {
            FragmentActivity.AnonymousClass1.valueOf((FragmentActivity.AnonymousClass1<?>) anonymousClass12);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public Bitmap decodeJPEGByteArrayAsPurgeable(FragmentActivity.AnonymousClass1<PooledByteBuffer> anonymousClass1, int i, BitmapFactory.Options options) {
        byte[] bArr = endsWithEOI(anonymousClass1, i) ? null : EOI;
        PooledByteBuffer HaptikSDK$c = anonymousClass1.HaptikSDK$c();
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i <= HaptikSDK$c.size()));
        int i2 = i + 2;
        FragmentActivity.AnonymousClass1<byte[]> anonymousClass12 = this.mFlexByteArrayPool.get(i2);
        try {
            byte[] HaptikSDK$c2 = anonymousClass12.HaptikSDK$c();
            HaptikSDK$c.read(0, HaptikSDK$c2, 0, i);
            if (bArr != null) {
                putEOI(HaptikSDK$c2, i);
                i = i2;
            }
            return (Bitmap) Fragment.AnonymousClass8.values(BitmapFactory.decodeByteArray(HaptikSDK$c2, 0, i, options), "BitmapFactory returned null");
        } finally {
            FragmentActivity.AnonymousClass1.valueOf((FragmentActivity.AnonymousClass1<?>) anonymousClass12);
        }
    }

    private static void putEOI(byte[] bArr, int i) {
        bArr[i] = -1;
        bArr[i + 1] = -39;
    }
}

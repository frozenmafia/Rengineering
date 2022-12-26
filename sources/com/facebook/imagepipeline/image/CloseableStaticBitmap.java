package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import com.facebook.imageutils.BitmapUtil;
import o.Fragment;
import o.FragmentActivity;
import o.onGetHost;
/* loaded from: classes4.dex */
public class CloseableStaticBitmap extends CloseableBitmap implements FragmentActivity.AnonymousClass2 {
    private volatile Bitmap mBitmap;
    private FragmentActivity.AnonymousClass1<Bitmap> mBitmapReference;
    private final int mExifOrientation;
    private final QualityInfo mQualityInfo;
    private final int mRotationAngle;

    public CloseableStaticBitmap(Bitmap bitmap, onGetHost<Bitmap> ongethost, QualityInfo qualityInfo, int i) {
        this(bitmap, ongethost, qualityInfo, i, 0);
    }

    public CloseableStaticBitmap(Bitmap bitmap, onGetHost<Bitmap> ongethost, QualityInfo qualityInfo, int i, int i2) {
        this.mBitmap = (Bitmap) bitmap.getClass();
        this.mBitmapReference = FragmentActivity.AnonymousClass1.ah$a(this.mBitmap, (onGetHost) ongethost.getClass());
        this.mQualityInfo = qualityInfo;
        this.mRotationAngle = i;
        this.mExifOrientation = i2;
    }

    public CloseableStaticBitmap(FragmentActivity.AnonymousClass1<Bitmap> anonymousClass1, QualityInfo qualityInfo, int i) {
        this(anonymousClass1, qualityInfo, i, 0);
    }

    public CloseableStaticBitmap(FragmentActivity.AnonymousClass1<Bitmap> anonymousClass1, QualityInfo qualityInfo, int i, int i2) {
        FragmentActivity.AnonymousClass1<Bitmap> anonymousClass12 = (FragmentActivity.AnonymousClass1) anonymousClass1.ah$a().getClass();
        this.mBitmapReference = anonymousClass12;
        this.mBitmap = anonymousClass12.HaptikSDK$c();
        this.mQualityInfo = qualityInfo;
        this.mRotationAngle = i;
        this.mExifOrientation = i2;
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        FragmentActivity.AnonymousClass1<Bitmap> detachBitmapReference = detachBitmapReference();
        if (detachBitmapReference != null) {
            detachBitmapReference.close();
        }
    }

    private FragmentActivity.AnonymousClass1<Bitmap> detachBitmapReference() {
        FragmentActivity.AnonymousClass1<Bitmap> anonymousClass1;
        synchronized (this) {
            anonymousClass1 = this.mBitmapReference;
            this.mBitmapReference = null;
            this.mBitmap = null;
        }
        return anonymousClass1;
    }

    public FragmentActivity.AnonymousClass1<Bitmap> convertToBitmapReference() {
        FragmentActivity.AnonymousClass1<Bitmap> detachBitmapReference;
        synchronized (this) {
            Fragment.AnonymousClass8.values(this.mBitmapReference, "Cannot convert a closed static bitmap");
            detachBitmapReference = detachBitmapReference();
        }
        return detachBitmapReference;
    }

    public FragmentActivity.AnonymousClass1<Bitmap> cloneUnderlyingBitmapReference() {
        FragmentActivity.AnonymousClass1<Bitmap> anonymousClass1;
        synchronized (this) {
            anonymousClass1 = FragmentActivity.AnonymousClass1.toString(this.mBitmapReference);
        }
        return anonymousClass1;
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage
    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.mBitmapReference == null;
        }
        return z;
    }

    @Override // com.facebook.imagepipeline.image.CloseableBitmap
    public Bitmap getUnderlyingBitmap() {
        return this.mBitmap;
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage
    public int getSizeInBytes() {
        return BitmapUtil.getSizeInBytes(this.mBitmap);
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo
    public int getWidth() {
        int i;
        if (this.mRotationAngle % 180 != 0 || (i = this.mExifOrientation) == 5 || i == 7) {
            return getBitmapHeight(this.mBitmap);
        }
        return getBitmapWidth(this.mBitmap);
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo
    public int getHeight() {
        int i;
        if (this.mRotationAngle % 180 != 0 || (i = this.mExifOrientation) == 5 || i == 7) {
            return getBitmapWidth(this.mBitmap);
        }
        return getBitmapHeight(this.mBitmap);
    }

    private static int getBitmapWidth(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    private static int getBitmapHeight(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    public int getRotationAngle() {
        return this.mRotationAngle;
    }

    public int getExifOrientation() {
        return this.mExifOrientation;
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage, com.facebook.imagepipeline.image.ImageInfo
    public QualityInfo getQualityInfo() {
        return this.mQualityInfo;
    }
}

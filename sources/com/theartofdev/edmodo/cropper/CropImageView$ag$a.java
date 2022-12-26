package com.theartofdev.edmodo.cropper;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
/* loaded from: classes5.dex */
public class CropImageView$ag$a {
    private final Uri HaptikSDK$a;
    private final Uri HaptikSDK$b;
    private final int HaptikSDK$c;
    private final Rect ag$a;
    private final float[] ah$a;
    private final int ah$b;
    private final Rect invoke;
    private final Bitmap toString;
    private final Bitmap valueOf;
    private final Exception values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CropImageView$ag$a(Bitmap bitmap, Uri uri, Bitmap bitmap2, Uri uri2, Exception exc, float[] fArr, Rect rect, Rect rect2, int i, int i2) {
        this.valueOf = bitmap;
        this.HaptikSDK$b = uri;
        this.toString = bitmap2;
        this.HaptikSDK$a = uri2;
        this.values = exc;
        this.ah$a = fArr;
        this.ag$a = rect;
        this.invoke = rect2;
        this.HaptikSDK$c = i;
        this.ah$b = i2;
    }

    public Uri valueOf() {
        return this.HaptikSDK$b;
    }

    public Uri HaptikSDK$c() {
        return this.HaptikSDK$a;
    }

    public Exception ag$a() {
        return this.values;
    }

    public float[] ah$a() {
        return this.ah$a;
    }

    public Rect values() {
        return this.ag$a;
    }

    public Rect HaptikSDK$a() {
        return this.invoke;
    }

    public int invoke() {
        return this.HaptikSDK$c;
    }

    public int ah$b() {
        return this.ah$b;
    }
}

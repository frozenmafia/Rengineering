package com.facebook.imagepipeline.filter;

import android.graphics.Bitmap;
import o.Fragment;
/* loaded from: classes6.dex */
public final class InPlaceRoundFilter {
    private InPlaceRoundFilter() {
    }

    public static void roundBitmapInPlace(Bitmap bitmap) {
        bitmap.getClass();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int min = Math.min(width, height) / 2;
        int i = width / 2;
        int i2 = height / 2;
        if (min == 0) {
            return;
        }
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(min >= 1));
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(width > 0 && ((float) width) <= 2048.0f));
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(height > 0 && ((float) height) <= 2048.0f));
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i > 0 && i < width));
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i2 > 0 && i2 < height));
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i3 = min - 1;
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i - i3 >= 0 && i2 - i3 >= 0 && i + i3 < width && i2 + i3 < height));
        int i4 = (-min) * 2;
        int[] iArr2 = new int[width];
        int i5 = i4 + 1;
        int i6 = 0;
        int i7 = 1;
        int i8 = 1;
        while (i3 >= i6) {
            int i9 = i + i3;
            int i10 = i - i3;
            int i11 = i + i6;
            int i12 = min;
            int i13 = i - i6;
            int i14 = i;
            int i15 = i2 + i6;
            int i16 = i2 - i6;
            Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i3 >= 0 && i11 < width && i13 >= 0 && i15 < height && i16 >= 0));
            int i17 = i15 * width;
            int i18 = height;
            int i19 = width * i16;
            int i20 = i4;
            int i21 = width * (i2 + i3);
            int i22 = i2;
            int i23 = width * (i2 - i3);
            int i24 = i7;
            System.arraycopy(iArr2, 0, iArr, i17, i10);
            System.arraycopy(iArr2, 0, iArr, i19, i10);
            System.arraycopy(iArr2, 0, iArr, i21, i13);
            System.arraycopy(iArr2, 0, iArr, i23, i13);
            int i25 = width - i9;
            System.arraycopy(iArr2, 0, iArr, i17 + i9, i25);
            System.arraycopy(iArr2, 0, iArr, i19 + i9, i25);
            int i26 = width - i11;
            System.arraycopy(iArr2, 0, iArr, i21 + i11, i26);
            System.arraycopy(iArr2, 0, iArr, i23 + i11, i26);
            if (i5 <= 0) {
                i6++;
                i8 += 2;
                i5 += i8;
            }
            if (i5 > 0) {
                i3--;
                i7 = i24 + 2;
                i5 += i7 + i20;
            } else {
                i7 = i24;
            }
            min = i12;
            i = i14;
            height = i18;
            i4 = i20;
            i2 = i22;
        }
        int i27 = height;
        int i28 = min;
        int i29 = i2;
        for (int i30 = i29 - i28; i30 >= 0; i30--) {
            System.arraycopy(iArr2, 0, iArr, i30 * width, width);
        }
        for (int i31 = i29 + i28; i31 < i27; i31++) {
            System.arraycopy(iArr2, 0, iArr, i31 * width, width);
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, i27);
    }
}

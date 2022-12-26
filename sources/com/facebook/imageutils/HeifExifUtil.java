package com.facebook.imageutils;

import android.media.ExifInterface;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public class HeifExifUtil {
    public static final String TAG = "HeifExifUtil";

    public static int getOrientation(InputStream inputStream) {
        if (Build.VERSION.SDK_INT >= 24) {
            return HeifExifUtilAndroidN.getOrientation(inputStream);
        }
        FragmentActivity.toString(TAG, "Trying to read Heif Exif information before Android N -> ignoring");
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class HeifExifUtilAndroidN {
        private HeifExifUtilAndroidN() {
        }

        static int getOrientation(InputStream inputStream) {
            try {
                return new ExifInterface(inputStream).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            } catch (IOException e) {
                FragmentActivity.ah$a(HeifExifUtil.TAG, "Failed reading Heif Exif orientation -> ignoring", e);
                return 0;
            }
        }
    }
}

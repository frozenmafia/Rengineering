package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;
/* loaded from: classes5.dex */
public class setQueryExecutor {
    public File toString(Context context, String str, int i, int i2, int i3, int i4, int i5) throws IOException {
        Bitmap decodeFile;
        android.util.Pair<Integer, Integer> values = values(i, i2, i3, i4);
        int intValue = ((Integer) values.first).intValue();
        int intValue2 = ((Integer) values.second).intValue();
        if (i <= i3 && i2 <= i4) {
            decodeFile = BitmapFactory.decodeFile(str);
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = ag$a(i, i2, intValue, intValue2);
            decodeFile = BitmapFactory.decodeFile(str, options);
        }
        String attribute = new android.media.ExifInterface(str).getAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeFile, intValue, intValue2, true);
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists()) {
            Log.d("image-crop-picker", "Pictures Directory is not existing. Will create this directory.");
            externalFilesDir.mkdirs();
        }
        File file = new File(externalFilesDir, UUID.randomUUID() + ".jpg");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, i5, bufferedOutputStream);
        if (values(attribute)) {
            android.media.ExifInterface exifInterface = new android.media.ExifInterface(file.getAbsolutePath());
            exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, attribute);
            exifInterface.saveAttributes();
        }
        bufferedOutputStream.close();
        createScaledBitmap.recycle();
        return file;
    }

    private int ag$a(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i > i3 || i2 > i4) {
            int i6 = i / 2;
            int i7 = i2 / 2;
            while (i6 / i5 >= i3 && i7 / i5 >= i4) {
                i5 *= 2;
            }
        }
        return i5;
    }

    private boolean values(String str) {
        return (str.equals(String.valueOf(1)) || str.equals(String.valueOf(0))) ? false : true;
    }

    public File ah$a(Context context, ReadableMap readableMap, String str, BitmapFactory.Options options) throws IOException {
        Integer valueOf = readableMap.hasKey("compressImageMaxWidth") ? Integer.valueOf(readableMap.getInt("compressImageMaxWidth")) : null;
        Integer valueOf2 = readableMap.hasKey("compressImageMaxHeight") ? Integer.valueOf(readableMap.getInt("compressImageMaxHeight")) : null;
        Double valueOf3 = readableMap.hasKey("compressImageQuality") ? Double.valueOf(readableMap.getDouble("compressImageQuality")) : null;
        boolean z = true;
        boolean z2 = valueOf3 == null || valueOf3.doubleValue() == 1.0d;
        boolean z3 = valueOf == null || valueOf.intValue() >= options.outWidth;
        boolean z4 = valueOf2 == null || valueOf2.intValue() >= options.outHeight;
        z = (options.outMimeType == null || !Arrays.asList(MimeTypes.IMAGE_JPEG, "image/jpg", "image/png", "image/gif", "image/tiff").contains(options.outMimeType.toLowerCase())) ? false : false;
        if (z2 && z3 && z4 && z) {
            Log.d("image-crop-picker", "Skipping image compression");
            return new File(str);
        }
        Log.d("image-crop-picker", "Image compression activated");
        int doubleValue = valueOf3 != null ? (int) (valueOf3.doubleValue() * 100.0d) : 100;
        Log.d("image-crop-picker", "Compressing image with quality " + doubleValue);
        if (valueOf == null) {
            valueOf = Integer.valueOf(options.outWidth);
        }
        if (valueOf2 == null) {
            valueOf2 = Integer.valueOf(options.outHeight);
        }
        return toString(context, str, options.outWidth, options.outHeight, valueOf.intValue(), valueOf2.intValue(), doubleValue);
    }

    private android.util.Pair<Integer, Integer> values(int i, int i2, int i3, int i4) {
        if (i > i3) {
            i2 = (int) (i2 * (i3 / i));
            i = i3;
        }
        if (i2 > i4) {
            i = (int) (i * (i4 / i2));
        } else {
            i4 = i2;
        }
        return android.util.Pair.create(Integer.valueOf(i), Integer.valueOf(i4));
    }

    public void ah$a(Activity activity, ReadableMap readableMap, String str, String str2, Promise promise) {
        synchronized (this) {
            promise.resolve(str);
        }
    }
}

package o;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
/* loaded from: classes5.dex */
public final class encryptKey {
    private static int HaptikSDK$c;
    public static android.util.Pair<String, WeakReference<Bitmap>> invoke;
    public static final Rect ag$a = new Rect();
    public static final RectF valueOf = new RectF();
    public static final RectF values = new RectF();
    public static final float[] ah$a = new float[6];
    public static final float[] toString = new float[6];

    encryptKey() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o.encryptKey$ah$a toString(android.graphics.Bitmap r0, android.content.Context r1, android.net.Uri r2) {
        /*
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Exception -> L15
            java.io.InputStream r1 = r1.openInputStream(r2)     // Catch: java.lang.Exception -> L15
            if (r1 == 0) goto L15
            androidx.exifinterface.media.ExifInterface r2 = new androidx.exifinterface.media.ExifInterface     // Catch: java.lang.Exception -> L15
            r2.<init>(r1)     // Catch: java.lang.Exception -> L15
            r1.close()     // Catch: java.lang.Exception -> L13
            goto L16
        L13:
            goto L16
        L15:
            r2 = 0
        L16:
            if (r2 == 0) goto L1d
            o.encryptKey$ah$a r0 = valueOf(r0, r2)
            goto L24
        L1d:
            o.encryptKey$ah$a r1 = new o.encryptKey$ah$a
            r2 = 0
            r1.<init>(r0, r2)
            r0 = r1
        L24:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.encryptKey.toString(android.graphics.Bitmap, android.content.Context, android.net.Uri):o.encryptKey$ah$a");
    }

    public static encryptKey$ah$a valueOf(Bitmap bitmap, androidx.exifinterface.media.ExifInterface exifInterface) {
        int attributeInt = exifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
        return new encryptKey$ah$a(bitmap, attributeInt != 3 ? attributeInt != 6 ? attributeInt != 8 ? 0 : 270 : 90 : 180);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static values ag$a(Context context, Uri uri, int i, int i2) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            BitmapFactory.Options values2 = values(contentResolver, uri);
            if (values2.outWidth == -1 && values2.outHeight == -1) {
                throw new RuntimeException("File is not a picture");
            }
            values2.inSampleSize = Math.max(toString(values2.outWidth, values2.outHeight, i, i2), valueOf(values2.outWidth, values2.outHeight));
            return new values(values(contentResolver, uri, values2), values2.inSampleSize);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static values values(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, boolean z2, boolean z3) {
        int i4 = 1;
        do {
            try {
                return new values(ah$a(bitmap, fArr, i, z, i2, i3, 1.0f / i4, z2, z3), i4);
            } catch (OutOfMemoryError e) {
                i4 *= 2;
                if (i4 > 8) {
                    throw e;
                }
            }
        } while (i4 > 8);
        throw e;
    }

    private static Bitmap ah$a(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, float f, boolean z2, boolean z3) {
        float f2 = f;
        Rect values2 = values(fArr, bitmap.getWidth(), bitmap.getHeight(), z, i2, i3);
        Matrix matrix = new Matrix();
        matrix.setRotate(i, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        float f3 = z2 ? -f2 : f2;
        if (z3) {
            f2 = -f2;
        }
        matrix.postScale(f3, f2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, values2.left, values2.top, values2.width(), values2.height(), matrix, true);
        if (createBitmap == bitmap) {
            createBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        return i % 90 != 0 ? toString(createBitmap, fArr, values2, i, z, i2, i3) : createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static values valueOf(Context context, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3) {
        int i8 = 1;
        do {
            try {
                return toString(context, uri, fArr, i, i2, i3, z, i4, i5, i6, i7, z2, z3, i8);
            } catch (OutOfMemoryError e) {
                i8 *= 2;
                if (i8 > 16) {
                    throw new RuntimeException("Failed to handle OOM by sampling (" + i8 + "): " + uri + "\r\n" + e.getMessage(), e);
                }
            }
        } while (i8 > 16);
        throw new RuntimeException("Failed to handle OOM by sampling (" + i8 + "): " + uri + "\r\n" + e.getMessage(), e);
    }

    public static float values(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    public static float HaptikSDK$b(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    public static float HaptikSDK$a(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    public static float toString(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    public static float HaptikSDK$c(float[] fArr) {
        return HaptikSDK$a(fArr) - values(fArr);
    }

    public static float valueOf(float[] fArr) {
        return toString(fArr) - HaptikSDK$b(fArr);
    }

    public static float ag$a(float[] fArr) {
        return (HaptikSDK$a(fArr) + values(fArr)) / 2.0f;
    }

    public static float ah$a(float[] fArr) {
        return (toString(fArr) + HaptikSDK$b(fArr)) / 2.0f;
    }

    public static Rect values(float[] fArr, int i, int i2, boolean z, int i3, int i4) {
        Rect rect = new Rect(Math.round(Math.max(0.0f, values(fArr))), Math.round(Math.max(0.0f, HaptikSDK$b(fArr))), Math.round(Math.min(i, HaptikSDK$a(fArr))), Math.round(Math.min(i2, toString(fArr))));
        if (z) {
            values(rect, i3, i4);
        }
        return rect;
    }

    private static void values(Rect rect, int i, int i2) {
        if (i != i2 || rect.width() == rect.height()) {
            return;
        }
        if (rect.height() > rect.width()) {
            rect.bottom -= rect.height() - rect.width();
        } else {
            rect.right -= rect.width() - rect.height();
        }
    }

    public static Uri ah$a(Context context, Bitmap bitmap, Uri uri) {
        boolean z = true;
        try {
            if (uri == null) {
                uri = Uri.fromFile(File.createTempFile("aic_state_store_temp", ".jpg", context.getCacheDir()));
            } else if (new File(uri.getPath()).exists()) {
                z = false;
            }
            if (z) {
                toString(context, bitmap, uri, Bitmap.CompressFormat.JPEG, 95);
            }
            return uri;
        } catch (Exception e) {
            Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void toString(Context context, Bitmap bitmap, Uri uri, Bitmap.CompressFormat compressFormat, int i) throws FileNotFoundException {
        OutputStream outputStream = null;
        try {
            outputStream = context.getContentResolver().openOutputStream(uri);
            bitmap.compress(compressFormat, i, outputStream);
        } finally {
            values(outputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bitmap ag$a(Bitmap bitmap, int i, int i2, CropImageView.RequestSizeOptions requestSizeOptions) {
        if (i > 0 && i2 > 0) {
            try {
                if (requestSizeOptions == CropImageView.RequestSizeOptions.RESIZE_FIT || requestSizeOptions == CropImageView.RequestSizeOptions.RESIZE_INSIDE || requestSizeOptions == CropImageView.RequestSizeOptions.RESIZE_EXACT) {
                    Bitmap bitmap2 = null;
                    if (requestSizeOptions == CropImageView.RequestSizeOptions.RESIZE_EXACT) {
                        bitmap2 = Bitmap.createScaledBitmap(bitmap, i, i2, false);
                    } else {
                        float width = bitmap.getWidth();
                        float height = bitmap.getHeight();
                        float max = Math.max(width / i, height / i2);
                        if (max > 1.0f || requestSizeOptions == CropImageView.RequestSizeOptions.RESIZE_FIT) {
                            bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) (width / max), (int) (height / max), false);
                        }
                    }
                    if (bitmap2 != null) {
                        if (bitmap2 != bitmap) {
                            bitmap.recycle();
                        }
                        return bitmap2;
                    }
                }
            } catch (Exception e) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e);
            }
        }
        return bitmap;
    }

    private static values toString(Context context, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3, int i8) {
        Bitmap bitmap;
        Rect values2 = values(fArr, i2, i3, z, i4, i5);
        int width = i6 > 0 ? i6 : values2.width();
        int height = i7 > 0 ? i7 : values2.height();
        Bitmap bitmap2 = null;
        int i9 = 1;
        try {
            values encryptkey = toString(context, uri, values2, width, height, i8);
            bitmap2 = encryptkey.valueOf;
            i9 = encryptkey.toString;
        } catch (Exception unused) {
        }
        if (bitmap2 != null) {
            try {
                Bitmap valueOf2 = valueOf(bitmap2, i, z2, z3);
                try {
                    if (i % 90 != 0) {
                        valueOf2 = toString(valueOf2, fArr, values2, i, z, i4, i5);
                    }
                    return new values(valueOf2, i9);
                } catch (OutOfMemoryError e) {
                    e = e;
                    bitmap2 = bitmap;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    throw e;
                }
            } catch (OutOfMemoryError e2) {
                e = e2;
            }
        } else {
            return ag$a(context, uri, fArr, i, z, i4, i5, i8, values2, width, height, z2, z3);
        }
    }

    private static values ag$a(Context context, Uri uri, float[] fArr, int i, boolean z, int i2, int i3, int i4, Rect rect, int i5, int i6, boolean z2, boolean z3) {
        Bitmap bitmap = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int encryptkey = toString(rect.width(), rect.height(), i5, i6) * i4;
            options.inSampleSize = encryptkey;
            Bitmap values2 = values(context.getContentResolver(), uri, options);
            if (values2 != null) {
                try {
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                    for (int i7 = 0; i7 < length; i7++) {
                        fArr2[i7] = fArr2[i7] / options.inSampleSize;
                    }
                    bitmap = ah$a(values2, fArr2, i, z, i2, i3, 1.0f, z2, z3);
                    if (bitmap != values2) {
                        values2.recycle();
                    }
                } catch (Throwable th) {
                    if (values2 != null) {
                        values2.recycle();
                    }
                    throw th;
                }
            }
            return new values(bitmap, encryptkey);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e.getMessage(), e);
        } catch (OutOfMemoryError e2) {
            if (0 != 0) {
                bitmap.recycle();
            }
            throw e2;
        }
    }

    private static BitmapFactory.Options values(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        InputStream inputStream;
        try {
            inputStream = contentResolver.openInputStream(uri);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStream, ag$a, options);
                options.inJustDecodeBounds = false;
                values(inputStream);
                return options;
            } catch (Throwable th) {
                th = th;
                values(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    private static Bitmap values(ContentResolver contentResolver, Uri uri, BitmapFactory.Options options) throws FileNotFoundException {
        do {
            InputStream inputStream = null;
            try {
                try {
                    inputStream = contentResolver.openInputStream(uri);
                    return BitmapFactory.decodeStream(inputStream, ag$a, options);
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                    values(inputStream);
                    if (options.inSampleSize > 512) {
                        throw new RuntimeException("Failed to decode image: " + uri);
                    }
                }
            } finally {
                values(inputStream);
            }
        } while (options.inSampleSize > 512);
        throw new RuntimeException("Failed to decode image: " + uri);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.graphics.BitmapRegionDecoder] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.graphics.BitmapRegionDecoder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static o.encryptKey.values toString(android.content.Context r5, android.net.Uri r6, android.graphics.Rect r7, int r8, int r9, int r10) {
        /*
            r0 = 0
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
            r1.<init>()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
            int r2 = r7.width()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
            int r3 = r7.height()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
            int r8 = toString(r2, r3, r8, r9)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
            int r10 = r10 * r8
            r1.inSampleSize = r10     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
            java.io.InputStream r5 = r5.openInputStream(r6)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
            r8 = 0
            android.graphics.BitmapRegionDecoder r8 = android.graphics.BitmapRegionDecoder.newInstance(r5, r8)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
        L23:
            o.encryptKey$values r9 = new o.encryptKey$values     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.lang.OutOfMemoryError -> L3b
            android.graphics.Bitmap r10 = r8.decodeRegion(r7, r1)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.lang.OutOfMemoryError -> L3b
            int r2 = r1.inSampleSize     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.lang.OutOfMemoryError -> L3b
            r9.<init>(r10, r2)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.lang.OutOfMemoryError -> L3b
            values(r5)
            if (r8 == 0) goto L36
            r8.recycle()
        L36:
            return r9
        L37:
            r6 = move-exception
            goto L56
        L39:
            r7 = move-exception
            goto L58
        L3b:
            int r9 = r1.inSampleSize     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            int r9 = r9 * 2
            r1.inSampleSize = r9     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            int r9 = r1.inSampleSize     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            r10 = 512(0x200, float:7.175E-43)
            if (r9 <= r10) goto L23
            values(r5)
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            o.encryptKey$values r5 = new o.encryptKey$values
            r6 = 1
            r5.<init>(r0, r6)
            return r5
        L56:
            r0 = r8
            goto L5b
        L58:
            r0 = r8
            goto L60
        L5a:
            r6 = move-exception
        L5b:
            r4 = r0
            r0 = r5
            r5 = r4
            goto L8f
        L5f:
            r7 = move-exception
        L60:
            r4 = r0
            r0 = r5
            r5 = r4
            goto L6b
        L64:
            r5 = move-exception
            r6 = r5
            r5 = r0
            goto L8f
        L68:
            r5 = move-exception
            r7 = r5
            r5 = r0
        L6b:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r9.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r10 = "Failed to load sampled bitmap: "
            r9.append(r10)     // Catch: java.lang.Throwable -> L8e
            r9.append(r6)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = "\r\n"
            r9.append(r6)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = r7.getMessage()     // Catch: java.lang.Throwable -> L8e
            r9.append(r6)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r6, r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        L8e:
            r6 = move-exception
        L8f:
            values(r0)
            if (r5 == 0) goto L97
            r5.recycle()
        L97:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.encryptKey.toString(android.content.Context, android.net.Uri, android.graphics.Rect, int, int, int):o.encryptKey$values");
    }

    private static Bitmap toString(Bitmap bitmap, float[] fArr, Rect rect, int i, boolean z, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        if (i % 90 != 0) {
            double radians = Math.toRadians(i);
            if (i < 90 || (i > 180 && i < 270)) {
                i4 = rect.left;
            } else {
                i4 = rect.right;
            }
            int i8 = 0;
            int i9 = 0;
            while (true) {
                if (i9 >= fArr.length) {
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                    break;
                } else if (fArr[i9] >= i4 - 1 && fArr[i9] <= i4 + 1) {
                    int i10 = i9 + 1;
                    i8 = (int) Math.abs(Math.sin(radians) * (rect.bottom - fArr[i10]));
                    i6 = (int) Math.abs(Math.cos(radians) * (fArr[i10] - rect.top));
                    i7 = (int) Math.abs((fArr[i10] - rect.top) / Math.sin(radians));
                    i5 = (int) Math.abs((rect.bottom - fArr[i10]) / Math.cos(radians));
                    break;
                } else {
                    i9 += 2;
                }
            }
            rect.set(i8, i6, i7 + i8, i5 + i6);
            if (z) {
                values(rect, i2, i3);
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }
        return bitmap;
    }

    private static int toString(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i4 || i > i3) {
            while ((i2 / 2) / i5 > i4 && (i / 2) / i5 > i3) {
                i5 *= 2;
            }
        }
        return i5;
    }

    private static int valueOf(int i, int i2) {
        if (HaptikSDK$c == 0) {
            HaptikSDK$c = ag$a();
        }
        int i3 = 1;
        if (HaptikSDK$c > 0) {
            while (true) {
                int i4 = i2 / i3;
                int i5 = HaptikSDK$c;
                if (i4 <= i5 && i / i3 <= i5) {
                    break;
                }
                i3 *= 2;
            }
        }
        return i3;
    }

    private static Bitmap valueOf(Bitmap bitmap, int i, boolean z, boolean z2) {
        if (i > 0 || z || z2) {
            Matrix matrix = new Matrix();
            matrix.setRotate(i);
            matrix.postScale(z ? -1.0f : 1.0f, z2 ? -1.0f : 1.0f);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
            if (createBitmap != bitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }
        return bitmap;
    }

    private static int ag$a() {
        try {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eglGetDisplay, new int[2]);
            int[] iArr = new int[1];
            egl10.eglGetConfigs(eglGetDisplay, null, 0, iArr);
            EGLConfig[] eGLConfigArr = new EGLConfig[iArr[0]];
            egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, iArr[0], iArr);
            int[] iArr2 = new int[1];
            int i = 0;
            for (int i2 = 0; i2 < iArr[0]; i2++) {
                egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i2], 12332, iArr2);
                if (i < iArr2[0]) {
                    i = iArr2[0];
                }
            }
            egl10.eglTerminate(eglGetDisplay);
            return Math.max(i, 2048);
        } catch (Exception unused) {
            return 2048;
        }
    }

    private static void values(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class values {
        final int toString;
        public final Bitmap valueOf;

        values(Bitmap bitmap, int i) {
            this.valueOf = bitmap;
            this.toString = i;
        }
    }
}

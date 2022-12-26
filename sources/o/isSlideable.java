package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.codec.language.Soundex;
import org.apache.http.message.TokenParser;
/* loaded from: classes7.dex */
public class isSlideable {
    private static final String[] ag$a;
    private static int[] ah$a = null;
    private static int toString = 1;
    private static int values;

    static void valueOf() {
        ah$a = new int[]{1564342501, -1270908131, -240019475, 903012240, -464704200, -740964055, 1505640407, 516539150, -836900171, 1316794364, 2040464428, 994345083, 588696399, -1843049861, 2078885010, 1336191402, 2110068487, 1220494972};
    }

    static {
        valueOf();
        ag$a = new String[]{androidx.exifinterface.media.ExifInterface.TAG_APERTURE_VALUE, androidx.exifinterface.media.ExifInterface.TAG_MAX_APERTURE_VALUE, androidx.exifinterface.media.ExifInterface.TAG_METERING_MODE, androidx.exifinterface.media.ExifInterface.TAG_ARTIST, androidx.exifinterface.media.ExifInterface.TAG_BITS_PER_SAMPLE, androidx.exifinterface.media.ExifInterface.TAG_COMPRESSION, androidx.exifinterface.media.ExifInterface.TAG_BODY_SERIAL_NUMBER, androidx.exifinterface.media.ExifInterface.TAG_BRIGHTNESS_VALUE, androidx.exifinterface.media.ExifInterface.TAG_CONTRAST, "CameraOwnerName", androidx.exifinterface.media.ExifInterface.TAG_COLOR_SPACE, androidx.exifinterface.media.ExifInterface.TAG_COPYRIGHT, androidx.exifinterface.media.ExifInterface.TAG_DATETIME, androidx.exifinterface.media.ExifInterface.TAG_DATETIME_DIGITIZED, androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL, androidx.exifinterface.media.ExifInterface.TAG_DEVICE_SETTING_DESCRIPTION, androidx.exifinterface.media.ExifInterface.TAG_DIGITAL_ZOOM_RATIO, androidx.exifinterface.media.ExifInterface.TAG_EXIF_VERSION, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_BIAS_VALUE, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_INDEX, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_MODE, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_TIME, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_PROGRAM, androidx.exifinterface.media.ExifInterface.TAG_FLASH, androidx.exifinterface.media.ExifInterface.TAG_FLASH_ENERGY, androidx.exifinterface.media.ExifInterface.TAG_FOCAL_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_FOCAL_LENGTH_IN_35MM_FILM, androidx.exifinterface.media.ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, androidx.exifinterface.media.ExifInterface.TAG_FOCAL_PLANE_X_RESOLUTION, androidx.exifinterface.media.ExifInterface.TAG_FOCAL_PLANE_Y_RESOLUTION, androidx.exifinterface.media.ExifInterface.TAG_PHOTOMETRIC_INTERPRETATION, androidx.exifinterface.media.ExifInterface.TAG_PLANAR_CONFIGURATION, androidx.exifinterface.media.ExifInterface.TAG_F_NUMBER, androidx.exifinterface.media.ExifInterface.TAG_GAIN_CONTROL, androidx.exifinterface.media.ExifInterface.TAG_GAMMA, androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_AREA_INFORMATION, androidx.exifinterface.media.ExifInterface.TAG_GPS_DATESTAMP, androidx.exifinterface.media.ExifInterface.TAG_GPS_DOP, androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_STATUS, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_BEARING, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_BEARING_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_DISTANCE, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_DISTANCE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LATITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LATITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LONGITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LONGITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_DIFFERENTIAL, androidx.exifinterface.media.ExifInterface.TAG_GPS_IMG_DIRECTION, androidx.exifinterface.media.ExifInterface.TAG_GPS_IMG_DIRECTION_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_MAP_DATUM, androidx.exifinterface.media.ExifInterface.TAG_GPS_MEASURE_MODE, androidx.exifinterface.media.ExifInterface.TAG_GPS_PROCESSING_METHOD, androidx.exifinterface.media.ExifInterface.TAG_GPS_SATELLITES, androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED, androidx.exifinterface.media.ExifInterface.TAG_GPS_SPEED_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_STATUS, androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP, androidx.exifinterface.media.ExifInterface.TAG_GPS_TRACK, androidx.exifinterface.media.ExifInterface.TAG_GPS_TRACK_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_VERSION_ID, androidx.exifinterface.media.ExifInterface.TAG_IMAGE_DESCRIPTION, androidx.exifinterface.media.ExifInterface.TAG_IMAGE_UNIQUE_ID, androidx.exifinterface.media.ExifInterface.TAG_ISO_SPEED, androidx.exifinterface.media.ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, androidx.exifinterface.media.ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT, androidx.exifinterface.media.ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_LENS_MAKE, androidx.exifinterface.media.ExifInterface.TAG_LENS_MODEL, androidx.exifinterface.media.ExifInterface.TAG_LENS_SERIAL_NUMBER, androidx.exifinterface.media.ExifInterface.TAG_LENS_SPECIFICATION, androidx.exifinterface.media.ExifInterface.TAG_LIGHT_SOURCE, androidx.exifinterface.media.ExifInterface.TAG_MAKE, androidx.exifinterface.media.ExifInterface.TAG_MAKER_NOTE, androidx.exifinterface.media.ExifInterface.TAG_MODEL, androidx.exifinterface.media.ExifInterface.TAG_SATURATION, androidx.exifinterface.media.ExifInterface.TAG_SHARPNESS, androidx.exifinterface.media.ExifInterface.TAG_SHUTTER_SPEED_VALUE, androidx.exifinterface.media.ExifInterface.TAG_SOFTWARE, androidx.exifinterface.media.ExifInterface.TAG_SUBJECT_DISTANCE, androidx.exifinterface.media.ExifInterface.TAG_SUBJECT_DISTANCE_RANGE, androidx.exifinterface.media.ExifInterface.TAG_SUBJECT_LOCATION, androidx.exifinterface.media.ExifInterface.TAG_USER_COMMENT, androidx.exifinterface.media.ExifInterface.TAG_WHITE_BALANCE};
        try {
            int i = values + 47;
            toString = i % 128;
            if (!(i % 2 == 0)) {
                return;
            }
            Object[] objArr = null;
            int length = objArr.length;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private static Bitmap values(Bitmap bitmap, int i, int i2, String str, boolean z) {
        float min;
        try {
            int i3 = toString + 45;
            values = i3 % 128;
            int i4 = i3 % 2;
            Bitmap bitmap2 = 0;
            bitmap2 = 0;
            bitmap2 = 0;
            if (bitmap == null) {
                int i5 = toString + 9;
                values = i5 % 128;
                if (i5 % 2 != 0) {
                    super.hashCode();
                }
                return null;
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (i2 > 0) {
                if ((i > 0 ? '(' : 'C') != 'C') {
                    if ((str.equals("stretch") ? '<' : TokenParser.CR) != '\r') {
                        if ((z ? '`' : 'K') != 'K') {
                            i = Math.min(width, i);
                            i2 = Math.min(height, i2);
                            int i6 = values + 97;
                            toString = i6 % 128;
                            int i7 = i6 % 2;
                        }
                    } else {
                        float f = width;
                        float f2 = i / f;
                        float f3 = height;
                        float f4 = i2 / f3;
                        if (str.equals("cover")) {
                            int i8 = values + 7;
                            toString = i8 % 128;
                            if ((i8 % 2 == 0 ? '#' : (char) 2) != 2) {
                                min = Math.max(f2, f4);
                                int length = bitmap2.length;
                            } else {
                                min = Math.max(f2, f4);
                            }
                        } else {
                            min = Math.min(f2, f4);
                        }
                        if (z) {
                            min = Math.min(min, 1.0f);
                        }
                        int round = Math.round(f * min);
                        i2 = Math.round(f3 * min);
                        i = round;
                    }
                    try {
                        bitmap2 = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                    } catch (OutOfMemoryError unused) {
                    }
                }
            }
            int i9 = values + 59;
            toString = i9 % 128;
            int i10 = i9 % 2;
            return bitmap2;
        } catch (Exception e) {
            throw e;
        }
    }

    public static Bitmap toString(Bitmap bitmap, float f) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        Object[] objArr = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            try {
                int i = toString + 107;
                values = i % 128;
                if (!(i % 2 != 0)) {
                    return createBitmap;
                }
                int length = objArr.length;
                return createBitmap;
            } catch (Exception e) {
                throw e;
            }
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
        r4 = new java.io.File(r3, r4 + "." + r5.name());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r4.createNewFile() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        r3 = new java.io.ByteArrayOutputStream();
        r2.compress(r5, r6, r3);
        r2 = r3.toByteArray();
        r3.flush();
        r3.close();
        r3 = new java.io.FileOutputStream(r4);
        r3.write(r2);
        r3.flush();
        r3.close();
        r2 = o.isSlideable.toString + 63;
        o.isSlideable.values = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
        throw new java.io.IOException("The file already exists");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
        throw new java.io.IOException("The bitmap couldn't be resized");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r2 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File values(android.graphics.Bitmap r2, java.io.File r3, java.lang.String r4, android.graphics.Bitmap.CompressFormat r5, int r6) throws java.io.IOException {
        /*
            int r0 = o.isSlideable.toString
            int r0 = r0 + 71
            int r1 = r0 % 128
            o.isSlideable.values = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == r1) goto L15
            if (r2 == 0) goto L6f
            goto L19
        L15:
            r0 = 0
            int r0 = r0.length     // Catch: java.lang.Throwable -> L77
            if (r2 == 0) goto L6f
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = "."
            r0.append(r4)
            java.lang.String r4 = r5.name()
            r0.append(r4)
            java.io.File r4 = new java.io.File
            java.lang.String r0 = r0.toString()
            r4.<init>(r3, r0)
            boolean r3 = r4.createNewFile()
            if (r3 == 0) goto L67
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r2.compress(r5, r6, r3)
            byte[] r2 = r3.toByteArray()
            r3.flush()
            r3.close()
            java.io.FileOutputStream r3 = new java.io.FileOutputStream
            r3.<init>(r4)
            r3.write(r2)
            r3.flush()
            r3.close()
            int r2 = o.isSlideable.toString
            int r2 = r2 + 63
            int r3 = r2 % 128
            o.isSlideable.values = r3
            int r2 = r2 % 2
            return r4
        L67:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "The file already exists"
            r2.<init>(r3)
            throw r2
        L6f:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "The bitmap couldn't be resized"
            r2.<init>(r3)
            throw r2
        L77:
            r2 = move-exception
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isSlideable.values(android.graphics.Bitmap, java.io.File, java.lang.String, android.graphics.Bitmap$CompressFormat, int):java.io.File");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.io.File toString(android.content.Context r11, android.net.Uri r12) {
        /*
            java.lang.String r0 = "_data"
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r12.getPath()
            r1.<init>(r2)
            boolean r2 = r1.exists()
            r3 = 84
            if (r2 == 0) goto L16
            r2 = 85
            goto L18
        L16:
            r2 = 84
        L18:
            r4 = 0
            if (r2 == r3) goto L3a
            int r11 = o.isSlideable.toString     // Catch: java.lang.Exception -> L37
            int r11 = r11 + 73
            int r12 = r11 % 128
            o.isSlideable.values = r12
            int r11 = r11 % 2
            r12 = 74
            if (r11 == 0) goto L2c
            r11 = 74
            goto L2e
        L2c:
            r11 = 59
        L2e:
            if (r11 == r12) goto L31
            return r1
        L31:
            r11 = 45
            int r11 = r11 / r4
            return r1
        L35:
            r11 = move-exception
            throw r11
        L37:
            r11 = move-exception
            goto Lb0
        L3a:
            r2 = 1
            r3 = 0
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            android.content.ContentResolver r5 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            r8 = 0
            r9 = 0
            r10 = 0
            r6 = r12
            android.database.Cursor r11 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            int r12 = r11.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r11.moveToFirst()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            java.lang.String r12 = r11.getString(r12)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            if (r11 == 0) goto L79
            int r12 = o.isSlideable.values
            int r12 = r12 + 115
            int r1 = r12 % 128
            o.isSlideable.toString = r1
            int r12 = r12 % 2
            if (r12 != 0) goto L6c
            r12 = 1
            goto L6d
        L6c:
            r12 = 0
        L6d:
            r11.close()
            if (r12 == r2) goto L73
            goto L79
        L73:
            super.hashCode()     // Catch: java.lang.Throwable -> L77
            goto L79
        L77:
            r11 = move-exception
            throw r11
        L79:
            r1 = r0
            goto L9c
        L7b:
            r12 = move-exception
            r3 = r11
            goto L84
        L7e:
            goto L8a
        L80:
            r12 = move-exception
            goto L84
        L82:
            r11 = r3
            goto L8a
        L84:
            if (r3 == 0) goto L89
            r3.close()
        L89:
            throw r12
        L8a:
            if (r11 == 0) goto L9c
            r11.close()
            int r11 = o.isSlideable.values     // Catch: java.lang.Exception -> L9a
            int r11 = r11 + 23
            int r12 = r11 % 128
            o.isSlideable.toString = r12     // Catch: java.lang.Exception -> L9a
            int r11 = r11 % 2
            goto L9c
        L9a:
            r11 = move-exception
            throw r11
        L9c:
            int r11 = o.isSlideable.values     // Catch: java.lang.Exception -> L37
            int r11 = r11 + 103
            int r12 = r11 % 128
            o.isSlideable.toString = r12     // Catch: java.lang.Exception -> L37
            int r11 = r11 % 2
            if (r11 != 0) goto La9
            r4 = 1
        La9:
            if (r4 == r2) goto Lac
            return r1
        Lac:
            int r11 = r3.length     // Catch: java.lang.Throwable -> Lae
            return r1
        Lae:
            r11 = move-exception
            throw r11
        Lb0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isSlideable.toString(android.content.Context, android.net.Uri):java.io.File");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:58:0x0099
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static boolean ah$a(android.content.Context r7, android.net.Uri r8, java.lang.String r9) {
        /*
            int r0 = o.isSlideable.toString
            int r0 = r0 + 39
            int r1 = r0 % 128
            o.isSlideable.values = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            java.lang.String r3 = "ImageResizer::copyExif"
            r4 = 0
            if (r0 == 0) goto L29
            java.io.File r7 = toString(r7, r8)     // Catch: java.lang.Exception -> L4b
            boolean r8 = r7.exists()     // Catch: java.lang.Exception -> L4b
            int r0 = r4.length     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L4b
            if (r8 != 0) goto L23
            r8 = 0
            goto L24
        L23:
            r8 = 1
        L24:
            if (r8 == r1) goto L38
            goto L4a
        L27:
            r7 = move-exception
            throw r7
        L29:
            java.io.File r7 = toString(r7, r8)     // Catch: java.lang.Exception -> L4b
            boolean r8 = r7.exists()     // Catch: java.lang.Exception -> L4b
            if (r8 != 0) goto L35
            r8 = 1
            goto L36
        L35:
            r8 = 0
        L36:
            if (r8 == r1) goto L4a
        L38:
            androidx.exifinterface.media.ExifInterface r8 = new androidx.exifinterface.media.ExifInterface     // Catch: java.lang.Exception -> L4b
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Exception -> L4b
            r8.<init>(r7)     // Catch: java.lang.Exception -> L4b
            androidx.exifinterface.media.ExifInterface r7 = new androidx.exifinterface.media.ExifInterface     // Catch: java.lang.Exception -> L48
            r7.<init>(r9)     // Catch: java.lang.Exception -> L48
            r4 = r7
            goto L52
        L48:
            r7 = move-exception
            goto L4d
        L4a:
            return r2
        L4b:
            r7 = move-exception
            r8 = r4
        L4d:
            java.lang.String r9 = "EXIF read failed"
            android.util.Log.e(r3, r9, r7)     // Catch: java.lang.Exception -> L97
        L52:
            if (r8 == 0) goto L56
            r7 = 1
            goto L57
        L56:
            r7 = 0
        L57:
            if (r7 == 0) goto L96
            if (r4 != 0) goto L66
            int r7 = o.isSlideable.toString
            int r7 = r7 + 115
            int r8 = r7 % 128
            o.isSlideable.values = r8
            int r7 = r7 % 2
            goto L96
        L66:
            java.lang.String[] r7 = o.isSlideable.ag$a     // Catch: java.lang.Exception -> L90
            int r9 = r7.length     // Catch: java.lang.Exception -> L90
            r0 = 0
        L6a:
            if (r0 >= r9) goto L7a
            r5 = r7[r0]     // Catch: java.lang.Exception -> L90
            java.lang.String r6 = r8.getAttribute(r5)     // Catch: java.lang.Exception -> L90
            if (r6 == 0) goto L77
            r4.setAttribute(r5, r6)     // Catch: java.lang.Exception -> L90
        L77:
            int r0 = r0 + 1
            goto L6a
        L7a:
            r4.saveAttributes()     // Catch: java.lang.Exception -> L90
            int r7 = o.isSlideable.toString
            int r7 = r7 + 45
            int r8 = r7 % 128
            o.isSlideable.values = r8
            int r7 = r7 % 2
            if (r7 == 0) goto L8f
            r7 = 52
            int r7 = r7 / r2
            return r1
        L8d:
            r7 = move-exception
            throw r7
        L8f:
            return r1
        L90:
            r7 = move-exception
            java.lang.String r8 = "EXIF copy failed"
            android.util.Log.e(r3, r8, r7)
        L96:
            return r2
        L97:
            r7 = move-exception
            goto L9b
        L99:
            r7 = move-exception
            throw r7
        L9b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isSlideable.ah$a(android.content.Context, android.net.Uri, java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r4 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r3.exists() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int valueOf(android.content.Context r3, android.net.Uri r4) {
        /*
            int r0 = o.isSlideable.toString
            int r0 = r0 + 41
            int r1 = r0 % 128
            o.isSlideable.values = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L10
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            if (r0 == r2) goto L24
            java.io.File r3 = toString(r3, r4)     // Catch: java.lang.Exception -> L48
            boolean r4 = r3.exists()     // Catch: java.lang.Exception -> L48
            r0 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L48
            if (r4 == 0) goto L48
            goto L2e
        L22:
            r3 = move-exception
            throw r3
        L24:
            java.io.File r3 = toString(r3, r4)     // Catch: java.lang.Exception -> L48
            boolean r4 = r3.exists()     // Catch: java.lang.Exception -> L48
            if (r4 == 0) goto L48
        L2e:
            androidx.exifinterface.media.ExifInterface r4 = new androidx.exifinterface.media.ExifInterface     // Catch: java.lang.Exception -> L48
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Exception -> L48
            r4.<init>(r3)     // Catch: java.lang.Exception -> L48
            int r3 = toString(r4)     // Catch: java.lang.Exception -> L48
            int r4 = o.isSlideable.toString     // Catch: java.lang.Exception -> L46
            int r4 = r4 + 93
            int r0 = r4 % 128
            o.isSlideable.values = r0     // Catch: java.lang.Exception -> L46
            int r4 = r4 % 2
            return r3
        L46:
            r3 = move-exception
            throw r3
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isSlideable.valueOf(android.content.Context, android.net.Uri):int");
    }

    public static int toString(androidx.exifinterface.media.ExifInterface exifInterface) {
        try {
            int attributeInt = exifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt != 3) {
                int i = values + 63;
                toString = i % 128;
                if (i % 2 == 0) {
                    if (attributeInt == 108) {
                        return 90;
                    }
                } else {
                    if ((attributeInt != 6 ? '3' : TokenParser.CR) == '\r') {
                        return 90;
                    }
                }
                if (attributeInt != 8) {
                    int i2 = values + 95;
                    toString = i2 % 128;
                    return !(i2 % 2 == 0) ? 0 : 1;
                }
                return 270;
            }
            return 180;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r6 <= r7) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065 A[EDGE_INSN: B:43:0x0065->B:37:0x0065 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int toString(android.graphics.BitmapFactory.Options r6, int r7, int r8) {
        /*
            int r0 = o.isSlideable.toString
            int r0 = r0 + 107
            int r1 = r0 % 128
            o.isSlideable.values = r1
            int r0 = r0 % 2
            r1 = 84
            if (r0 == 0) goto L11
            r0 = 98
            goto L13
        L11:
            r0 = 84
        L13:
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L20
            int r0 = r6.outHeight     // Catch: java.lang.Exception -> L66
            int r6 = r6.outWidth     // Catch: java.lang.Exception -> L66
            r1 = 0
            if (r0 > r8) goto L2a
            r4 = 0
            goto L28
        L20:
            int r0 = r6.outHeight     // Catch: java.lang.Exception -> L66
            int r6 = r6.outWidth     // Catch: java.lang.Exception -> L66
            r1 = 1
            if (r0 > r8) goto L2a
            r4 = 1
        L28:
            if (r6 <= r7) goto L65
        L2a:
            int r0 = r0 / 2
            int r6 = r6 / 2
            int r4 = o.isSlideable.toString
            int r4 = r4 + 59
            int r5 = r4 % 128
            o.isSlideable.values = r5
            int r4 = r4 % 2
            r4 = r1
        L39:
            int r1 = r0 / r4
            if (r1 < r8) goto L3f
            r1 = 1
            goto L40
        L3f:
            r1 = 0
        L40:
            if (r1 == r3) goto L43
            goto L65
        L43:
            int r1 = o.isSlideable.toString
            int r1 = r1 + 87
            int r5 = r1 % 128
            o.isSlideable.values = r5
            int r1 = r1 % 2
            if (r1 == 0) goto L51
            r1 = 1
            goto L52
        L51:
            r1 = 0
        L52:
            if (r1 == r3) goto L59
            int r1 = r6 / r4
            if (r1 < r7) goto L65
            goto L62
        L59:
            int r1 = r6 - r4
            if (r1 < r7) goto L5f
            r1 = 1
            goto L60
        L5f:
            r1 = 0
        L60:
            if (r1 == 0) goto L65
        L62:
            int r4 = r4 * 2
            goto L39
        L65:
            return r4
        L66:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isSlideable.toString(android.graphics.BitmapFactory$Options, int, int):int");
    }

    private static Bitmap values(Context context, Uri uri, BitmapFactory.Options options) throws IOException {
        Bitmap decodeStream;
        try {
            int i = toString + 31;
            values = i % 128;
            int i2 = i % 2;
            String scheme = uri.getScheme();
            if (scheme != null) {
                if (scheme.equalsIgnoreCase("content")) {
                    InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                    if ((openInputStream != null ? 'a' : Soundex.SILENT_MARKER) != 'a') {
                        return null;
                    }
                    int i3 = values + 11;
                    toString = i3 % 128;
                    if (i3 % 2 == 0) {
                        decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                        openInputStream.close();
                        int i4 = 83 / 0;
                    } else {
                        decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                        openInputStream.close();
                    }
                    return decodeStream;
                }
                int i5 = toString + 41;
                values = i5 % 128;
                int i6 = i5 % 2;
            }
            try {
                return BitmapFactory.decodeFile(uri.getPath(), options);
            } catch (Exception e) {
                e.printStackTrace();
                throw new IOException("Error decoding image file");
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static Bitmap ag$a(Context context, Uri uri, int i, int i2) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        values(context, uri, options);
        options.inSampleSize = toString(options, i, i2);
        options.inJustDecodeBounds = false;
        Bitmap values2 = values(context, uri, options);
        int i3 = values + 9;
        toString = i3 % 128;
        int i4 = i3 % 2;
        return values2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Bitmap ah$a(Uri uri, int i, int i2) throws IOException {
        Throwable th;
        InputStream inputStream;
        Exception e;
        Bitmap bitmap = null;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
                if (inputStream != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr, 0, 1024);
                            if ((read != -1 ? 'U' : 'Q') != 'U') {
                                break;
                            }
                            int i3 = values + 111;
                            toString = i3 % 128;
                            if (i3 % 2 == 0) {
                                byteArrayOutputStream.write(bArr, 1, read);
                            } else {
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                        }
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                        options.inSampleSize = toString(options, i, i2);
                        options.inJustDecodeBounds = false;
                        bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                    } catch (Exception e2) {
                        e = e2;
                        bitmap = inputStream;
                        e.printStackTrace();
                        throw new IOException("Error fetching remote image file.");
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStream != 0) {
                            try {
                                inputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                if (inputStream != 0) {
                    try {
                        inputStream.close();
                        int i4 = toString + 41;
                        values = i4 % 128;
                        int i5 = i4 % 2;
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return bitmap;
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = bitmap;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        if (r2 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
        if (r2 != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap toString(android.net.Uri r8) {
        /*
            java.lang.String r8 = r8.getSchemeSpecificPart()
            r0 = 44
            int r1 = r8.indexOf(r0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r1 == r2) goto L11
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            if (r2 == 0) goto L15
            goto L67
        L15:
            int r2 = o.isSlideable.values
            int r2 = r2 + 15
            int r5 = r2 % 128
            o.isSlideable.toString = r5
            r5 = 2
            int r2 = r2 % r5
            java.lang.String r2 = r8.substring(r4, r1)     // Catch: java.lang.Exception -> L7a
            r6 = 92
            r7 = 47
            java.lang.String r2 = r2.replace(r6, r7)     // Catch: java.lang.Exception -> L78
            java.lang.String r2 = r2.toLowerCase()     // Catch: java.lang.Exception -> L78
            java.lang.String r6 = "image/jpeg"
            boolean r6 = r2.startsWith(r6)     // Catch: java.lang.Exception -> L78
            if (r6 != 0) goto L3a
            r7 = 55
            goto L3b
        L3a:
            r7 = 2
        L3b:
            if (r7 == r5) goto L50
            java.lang.String r7 = "image/png"
            boolean r2 = r2.startsWith(r7)
            r7 = 23
            if (r2 == 0) goto L4a
            r2 = 11
            goto L4c
        L4a:
            r2 = 23
        L4c:
            if (r2 == r7) goto L50
            r2 = 1
            goto L51
        L50:
            r2 = 0
        L51:
            if (r6 != 0) goto L69
            int r6 = o.isSlideable.values
            int r6 = r6 + 13
            int r7 = r6 % 128
            o.isSlideable.toString = r7
            int r6 = r6 % r5
            if (r6 != 0) goto L64
            int r0 = r0 / r4
            if (r2 == 0) goto L67
            goto L69
        L62:
            r8 = move-exception
            throw r8
        L64:
            if (r2 == 0) goto L67
            goto L69
        L67:
            r8 = 0
            goto L77
        L69:
            int r1 = r1 + r3
            java.lang.String r8 = r8.substring(r1)
            byte[] r8 = android.util.Base64.decode(r8, r4)
            int r0 = r8.length
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeByteArray(r8, r4, r0)
        L77:
            return r8
        L78:
            r8 = move-exception
            throw r8
        L7a:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isSlideable.toString(android.net.Uri):android.graphics.Bitmap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c7, code lost:
        if ((r6 != r5 ? ']' : 'D') != ']') goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d5, code lost:
        if ((r6 != r5 ? 27 : 'U') != 'U') goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d7, code lost:
        r7 = o.isSlideable.values + 5;
        o.isSlideable.toString = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e1, code lost:
        if ((r7 % 2) != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e3, code lost:
        r5.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e8, code lost:
        r5 = 41 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ec, code lost:
        r5.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ef, code lost:
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap ah$a(android.content.Context r5, android.net.Uri r6, int r7, int r8, int r9, int r10, java.lang.String r11, boolean r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isSlideable.ah$a(android.content.Context, android.net.Uri, int, int, int, int, java.lang.String, boolean):android.graphics.Bitmap");
    }

    private static String ag$a(int[] iArr, int i) {
        String str;
        synchronized (getDouble.ag$a) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) ah$a.clone();
            getDouble.toString = 0;
            while (getDouble.toString < iArr.length) {
                cArr[0] = (char) (iArr[getDouble.toString] >> 16);
                cArr[1] = (char) iArr[getDouble.toString];
                cArr[2] = (char) (iArr[getDouble.toString + 1] >> 16);
                cArr[3] = (char) iArr[getDouble.toString + 1];
                getDouble.valueOf = (cArr[0] << 16) + cArr[1];
                getDouble.values = (cArr[2] << 16) + cArr[3];
                getDouble.values(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = getDouble.valueOf ^ iArr2[i2];
                    getDouble.valueOf = i3;
                    getDouble.values = getDouble.toString(i3) ^ getDouble.values;
                    int i4 = getDouble.valueOf;
                    getDouble.valueOf = getDouble.values;
                    getDouble.values = i4;
                }
                int i5 = getDouble.valueOf;
                getDouble.valueOf = getDouble.values;
                getDouble.values = i5;
                getDouble.values = i5 ^ iArr2[16];
                getDouble.valueOf ^= iArr2[17];
                int i6 = getDouble.valueOf;
                int i7 = getDouble.values;
                cArr[0] = (char) (getDouble.valueOf >>> 16);
                cArr[1] = (char) getDouble.valueOf;
                cArr[2] = (char) (getDouble.values >>> 16);
                cArr[3] = (char) getDouble.values;
                getDouble.values(iArr2);
                cArr2[getDouble.toString << 1] = cArr[0];
                cArr2[(getDouble.toString << 1) + 1] = cArr[1];
                cArr2[(getDouble.toString << 1) + 2] = cArr[2];
                cArr2[(getDouble.toString << 1) + 3] = cArr[3];
                getDouble.toString += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}

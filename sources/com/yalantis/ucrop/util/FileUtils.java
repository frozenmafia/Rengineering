package com.yalantis.ucrop.util;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.sendbird.android.constant.StringSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
/* loaded from: classes5.dex */
public class FileUtils {
    private static final String TAG = "FileUtils";

    private FileUtils() {
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static boolean isGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r8 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r8 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getDataColumn(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L2e java.lang.IllegalArgumentException -> L30
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2e java.lang.IllegalArgumentException -> L30
            if (r8 == 0) goto L2b
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.IllegalArgumentException -> L29 java.lang.Throwable -> L52
            if (r9 == 0) goto L2b
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.IllegalArgumentException -> L29 java.lang.Throwable -> L52
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.IllegalArgumentException -> L29 java.lang.Throwable -> L52
            if (r8 == 0) goto L28
            r8.close()
        L28:
            return r9
        L29:
            r9 = move-exception
            goto L33
        L2b:
            if (r8 == 0) goto L51
            goto L4e
        L2e:
            r8 = move-exception
            goto L55
        L30:
            r8 = move-exception
            r9 = r8
            r8 = r7
        L33:
            java.util.Locale r10 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L52
            r11 = 1
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L52
            r0 = 0
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L52
            r11[r0] = r9     // Catch: java.lang.Throwable -> L52
            java.lang.String r9 = "FileUtils"
            java.lang.String r0 = "getDataColumn: _data - [%s]"
            java.lang.String r10 = java.lang.String.format(r10, r0, r11)     // Catch: java.lang.Throwable -> L52
            android.util.Log.i(r9, r10)     // Catch: java.lang.Throwable -> L52
            if (r8 == 0) goto L51
        L4e:
            r8.close()
        L51:
            return r7
        L52:
            r9 = move-exception
            r7 = r8
            r8 = r9
        L55:
            if (r7 == 0) goto L5a
            r7.close()
        L5a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.util.FileUtils.getDataColumn(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static String getPath(Context context, Uri uri) {
        Uri uri2 = null;
        if ((Build.VERSION.SDK_INT >= 19) && DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                }
            } else if (isDownloadsDocument(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                if (!TextUtils.isEmpty(documentId)) {
                    try {
                        return getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                    } catch (NumberFormatException e) {
                        Log.i(TAG, e.getMessage());
                        return null;
                    }
                }
            } else if (isMediaDocument(uri)) {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                String str = split2[0];
                if ("image".equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return getDataColumn(context, uri2, "_id=?", new String[]{split2[1]});
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            if (isGooglePhotosUri(uri)) {
                return uri.getLastPathSegment();
            }
            return getDataColumn(context, uri, null, null);
        } else if (StringSet.file.equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        }
        return null;
    }

    public static void copyFile(String str, String str2) throws IOException {
        Throwable th;
        FileChannel fileChannel;
        FileChannel channel;
        if (str.equalsIgnoreCase(str2)) {
            return;
        }
        FileChannel fileChannel2 = null;
        try {
            channel = new FileInputStream(new File(str)).getChannel();
        } catch (Throwable th2) {
            th = th2;
            fileChannel = null;
        }
        try {
            fileChannel2 = new FileOutputStream(new File(str2)).getChannel();
            channel.transferTo(0L, channel.size(), fileChannel2);
            channel.close();
            if (channel != null) {
                channel.close();
            }
            if (fileChannel2 != null) {
                fileChannel2.close();
            }
        } catch (Throwable th3) {
            th = th3;
            FileChannel fileChannel3 = fileChannel2;
            fileChannel2 = channel;
            fileChannel = fileChannel3;
            if (fileChannel2 != null) {
                fileChannel2.close();
            }
            if (fileChannel != null) {
                fileChannel.close();
            }
            throw th;
        }
    }
}

package o;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.sendbird.android.constant.StringSet;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
/* loaded from: classes6.dex */
public class getMaxVolume {
    public static String toString(Context context, Uri uri) {
        String values;
        Uri uri2 = null;
        if ((Build.VERSION.SDK_INT >= 19) && DocumentsContract.isDocumentUri(context, uri)) {
            if (toString(uri)) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                }
            } else if (values(uri)) {
                try {
                    String documentId = DocumentsContract.getDocumentId(uri);
                    if (documentId != null && documentId.startsWith("raw:/")) {
                        return Uri.parse(documentId).getPath();
                    }
                    return values(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                } catch (Exception unused) {
                    return null;
                }
            } else if (valueOf(uri)) {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                String str = split2[0];
                if ("image".equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return values(context, uri2, "_id=?", new String[]{split2[1]});
            } else if ("content".equalsIgnoreCase(uri.getScheme())) {
                if (ag$a(uri)) {
                    return uri.getLastPathSegment();
                }
                return values(context, uri, null, null);
            } else {
                try {
                    InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                    if (openInputStream != null && (values = values(context.getContentResolver(), uri)) != null) {
                        File file = new File(context.getCacheDir(), values);
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[1024];
                        while (openInputStream.read(bArr) > 0) {
                            fileOutputStream.write(bArr);
                        }
                        fileOutputStream.close();
                        openInputStream.close();
                        return file.getAbsolutePath();
                    }
                } catch (Exception e) {
                    getCurrentVolume.ah$a(e.toString());
                    return null;
                }
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            if (ag$a(uri)) {
                return uri.getLastPathSegment();
            }
            return values(context, uri, null, null);
        } else if (StringSet.file.equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        }
        return null;
    }

    private static String values(ContentResolver contentResolver, Uri uri) {
        Cursor query = contentResolver.query(uri, null, null, null, null);
        query.moveToFirst();
        int columnIndex = query.getColumnIndex("_display_name");
        if (columnIndex >= 0) {
            String string = query.getString(columnIndex);
            query.close();
            return string;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String values(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            if (r8 == 0) goto L26
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L3a
            if (r9 == 0) goto L26
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L3a
            java.lang.String r7 = r8.getString(r9)     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L3a
            goto L26
        L24:
            r9 = move-exception
            goto L31
        L26:
            if (r8 == 0) goto L2b
            r8.close()
        L2b:
            return r7
        L2c:
            r8 = move-exception
            goto L3d
        L2e:
            r8 = move-exception
            r9 = r8
            r8 = r7
        L31:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L3a
            if (r8 == 0) goto L39
            r8.close()
        L39:
            return r7
        L3a:
            r9 = move-exception
            r7 = r8
            r8 = r9
        L3d:
            if (r7 == 0) goto L42
            r7.close()
        L42:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getMaxVolume.values(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static boolean toString(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean values(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean valueOf(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static boolean ag$a(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }
}

package o;

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
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes5.dex */
public class onDestructiveMigration {
    onDestructiveMigration() {
    }

    public static String ah$a(Context context, Uri uri) throws IOException {
        String[] split;
        Uri uri2 = null;
        if ((Build.VERSION.SDK_INT == 19) && DocumentsContract.isDocumentUri(context, uri)) {
            if (ag$a(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                if ("primary".equalsIgnoreCase(documentId.split(":")[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                }
                int indexOf = documentId.indexOf(58, 1);
                String substring = documentId.substring(0, indexOf);
                String substring2 = documentId.substring(indexOf + 1);
                String values = values(context, substring);
                if (values != null) {
                    String str = values + "/" + substring2;
                    File file = new File(str);
                    if (file.exists() && file.canRead()) {
                        return str;
                    }
                    return null;
                }
            } else if (values(uri)) {
                return values(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
            } else {
                if (toString(uri)) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str2 = split2[0];
                    if ("image".equals(str2)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str2)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str2)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return values(context, uri2, "_id=?", new String[]{split2[1]});
                }
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            if (ah$a(uri)) {
                return uri.getLastPathSegment();
            }
            return values(context, uri, null, null);
        } else if (StringSet.file.equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        }
        return null;
    }

    private static File values(Context context, String str, Uri uri) {
        String str2 = context.getCacheDir() + "/react-native-image-crop-picker";
        new File(str2).mkdir();
        File file = new File(new File(str2), str.substring(str.lastIndexOf(47) + 1));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[8192];
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            while (true) {
                int read = openInputStream.read(bArr, 0, 8192);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
                fileOutputStream.flush();
            }
            fileOutputStream.close();
            openInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }

    private static String values(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data", "_display_name"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        int columnIndex = query.getColumnIndex("_data");
                        if ((columnIndex > -1 ? query.getString(columnIndex) : null) != null) {
                            String string = query.getString(columnIndex);
                            if (query != null) {
                                query.close();
                            }
                            return string;
                        }
                        String absolutePath = values(context, query.getString(query.getColumnIndexOrThrow("_display_name")), uri).getAbsolutePath();
                        if (query != null) {
                            query.close();
                        }
                        return absolutePath;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean ag$a(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    private static boolean values(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    private static boolean toString(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    private static boolean ah$a(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    private static String values(Context context, String str) {
        String absolutePath;
        int indexOf;
        File[] externalCacheDirs = context.getExternalCacheDirs();
        if (externalCacheDirs != null) {
            for (File file : externalCacheDirs) {
                if (file != null && (absolutePath = file.getAbsolutePath()) != null && (indexOf = absolutePath.indexOf(str)) != -1) {
                    return absolutePath.substring(0, indexOf) + str;
                }
            }
            return null;
        }
        return null;
    }
}

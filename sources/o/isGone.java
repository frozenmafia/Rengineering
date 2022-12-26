package o;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* loaded from: classes3.dex */
class isGone {
    private static final getMarginLeft ah$a = new getMarginLeft();
    private final ContentResolver ag$a;
    private final getMarginLeft ah$b;
    private final List<ImageHeaderParser> toString;
    private final getMarginTop valueOf;
    private final rotationXBy values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public isGone(List<ImageHeaderParser> list, getMarginTop getmargintop, rotationXBy rotationxby, ContentResolver contentResolver) {
        this(list, ah$a, getmargintop, rotationxby, contentResolver);
    }

    isGone(List<ImageHeaderParser> list, getMarginLeft getmarginleft, getMarginTop getmargintop, rotationXBy rotationxby, ContentResolver contentResolver) {
        this.ah$b = getmarginleft;
        this.valueOf = getmargintop;
        this.values = rotationxby;
        this.ag$a = contentResolver;
        this.toString = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int values(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.ag$a.openInputStream(uri);
                int ah$a2 = setTransitionGroup.ah$a(this.toString, inputStream, this.values);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return ah$a2;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException | NullPointerException e) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            }
            return -1;
        }
    }

    public InputStream ag$a(Uri uri) throws FileNotFoundException {
        String ah$a2 = ah$a(uri);
        if (TextUtils.isEmpty(ah$a2)) {
            return null;
        }
        File getmarginleft = this.ah$b.toString(ah$a2);
        if (ah$a(getmarginleft)) {
            Uri fromFile = Uri.fromFile(getmarginleft);
            try {
                return this.ag$a.openInputStream(fromFile);
            } catch (NullPointerException e) {
                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
            }
        }
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x001d: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:12:0x001d */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String ah$a(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            o.getMarginTop r2 = r6.valueOf     // Catch: java.lang.Throwable -> L27 java.lang.SecurityException -> L29
            android.database.Cursor r2 = r2.values(r7)     // Catch: java.lang.Throwable -> L27 java.lang.SecurityException -> L29
            if (r2 == 0) goto L21
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L1c java.lang.SecurityException -> L1f
            if (r3 == 0) goto L21
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch: java.lang.Throwable -> L1c java.lang.SecurityException -> L1f
            if (r2 == 0) goto L1b
            r2.close()
        L1b:
            return r7
        L1c:
            r7 = move-exception
            r1 = r2
            goto L4d
        L1f:
            r3 = move-exception
            goto L2c
        L21:
            if (r2 == 0) goto L26
            r2.close()
        L26:
            return r1
        L27:
            r7 = move-exception
            goto L4d
        L29:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L2c:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L47
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r4.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L1c
            r4.append(r7)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L1c
            android.util.Log.d(r0, r7, r3)     // Catch: java.lang.Throwable -> L1c
        L47:
            if (r2 == 0) goto L4c
            r2.close()
        L4c:
            return r1
        L4d:
            if (r1 == 0) goto L52
            r1.close()
        L52:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isGone.ah$a(android.net.Uri):java.lang.String");
    }

    private boolean ah$a(File file) {
        return this.ah$b.ag$a(file) && 0 < this.ah$b.valueOf(file);
    }
}

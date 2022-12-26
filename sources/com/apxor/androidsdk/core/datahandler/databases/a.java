package com.apxor.androidsdk.core.datahandler.databases;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import o.isAfterLast;
@Deprecated
/* loaded from: classes3.dex */
public class a extends SQLiteOpenHelper {
    private static final String a = "a";
    private static int ag$a = 1;
    private static int toString;
    private static int valueOf;

    static {
        values();
        try {
            int i = ag$a + 125;
            toString = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.pm.ApplicationInfo r1 = r4.getApplicationInfo()     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = r1.dataDir     // Catch: java.lang.Exception -> L22
            r0.append(r1)     // Catch: java.lang.Exception -> L22
            java.lang.String r1 = "/ApxUserDatabases/"
            r0.append(r1)     // Catch: java.lang.Exception -> L22
            java.lang.String r1 = "ApxUserDB"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2 = 6
            r3.<init>(r4, r0, r1, r2)
            return
        L22:
            r4 = move-exception
            throw r4
        L24:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.datahandler.databases.a.<init>(android.content.Context):void");
    }

    static void values() {
        valueOf = 9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
        if (r11 == null) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5 A[Catch: all -> 0x00d6, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:3:0x0001, B:27:0x00a5, B:45:0x00c6, B:49:0x00cd, B:51:0x00d2, B:52:0x00d5, B:43:0x00c1), top: B:58:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #3 {, blocks: (B:3:0x0001, B:27:0x00a5, B:45:0x00c6, B:49:0x00cd, B:51:0x00d2, B:52:0x00d5, B:43:0x00c1), top: B:58:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #3 {, blocks: (B:3:0x0001, B:27:0x00a5, B:45:0x00c6, B:49:0x00cd, B:51:0x00d2, B:52:0x00d5, B:43:0x00c1), top: B:58:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2 A[Catch: all -> 0x00d6, TryCatch #3 {, blocks: (B:3:0x0001, B:27:0x00a5, B:45:0x00c6, B:49:0x00cd, B:51:0x00d2, B:52:0x00d5, B:43:0x00c1), top: B:58:0x0001 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.database.sqlite.SQLiteDatabase, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.apxor.androidsdk.core.Attributes a() {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.datahandler.databases.a.a():com.apxor.androidsdk.core.Attributes");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            int i = ag$a + 101;
            toString = i % 128;
            if (i % 2 != 0) {
                int i2 = 74 / 0;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = ag$a + 11;
        toString = i3 % 128;
        if ((i3 % 2 != 0 ? 'H' : ']') != ']') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    private static String toString(int i, int i2, boolean z, int i3, char[] cArr) {
        String str;
        synchronized (isAfterLast.valueOf) {
            char[] cArr2 = new char[i3];
            isAfterLast.values = 0;
            while (isAfterLast.values < i3) {
                isAfterLast.ag$a = cArr[isAfterLast.values];
                cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                int i4 = isAfterLast.values;
                cArr2[i4] = (char) (cArr2[i4] - valueOf);
                isAfterLast.values++;
            }
            if (i > 0) {
                isAfterLast.toString = i;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - isAfterLast.toString, isAfterLast.toString);
                System.arraycopy(cArr3, isAfterLast.toString, cArr2, 0, i3 - isAfterLast.toString);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                isAfterLast.values = 0;
                while (isAfterLast.values < i3) {
                    cArr4[isAfterLast.values] = cArr2[(i3 - isAfterLast.values) - 1];
                    isAfterLast.values++;
                }
                cArr2 = cArr4;
            }
            str = new String(cArr2);
        }
        return str;
    }
}

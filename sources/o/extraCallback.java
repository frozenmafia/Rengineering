package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import o.HaptikSDK$a;
/* loaded from: classes.dex */
public abstract class extraCallback<K extends HaptikSDK$a> {
    private static final String toString = "al";
    static final /* synthetic */ boolean values = true;
    protected SQLiteDatabase ag$a;

    public extraCallback(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            throw new IllegalArgumentException("database can't be null!");
        }
        this.ag$a = sQLiteDatabase;
    }

    private static String valueOf(String[] strArr, String[] strArr2) throws IllegalArgumentException {
        String str;
        if (strArr == null && strArr2 == null) {
            return null;
        }
        if (strArr == null || strArr2 == null) {
            throw new IllegalArgumentException("Both arguments have to be either null or not null!");
        }
        if (strArr.length == strArr2.length) {
            int i = 0;
            String str2 = "";
            while (i < strArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(strArr[i]);
                if (strArr2[i] == null) {
                    str = " IS NULL";
                } else {
                    str = " = '" + strArr2[i] + "'";
                }
                sb.append(str);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(i != strArr.length + (-1) ? " AND " : "");
                str2 = sb3.toString();
                i++;
            }
            return str2;
        }
        throw new IllegalArgumentException("selectionFields and selectionValues differ in length!");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r1 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<K> values(java.lang.String[] r11, java.lang.String[] r12) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.String r5 = valueOf(r11, r12)     // Catch: java.lang.Throwable -> L3f java.lang.IllegalArgumentException -> L41
            android.database.sqlite.SQLiteDatabase r2 = r10.ag$a     // Catch: java.lang.Throwable -> L3f java.lang.IllegalArgumentException -> L41
            java.lang.String r3 = r10.HaptikSDK$b()     // Catch: java.lang.Throwable -> L3f java.lang.IllegalArgumentException -> L41
            java.lang.String[] r4 = r10.ah$a()     // Catch: java.lang.Throwable -> L3f java.lang.IllegalArgumentException -> L41
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3f java.lang.IllegalArgumentException -> L41
            if (r1 == 0) goto L3c
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L3f java.lang.IllegalArgumentException -> L41
        L21:
            boolean r11 = r1.isAfterLast()     // Catch: java.lang.Throwable -> L3f java.lang.IllegalArgumentException -> L41
            if (r11 != 0) goto L3c
            o.HaptikSDK$a r11 = r10.ah$a(r1)     // Catch: java.lang.Throwable -> L3f java.lang.IllegalArgumentException -> L41
            if (r11 == 0) goto L34
            r0.add(r11)     // Catch: java.lang.Throwable -> L3f java.lang.IllegalArgumentException -> L41
            r1.moveToNext()     // Catch: java.lang.Throwable -> L3f java.lang.IllegalArgumentException -> L41
            goto L21
        L34:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3f java.lang.IllegalArgumentException -> L41
            java.lang.String r12 = "cursor contains invalid object!"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L3f java.lang.IllegalArgumentException -> L41
            throw r11     // Catch: java.lang.Throwable -> L3f java.lang.IllegalArgumentException -> L41
        L3c:
            if (r1 == 0) goto L66
            goto L63
        L3f:
            r11 = move-exception
            goto L67
        L41:
            r11 = move-exception
            java.lang.String r12 = r10.values()     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r2.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = ""
            r2.append(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = r11.getMessage()     // Catch: java.lang.Throwable -> L3f
            r2.append(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3f
            o.putEncryptedObject.values(r12, r2, r11)     // Catch: java.lang.Throwable -> L3f
            r0.clear()     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L66
        L63:
            r1.close()
        L66:
            return r0
        L67:
            if (r1 == 0) goto L6c
            r1.close()
        L6c:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.extraCallback.values(java.lang.String[], java.lang.String[]):java.util.List");
    }

    public abstract String HaptikSDK$b();

    public int ag$a(String[] strArr, String[] strArr2) {
        try {
            return this.ag$a.delete(HaptikSDK$b(), valueOf(strArr, strArr2), null);
        } catch (IllegalArgumentException e) {
            String values2 = values();
            putEncryptedObject.values(values2, "" + e.getMessage(), e);
            return 0;
        }
    }

    public List<K> ag$a() {
        return values((String[]) null, (String[]) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public K ag$a(String str, String str2) {
        return toString(new String[]{str}, new String[]{str2});
    }

    public abstract K ah$a(Cursor cursor);

    public boolean ah$a(long j) {
        SQLiteDatabase sQLiteDatabase = this.ag$a;
        String HaptikSDK$b = HaptikSDK$b();
        StringBuilder sb = new StringBuilder();
        sb.append("rowid = ");
        sb.append(j);
        return sQLiteDatabase.delete(HaptikSDK$b, sb.toString(), null) == 1;
    }

    public abstract String[] ah$a();

    /* JADX INFO: Access modifiers changed from: protected */
    public List<K> toString(String str, String str2) {
        return values(new String[]{str}, new String[]{str2});
    }

    public K toString(long j) {
        return toString(new String[]{"rowid"}, new String[]{"" + j});
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r10 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
        return (K) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r10 != null) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [K extends o.HaptikSDK$a] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K toString(java.lang.String[] r10, java.lang.String[] r11) {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r4 = valueOf(r10, r11)     // Catch: java.lang.Throwable -> L27 java.lang.IllegalArgumentException -> L29
            android.database.sqlite.SQLiteDatabase r1 = r9.ag$a     // Catch: java.lang.Throwable -> L27 java.lang.IllegalArgumentException -> L29
            java.lang.String r2 = r9.HaptikSDK$b()     // Catch: java.lang.Throwable -> L27 java.lang.IllegalArgumentException -> L29
            java.lang.String[] r3 = r9.ah$a()     // Catch: java.lang.Throwable -> L27 java.lang.IllegalArgumentException -> L29
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L27 java.lang.IllegalArgumentException -> L29
            if (r10 == 0) goto L24
            r10.moveToFirst()     // Catch: java.lang.IllegalArgumentException -> L22 java.lang.Throwable -> L4e
            o.HaptikSDK$a r11 = r9.ah$a(r10)     // Catch: java.lang.IllegalArgumentException -> L22 java.lang.Throwable -> L4e
            r0 = r11
            goto L24
        L22:
            r11 = move-exception
            goto L2c
        L24:
            if (r10 == 0) goto L4d
            goto L4a
        L27:
            r10 = move-exception
            goto L51
        L29:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L2c:
            java.lang.String r1 = r9.values()     // Catch: java.lang.Throwable -> L4e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r2.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = ""
            r2.append(r3)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = r11.getMessage()     // Catch: java.lang.Throwable -> L4e
            r2.append(r3)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4e
            o.putEncryptedObject.values(r1, r2, r11)     // Catch: java.lang.Throwable -> L4e
            if (r10 == 0) goto L4d
        L4a:
            r10.close()
        L4d:
            return r0
        L4e:
            r11 = move-exception
            r0 = r10
            r10 = r11
        L51:
            if (r0 == 0) goto L56
            r0.close()
        L56:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.extraCallback.toString(java.lang.String[], java.lang.String[]):o.HaptikSDK$a");
    }

    public int valueOf() {
        return ag$a((String[]) null, (String[]) null);
    }

    public long valueOf(K k) {
        if (k == null) {
            return -1L;
        }
        putEncryptedObject.ag$a(toString, "Insert Row table=" + HaptikSDK$b(), "vals=" + k.valueOf());
        long insert = this.ag$a.insert(HaptikSDK$b(), null, k.valueOf());
        k.ag$a(insert);
        return insert;
    }

    public int values(Cursor cursor, int i) throws IllegalArgumentException {
        if (values || cursor != null) {
            if (i < 0 || i >= ah$a().length) {
                throw new IllegalArgumentException("colIndex is out of bound!");
            }
            return cursor.getColumnIndexOrThrow(ah$a()[i]);
        }
        throw new AssertionError();
    }

    public abstract String values();

    public boolean values(long j, ContentValues contentValues) {
        if (contentValues == null) {
            return false;
        }
        SQLiteDatabase sQLiteDatabase = this.ag$a;
        String HaptikSDK$b = HaptikSDK$b();
        StringBuilder sb = new StringBuilder();
        sb.append("rowid = ");
        sb.append(j);
        return sQLiteDatabase.update(HaptikSDK$b, contentValues, sb.toString(), null) == 1;
    }
}

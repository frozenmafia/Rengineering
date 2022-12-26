package o;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import androidx.work.WorkRequest;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class getDeltaY extends SQLiteOpenHelper {
    private static char[] HaptikSDK$c = {'4', 'f'};
    private static getDeltaY ag$a = null;
    private static int ah$b = 1;
    private static int invoke;
    private static CompoundButtonCompat values;
    private SQLiteStatement HaptikSDK$a;
    private SQLiteStatement HaptikSDK$b;
    private SQLiteDatabase ah$a;
    private SQLiteStatement toString;
    private SQLiteStatement valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private getDeltaY() {
        super(setMinimumVelocity.values(), "hbdict.db", (SQLiteDatabase.CursorFactory) null, 1);
        Object[] objArr = null;
        this.ah$a = null;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.ah$a = writableDatabase;
            this.HaptikSDK$b = writableDatabase.compileStatement(" DROP TABLE IF EXISTS hbinfos");
            this.HaptikSDK$a = this.ah$a.compileStatement(" INSERT INTO hbinfos (hb)   VALUES( ? )");
            this.valueOf = this.ah$a.compileStatement("DELETE FROM hbinfos WHERE id =?");
        } catch (Exception e) {
            CompoundButtonCompat compoundButtonCompat = values;
            if (compoundButtonCompat != null) {
                try {
                    try {
                        compoundButtonCompat.toString(e.getLocalizedMessage());
                    } catch (Exception e2) {
                        throw e2;
                    }
                } catch (Exception e3) {
                    throw e3;
                }
            }
        }
        int i = ah$b + 51;
        invoke = i % 128;
        if (!(i % 2 == 0)) {
            int length = objArr.length;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static getDeltaY toString(CompoundButtonCompat compoundButtonCompat) {
        getDeltaY getdeltay;
        synchronized (getDeltaY.class) {
            if (ag$a == null) {
                values = compoundButtonCompat;
                ag$a = new getDeltaY();
            }
            getdeltay = ag$a;
        }
        return getdeltay;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!(sQLiteDatabase == null)) {
            int i = ah$b + 57;
            invoke = i % 128;
            try {
                if (i % 2 != 0) {
                    this.ah$a = sQLiteDatabase;
                    SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(" CREATE TABLE IF NOT EXISTS hbinfos(id INTEGER PRIMARY KEY AUTOINCREMENT, hb TEXT )");
                    this.toString = compileStatement;
                    compileStatement.execute();
                    Object[] objArr = null;
                    int length = objArr.length;
                } else {
                    this.ah$a = sQLiteDatabase;
                    SQLiteStatement compileStatement2 = sQLiteDatabase.compileStatement(" CREATE TABLE IF NOT EXISTS hbinfos(id INTEGER PRIMARY KEY AUTOINCREMENT, hb TEXT )");
                    this.toString = compileStatement2;
                    compileStatement2.execute();
                }
                try {
                    int i2 = invoke + 17;
                    ah$b = i2 % 128;
                    int i3 = i2 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (SQLException e2) {
                CompoundButtonCompat compoundButtonCompat = values;
                if (compoundButtonCompat != null) {
                    try {
                        compoundButtonCompat.toString(e2.getLocalizedMessage());
                    } catch (Exception e3) {
                        throw e3;
                    }
                }
            } catch (Exception e4) {
                CompoundButtonCompat compoundButtonCompat2 = values;
                if (compoundButtonCompat2 != null) {
                    compoundButtonCompat2.toString(e4.getLocalizedMessage());
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if ((sQLiteDatabase != null ? '9' : (char) 30) == '9') {
            int i3 = invoke + 13;
            ah$b = i3 % 128;
            int i4 = i3 % 2;
            try {
                this.HaptikSDK$b.execute();
                onCreate(sQLiteDatabase);
            } catch (SQLException e) {
                CompoundButtonCompat compoundButtonCompat = values;
                if (compoundButtonCompat != null) {
                    try {
                        compoundButtonCompat.toString(e.getLocalizedMessage());
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
            }
        }
        int i5 = ah$b + 19;
        invoke = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(String str) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.ah$a = writableDatabase;
        if ((writableDatabase != null ? (char) 19 : '\t') != 19) {
            return;
        }
        int i = invoke + 7;
        ah$b = i % 128;
        int i2 = i % 2;
        try {
            try {
                if (ah$b() >= WorkRequest.MIN_BACKOFF_MILLIS) {
                    ag$a();
                    int i3 = invoke + 73;
                    ah$b = i3 % 128;
                    int i4 = i3 % 2;
                }
                if ((str != null ? (char) 1 : (char) 23) != 23) {
                    this.HaptikSDK$a.bindString(1, str);
                    this.HaptikSDK$a.executeInsert();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (SQLException e2) {
            CompoundButtonCompat compoundButtonCompat = values;
            if (compoundButtonCompat != null) {
                compoundButtonCompat.toString(e2.getLocalizedMessage());
            }
        } catch (IllegalStateException e3) {
            CompoundButtonCompat compoundButtonCompat2 = values;
            if (compoundButtonCompat2 != null) {
                try {
                    compoundButtonCompat2.toString(e3.getLocalizedMessage());
                } catch (Exception e4) {
                    throw e4;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r2 != null) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long ah$b() {
        /*
            r6 = this;
            int r0 = o.getDeltaY.ah$b
            int r0 = r0 + 23
            int r1 = r0 % 128
            o.getDeltaY.invoke = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L1e
            r0 = 1
            android.database.sqlite.SQLiteDatabase r2 = r6.getWritableDatabase()     // Catch: java.lang.IllegalStateException -> L4b android.database.SQLException -> L5a
            r6.ah$a = r2     // Catch: java.lang.IllegalStateException -> L4b android.database.SQLException -> L5a
            r3 = 5
            if (r2 == 0) goto L19
            r4 = 5
            goto L1b
        L19:
            r4 = 72
        L1b:
            if (r4 == r3) goto L28
            goto L66
        L1e:
            r0 = 0
            android.database.sqlite.SQLiteDatabase r2 = r6.getWritableDatabase()     // Catch: java.lang.IllegalStateException -> L4b android.database.SQLException -> L5a
            r6.ah$a = r2     // Catch: java.lang.IllegalStateException -> L4b android.database.SQLException -> L5a
            if (r2 == 0) goto L66
        L28:
            int r3 = o.getDeltaY.invoke
            int r3 = r3 + 97
            int r4 = r3 % 128
            o.getDeltaY.ah$b = r4
            int r3 = r3 % 2
            r4 = 1
            if (r3 != 0) goto L37
            r3 = 1
            goto L38
        L37:
            r3 = 0
        L38:
            java.lang.String r5 = "hbinfos"
            if (r3 == r4) goto L41
            long r0 = android.database.DatabaseUtils.queryNumEntries(r2, r5)     // Catch: java.lang.IllegalStateException -> L4b android.database.SQLException -> L5a
            goto L66
        L41:
            long r2 = android.database.DatabaseUtils.queryNumEntries(r2, r5)     // Catch: java.lang.IllegalStateException -> L4b android.database.SQLException -> L5a
            r4 = 0
            int r0 = r4.length     // Catch: java.lang.Throwable -> L49 java.lang.IllegalStateException -> L4b android.database.SQLException -> L5a
            r0 = r2
            goto L66
        L49:
            r0 = move-exception
            throw r0
        L4b:
            r2 = move-exception
            o.CompoundButtonCompat r3 = o.getDeltaY.values
            if (r3 == 0) goto L66
            java.lang.String r2 = r2.getLocalizedMessage()     // Catch: java.lang.Exception -> L58
            r3.toString(r2)     // Catch: java.lang.Exception -> L58
            goto L66
        L58:
            r0 = move-exception
            throw r0
        L5a:
            r2 = move-exception
            o.CompoundButtonCompat r3 = o.getDeltaY.values
            if (r3 == 0) goto L66
            java.lang.String r2 = r2.getLocalizedMessage()
            r3.toString(r2)
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDeltaY.ah$b():long");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        if ((r1.getCount() <= 0) != true) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String valueOf() {
        /*
            r6 = this;
            int r0 = o.getDeltaY.ah$b
            int r0 = r0 + 3
            int r1 = r0 % 128
            o.getDeltaY.invoke = r1
            int r0 = r0 % 2
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r6.getWritableDatabase()     // Catch: android.database.SQLException -> L65
            r6.ah$a = r1     // Catch: android.database.SQLException -> L65
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L17
            r4 = 1
            goto L18
        L17:
            r4 = 0
        L18:
            if (r4 == r3) goto L1b
            goto L76
        L1b:
            int r4 = o.getDeltaY.invoke     // Catch: java.lang.Exception -> L72
            int r4 = r4 + 77
            int r5 = r4 % 128
            o.getDeltaY.ah$b = r5     // Catch: java.lang.Exception -> L72
            int r4 = r4 % 2
            if (r4 != 0) goto L29
            r4 = 1
            goto L2a
        L29:
            r4 = 0
        L2a:
            java.lang.String r5 = " SELECT * FROM hbinfos ORDER BY id ASC LIMIT 1"
            if (r4 == r3) goto L39
            android.database.Cursor r1 = r1.rawQuery(r5, r0)     // Catch: android.database.SQLException -> L65
            int r2 = r1.getCount()     // Catch: android.database.SQLException -> L65
            if (r2 <= 0) goto L5f
            goto L4a
        L39:
            android.database.Cursor r1 = r1.rawQuery(r5, r0)     // Catch: android.database.SQLException -> L65
            int r4 = r1.getCount()     // Catch: android.database.SQLException -> L65
            r5 = 48
            int r5 = r5 / r2
            if (r4 <= 0) goto L47
            goto L48
        L47:
            r2 = 1
        L48:
            if (r2 == r3) goto L5f
        L4a:
            boolean r2 = r1.moveToFirst()     // Catch: android.database.SQLException -> L65
            r4 = 33
            if (r2 == 0) goto L55
            r2 = 33
            goto L57
        L55:
            r2 = 53
        L57:
            if (r2 == r4) goto L5a
            goto L5f
        L5a:
            java.lang.String r0 = r1.getString(r3)     // Catch: android.database.SQLException -> L65
            return r0
        L5f:
            r1.close()     // Catch: android.database.SQLException -> L65
            goto L76
        L63:
            r0 = move-exception
            throw r0
        L65:
            r1 = move-exception
            o.CompoundButtonCompat r2 = o.getDeltaY.values
            if (r2 == 0) goto L76
            java.lang.String r1 = r1.getLocalizedMessage()     // Catch: java.lang.Exception -> L74
            r2.toString(r1)     // Catch: java.lang.Exception -> L72
            goto L76
        L72:
            r0 = move-exception
            throw r0
        L74:
            r0 = move-exception
            throw r0
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDeltaY.valueOf():java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a() {
        SQLiteDatabase writableDatabase;
        SQLiteStatement sQLiteStatement;
        int i = ah$b + 75;
        invoke = i % 128;
        try {
            if (!(i % 2 != 0)) {
                writableDatabase = getWritableDatabase();
                this.ah$a = writableDatabase;
                if ((writableDatabase != null ? 'P' : '_') != 'P') {
                    return;
                }
            } else {
                writableDatabase = getWritableDatabase();
                this.ah$a = writableDatabase;
                int i2 = 24 / 0;
                if (writableDatabase == null) {
                    return;
                }
            }
            Cursor query = writableDatabase.query("hbinfos", null, null, null, null, null, null);
            if (query.moveToFirst()) {
                int i3 = invoke + 93;
                ah$b = i3 % 128;
                if (i3 % 2 != 0) {
                    this.valueOf.bindString(1, query.getString(query.getColumnIndex(toString(true, new int[]{0, 2, 0, 1}, new byte[]{1, 1}).intern())));
                    sQLiteStatement = this.valueOf;
                } else {
                    this.valueOf.bindString(1, query.getString(query.getColumnIndex(toString(true, new int[]{0, 2, 0, 1}, new byte[]{1, 1}).intern())));
                    sQLiteStatement = this.valueOf;
                }
                sQLiteStatement.executeUpdateDelete();
            }
            query.close();
        } catch (SQLException e) {
            CompoundButtonCompat compoundButtonCompat = values;
            if (compoundButtonCompat != null) {
                compoundButtonCompat.toString(e.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean values() {
        /*
            r6 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r2 = r6.getWritableDatabase()     // Catch: java.lang.Exception -> L25
            r6.ah$a = r2     // Catch: java.lang.Exception -> L25
            r3 = 94
            if (r2 == 0) goto Lf
            r4 = 94
            goto L11
        Lf:
            r4 = 86
        L11:
            if (r4 == r3) goto L14
            goto L31
        L14:
            int r3 = o.getDeltaY.invoke
            int r3 = r3 + 91
            int r4 = r3 % 128
            o.getDeltaY.ah$b = r4
            int r3 = r3 % 2
            java.lang.String r3 = "hbinfos"
            long r2 = android.database.DatabaseUtils.queryNumEntries(r2, r3)     // Catch: java.lang.Exception -> L25
            goto L32
        L25:
            r2 = move-exception
            o.CompoundButtonCompat r3 = o.getDeltaY.values
            if (r3 == 0) goto L31
            java.lang.String r2 = r2.getLocalizedMessage()
            r3.toString(r2)
        L31:
            r2 = r0
        L32:
            r4 = 39
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 > 0) goto L3b
            r0 = 96
            goto L3d
        L3b:
            r0 = 39
        L3d:
            if (r0 == r4) goto L4b
            r0 = 1
            int r1 = o.getDeltaY.invoke
            int r1 = r1 + 101
            int r2 = r1 % 128
            o.getDeltaY.ah$b = r2
            int r1 = r1 % 2
            goto L4c
        L4b:
            r0 = 0
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDeltaY.values():boolean");
    }

    public void ah$a() {
        int i = ah$b + 27;
        invoke = i % 128;
        int i2 = i % 2;
        CompoundButtonCompat compoundButtonCompat = values;
        if (compoundButtonCompat != null) {
            compoundButtonCompat.ah$a("Database cleanup");
            int i3 = invoke + 89;
            ah$b = i3 % 128;
            int i4 = i3 % 2;
        }
        SQLiteDatabase sQLiteDatabase = this.ah$a;
        Object[] objArr = null;
        if (sQLiteDatabase != null) {
            int i5 = invoke + 9;
            ah$b = i5 % 128;
            if (!(i5 % 2 != 0)) {
                sQLiteDatabase.close();
                this.ah$a = null;
                int length = objArr.length;
            } else {
                sQLiteDatabase.close();
                this.ah$a = null;
            }
            int i6 = ah$b + 43;
            invoke = i6 % 128;
            int i7 = i6 % 2;
        }
        try {
            ag$a = null;
            values = null;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String toString(boolean z, int[] iArr, byte[] bArr) {
        String str;
        synchronized (isClosed.ah$a) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(HaptikSDK$c, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                isClosed.ag$a = 0;
                char c = 0;
                while (isClosed.ag$a < i2) {
                    if (bArr[isClosed.ag$a] == 1) {
                        cArr2[isClosed.ag$a] = (char) (((cArr[isClosed.ag$a] << 1) + 1) - c);
                    } else {
                        cArr2[isClosed.ag$a] = (char) ((cArr[isClosed.ag$a] << 1) - c);
                    }
                    c = cArr2[isClosed.ag$a];
                    isClosed.ag$a++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr4[isClosed.ag$a] = cArr[(i2 - isClosed.ag$a) - 1];
                    isClosed.ag$a++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr[isClosed.ag$a] = (char) (cArr[isClosed.ag$a] - iArr[2]);
                    isClosed.ag$a++;
                }
            }
            str = new String(cArr);
        }
        return str;
    }
}

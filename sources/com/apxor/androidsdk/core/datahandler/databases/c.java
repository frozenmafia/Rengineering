package com.apxor.androidsdk.core.datahandler.databases;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.apxor.androidsdk.core.Constants;
import com.apxor.androidsdk.core.utils.Logger;
import com.sendbird.android.constant.StringSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class c extends ApxorBaseSQLiteWrapper {

    /* renamed from: b  reason: collision with root package name */
    private static final String f262b = "c";

    public c(Context context, String str) {
        super(context, str, null, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a A[Catch: RuntimeException -> 0x0078, SQLiteException | IllegalStateException -> 0x009d, all -> 0x00b6, TRY_ENTER, TryCatch #10 {SQLiteException | IllegalStateException -> 0x009d, RuntimeException -> 0x0078, blocks: (B:8:0x0050, B:10:0x0056, B:12:0x005c, B:19:0x0068, B:21:0x006e, B:23:0x0074, B:34:0x008a, B:36:0x0090, B:38:0x0096), top: B:59:0x0006, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(org.json.JSONObject r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r9 != 0) goto L5
            monitor-exit(r8)
            return
        L5:
            r0 = 0
            android.database.sqlite.SQLiteDatabase r0 = r8.getWritableDatabase()     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62 java.lang.IllegalStateException -> L7a android.database.sqlite.SQLiteException -> L7c org.json.JSONException -> L7e
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62 java.lang.IllegalStateException -> L7a android.database.sqlite.SQLiteException -> L7c org.json.JSONException -> L7e
            java.lang.String r1 = "date"
            long r1 = r9.getLong(r1)     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62 java.lang.IllegalStateException -> L7a android.database.sqlite.SQLiteException -> L7c org.json.JSONException -> L7e
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62 java.lang.IllegalStateException -> L7a android.database.sqlite.SQLiteException -> L7c org.json.JSONException -> L7e
            java.lang.String r2 = "operand"
            java.lang.String r2 = r9.getString(r2)     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62 java.lang.IllegalStateException -> L7a android.database.sqlite.SQLiteException -> L7c org.json.JSONException -> L7e
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62 java.lang.IllegalStateException -> L7a android.database.sqlite.SQLiteException -> L7c org.json.JSONException -> L7e
            r3.<init>()     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62 java.lang.IllegalStateException -> L7a android.database.sqlite.SQLiteException -> L7c org.json.JSONException -> L7e
            java.lang.String r4 = "date"
            r3.put(r4, r1)     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62 java.lang.IllegalStateException -> L7a android.database.sqlite.SQLiteException -> L7c org.json.JSONException -> L7e
            java.lang.String r4 = "operand"
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62 java.lang.IllegalStateException -> L7a android.database.sqlite.SQLiteException -> L7c org.json.JSONException -> L7e
            java.lang.String r4 = "count"
            java.lang.String r5 = "count"
            r6 = 1
            long r5 = r9.optLong(r5, r6)     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62 java.lang.IllegalStateException -> L7a android.database.sqlite.SQLiteException -> L7c org.json.JSONException -> L7e
            java.lang.Long r9 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62 java.lang.IllegalStateException -> L7a android.database.sqlite.SQLiteException -> L7c org.json.JSONException -> L7e
            r3.put(r4, r9)     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62 java.lang.IllegalStateException -> L7a android.database.sqlite.SQLiteException -> L7c org.json.JSONException -> L7e
            r9 = 2
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62 java.lang.IllegalStateException -> L7a android.database.sqlite.SQLiteException -> L7c org.json.JSONException -> L7e
            r4 = 0
            r9[r4] = r2     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62 java.lang.IllegalStateException -> L7a android.database.sqlite.SQLiteException -> L7c org.json.JSONException -> L7e
            r2 = 1
            r9[r2] = r1     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62 java.lang.IllegalStateException -> L7a android.database.sqlite.SQLiteException -> L7c org.json.JSONException -> L7e
            java.lang.String r1 = "h_data"
            java.lang.String r2 = "operand = ? AND date = ?"
            r8.incrementCountAndUpsertData(r1, r3, r2, r9)     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62 java.lang.IllegalStateException -> L7a android.database.sqlite.SQLiteException -> L7c org.json.JSONException -> L7e
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62 java.lang.IllegalStateException -> L7a android.database.sqlite.SQLiteException -> L7c org.json.JSONException -> L7e
            boolean r9 = r0.isOpen()     // Catch: java.lang.RuntimeException -> L78 java.lang.Throwable -> L9d java.lang.Throwable -> Lb6
            if (r9 == 0) goto L9d
            boolean r9 = r0.inTransaction()     // Catch: java.lang.RuntimeException -> L78 java.lang.Throwable -> L9d java.lang.Throwable -> Lb6
            if (r9 == 0) goto L9d
            r0.endTransaction()     // Catch: java.lang.RuntimeException -> L78 java.lang.Throwable -> L9d java.lang.Throwable -> Lb6
            goto L9d
        L60:
            r9 = move-exception
            goto L9f
        L62:
            r9 = move-exception
            r8.logErrorOrThrowException(r9)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L9d
            boolean r9 = r0.isOpen()     // Catch: java.lang.RuntimeException -> L78 java.lang.Throwable -> L9d java.lang.Throwable -> Lb6
            if (r9 == 0) goto L9d
            boolean r9 = r0.inTransaction()     // Catch: java.lang.RuntimeException -> L78 java.lang.Throwable -> L9d java.lang.Throwable -> Lb6
            if (r9 == 0) goto L9d
            r0.endTransaction()     // Catch: java.lang.RuntimeException -> L78 java.lang.Throwable -> L9d java.lang.Throwable -> Lb6
            goto L9d
        L78:
            r9 = move-exception
            goto L9a
        L7a:
            r9 = move-exception
            goto L7f
        L7c:
            r9 = move-exception
            goto L7f
        L7e:
            r9 = move-exception
        L7f:
            com.apxor.androidsdk.core.SDKController r1 = com.apxor.androidsdk.core.SDKController.getInstance()     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "hd"
            r1.logException(r2, r9)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L9d
            boolean r9 = r0.isOpen()     // Catch: java.lang.RuntimeException -> L78 java.lang.Throwable -> L9d java.lang.Throwable -> Lb6
            if (r9 == 0) goto L9d
            boolean r9 = r0.inTransaction()     // Catch: java.lang.RuntimeException -> L78 java.lang.Throwable -> L9d java.lang.Throwable -> Lb6
            if (r9 == 0) goto L9d
            r0.endTransaction()     // Catch: java.lang.RuntimeException -> L78 java.lang.Throwable -> L9d java.lang.Throwable -> Lb6
            goto L9d
        L9a:
            r8.logErrorOrThrowException(r9)     // Catch: java.lang.Throwable -> Lb6
        L9d:
            monitor-exit(r8)
            return
        L9f:
            if (r0 == 0) goto Lb5
            boolean r1 = r0.isOpen()     // Catch: java.lang.RuntimeException -> Lb1 java.lang.Throwable -> Lb5 java.lang.Throwable -> Lb6
            if (r1 == 0) goto Lb5
            boolean r1 = r0.inTransaction()     // Catch: java.lang.RuntimeException -> Lb1 java.lang.Throwable -> Lb5 java.lang.Throwable -> Lb6
            if (r1 == 0) goto Lb5
            r0.endTransaction()     // Catch: java.lang.RuntimeException -> Lb1 java.lang.Throwable -> Lb5 java.lang.Throwable -> Lb6
            goto Lb5
        Lb1:
            r0 = move-exception
            r8.logErrorOrThrowException(r0)     // Catch: java.lang.Throwable -> Lb6
        Lb5:
            throw r9     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.datahandler.databases.c.a(org.json.JSONObject):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
        if (r12.inTransaction() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a7, code lost:
        if (r0 != false) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #0 {, blocks: (B:33:0x0086, B:66:0x00c2, B:71:0x00ca, B:73:0x00d0, B:74:0x00d3, B:53:0x00a3, B:63:0x00bb), top: B:78:0x000a }] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(org.json.JSONObject r25) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.datahandler.databases.c.b(org.json.JSONObject):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS user_attr (key text, value text)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS h_data (date TEXT, operand TEXT, count INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS h_data");
        onCreate(sQLiteDatabase);
    }

    public void a(ContentValues contentValues) {
        synchronized (this) {
            if (!contentValues.containsKey(StringSet.key)) {
                Logger.e(f262b, "Invalid format");
            } else {
                upsertDataToTableInDatabase(Constants.USER_ATTRIBUTES_TABLE, contentValues, "key=?", new String[]{String.valueOf(contentValues.get(StringSet.key))});
            }
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase, long j, JSONObject jSONObject, JSONArray jSONArray, int i, int i2) throws JSONException {
        int length = jSONArray.length();
        if (i > length || i2 > length) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO h_data");
        sb.append(" VALUES ");
        for (int i3 = i; i3 < i2; i3++) {
            if (i3 != i) {
                sb.append(", ");
            }
            sb.append("(?,?,?)");
        }
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(sb.toString());
        int i4 = 1;
        while (i < i2) {
            String string = jSONArray.getString(i);
            long j2 = jSONObject.getLong(string);
            int i5 = i4 + 1;
            compileStatement.bindLong(i4, j);
            int i6 = i5 + 1;
            compileStatement.bindString(i5, string);
            compileStatement.bindLong(i6, j2);
            i++;
            i4 = i6 + 1;
        }
        compileStatement.executeInsert();
        compileStatement.clearBindings();
        compileStatement.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(java.lang.String r10, long[] r11) {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            r3[r2] = r10     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            java.lang.String r4 = "SELECT SUM(COUNT) FROM h_data WHERE operand = ?"
            if (r11 == 0) goto L6d
            int r5 = r11.length     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            if (r5 <= 0) goto L6d
            int r5 = r11.length     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            r6 = 2
            if (r5 > r6) goto L6d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            r5.<init>()     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            r5.append(r4)     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            java.lang.String r4 = " AND "
            r5.append(r4)     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            int r5 = r11.length     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            if (r5 != r1) goto L44
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            r3.<init>()     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            r3.append(r4)     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            java.lang.String r4 = "date >= ?"
            r3.append(r4)     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            java.lang.String[] r3 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            r3[r2] = r10     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            r10 = r11[r2]     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            r3[r1] = r10     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            goto L6d
        L44:
            int r5 = r11.length     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            if (r5 != r6) goto L6d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            r3.<init>()     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            r3.append(r4)     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            java.lang.String r4 = "date >= ? AND date <= ?"
            r3.append(r4)     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            r3[r2] = r10     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            r7 = r11[r2]     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            java.lang.String r10 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            r3[r1] = r10     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            r10 = r11[r1]     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            r3[r6] = r10     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
        L6d:
            android.database.sqlite.SQLiteDatabase r10 = r9.getReadableDatabase()     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            android.database.Cursor r0 = r10.rawQuery(r4, r3)     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            if (r0 == 0) goto L85
            boolean r10 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            if (r10 == 0) goto L85
            int r10 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L88 java.lang.RuntimeException -> L8a java.lang.Throwable -> L97
            r0.close()
            return r10
        L85:
            if (r0 == 0) goto L9c
            goto L99
        L88:
            r10 = move-exception
            goto L91
        L8a:
            r10 = move-exception
            r9.logErrorOrThrowException(r10)     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L9c
            goto L99
        L91:
            if (r0 == 0) goto L96
            r0.close()
        L96:
            throw r10
        L97:
            if (r0 == 0) goto L9c
        L99:
            r0.close()
        L9c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.datahandler.databases.c.a(java.lang.String, long[]):int");
    }
}

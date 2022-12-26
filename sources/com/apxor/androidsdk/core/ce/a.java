package com.apxor.androidsdk.core.ce;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.datahandler.databases.ApxorBaseSQLiteWrapper;
import com.apxor.androidsdk.core.utils.Logger;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes3.dex */
public class a extends ApxorBaseSQLiteWrapper {
    private static final String a = "a";

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, String str) {
        super(context, str, null, 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(String str, boolean z) {
        return a(str, z, SDKController.getInstance().getDateTimeUtils().getDateString(new Date()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r0 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(java.lang.String r11, boolean r12, java.lang.String r13) {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.getReadableDatabase()     // Catch: java.lang.Throwable -> L3d java.lang.IllegalStateException -> L3f android.database.sqlite.SQLiteException -> L41
            r3 = 1
            if (r12 == 0) goto L22
            java.lang.String r12 = "count"
            java.lang.String[] r4 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L3d java.lang.IllegalStateException -> L3f android.database.sqlite.SQLiteException -> L41
            r12 = 2
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch: java.lang.Throwable -> L3d java.lang.IllegalStateException -> L3f android.database.sqlite.SQLiteException -> L41
            r6[r1] = r11     // Catch: java.lang.Throwable -> L3d java.lang.IllegalStateException -> L3f android.database.sqlite.SQLiteException -> L41
            r6[r3] = r13     // Catch: java.lang.Throwable -> L3d java.lang.IllegalStateException -> L3f android.database.sqlite.SQLiteException -> L41
            java.lang.String r3 = "frequency"
            java.lang.String r5 = "uuid=? and date=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3d java.lang.IllegalStateException -> L3f android.database.sqlite.SQLiteException -> L41
            goto L2c
        L22:
            java.lang.String[] r12 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L3d java.lang.IllegalStateException -> L3f android.database.sqlite.SQLiteException -> L41
            r12[r1] = r11     // Catch: java.lang.Throwable -> L3d java.lang.IllegalStateException -> L3f android.database.sqlite.SQLiteException -> L41
            java.lang.String r11 = "SELECT SUM(COUNT) FROM frequency WHERE uuid=?"
            android.database.Cursor r11 = r2.rawQuery(r11, r12)     // Catch: java.lang.Throwable -> L3d java.lang.IllegalStateException -> L3f android.database.sqlite.SQLiteException -> L41
        L2c:
            r0 = r11
            if (r0 == 0) goto L3a
            boolean r11 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L3d java.lang.IllegalStateException -> L3f android.database.sqlite.SQLiteException -> L41
            if (r11 == 0) goto L3a
            int r11 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L3d java.lang.IllegalStateException -> L3f android.database.sqlite.SQLiteException -> L41
            r1 = r11
        L3a:
            if (r0 == 0) goto L50
            goto L4d
        L3d:
            r11 = move-exception
            goto L51
        L3f:
            r11 = move-exception
            goto L42
        L41:
            r11 = move-exception
        L42:
            com.apxor.androidsdk.core.SDKController r12 = com.apxor.androidsdk.core.SDKController.getInstance()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r13 = "hmdb_g_cnt"
            r12.logException(r13, r11)     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L50
        L4d:
            r0.close()
        L50:
            return r1
        L51:
            if (r0 == 0) goto L56
            r0.close()
        L56:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.ce.a.a(java.lang.String, boolean, java.lang.String):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
        if (r1 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.HashSet<java.lang.String> a(java.lang.String r9, org.json.JSONArray r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> La9
            r0.<init>()     // Catch: java.lang.Throwable -> La9
            if (r10 == 0) goto La7
            int r1 = r10.length()     // Catch: java.lang.Throwable -> La9
            r2 = 1
            if (r1 >= r2) goto L11
            goto La7
        L11:
            r1 = 0
            int r3 = r10.length()     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            r4.<init>()     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            java.lang.String r5 = "'"
            r4.append(r5)     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            r5 = 0
            java.lang.String r6 = r10.getString(r5)     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            r4.append(r6)     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            java.lang.String r6 = "'"
            r4.append(r6)     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            r6 = 1
        L2e:
            if (r6 >= r3) goto L44
            java.lang.String r7 = ", '"
            r4.append(r7)     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            java.lang.String r7 = r10.getString(r6)     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            r4.append(r7)     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            java.lang.String r7 = "'"
            r4.append(r7)     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            int r6 = r6 + 1
            goto L2e
        L44:
            android.database.sqlite.SQLiteDatabase r10 = r8.getReadableDatabase()     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            java.lang.String r6 = "cfgs"
            r3[r5] = r6     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            r3[r2] = r4     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            java.lang.String r4 = "SELECT uuid from %s where type=? and pid in (%s)"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            r2[r5] = r9     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            android.database.Cursor r1 = r10.rawQuery(r3, r2)     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            boolean r9 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            if (r9 == 0) goto L9c
        L69:
            java.lang.String r9 = r1.getString(r5)     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            r0.add(r9)     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            boolean r9 = r1.moveToNext()     // Catch: java.lang.Throwable -> L77 org.json.JSONException -> L79 java.lang.IllegalArgumentException -> L89 java.lang.IllegalStateException -> L8b android.database.sqlite.SQLiteException -> L8d
            if (r9 != 0) goto L69
            goto L9c
        L77:
            r9 = move-exception
            goto La1
        L79:
            r9 = move-exception
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L77
            com.apxor.androidsdk.core.SDKController r10 = com.apxor.androidsdk.core.SDKController.getInstance()     // Catch: java.lang.Throwable -> L77
            java.lang.String r2 = "g_PML"
            r10.logException(r2, r9)     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L9f
            goto L9c
        L89:
            r9 = move-exception
            goto L8e
        L8b:
            r9 = move-exception
            goto L8e
        L8d:
            r9 = move-exception
        L8e:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L77
            com.apxor.androidsdk.core.SDKController r10 = com.apxor.androidsdk.core.SDKController.getInstance()     // Catch: java.lang.Throwable -> L77
            java.lang.String r2 = "g_PML"
            r10.logException(r2, r9)     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L9f
        L9c:
            r1.close()     // Catch: java.lang.Throwable -> La9
        L9f:
            monitor-exit(r8)
            return r0
        La1:
            if (r1 == 0) goto La6
            r1.close()     // Catch: java.lang.Throwable -> La9
        La6:
            throw r9     // Catch: java.lang.Throwable -> La9
        La7:
            monitor-exit(r8)
            return r0
        La9:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.ce.a.a(java.lang.String, org.json.JSONArray):java.util.HashSet");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x00f7, code lost:
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00d6, code lost:
        if (r4 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00f5, code lost:
        if (r4 != null) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0100 A[Catch: all -> 0x0104, TRY_ENTER, TRY_LEAVE, TryCatch #21 {, blocks: (B:7:0x0018, B:24:0x0069, B:25:0x006c, B:106:0x0100, B:111:0x0108, B:113:0x010d, B:114:0x0110, B:96:0x00ed, B:98:0x00f2, B:100:0x00f7, B:82:0x00ce, B:84:0x00d3), top: B:127:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x010d A[Catch: all -> 0x0104, IOException -> 0x0110, TRY_LEAVE, TryCatch #21 {, blocks: (B:7:0x0018, B:24:0x0069, B:25:0x006c, B:106:0x0100, B:111:0x0108, B:113:0x010d, B:114:0x0110, B:96:0x00ed, B:98:0x00f2, B:100:0x00f7, B:82:0x00ce, B:84:0x00d3), top: B:127:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ce A[Catch: all -> 0x0104, TRY_ENTER, TRY_LEAVE, TryCatch #21 {, blocks: (B:7:0x0018, B:24:0x0069, B:25:0x006c, B:106:0x0100, B:111:0x0108, B:113:0x010d, B:114:0x0110, B:96:0x00ed, B:98:0x00f2, B:100:0x00f7, B:82:0x00ce, B:84:0x00d3), top: B:127:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d3 A[Catch: IOException -> 0x00fa, all -> 0x0104, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x00fa, blocks: (B:25:0x006c, B:98:0x00f2, B:100:0x00f7, B:84:0x00d3), top: B:122:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ed A[Catch: all -> 0x0104, TRY_ENTER, TRY_LEAVE, TryCatch #21 {, blocks: (B:7:0x0018, B:24:0x0069, B:25:0x006c, B:106:0x0100, B:111:0x0108, B:113:0x010d, B:114:0x0110, B:96:0x00ed, B:98:0x00f2, B:100:0x00f7, B:82:0x00ce, B:84:0x00d3), top: B:127:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f2 A[Catch: IOException -> 0x00fa, all -> 0x0104, TRY_ENTER, TryCatch #0 {IOException -> 0x00fa, blocks: (B:25:0x006c, B:98:0x00f2, B:100:0x00f7, B:84:0x00d3), top: B:122:0x0002 }] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject a(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.ce.a.a(java.lang.String):org.json.JSONObject");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Cursor cursor = null;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            cursor = writableDatabase.rawQuery("SELECT count(name) FROM sqlite_master WHERE TYPE='table' and (name='messages_frequency' or name='configs')", null);
            if (cursor != null && cursor.moveToFirst() && cursor.getInt(0) == 2) {
                writableDatabase.execSQL("ALTER TABLE messages_frequency RENAME TO frequency");
                writableDatabase.execSQL("ALTER TABLE configs RENAME TO cfgs");
            }
            if (cursor == null) {
                return;
            }
        } catch (SQLiteException | IllegalStateException unused) {
            if (cursor == null) {
                return;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        cursor.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, ContentValues contentValues) {
        String asString = contentValues.getAsString(Constants.UUID);
        if (i == 0) {
            upsertDataToTableInDatabase(Constants.FREQUENCY, contentValues, "uuid=? and date=?", new String[]{asString, contentValues.getAsString("date")});
        } else if (i != 1) {
        } else {
            upsertDataToTableInDatabase("cfgs", contentValues, "uuid=? and type=? and pid=?", new String[]{asString, contentValues.getAsString("type"), contentValues.getAsString("pid")});
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r1 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.HashSet<java.lang.String> b(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L55
            r0.<init>()     // Catch: java.lang.Throwable -> L55
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r7.getReadableDatabase()     // Catch: java.lang.Throwable -> L35 java.lang.IllegalArgumentException -> L37 java.lang.IllegalStateException -> L39 android.database.sqlite.SQLiteException -> L3b
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L35 java.lang.IllegalArgumentException -> L37 java.lang.IllegalStateException -> L39 android.database.sqlite.SQLiteException -> L3b
            java.lang.String r5 = "cfgs"
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L35 java.lang.IllegalArgumentException -> L37 java.lang.IllegalStateException -> L39 android.database.sqlite.SQLiteException -> L3b
            java.lang.String r5 = "SELECT pid || '_' || mid from %s where type=?"
            java.lang.String r4 = java.lang.String.format(r5, r4)     // Catch: java.lang.Throwable -> L35 java.lang.IllegalArgumentException -> L37 java.lang.IllegalStateException -> L39 android.database.sqlite.SQLiteException -> L3b
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L35 java.lang.IllegalArgumentException -> L37 java.lang.IllegalStateException -> L39 android.database.sqlite.SQLiteException -> L3b
            r3[r6] = r8     // Catch: java.lang.Throwable -> L35 java.lang.IllegalArgumentException -> L37 java.lang.IllegalStateException -> L39 android.database.sqlite.SQLiteException -> L3b
            android.database.Cursor r1 = r2.rawQuery(r4, r3)     // Catch: java.lang.Throwable -> L35 java.lang.IllegalArgumentException -> L37 java.lang.IllegalStateException -> L39 android.database.sqlite.SQLiteException -> L3b
            boolean r8 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L35 java.lang.IllegalArgumentException -> L37 java.lang.IllegalStateException -> L39 android.database.sqlite.SQLiteException -> L3b
            if (r8 == 0) goto L4a
        L27:
            java.lang.String r8 = r1.getString(r6)     // Catch: java.lang.Throwable -> L35 java.lang.IllegalArgumentException -> L37 java.lang.IllegalStateException -> L39 android.database.sqlite.SQLiteException -> L3b
            r0.add(r8)     // Catch: java.lang.Throwable -> L35 java.lang.IllegalArgumentException -> L37 java.lang.IllegalStateException -> L39 android.database.sqlite.SQLiteException -> L3b
            boolean r8 = r1.moveToNext()     // Catch: java.lang.Throwable -> L35 java.lang.IllegalArgumentException -> L37 java.lang.IllegalStateException -> L39 android.database.sqlite.SQLiteException -> L3b
            if (r8 != 0) goto L27
            goto L4a
        L35:
            r8 = move-exception
            goto L4f
        L37:
            r8 = move-exception
            goto L3c
        L39:
            r8 = move-exception
            goto L3c
        L3b:
            r8 = move-exception
        L3c:
            r8.printStackTrace()     // Catch: java.lang.Throwable -> L35
            com.apxor.androidsdk.core.SDKController r2 = com.apxor.androidsdk.core.SDKController.getInstance()     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "g_PML"
            r2.logException(r3, r8)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L4d
        L4a:
            r1.close()     // Catch: java.lang.Throwable -> L55
        L4d:
            monitor-exit(r7)
            return r0
        L4f:
            if (r1 == 0) goto L54
            r1.close()     // Catch: java.lang.Throwable -> L55
        L54:
            throw r8     // Catch: java.lang.Throwable -> L55
        L55:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.ce.a.b(java.lang.String):java.util.HashSet");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str, JSONArray jSONArray) {
        synchronized (this) {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                if (jSONArray == null) {
                    writableDatabase.delete("cfgs", "type=?", new String[]{str});
                } else {
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        try {
                            writableDatabase.delete("cfgs", "pid=?", new String[]{jSONArray.getString(i)});
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (SQLiteException | IllegalStateException unused2) {
                Logger.e(a, "Failed to delete");
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS frequency(uuid text, date text, count int, PRIMARY KEY (uuid,date))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cfgs(type text, uuid text, config blob, pid text, mid text, PRIMARY KEY(type, uuid))");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cfgs");
        onCreate(sQLiteDatabase);
    }
}

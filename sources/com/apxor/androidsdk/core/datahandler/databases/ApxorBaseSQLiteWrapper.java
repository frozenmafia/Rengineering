package com.apxor.androidsdk.core.datahandler.databases;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.models.IDataStorable;
import com.apxor.androidsdk.core.utils.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public abstract class ApxorBaseSQLiteWrapper extends SQLiteOpenHelper {
    private static final String a = "ApxorBaseSQLiteWrapper";
    protected final String CREATE_TABLE;
    protected final String DROP_TABLE_IF_EXISTS;
    protected String INDEX_TRACKER_TABLE_SCHEMA;

    public ApxorBaseSQLiteWrapper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        this.CREATE_TABLE = "CREATE TABLE IF NOT EXISTS ";
        this.DROP_TABLE_IF_EXISTS = "DROP TABLE IF EXISTS ";
        this.INDEX_TRACKER_TABLE_SCHEMA = " (chunk_number int, start_index int, end_index int, table_type text, PRIMARY KEY(chunk_number, table_type))";
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r1 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject getAttributesFromTable(java.lang.String r7) {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r6.getReadableDatabase()     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 org.json.JSONException -> L4e java.lang.IllegalStateException -> L50 android.database.sqlite.SQLiteException -> L52
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 org.json.JSONException -> L4e java.lang.IllegalStateException -> L50 android.database.sqlite.SQLiteException -> L52
            r3.<init>()     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 org.json.JSONException -> L4e java.lang.IllegalStateException -> L50 android.database.sqlite.SQLiteException -> L52
            java.lang.String r4 = "SELECT * FROM "
            r3.append(r4)     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 org.json.JSONException -> L4e java.lang.IllegalStateException -> L50 android.database.sqlite.SQLiteException -> L52
            r3.append(r7)     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 org.json.JSONException -> L4e java.lang.IllegalStateException -> L50 android.database.sqlite.SQLiteException -> L52
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 org.json.JSONException -> L4e java.lang.IllegalStateException -> L50 android.database.sqlite.SQLiteException -> L52
            android.database.Cursor r1 = r2.rawQuery(r3, r1)     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 org.json.JSONException -> L4e java.lang.IllegalStateException -> L50 android.database.sqlite.SQLiteException -> L52
            if (r1 == 0) goto L42
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 org.json.JSONException -> L4e java.lang.IllegalStateException -> L50 android.database.sqlite.SQLiteException -> L52
            if (r2 <= 0) goto L42
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 org.json.JSONException -> L4e java.lang.IllegalStateException -> L50 android.database.sqlite.SQLiteException -> L52
            if (r2 == 0) goto L42
        L2d:
            r2 = 0
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 org.json.JSONException -> L4e java.lang.IllegalStateException -> L50 android.database.sqlite.SQLiteException -> L52
            r3 = 1
            java.lang.Object r3 = r6.getDataForType(r1, r3)     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 org.json.JSONException -> L4e java.lang.IllegalStateException -> L50 android.database.sqlite.SQLiteException -> L52
            if (r3 == 0) goto L3c
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 org.json.JSONException -> L4e java.lang.IllegalStateException -> L50 android.database.sqlite.SQLiteException -> L52
        L3c:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 org.json.JSONException -> L4e java.lang.IllegalStateException -> L50 android.database.sqlite.SQLiteException -> L52
            if (r2 != 0) goto L2d
        L42:
            if (r1 == 0) goto L70
            goto L6d
        L45:
            r7 = move-exception
            goto L71
        L47:
            r7 = move-exception
            r6.logErrorOrThrowException(r7)     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L70
            goto L6d
        L4e:
            r2 = move-exception
            goto L53
        L50:
            r2 = move-exception
            goto L53
        L52:
            r2 = move-exception
        L53:
            com.apxor.androidsdk.core.SDKController r3 = com.apxor.androidsdk.core.SDKController.getInstance()     // Catch: java.lang.Throwable -> L45
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r4.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = "sdb_g_ua_v2_"
            r4.append(r5)     // Catch: java.lang.Throwable -> L45
            r4.append(r7)     // Catch: java.lang.Throwable -> L45
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L45
            r3.logException(r7, r2)     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L70
        L6d:
            r1.close()
        L70:
            return r0
        L71:
            if (r1 == 0) goto L76
            r1.close()
        L76:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.datahandler.databases.ApxorBaseSQLiteWrapper.getAttributesFromTable(java.lang.String):org.json.JSONObject");
    }

    @Deprecated
    public JSONObject getDataForChunk(JSONObject jSONObject, int i, boolean z) {
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object getDataForType(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type == 4) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(cursor.getBlob(i)));
                            String string = jSONObject.getString("t");
                            char c = 65535;
                            int hashCode = string.hashCode();
                            if (hashCode != 97) {
                                if (hashCode == 98 && string.equals("b")) {
                                    c = 0;
                                }
                            } else if (string.equals("a")) {
                                c = 1;
                            }
                            if (c != 0) {
                                if (c != 1) {
                                    return jSONObject.get("v");
                                }
                                return jSONObject.getJSONArray("v");
                            }
                            return Boolean.valueOf(jSONObject.getBoolean("v"));
                        } catch (JSONException unused) {
                        }
                    }
                    return null;
                }
                return cursor.getString(i);
            }
            return Double.valueOf(cursor.getDouble(i));
        }
        return Integer.valueOf(cursor.getInt(i));
    }

    @Deprecated
    public JSONObject getDataFromARowInTable(String str, String str2, String[] strArr) {
        return new JSONObject();
    }

    protected Cursor getDataGreaterThanID(String str, String[] strArr) {
        String[] strArr2;
        String str2;
        if (strArr != null) {
            try {
                if (strArr.length <= 1) {
                    strArr2 = strArr;
                    str2 = "_id >=?";
                    return getReadableDatabase().query(str, null, str2, strArr2, null, null, "_id", null);
                }
            } catch (SQLiteException e) {
                e = e;
                Logger.e(a, "Failed to get data: " + e.getMessage());
                return null;
            } catch (IllegalStateException e2) {
                e = e2;
                Logger.e(a, "Failed to get data: " + e.getMessage());
                return null;
            } catch (RuntimeException e3) {
                logErrorOrThrowException(e3);
                return null;
            }
        }
        str2 = null;
        strArr2 = null;
        return getReadableDatabase().query(str, null, str2, strArr2, null, null, "_id", null);
    }

    protected Cursor getDataInRange(String str, String str2, String[] strArr) {
        String str3;
        String[] strArr2;
        String str4;
        if (str2 == null) {
            str3 = null;
        } else {
            try {
                str3 = str2 + " >=? AND " + str2 + " <=?";
            } catch (SQLiteException e) {
                e = e;
                Logger.e(a, "Failed to get data: " + e.getMessage());
                return null;
            } catch (IllegalStateException e2) {
                e = e2;
                Logger.e(a, "Failed to get data: " + e.getMessage());
                return null;
            } catch (RuntimeException e3) {
                logErrorOrThrowException(e3);
                return null;
            }
        }
        if (str2 != null && strArr != null) {
            str4 = str2;
            strArr2 = strArr;
            return getReadableDatabase().query(str, null, str3, strArr2, null, null, str4, null);
        }
        strArr2 = null;
        str4 = null;
        return getReadableDatabase().query(str, null, str3, strArr2, null, null, str4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
        if (r1 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList<org.json.JSONObject> getEntireDataFromTable(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            r2.<init>()     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            java.lang.String r3 = "SELECT * FROM "
            r2.append(r3)     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            r2.append(r8)     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            if (r9 == 0) goto L35
            if (r10 == 0) goto L35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            r3.<init>()     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            r3.append(r2)     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            java.lang.String r2 = " where "
            r3.append(r2)     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            java.lang.String r2 = "?"
            java.lang.String r9 = r9.replace(r2, r10)     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            r3.append(r9)     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
        L35:
            android.database.sqlite.SQLiteDatabase r9 = r7.getReadableDatabase()     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            android.database.Cursor r1 = r9.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            if (r1 == 0) goto L8a
            int r9 = r1.getCount()     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            if (r9 <= 0) goto L8a
            boolean r9 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            if (r9 == 0) goto L8a
        L4b:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            r9.<init>()     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            int r10 = r1.getColumnCount()     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            r2 = 0
        L55:
            if (r2 >= r10) goto L81
            java.lang.String r3 = r1.getColumnName(r2)     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            java.lang.Object r4 = r7.getDataForType(r1, r2)     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            r9.put(r3, r4)     // Catch: org.json.JSONException -> L63 java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            goto L7e
        L63:
            r3 = move-exception
            java.lang.String r4 = com.apxor.androidsdk.core.datahandler.databases.ApxorBaseSQLiteWrapper.a     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            r5.<init>()     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            java.lang.String r6 = "getData: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            r5.append(r3)     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            com.apxor.androidsdk.core.utils.Logger.e(r4, r3)     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
        L7e:
            int r2 = r2 + 1
            goto L55
        L81:
            r0.add(r9)     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            boolean r9 = r1.moveToNext()     // Catch: java.lang.Throwable -> L8d java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L96 android.database.sqlite.SQLiteException -> L98
            if (r9 != 0) goto L4b
        L8a:
            if (r1 == 0) goto Lb6
            goto Lb3
        L8d:
            r8 = move-exception
            goto Lb7
        L8f:
            r8 = move-exception
            r7.logErrorOrThrowException(r8)     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto Lb6
            goto Lb3
        L96:
            r9 = move-exception
            goto L99
        L98:
            r9 = move-exception
        L99:
            com.apxor.androidsdk.core.SDKController r10 = com.apxor.androidsdk.core.SDKController.getInstance()     // Catch: java.lang.Throwable -> L8d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r2.<init>()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = "sdb_g_data_v2_"
            r2.append(r3)     // Catch: java.lang.Throwable -> L8d
            r2.append(r8)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L8d
            r10.logException(r8, r9)     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto Lb6
        Lb3:
            r1.close()
        Lb6:
            return r0
        Lb7:
            if (r1 == 0) goto Lbc
            r1.close()
        Lbc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.datahandler.databases.ApxorBaseSQLiteWrapper.getEntireDataFromTable(java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    @Deprecated
    public Object getEventDataInRange(String str, String str2, String[] strArr) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r1 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected org.json.JSONObject getFirstRowDataFromTable(java.lang.String r9) {
        /*
            r8 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r8.getReadableDatabase()     // Catch: java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
            r3.<init>()     // Catch: java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
            java.lang.String r4 = "SELECT * FROM "
            r3.append(r4)     // Catch: java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
            r3.append(r9)     // Catch: java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
            android.database.Cursor r1 = r2.rawQuery(r3, r1)     // Catch: java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
            if (r1 == 0) goto L5e
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
            if (r2 <= 0) goto L5e
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
            if (r2 == 0) goto L5e
            int r2 = r1.getColumnCount()     // Catch: java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
            r3 = 0
        L32:
            if (r3 >= r2) goto L5e
            java.lang.String r4 = r1.getColumnName(r3)     // Catch: java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
            java.lang.Object r5 = r8.getDataForType(r1, r3)     // Catch: java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
            r0.put(r4, r5)     // Catch: org.json.JSONException -> L40 java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
            goto L5b
        L40:
            r4 = move-exception
            java.lang.String r5 = com.apxor.androidsdk.core.datahandler.databases.ApxorBaseSQLiteWrapper.a     // Catch: java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
            r6.<init>()     // Catch: java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
            java.lang.String r7 = "gD: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
            r6.append(r4)     // Catch: java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
            com.apxor.androidsdk.core.utils.Logger.e(r5, r4)     // Catch: java.lang.Throwable -> L61 java.lang.RuntimeException -> L63 java.lang.IllegalStateException -> L6a android.database.sqlite.SQLiteException -> L6c
        L5b:
            int r3 = r3 + 1
            goto L32
        L5e:
            if (r1 == 0) goto L8a
            goto L87
        L61:
            r9 = move-exception
            goto L8b
        L63:
            r9 = move-exception
            r8.logErrorOrThrowException(r9)     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L8a
            goto L87
        L6a:
            r2 = move-exception
            goto L6d
        L6c:
            r2 = move-exception
        L6d:
            com.apxor.androidsdk.core.SDKController r3 = com.apxor.androidsdk.core.SDKController.getInstance()     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r4.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.String r5 = "sdb_g_data_v2_"
            r4.append(r5)     // Catch: java.lang.Throwable -> L61
            r4.append(r9)     // Catch: java.lang.Throwable -> L61
            java.lang.String r9 = r4.toString()     // Catch: java.lang.Throwable -> L61
            r3.logException(r9, r2)     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L8a
        L87:
            r1.close()
        L8a:
            return r0
        L8b:
            if (r1 == 0) goto L90
            r1.close()
        L90:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.datahandler.databases.ApxorBaseSQLiteWrapper.getFirstRowDataFromTable(java.lang.String):org.json.JSONObject");
    }

    @Deprecated
    protected Integer[] getIndicesFromIndicesTable(int i, String str) {
        return new Integer[]{-1, -1};
    }

    @Deprecated
    public int getNewChunkNumber() {
        return -1;
    }

    protected JSONArray getRawData(Cursor cursor) {
        JSONArray jSONArray = new JSONArray();
        if (cursor != null) {
            if (cursor.getCount() > 0 && cursor.moveToFirst()) {
                int columnCount = cursor.getColumnCount();
                do {
                    JSONObject jSONObject = new JSONObject();
                    for (int i = 0; i < columnCount; i++) {
                        try {
                            jSONObject.put(cursor.getColumnName(i), getDataForType(cursor, i));
                        } catch (JSONException e) {
                            String str = a;
                            Logger.e(str, "gD: " + e.getMessage());
                        }
                    }
                    jSONArray.put(jSONObject);
                } while (cursor.moveToNext());
                cursor.close();
            } else {
                cursor.close();
            }
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
        if (r0 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
        if (r0 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void incrementCountAndUpsertData(java.lang.String r7, android.content.ContentValues r8, java.lang.String r9, java.lang.String[] r10) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r6.getReadableDatabase()     // Catch: java.lang.Throwable -> L4d java.lang.RuntimeException -> L4f java.lang.Throwable -> L56
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d java.lang.RuntimeException -> L4f java.lang.Throwable -> L56
            r2.<init>()     // Catch: java.lang.Throwable -> L4d java.lang.RuntimeException -> L4f java.lang.Throwable -> L56
            java.lang.String r3 = "SELECT count FROM "
            r2.append(r3)     // Catch: java.lang.Throwable -> L4d java.lang.RuntimeException -> L4f java.lang.Throwable -> L56
            r2.append(r7)     // Catch: java.lang.Throwable -> L4d java.lang.RuntimeException -> L4f java.lang.Throwable -> L56
            java.lang.String r3 = " WHERE "
            r2.append(r3)     // Catch: java.lang.Throwable -> L4d java.lang.RuntimeException -> L4f java.lang.Throwable -> L56
            r2.append(r9)     // Catch: java.lang.Throwable -> L4d java.lang.RuntimeException -> L4f java.lang.Throwable -> L56
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4d java.lang.RuntimeException -> L4f java.lang.Throwable -> L56
            android.database.Cursor r0 = r1.rawQuery(r2, r10)     // Catch: java.lang.Throwable -> L4d java.lang.RuntimeException -> L4f java.lang.Throwable -> L56
            if (r0 == 0) goto L47
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L4d java.lang.RuntimeException -> L4f java.lang.Throwable -> L56
            if (r1 == 0) goto L3d
            r1 = 0
            long r1 = r0.getLong(r1)     // Catch: java.lang.Throwable -> L4d java.lang.RuntimeException -> L4f java.lang.Throwable -> L56
            java.lang.String r3 = "count"
            r4 = 1
            long r1 = r1 + r4
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L4d java.lang.RuntimeException -> L4f java.lang.Throwable -> L56
            r8.put(r3, r1)     // Catch: java.lang.Throwable -> L4d java.lang.RuntimeException -> L4f java.lang.Throwable -> L56
            goto L47
        L3d:
            java.lang.String r1 = "count"
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L4d java.lang.RuntimeException -> L4f java.lang.Throwable -> L56
            r8.put(r1, r2)     // Catch: java.lang.Throwable -> L4d java.lang.RuntimeException -> L4f java.lang.Throwable -> L56
        L47:
            r6.upsertDataToTableInDatabase(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L4d java.lang.RuntimeException -> L4f java.lang.Throwable -> L56
            if (r0 == 0) goto L62
            goto L5f
        L4d:
            r7 = move-exception
            goto L64
        L4f:
            r7 = move-exception
            r6.logErrorOrThrowException(r7)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L62
            goto L5f
        L56:
            java.lang.String r7 = com.apxor.androidsdk.core.datahandler.databases.ApxorBaseSQLiteWrapper.a     // Catch: java.lang.Throwable -> L4d
            java.lang.String r8 = "Failed to upsert"
            com.apxor.androidsdk.core.utils.Logger.e(r7, r8)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L62
        L5f:
            r0.close()     // Catch: java.lang.Throwable -> L6a
        L62:
            monitor-exit(r6)
            return
        L64:
            if (r0 == 0) goto L69
            r0.close()     // Catch: java.lang.Throwable -> L6a
        L69:
            throw r7     // Catch: java.lang.Throwable -> L6a
        L6a:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.datahandler.databases.ApxorBaseSQLiteWrapper.incrementCountAndUpsertData(java.lang.String, android.content.ContentValues, java.lang.String, java.lang.String[]):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void insertDataToTable(String str, ContentValues contentValues) {
        synchronized (this) {
            try {
                long insertWithOnConflict = getWritableDatabase().insertWithOnConflict(str, null, contentValues, 4);
                String str2 = a;
                Logger.d(str2, "Insert: " + str + " : " + insertWithOnConflict);
            } catch (SQLiteException e) {
                e = e;
                SDKController sDKController = SDKController.getInstance();
                sDKController.logException("sdb_ins_v2_" + str, e);
                close();
            } catch (IllegalStateException e2) {
                e = e2;
                SDKController sDKController2 = SDKController.getInstance();
                sDKController2.logException("sdb_ins_v2_" + str, e);
                close();
            } catch (RuntimeException e3) {
                logErrorOrThrowException(e3);
            }
        }
    }

    @Deprecated
    protected void insertIndexInMetaTable(String str, int i, int i2, int i3) {
        synchronized (this) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void logErrorOrThrowException(RuntimeException runtimeException) {
        String message;
        if (runtimeException != null && (message = runtimeException.getMessage()) != null && !message.isEmpty() && message.startsWith("Cursor window allocation of")) {
            Logger.e(a, "An exception occurred while performing DB operation", null);
            return;
        }
        throw runtimeException;
    }

    @Deprecated
    public void saveData(String str, IDataStorable iDataStorable) {
    }

    public void upsertDataToTableInDatabase(String str, ContentValues contentValues, String str2, String[] strArr) {
        synchronized (this) {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                if (writableDatabase.update(str, contentValues, str2, strArr) == 0) {
                    String str3 = a;
                    Logger.d(str3, "Insert : " + writableDatabase.insert(str, null, contentValues));
                }
            } catch (SQLiteException e) {
                e = e;
                SDKController sDKController = SDKController.getInstance();
                sDKController.logException("sdb_ups_si_v2_" + str, e);
                close();
            } catch (IllegalStateException e2) {
                e = e2;
                SDKController sDKController2 = SDKController.getInstance();
                sDKController2.logException("sdb_ups_si_v2_" + str, e);
                close();
            } catch (RuntimeException e3) {
                logErrorOrThrowException(e3);
            }
        }
    }
}

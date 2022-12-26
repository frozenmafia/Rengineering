package com.apxor.androidsdk.core.datahandler.databases;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import com.apxor.androidsdk.core.Constants;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.utils.Logger;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import o.moveToLast;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class b extends ApxorBaseSQLiteWrapper {
    private static int HaptikSDK$c = 1;
    private static int ag$a = 0;
    private static int ah$a = 0;

    /* renamed from: b  reason: collision with root package name */
    private static final String f261b = "b";
    private static int invoke;
    private static short[] toString;
    private static int valueOf;
    private static byte[] values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements j<Long> {
        a() {
        }

        @Override // com.apxor.androidsdk.core.datahandler.databases.b.j
        /* renamed from: b */
        public Long a(Cursor cursor) {
            if (cursor.moveToFirst()) {
                return Long.valueOf(cursor.getLong(0));
            }
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.apxor.androidsdk.core.datahandler.databases.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0257b implements j<Boolean> {
        C0257b() {
        }

        @Override // com.apxor.androidsdk.core.datahandler.databases.b.j
        /* renamed from: b */
        public Boolean a(Cursor cursor) {
            boolean z;
            boolean z2;
            int count = cursor.getCount();
            if (cursor.moveToFirst()) {
                while (true) {
                    try {
                        z = false;
                        if (!new JSONObject(cursor.getString(2)).getString("name").equals(Constants.APX_APP_OPEN)) {
                            if (!cursor.moveToNext()) {
                                z2 = false;
                                break;
                            }
                        } else {
                            z2 = true;
                            break;
                        }
                    } catch (JSONException unused) {
                    }
                }
                if (z2 && count - 1 > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements j<TreeSet<String>> {
        c() {
        }

        @Override // com.apxor.androidsdk.core.datahandler.databases.b.j
        /* renamed from: b */
        public TreeSet<String> a(Cursor cursor) {
            if (cursor.moveToFirst()) {
                TreeSet<String> treeSet = new TreeSet<>();
                do {
                    treeSet.add(cursor.getString(0));
                } while (cursor.moveToNext());
                return treeSet;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements j<JSONArray> {
        d() {
        }

        @Override // com.apxor.androidsdk.core.datahandler.databases.b.j
        /* renamed from: b */
        public JSONArray a(Cursor cursor) {
            JSONArray jSONArray = new JSONArray();
            if (cursor.moveToFirst()) {
                do {
                    try {
                        jSONArray.put(new JSONObject(cursor.getString(0)));
                    } catch (JSONException unused) {
                    }
                } while (cursor.moveToNext());
                return jSONArray;
            }
            return jSONArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements j<TreeSet<String>> {
        e() {
        }

        @Override // com.apxor.androidsdk.core.datahandler.databases.b.j
        /* renamed from: b */
        public TreeSet<String> a(Cursor cursor) {
            TreeSet<String> treeSet = new TreeSet<>();
            if (cursor.moveToNext()) {
                do {
                    treeSet.add(cursor.getString(0));
                } while (cursor.moveToNext());
                return treeSet;
            }
            return treeSet;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements j<List<com.apxor.androidsdk.core.models.b>> {
        f() {
        }

        @Override // com.apxor.androidsdk.core.datahandler.databases.b.j
        /* renamed from: b */
        public List<com.apxor.androidsdk.core.models.b> a(Cursor cursor) {
            ArrayList arrayList = new ArrayList();
            if (cursor.moveToFirst()) {
                do {
                    try {
                        String string = cursor.getString(0);
                        int parseInt = Integer.parseInt(string.substring(string.indexOf(":") + 1));
                        String string2 = cursor.getString(1);
                        long j = cursor.getLong(2);
                        long j2 = cursor.getLong(3);
                        boolean equals = cursor.getString(4).equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                        com.apxor.androidsdk.core.models.b bVar = new com.apxor.androidsdk.core.models.b(string2, parseInt, j, j2, new JSONArray(cursor.getString(5)));
                        bVar.a(equals);
                        arrayList.add(bVar);
                    } catch (JSONException unused) {
                    }
                } while (cursor.moveToNext());
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g implements j<Integer> {
        g() {
        }

        @Override // com.apxor.androidsdk.core.datahandler.databases.b.j
        /* renamed from: b */
        public Integer a(Cursor cursor) {
            if (cursor == null || !cursor.moveToFirst() || cursor.getInt(0) <= 5) {
                return null;
            }
            b.a(b.this);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h implements j<String> {
        h() {
        }

        @Override // com.apxor.androidsdk.core.datahandler.databases.b.j
        /* renamed from: b */
        public String a(Cursor cursor) {
            String string;
            if (cursor == null || !cursor.moveToFirst() || (string = cursor.getString(0)) == null || string.isEmpty()) {
                return null;
            }
            return string;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class i implements j<JSONArray> {
        i() {
        }

        @Override // com.apxor.androidsdk.core.datahandler.databases.b.j
        /* renamed from: b */
        public JSONArray a(Cursor cursor) {
            if (cursor == null || !cursor.moveToFirst()) {
                return null;
            }
            HashMap hashMap = new HashMap();
            do {
                String string = cursor.getString(0);
                String string2 = cursor.getString(1);
                String string3 = cursor.getString(2);
                Object dataForType = b.this.getDataForType(cursor, 3);
                long j = cursor.getLong(4);
                HashMap hashMap2 = new HashMap();
                if (hashMap.containsKey(string)) {
                    hashMap2 = (HashMap) hashMap.get(string);
                }
                if (string2.isEmpty() && string3.isEmpty()) {
                    hashMap2.put("count", Long.valueOf(j));
                } else {
                    JSONArray jSONArray = new JSONArray();
                    if (hashMap2.containsKey(string2)) {
                        jSONArray = (JSONArray) hashMap2.get(string2);
                    }
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(dataForType);
                    jSONArray2.put(j);
                    jSONArray.put(jSONArray2);
                    hashMap2.put(string2, jSONArray);
                }
                hashMap.put(string, hashMap2);
            } while (cursor.moveToNext());
            JSONArray jSONArray3 = new JSONArray();
            for (Map.Entry entry : hashMap.entrySet()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", (String) entry.getKey());
                    JSONObject jSONObject2 = new JSONObject((HashMap) entry.getValue());
                    jSONObject.put("count", jSONObject2.getLong("count"));
                    jSONObject2.remove("count");
                    if (jSONObject2.length() > 0) {
                        jSONObject.put(com.apxor.androidsdk.core.ce.Constants.ATTRIBUTES, jSONObject2);
                    }
                    jSONArray3.put(jSONObject);
                } catch (JSONException unused) {
                }
            }
            return jSONArray3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface j<T> {
        T a(Cursor cursor);
    }

    static {
        valueOf();
        int i2 = invoke + 89;
        HaptikSDK$c = i2 % 128;
        int i3 = i2 % 2;
    }

    public b(Context context, String str) {
        super(context, str, null, 4);
    }

    static /* synthetic */ void a(b bVar) {
        int i2 = invoke + 39;
        HaptikSDK$c = i2 % 128;
        int i3 = i2 % 2;
        bVar.d();
        int i4 = HaptikSDK$c + 91;
        invoke = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        int i5 = 79 / 0;
    }

    static void valueOf() {
        valueOf = 43;
        ag$a = -1305599598;
        ah$a = 591623406;
        values = new byte[]{-41, -23};
    }

    public void b(String str) {
        synchronized (this) {
            try {
                try {
                    SQLiteDatabase writableDatabase = getWritableDatabase();
                    writableDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + ("events_" + str) + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, type text, data text)");
                } catch (RuntimeException e2) {
                    logErrorOrThrowException(e2);
                }
            } catch (SQLiteException | IllegalStateException unused) {
                Logger.e(f261b, "Failed to create table");
            }
        }
    }

    public TreeSet<String> c() {
        TreeSet<String> treeSet;
        synchronized (this) {
            treeSet = (TreeSet) a("SELECT substr(name, 8) FROM sqlite_master WHERE TYPE='table' AND name LIKE 'events_%'", (String[]) null, new e());
            if (treeSet == null) {
                treeSet = new TreeSet<>();
            }
        }
        return treeSet;
    }

    public long d(String str) {
        long longValue;
        synchronized (this) {
            Object a2 = a("SELECT max(_id) FROM " + str, (String[]) null, new a());
            longValue = a2 != null ? ((Long) a2).longValue() : 0L;
        }
        return longValue;
    }

    public void e(String str) {
        synchronized (this) {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.delete("chunk_meta", "sid=?", new String[]{str});
                writableDatabase.execSQL("DROP TABLE IF EXISTS events_" + str);
            } catch (SQLiteException | IllegalStateException unused) {
                Logger.e(f261b, "Failed to remove");
            } catch (RuntimeException e2) {
                logErrorOrThrowException(e2);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS chunk_meta (id text PRIMARY KEY, sid text, start int, end int, sent_status int DEFAULT 0, reporting_times text)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS meta_events_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, type text, data text)");
        try {
            int i2 = invoke + 125;
            HaptikSDK$c = i2 % 128;
            if ((i2 % 2 == 0 ? '^' : '8') != '8') {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        int i4 = HaptikSDK$c + 29;
        invoke = i4 % 128;
        int i5 = i4 % 2;
    }

    public void a(String str, ContentValues contentValues) {
        synchronized (this) {
            insertDataToTable(str, contentValues);
        }
    }

    public void a(com.apxor.androidsdk.core.models.b bVar) {
        synchronized (this) {
            try {
                ContentValues contentValues = bVar.getContentValues();
                SQLiteDatabase writableDatabase = getWritableDatabase();
                if (writableDatabase.update("chunk_meta", contentValues, "id=?", new String[]{contentValues.getAsString(ah$a((byte) Color.red(0), TextUtils.lastIndexOf("", '0') - 43, 1305599703 - Color.blue(0), (short) (18 - Color.argb(0, 0, 0, 0)), (-591623406) - (Process.myPid() >> 22)).intern())}) == 0) {
                    writableDatabase.insertWithOnConflict("chunk_meta", null, contentValues, 5);
                }
            } catch (SQLiteException e2) {
                e = e2;
                SDKController.getInstance().logException("uCM", e);
            } catch (IllegalStateException e3) {
                e = e3;
                SDKController.getInstance().logException("uCM", e);
            } catch (RuntimeException e4) {
                logErrorOrThrowException(e4);
            }
        }
    }

    public void b() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.execSQL("CREATE TABLE IF NOT EXISTS agg_events (s_id text, date int, name text, attr text, o_value text, value blob, count int, PRIMARY KEY (s_id, date, name, attr, o_value))");
            try {
                int i2 = invoke + 89;
                HaptikSDK$c = i2 % 128;
                int i3 = i2 % 2;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (SQLiteException | IllegalStateException unused) {
            Logger.e(f261b, "Failed to create table");
        } catch (RuntimeException e3) {
            logErrorOrThrowException(e3);
        }
    }

    private void d() {
        String str = (String) a("SELECT DISTINCT s_id FROM agg_events LIMIT 1", (String[]) null, new h());
        if (str == null) {
            return;
        }
        int i2 = HaptikSDK$c + 107;
        invoke = i2 % 128;
        int i3 = i2 % 2;
        try {
            getWritableDatabase().delete("agg_events", "s_id = ?", new String[]{str});
            try {
                int i4 = HaptikSDK$c + 113;
                invoke = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (SQLiteException | IllegalStateException unused) {
        } catch (RuntimeException e3) {
            logErrorOrThrowException(e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0071, code lost:
        if ((r3 != null ? 18 : 'D') != 18) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0059  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <T> T a(java.lang.String r3, java.lang.String[] r4, com.apxor.androidsdk.core.datahandler.databases.b.j<T> r5) {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.getReadableDatabase()     // Catch: java.lang.Throwable -> L3b java.lang.RuntimeException -> L3d java.lang.Throwable -> L67
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L3b java.lang.RuntimeException -> L3d java.lang.Throwable -> L67
            java.lang.Object r4 = r5.a(r3)     // Catch: java.lang.Throwable -> L34 java.lang.RuntimeException -> L37 java.lang.Throwable -> L39
            r5 = 79
            if (r3 == 0) goto L14
            r1 = 79
            goto L16
        L14:
            r1 = 73
        L16:
            if (r1 == r5) goto L19
            goto L31
        L19:
            int r5 = com.apxor.androidsdk.core.datahandler.databases.b.invoke     // Catch: java.lang.Exception -> L32
            int r5 = r5 + 109
            int r1 = r5 % 128
            com.apxor.androidsdk.core.datahandler.databases.b.HaptikSDK$c = r1     // Catch: java.lang.Exception -> L78
            int r5 = r5 % 2
            if (r5 != 0) goto L2e
            r3.close()
            super.hashCode()     // Catch: java.lang.Throwable -> L2c
            goto L31
        L2c:
            r3 = move-exception
            throw r3
        L2e:
            r3.close()
        L31:
            return r4
        L32:
            r3 = move-exception
            throw r3
        L34:
            r4 = move-exception
            r0 = r3
            goto L50
        L37:
            r4 = move-exception
            goto L40
        L39:
            goto L68
        L3b:
            r3 = move-exception
            goto L51
        L3d:
            r3 = move-exception
            r4 = r3
            r3 = r0
        L40:
            r2.logErrorOrThrowException(r4)     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L77
            int r4 = com.apxor.androidsdk.core.datahandler.databases.b.HaptikSDK$c
            int r4 = r4 + 101
            int r5 = r4 % 128
            com.apxor.androidsdk.core.datahandler.databases.b.invoke = r5
            int r4 = r4 % 2
            goto L74
        L50:
            r3 = r4
        L51:
            r4 = 1
            if (r0 == 0) goto L56
            r5 = 0
            goto L57
        L56:
            r5 = 1
        L57:
            if (r5 == r4) goto L66
            int r4 = com.apxor.androidsdk.core.datahandler.databases.b.invoke
            int r4 = r4 + 9
            int r5 = r4 % 128
            com.apxor.androidsdk.core.datahandler.databases.b.HaptikSDK$c = r5
            int r4 = r4 % 2
            r0.close()
        L66:
            throw r3
        L67:
            r3 = r0
        L68:
            r4 = 18
            if (r3 == 0) goto L6f
            r5 = 18
            goto L71
        L6f:
            r5 = 68
        L71:
            if (r5 == r4) goto L74
            goto L77
        L74:
            r3.close()     // Catch: java.lang.Exception -> L78
        L77:
            return r0
        L78:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.datahandler.databases.b.a(java.lang.String, java.lang.String[], com.apxor.androidsdk.core.datahandler.databases.b$j):java.lang.Object");
    }

    public JSONArray c(String str) {
        JSONArray jSONArray = (JSONArray) a("SELECT name, attr, o_value, value, count from agg_events WHERE s_id = ?", new String[]{str}, new i());
        int i2 = HaptikSDK$c + 93;
        invoke = i2 % 128;
        int i3 = i2 % 2;
        return jSONArray;
    }

    public boolean a(String str) {
        boolean z;
        synchronized (this) {
            Boolean bool = (Boolean) a("SELECT * from " + str + " WHERE type='app_events'", (String[]) null, new C0257b());
            if (bool != null) {
                z = bool.booleanValue();
            }
        }
        return z;
    }

    public TreeSet<String> a(String str, long j2, long j3) {
        TreeSet<String> treeSet;
        synchronized (this) {
            treeSet = (TreeSet) a("SELECT DISTINCT type FROM events_" + str + " WHERE _id >= ? and _id <= ?", new String[]{String.valueOf(j2), String.valueOf(j3)}, new c());
            if (treeSet == null) {
                treeSet = new TreeSet<>();
            }
        }
        return treeSet;
    }

    public JSONArray a(String str, String str2, long j2, long j3) {
        JSONArray jSONArray;
        synchronized (this) {
            jSONArray = (JSONArray) a("SELECT data FROM " + str + " WHERE type = ? and _id >= ? and _id <= ?", new String[]{str2, String.valueOf(j2), String.valueOf(j3)}, new d());
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
        }
        return jSONArray;
    }

    public List<com.apxor.androidsdk.core.models.b> a(String str, String[] strArr) {
        List<com.apxor.androidsdk.core.models.b> list;
        synchronized (this) {
            StringBuilder sb = new StringBuilder("SELECT * FROM chunk_meta");
            if (str != null) {
                sb.append(" WHERE ");
                sb.append(str);
            }
            list = (List) a(sb.toString(), strArr, new f());
            if (list == null) {
                list = new ArrayList<>();
            }
        }
        return list;
    }

    public void a(long j2, long j3) {
        synchronized (this) {
            try {
                getWritableDatabase().delete(Constants.META_EVENTS_TABLE, "_id>=? and _id<=?", new String[]{String.valueOf(j2), String.valueOf(j3)});
            } catch (SQLiteException | IllegalStateException unused) {
                Logger.e(f261b, "Failed to remove");
            } catch (RuntimeException e2) {
                logErrorOrThrowException(e2);
            }
        }
    }

    public void a(ArrayList<ContentValues> arrayList) {
        synchronized (this) {
            if (arrayList != null) {
                if (arrayList.size() >= 1) {
                    Iterator<ContentValues> it = arrayList.iterator();
                    while (it.hasNext()) {
                        ContentValues next = it.next();
                        incrementCountAndUpsertData("agg_events", next, " s_id = ? and date = ? and name = ? and attr = ? and o_value = ?", new String[]{next.getAsString("s_id"), String.valueOf(next.getAsLong("date").longValue()), next.getAsString("name"), next.getAsString(com.apxor.androidsdk.core.ce.Constants.META_ATTRIBUTES), next.getAsString("o_value")});
                    }
                }
            }
        }
    }

    public void a() {
        synchronized (this) {
            a("SELECT COUNT(*) FROM (SELECT DISTINCT s_id FROM agg_events)", (String[]) null, new g());
        }
    }

    private static String ah$a(byte b2, int i2, int i3, short s, int i4) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i5 = i2 + valueOf;
            boolean z = i5 == -1;
            if (z) {
                if (values != null) {
                    i5 = (byte) (values[ah$a + i4] + valueOf);
                } else {
                    i5 = (short) (toString[ah$a + i4] + valueOf);
                }
            }
            if (i5 > 0) {
                moveToLast.values = ((i4 + i5) - 2) + ah$a + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i3 + ag$a);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i5) {
                    if (values != null) {
                        byte[] bArr = values;
                        int i6 = moveToLast.values;
                        moveToLast.values = i6 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i6] + s)) ^ b2));
                    } else {
                        short[] sArr = toString;
                        int i7 = moveToLast.values;
                        moveToLast.values = i7 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((short) (sArr[i7] + s)) ^ b2));
                    }
                    sb.append(moveToLast.ag$a);
                    moveToLast.toString = moveToLast.ag$a;
                    moveToLast.valueOf++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}

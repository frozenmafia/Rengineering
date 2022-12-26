package com.app.dream11.core.device.store.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o.casListeners;
import o.getMenuWrapper;
import o.getWantsAllOnMoveCalls;
import o.initializeTheme;
/* loaded from: classes2.dex */
public class KeyValueDBTable implements getMenuWrapper {
    private static int HaptikSDK$c = 1;
    private static int toString = 0;
    private static long values = 4466907505033873546L;
    private final SQLiteDatabase ag$a;
    private final initializeTheme ah$a;
    private Map<String, String> valueOf = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum fields {
        KEY,
        VALUE
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
        if ((r4 >= r5) != true) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0021, code lost:
        if (r4 >= r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0023, code lost:
        r3 = com.app.dream11.core.device.store.database.KeyValueDBTable.HaptikSDK$c + 27;
        com.app.dream11.core.device.store.database.KeyValueDBTable.toString = r3 % 128;
        r3 = r3 % 2;
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean valueOf(int r3, int r4, int r5) {
        /*
            r0 = 0
            r1 = 1
            if (r3 >= r5) goto L31
            int r3 = com.app.dream11.core.device.store.database.KeyValueDBTable.HaptikSDK$c     // Catch: java.lang.Exception -> L2f
            int r3 = r3 + 37
            int r2 = r3 % 128
            com.app.dream11.core.device.store.database.KeyValueDBTable.toString = r2     // Catch: java.lang.Exception -> L2f
            int r3 = r3 % 2
            if (r3 == 0) goto L12
            r3 = 0
            goto L13
        L12:
            r3 = 1
        L13:
            if (r3 == r1) goto L21
            r3 = 0
            int r3 = r3.length     // Catch: java.lang.Throwable -> L1f
            if (r4 < r5) goto L1b
            r3 = 1
            goto L1c
        L1b:
            r3 = 0
        L1c:
            if (r3 == r1) goto L23
            goto L31
        L1f:
            r3 = move-exception
            throw r3
        L21:
            if (r4 < r5) goto L31
        L23:
            int r3 = com.app.dream11.core.device.store.database.KeyValueDBTable.HaptikSDK$c
            int r3 = r3 + 27
            int r4 = r3 % 128
            com.app.dream11.core.device.store.database.KeyValueDBTable.toString = r4
            int r3 = r3 % 2
            r0 = 1
            goto L31
        L2f:
            r3 = move-exception
            throw r3
        L31:
            int r3 = com.app.dream11.core.device.store.database.KeyValueDBTable.HaptikSDK$c
            int r3 = r3 + 31
            int r4 = r3 % 128
            com.app.dream11.core.device.store.database.KeyValueDBTable.toString = r4
            int r3 = r3 % 2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.core.device.store.database.KeyValueDBTable.valueOf(int, int, int):boolean");
    }

    public KeyValueDBTable(SQLiteDatabase sQLiteDatabase, initializeTheme initializetheme) {
        this.ag$a = sQLiteDatabase;
        this.ah$a = initializetheme;
    }

    @Override // o.getMenuWrapper
    public void valueOf(String str, String str2) {
        synchronized (this) {
            String encrypt = this.ah$a.encrypt(str);
            String encrypt2 = this.ah$a.encrypt(str2);
            this.valueOf.put(encrypt, encrypt2);
            ContentValues contentValues = new ContentValues();
            contentValues.put(fields.KEY.toString(), encrypt);
            contentValues.put(fields.VALUE.toString(), encrypt2);
            this.ag$a.replace(ag$a(new char[]{9272, 9340, 14466, 12345, 61616, 3712, 57749, 5973, 1606, 4707, 50168, 13609, 24602, 29757}, View.resolveSize(0, 0)).intern(), null, contentValues);
        }
    }

    @Override // o.getMenuWrapper
    public String ah$a(String str) {
        String decrypt;
        synchronized (this) {
            if (this.valueOf.isEmpty()) {
                this.valueOf = Collections.synchronizedMap(new HashMap());
                try {
                    valueOf();
                } catch (Exception e) {
                    casListeners.toString(e.getMessage());
                }
            }
            decrypt = this.ah$a.decrypt(this.valueOf.get(this.ah$a.encrypt(str)));
            if (decrypt == null) {
                decrypt = "";
            }
        }
        return decrypt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r4.equals("") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        r4 = com.app.dream11.core.device.store.database.KeyValueDBTable.toString + 77;
        com.app.dream11.core.device.store.database.KeyValueDBTable.HaptikSDK$c = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r4.equals("") != false) goto L9;
     */
    @Override // o.getMenuWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            int r0 = com.app.dream11.core.device.store.database.KeyValueDBTable.toString
            int r0 = r0 + 57
            int r1 = r0 % 128
            com.app.dream11.core.device.store.database.KeyValueDBTable.HaptikSDK$c = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto Lf
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            java.lang.String r2 = ""
            if (r0 == 0) goto L21
            java.lang.String r4 = r3.ah$a(r4)
            boolean r0 = r4.equals(r2)
            if (r0 == 0) goto L1f
            goto L2e
        L1f:
            r5 = r4
            goto L2e
        L21:
            java.lang.String r4 = r3.ah$a(r4)
            boolean r0 = r4.equals(r2)
            r2 = 53
            int r2 = r2 / r1
            if (r0 == 0) goto L1f
        L2e:
            int r4 = com.app.dream11.core.device.store.database.KeyValueDBTable.toString
            int r4 = r4 + 77
            int r0 = r4 % 128
            com.app.dream11.core.device.store.database.KeyValueDBTable.HaptikSDK$c = r0
            int r4 = r4 % 2
            return r5
        L39:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.core.device.store.database.KeyValueDBTable.toString(java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // o.getMenuWrapper
    public Set<Map.Entry<String, String>> values() {
        try {
            int i = toString + 7;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            Set<Map.Entry<String, String>> entrySet = this.valueOf.entrySet();
            int i3 = toString + 87;
            HaptikSDK$c = i3 % 128;
            if ((i3 % 2 == 0 ? '#' : '\t') != '\t') {
                int i4 = 5 / 0;
                return entrySet;
            }
            return entrySet;
        } catch (Exception e) {
            throw e;
        }
    }

    public static String ag$a() {
        int i = HaptikSDK$c + 33;
        toString = i % 128;
        int i2 = i % 2;
        String format = String.format("create table %s (%s text not null primary key, %s text not null)", ag$a(new char[]{9272, 9340, 14466, 12345, 61616, 3712, 57749, 5973, 1606, 4707, 50168, 13609, 24602, 29757}, TextUtils.lastIndexOf("", '0') + 1).intern(), fields.KEY, fields.VALUE);
        int i3 = HaptikSDK$c + 45;
        toString = i3 % 128;
        int i4 = i3 % 2;
        return format;
    }

    private void valueOf() {
        int i = HaptikSDK$c + 17;
        toString = i % 128;
        int i2 = i % 2;
        Cursor query = this.ag$a.query(ag$a(new char[]{9272, 9340, 14466, 12345, 61616, 3712, 57749, 5973, 1606, 4707, 50168, 13609, 24602, 29757}, 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), new String[]{fields.KEY.toString(), fields.VALUE.toString()}, null, null, null, null, null);
        if (query.getCount() > 0) {
            while (true) {
                if (!(query.moveToNext())) {
                    break;
                }
                this.valueOf.put(query.getString(0), query.getString(1));
                int i3 = toString + 71;
                HaptikSDK$c = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        query.close();
        int i5 = toString + 3;
        HaptikSDK$c = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void ag$a(SQLiteDatabase sQLiteDatabase, int i, int i2, initializeTheme initializetheme) {
        if ((valueOf(i, i2, 6) ? '\'' : (char) 31) != '\'') {
            return;
        }
        int i3 = HaptikSDK$c + 5;
        toString = i3 % 128;
        int i4 = i3 % 2;
        try {
            ah$a(sQLiteDatabase, initializetheme);
            int i5 = toString + 95;
            HaptikSDK$c = i5 % 128;
            int i6 = i5 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    private static void ah$a(SQLiteDatabase sQLiteDatabase, initializeTheme initializetheme) {
        Cursor query = sQLiteDatabase.query(ag$a(new char[]{9272, 9340, 14466, 12345, 61616, 3712, 57749, 5973, 1606, 4707, 50168, 13609, 24602, 29757}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), new String[]{fields.KEY.toString(), fields.VALUE.toString()}, null, null, null, null, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (!(query.getCount() <= 0)) {
            while (query.moveToNext()) {
                String string = query.getString(0);
                String string2 = query.getString(1);
                linkedHashMap2.put(string, string2);
                linkedHashMap.put(initializetheme.encrypt(string), initializetheme.encrypt(string2));
            }
        }
        query.close();
        Log.d("KVTOriginal", linkedHashMap2.toString());
        sQLiteDatabase.execSQL(String.format("DROP TABLE %s", ag$a(new char[]{9272, 9340, 14466, 12345, 61616, 3712, 57749, 5973, 1606, 4707, 50168, 13609, 24602, 29757}, Process.myPid() >> 22).intern()));
        sQLiteDatabase.execSQL(ag$a());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(fields.KEY.toString(), (String) entry.getKey());
            contentValues.put(fields.VALUE.toString(), (String) entry.getValue());
            sQLiteDatabase.replace(ag$a(new char[]{9272, 9340, 14466, 12345, 61616, 3712, 57749, 5973, 1606, 4707, 50168, 13609, 24602, 29757}, Color.rgb(0, 0, 0) + 16777216).intern(), null, contentValues);
            int i = HaptikSDK$c + 5;
            toString = i % 128;
            int i2 = i % 2;
        }
        int i3 = toString + 105;
        HaptikSDK$c = i3 % 128;
        int i4 = i3 % 2;
    }

    private static String ag$a(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(values, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * values));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}

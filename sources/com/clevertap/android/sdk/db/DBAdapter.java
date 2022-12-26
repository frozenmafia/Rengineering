package com.clevertap.android.sdk.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.apxor.androidsdk.core.Constants;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.sendbird.android.constant.StringSet;
import java.util.ArrayList;
import java.util.Iterator;
import o.getRegionAt;
import o.setBoundsInScreen;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class DBAdapter {
    private static final String HaptikSDK$a;
    private static final String HaptikSDK$b;
    private static final String HaptikSDK$c;
    private static final String HaptikSDK$d;
    private static final String HaptikSDK$e;
    private static final String HaptikWebView;
    private static final String ah$a;
    private static final String ah$b;
    private static final String aj$a;
    private static final String getInitSettings;
    private static final String getSignupData;
    private static final String invoke;
    private static final String toString;
    private static final String values;
    private boolean a;
    private final DBAdapter$ag$a isLogoutPending;
    private CleverTapInstanceConfig onXdkEvent;
    private static final String valueOf = "CREATE TABLE " + Table.EVENTS.getName() + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, " + StringSet.created_at + " INTEGER NOT NULL);";
    private static final String ag$a = "CREATE TABLE " + Table.PROFILE_EVENTS.getName() + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, " + StringSet.created_at + " INTEGER NOT NULL);";

    /* loaded from: classes3.dex */
    public enum Table {
        EVENTS(Constants.EVENTS_TABLE),
        PROFILE_EVENTS("profileEvents"),
        USER_PROFILES("userProfiles"),
        INBOX_MESSAGES("inboxMessages"),
        PUSH_NOTIFICATIONS("pushNotifications"),
        UNINSTALL_TS("uninstallTimestamp"),
        PUSH_NOTIFICATION_VIEWED("notificationViewed");
        
        private final String tableName;

        Table(String str) {
            this.tableName = str;
        }

        public String getName() {
            return this.tableName;
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE ");
        sb.append(Table.USER_PROFILES.getName());
        sb.append(" (_id STRING UNIQUE PRIMARY KEY, ");
        sb.append("data");
        sb.append(" STRING NOT NULL);");
        HaptikSDK$a = sb.toString();
        toString = "CREATE TABLE " + Table.INBOX_MESSAGES.getName() + " (_id STRING NOT NULL, data TEXT NOT NULL, wzrkParams TEXT NOT NULL, campaignId STRING NOT NULL, tags TEXT NOT NULL, isRead INTEGER NOT NULL DEFAULT 0, " + ClientCookie.EXPIRES_ATTR + " INTEGER NOT NULL, " + StringSet.created_at + " INTEGER NOT NULL, messageUser STRING NOT NULL);";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CREATE UNIQUE INDEX IF NOT EXISTS userid_id_idx ON ");
        sb2.append(Table.INBOX_MESSAGES.getName());
        sb2.append(" (");
        sb2.append("messageUser");
        sb2.append(",");
        sb2.append("_id");
        sb2.append(");");
        getInitSettings = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("CREATE INDEX IF NOT EXISTS time_idx ON ");
        sb3.append(Table.EVENTS.getName());
        sb3.append(" (");
        sb3.append(StringSet.created_at);
        sb3.append(");");
        HaptikSDK$e = sb3.toString();
        HaptikWebView = "CREATE INDEX IF NOT EXISTS time_idx ON " + Table.PROFILE_EVENTS.getName() + " (" + StringSet.created_at + ");";
        ah$a = "CREATE TABLE " + Table.PUSH_NOTIFICATIONS.getName() + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, " + StringSet.created_at + " INTEGER NOT NULL,isRead INTEGER NOT NULL);";
        StringBuilder sb4 = new StringBuilder();
        sb4.append("CREATE INDEX IF NOT EXISTS time_idx ON ");
        sb4.append(Table.PUSH_NOTIFICATIONS.getName());
        sb4.append(" (");
        sb4.append(StringSet.created_at);
        sb4.append(");");
        HaptikSDK$d = sb4.toString();
        invoke = "CREATE TABLE " + Table.UNINSTALL_TS.getName() + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, " + StringSet.created_at + " INTEGER NOT NULL);";
        aj$a = "CREATE INDEX IF NOT EXISTS time_idx ON " + Table.UNINSTALL_TS.getName() + " (" + StringSet.created_at + ");";
        values = "CREATE TABLE " + Table.PUSH_NOTIFICATION_VIEWED.getName() + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, " + StringSet.created_at + " INTEGER NOT NULL);";
        StringBuilder sb5 = new StringBuilder();
        sb5.append("CREATE INDEX IF NOT EXISTS time_idx ON ");
        sb5.append(Table.PUSH_NOTIFICATION_VIEWED.getName());
        sb5.append(" (");
        sb5.append(StringSet.created_at);
        sb5.append(");");
        getSignupData = sb5.toString();
        ah$b = "DROP TABLE IF EXISTS " + Table.UNINSTALL_TS.getName();
        HaptikSDK$b = "DROP TABLE IF EXISTS " + Table.INBOX_MESSAGES.getName();
        HaptikSDK$c = "DROP TABLE IF EXISTS " + Table.PUSH_NOTIFICATION_VIEWED.getName();
    }

    public DBAdapter(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this(context, ag$a(cleverTapInstanceConfig));
        this.onXdkEvent = cleverTapInstanceConfig;
    }

    private DBAdapter(Context context, String str) {
        this.a = true;
        this.isLogoutPending = new DBAdapter$ag$a(context, str);
    }

    public boolean toString(String str, String str2) {
        synchronized (this) {
            if (str == null || str2 == null) {
                return false;
            }
            String name = Table.INBOX_MESSAGES.getName();
            try {
                this.isLogoutPending.getWritableDatabase().delete(name, "_id = ? AND messageUser = ?", new String[]{str, str2});
                this.isLogoutPending.close();
                return true;
            } catch (SQLiteException e) {
                setBoundsInScreen extraCallback = extraCallback();
                extraCallback.toString("Error removing stale records from " + name, e);
                this.isLogoutPending.close();
                return false;
            }
        }
    }

    public boolean valueOf(String str) {
        boolean equals;
        synchronized (this) {
            equals = str.equals(ah$a(str));
        }
        return equals;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
        if (r11 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
        if (r11 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
        r0 = (java.lang.String[]) r10.toArray(new java.lang.String[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String[] onXdkEvent() {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.a     // Catch: java.lang.Throwable -> Lab
            r1 = 0
            if (r0 != 0) goto La
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r12)
            return r0
        La:
            com.clevertap.android.sdk.db.DBAdapter$Table r0 = com.clevertap.android.sdk.db.DBAdapter.Table.PUSH_NOTIFICATIONS     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> Lab
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lab
            r10.<init>()     // Catch: java.lang.Throwable -> Lab
            r11 = 0
            com.clevertap.android.sdk.db.DBAdapter$ag$a r2 = r12.isLogoutPending     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r3 = "0"
            java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            r4 = 0
            java.lang.String r5 = "isRead =?"
            r7 = 0
            r8 = 0
            r9 = 0
            r3 = r0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            if (r11 == 0) goto L64
        L2f:
            boolean r2 = r11.moveToNext()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            if (r2 == 0) goto L61
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            r2.<init>()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r3 = "Fetching PID - "
            r2.append(r3)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r3 = "data"
            int r3 = r11.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r3 = r11.getString(r3)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            r2.append(r3)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            o.setBoundsInScreen.values(r2)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r2 = "data"
            int r2 = r11.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r2 = r11.getString(r2)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            r10.add(r2)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            goto L2f
        L61:
            r11.close()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
        L64:
            com.clevertap.android.sdk.db.DBAdapter$ag$a r0 = r12.isLogoutPending     // Catch: java.lang.Throwable -> Lab
            r0.close()     // Catch: java.lang.Throwable -> Lab
            if (r11 == 0) goto L96
            goto L93
        L6c:
            r0 = move-exception
            goto La0
        L6e:
            r2 = move-exception
            o.setBoundsInScreen r3 = r12.extraCallback()     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r4.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r5 = "Could not fetch records out of database "
            r4.append(r5)     // Catch: java.lang.Throwable -> L6c
            r4.append(r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = "."
            r4.append(r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L6c
            r3.toString(r0, r2)     // Catch: java.lang.Throwable -> L6c
            com.clevertap.android.sdk.db.DBAdapter$ag$a r0 = r12.isLogoutPending     // Catch: java.lang.Throwable -> Lab
            r0.close()     // Catch: java.lang.Throwable -> Lab
            if (r11 == 0) goto L96
        L93:
            r11.close()     // Catch: java.lang.Throwable -> Lab
        L96:
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> Lab
            java.lang.Object[] r0 = r10.toArray(r0)     // Catch: java.lang.Throwable -> Lab
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r12)
            return r0
        La0:
            com.clevertap.android.sdk.db.DBAdapter$ag$a r1 = r12.isLogoutPending     // Catch: java.lang.Throwable -> Lab
            r1.close()     // Catch: java.lang.Throwable -> Lab
            if (r11 == 0) goto Laa
            r11.close()     // Catch: java.lang.Throwable -> Lab
        Laa:
            throw r0     // Catch: java.lang.Throwable -> Lab
        Lab:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.db.DBAdapter.onXdkEvent():java.lang.String[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r12 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (r12 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject toString(java.lang.String r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            if (r12 != 0) goto L6
            monitor-exit(r11)
            return r0
        L6:
            com.clevertap.android.sdk.db.DBAdapter$Table r1 = com.clevertap.android.sdk.db.DBAdapter.Table.USER_PROFILES     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L83
            com.clevertap.android.sdk.db.DBAdapter$ag$a r2 = r11.isLogoutPending     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48
            r3 = 1
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48
            r3 = 0
            r6[r3] = r12     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48
            r4 = 0
            java.lang.String r5 = "_id =?"
            r7 = 0
            r8 = 0
            r9 = 0
            r3 = r1
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48
            if (r12 == 0) goto L3e
            boolean r2 = r12.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3c java.lang.Throwable -> L74
            if (r2 == 0) goto L3e
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: android.database.sqlite.SQLiteException -> L3c org.json.JSONException -> L3e java.lang.Throwable -> L74
            java.lang.String r3 = "data"
            int r3 = r12.getColumnIndex(r3)     // Catch: android.database.sqlite.SQLiteException -> L3c org.json.JSONException -> L3e java.lang.Throwable -> L74
            java.lang.String r3 = r12.getString(r3)     // Catch: android.database.sqlite.SQLiteException -> L3c org.json.JSONException -> L3e java.lang.Throwable -> L74
            r2.<init>(r3)     // Catch: android.database.sqlite.SQLiteException -> L3c org.json.JSONException -> L3e java.lang.Throwable -> L74
            r0 = r2
            goto L3e
        L3c:
            r2 = move-exception
            goto L4b
        L3e:
            com.clevertap.android.sdk.db.DBAdapter$ag$a r1 = r11.isLogoutPending     // Catch: java.lang.Throwable -> L83
            r1.close()     // Catch: java.lang.Throwable -> L83
            if (r12 == 0) goto L72
            goto L6f
        L46:
            r12 = move-exception
            goto L78
        L48:
            r12 = move-exception
            r2 = r12
            r12 = r0
        L4b:
            o.setBoundsInScreen r3 = r11.extraCallback()     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r4.<init>()     // Catch: java.lang.Throwable -> L74
            java.lang.String r5 = "Could not fetch records out of database "
            r4.append(r5)     // Catch: java.lang.Throwable -> L74
            r4.append(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "."
            r4.append(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L74
            r3.toString(r1, r2)     // Catch: java.lang.Throwable -> L74
            com.clevertap.android.sdk.db.DBAdapter$ag$a r1 = r11.isLogoutPending     // Catch: java.lang.Throwable -> L83
            r1.close()     // Catch: java.lang.Throwable -> L83
            if (r12 == 0) goto L72
        L6f:
            r12.close()     // Catch: java.lang.Throwable -> L83
        L72:
            monitor-exit(r11)
            return r0
        L74:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
        L78:
            com.clevertap.android.sdk.db.DBAdapter$ag$a r1 = r11.isLogoutPending     // Catch: java.lang.Throwable -> L83
            r1.close()     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L82
            r0.close()     // Catch: java.lang.Throwable -> L83
        L82:
            throw r12     // Catch: java.lang.Throwable -> L83
        L83:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.db.DBAdapter.toString(java.lang.String):org.json.JSONObject");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r12 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r12 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        r12.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long isLogoutPending() {
        /*
            r13 = this;
            monitor-enter(r13)
            com.clevertap.android.sdk.db.DBAdapter$Table r0 = com.clevertap.android.sdk.db.DBAdapter.Table.UNINSTALL_TS     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L6f
            r10 = 0
            r12 = 0
            com.clevertap.android.sdk.db.DBAdapter$ag$a r1 = r13.isLogoutPending     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3a
            android.database.sqlite.SQLiteDatabase r1 = r1.getReadableDatabase()     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3a
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r8 = "created_at DESC"
            java.lang.String r9 = "1"
            r2 = r0
            android.database.Cursor r12 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3a
            if (r12 == 0) goto L30
            boolean r1 = r12.moveToFirst()     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3a
            if (r1 == 0) goto L30
            java.lang.String r1 = "created_at"
            int r1 = r12.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3a
            long r10 = r12.getLong(r1)     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3a
        L30:
            com.clevertap.android.sdk.db.DBAdapter$ag$a r0 = r13.isLogoutPending     // Catch: java.lang.Throwable -> L6f
            r0.close()     // Catch: java.lang.Throwable -> L6f
            if (r12 == 0) goto L62
            goto L5f
        L38:
            r0 = move-exception
            goto L64
        L3a:
            r1 = move-exception
            o.setBoundsInScreen r2 = r13.extraCallback()     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r3.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = "Could not fetch records out of database "
            r3.append(r4)     // Catch: java.lang.Throwable -> L38
            r3.append(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "."
            r3.append(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L38
            r2.toString(r0, r1)     // Catch: java.lang.Throwable -> L38
            com.clevertap.android.sdk.db.DBAdapter$ag$a r0 = r13.isLogoutPending     // Catch: java.lang.Throwable -> L6f
            r0.close()     // Catch: java.lang.Throwable -> L6f
            if (r12 == 0) goto L62
        L5f:
            r12.close()     // Catch: java.lang.Throwable -> L6f
        L62:
            monitor-exit(r13)
            return r10
        L64:
            com.clevertap.android.sdk.db.DBAdapter$ag$a r1 = r13.isLogoutPending     // Catch: java.lang.Throwable -> L6f
            r1.close()     // Catch: java.lang.Throwable -> L6f
            if (r12 == 0) goto L6e
            r12.close()     // Catch: java.lang.Throwable -> L6f
        L6e:
            throw r0     // Catch: java.lang.Throwable -> L6f
        L6f:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.db.DBAdapter.isLogoutPending():long");
    }

    public ArrayList<getRegionAt> ag$a(String str) {
        ArrayList<getRegionAt> arrayList;
        synchronized (this) {
            String name = Table.INBOX_MESSAGES.getName();
            arrayList = new ArrayList<>();
            try {
                try {
                    Cursor query = this.isLogoutPending.getWritableDatabase().query(name, null, "messageUser =?", new String[]{str}, null, null, "created_at DESC");
                    if (query != null) {
                        while (query.moveToNext()) {
                            getRegionAt getregionat = new getRegionAt();
                            getregionat.ag$a(query.getString(query.getColumnIndex("_id")));
                            getregionat.toString(new JSONObject(query.getString(query.getColumnIndex("data"))));
                            getregionat.valueOf(new JSONObject(query.getString(query.getColumnIndex("wzrkParams"))));
                            getregionat.toString(query.getLong(query.getColumnIndex(StringSet.created_at)));
                            getregionat.ah$a(query.getLong(query.getColumnIndex(ClientCookie.EXPIRES_ATTR)));
                            getregionat.toString(query.getInt(query.getColumnIndex("isRead")));
                            getregionat.valueOf(query.getString(query.getColumnIndex("messageUser")));
                            getregionat.values(query.getString(query.getColumnIndex("tags")));
                            getregionat.toString(query.getString(query.getColumnIndex("campaignId")));
                            arrayList.add(getregionat);
                        }
                        query.close();
                    }
                    this.isLogoutPending.close();
                } catch (JSONException e) {
                    setBoundsInScreen extraCallback = extraCallback();
                    extraCallback.ah$a("Error retrieving records from " + name, e.getMessage());
                    this.isLogoutPending.close();
                    return null;
                }
            } catch (SQLiteException e2) {
                setBoundsInScreen extraCallback2 = extraCallback();
                extraCallback2.toString("Error retrieving records from " + name, e2);
                this.isLogoutPending.close();
                return null;
            }
        }
        return arrayList;
    }

    public boolean ah$a(String str, String str2) {
        synchronized (this) {
            if (str == null || str2 == null) {
                return false;
            }
            String name = Table.INBOX_MESSAGES.getName();
            try {
                SQLiteDatabase writableDatabase = this.isLogoutPending.getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put("isRead", (Integer) 1);
                writableDatabase.update(Table.INBOX_MESSAGES.getName(), contentValues, "_id = ? AND messageUser = ?", new String[]{str, str2});
                this.isLogoutPending.close();
                return true;
            } catch (SQLiteException e) {
                setBoundsInScreen extraCallback = extraCallback();
                extraCallback.toString("Error removing stale records from " + name, e);
                this.isLogoutPending.close();
                return false;
            }
        }
    }

    public void values(String str) {
        synchronized (this) {
            if (str == null) {
                return;
            }
            String name = Table.USER_PROFILES.getName();
            try {
                this.isLogoutPending.getWritableDatabase().delete(name, "_id = ?", new String[]{str});
            } catch (SQLiteException unused) {
                setBoundsInScreen extraCallback = extraCallback();
                extraCallback.HaptikSDK$b("Error removing user profile from " + name + " Recreating DB");
                this.isLogoutPending.ag$a();
            }
            this.isLogoutPending.close();
        }
    }

    public void ak$a() {
        synchronized (this) {
            if (!ak$b()) {
                extraCallback().HaptikSDK$b("There is not enough space left on the device to store data, data discarded");
                return;
            }
            String name = Table.UNINSTALL_TS.getName();
            try {
                SQLiteDatabase writableDatabase = this.isLogoutPending.getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put(StringSet.created_at, Long.valueOf(System.currentTimeMillis()));
                writableDatabase.insert(name, null, contentValues);
            } catch (SQLiteException unused) {
                setBoundsInScreen extraCallback = extraCallback();
                extraCallback.HaptikSDK$b("Error adding data to table " + name + " Recreating DB");
                this.isLogoutPending.ag$a();
            }
            this.isLogoutPending.close();
        }
    }

    public long ag$a(String str, JSONObject jSONObject) {
        synchronized (this) {
            long j = -1;
            if (str == null) {
                return -1L;
            }
            if (!ak$b()) {
                extraCallback().HaptikSDK$b("There is not enough space left on the device to store data, data discarded");
                return -2L;
            }
            String name = Table.USER_PROFILES.getName();
            try {
                SQLiteDatabase writableDatabase = this.isLogoutPending.getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put("data", jSONObject.toString());
                contentValues.put("_id", str);
                j = writableDatabase.insertWithOnConflict(name, null, contentValues, 5);
            } catch (SQLiteException unused) {
                setBoundsInScreen extraCallback = extraCallback();
                extraCallback.HaptikSDK$b("Error adding data to table " + name + " Recreating DB");
                this.isLogoutPending.ag$a();
            }
            this.isLogoutPending.close();
            return j;
        }
    }

    public void toString(ArrayList<getRegionAt> arrayList) {
        synchronized (this) {
            if (!ak$b()) {
                setBoundsInScreen.values("There is not enough space left on the device to store data, data discarded");
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.isLogoutPending.getWritableDatabase();
                Iterator<getRegionAt> it = arrayList.iterator();
                while (it.hasNext()) {
                    getRegionAt next = it.next();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_id", next.HaptikSDK$c());
                    contentValues.put("data", next.ah$b().toString());
                    contentValues.put("wzrkParams", next.HaptikSDK$b().toString());
                    contentValues.put("campaignId", next.valueOf());
                    contentValues.put("tags", next.HaptikSDK$a());
                    contentValues.put("isRead", Integer.valueOf(next.HaptikSDK$d()));
                    contentValues.put(ClientCookie.EXPIRES_ATTR, Long.valueOf(next.ah$a()));
                    contentValues.put(StringSet.created_at, Long.valueOf(next.ag$a()));
                    contentValues.put("messageUser", next.invoke());
                    writableDatabase.insertWithOnConflict(Table.INBOX_MESSAGES.getName(), null, contentValues, 5);
                }
            } catch (SQLiteException unused) {
                setBoundsInScreen extraCallback = extraCallback();
                extraCallback.HaptikSDK$b("Error adding data to table " + Table.INBOX_MESSAGES.getName());
            }
            this.isLogoutPending.close();
        }
    }

    public void a() {
        synchronized (this) {
            toString(Table.PUSH_NOTIFICATIONS, 0L);
        }
    }

    public void ag$a(String str, Table table) {
        synchronized (this) {
            String name = table.getName();
            try {
                SQLiteDatabase writableDatabase = this.isLogoutPending.getWritableDatabase();
                writableDatabase.delete(name, "_id <= " + str, null);
            } catch (SQLiteException unused) {
                setBoundsInScreen extraCallback = extraCallback();
                extraCallback.HaptikSDK$b("Error removing sent data from table " + name + " Recreating DB");
                ICustomTabsCallback();
            }
            this.isLogoutPending.close();
        }
    }

    public void ah$a(String str, long j) {
        synchronized (this) {
            if (str == null) {
                return;
            }
            if (!ak$b()) {
                extraCallback().HaptikSDK$b("There is not enough space left on the device to store data, data discarded");
                return;
            }
            String name = Table.PUSH_NOTIFICATIONS.getName();
            if (j <= 0) {
                j = System.currentTimeMillis() + 345600000;
            }
            try {
                SQLiteDatabase writableDatabase = this.isLogoutPending.getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put("data", str);
                contentValues.put(StringSet.created_at, Long.valueOf(j));
                contentValues.put("isRead", (Integer) 0);
                writableDatabase.insert(name, null, contentValues);
                this.a = true;
                setBoundsInScreen.values("Stored PN - " + str + " with TTL - " + j);
            } catch (SQLiteException unused) {
                setBoundsInScreen extraCallback = extraCallback();
                extraCallback.HaptikSDK$b("Error adding data to table " + name + " Recreating DB");
                this.isLogoutPending.ag$a();
            }
            this.isLogoutPending.close();
        }
    }

    public void valueOf(Table table) {
        synchronized (this) {
            toString(table, 432000000L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: all -> 0x00a0, TryCatch #1 {, blocks: (B:3:0x0001, B:14:0x004b, B:16:0x0052, B:30:0x0087, B:25:0x007a, B:27:0x0081, B:37:0x0095, B:39:0x009c, B:40:0x009f), top: B:48:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject valueOf(com.clevertap.android.sdk.db.DBAdapter.Table r12, int r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.lang.String r12 = r12.getName()     // Catch: java.lang.Throwable -> La0
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch: java.lang.Throwable -> La0
            r9.<init>()     // Catch: java.lang.Throwable -> La0
            r10 = 0
            com.clevertap.android.sdk.db.DBAdapter$ag$a r0 = r11.isLogoutPending     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5a
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5a
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = "created_at ASC"
            java.lang.String r8 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5a
            r1 = r12
            android.database.Cursor r13 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5a
            r0 = r10
        L22:
            boolean r1 = r13.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L56 java.lang.Throwable -> L93
            if (r1 == 0) goto L4b
            boolean r1 = r13.isLast()     // Catch: android.database.sqlite.SQLiteException -> L56 java.lang.Throwable -> L93
            if (r1 == 0) goto L38
            java.lang.String r0 = "_id"
            int r0 = r13.getColumnIndex(r0)     // Catch: android.database.sqlite.SQLiteException -> L56 java.lang.Throwable -> L93
            java.lang.String r0 = r13.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L56 java.lang.Throwable -> L93
        L38:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L22 android.database.sqlite.SQLiteException -> L56 java.lang.Throwable -> L93
            java.lang.String r2 = "data"
            int r2 = r13.getColumnIndex(r2)     // Catch: org.json.JSONException -> L22 android.database.sqlite.SQLiteException -> L56 java.lang.Throwable -> L93
            java.lang.String r2 = r13.getString(r2)     // Catch: org.json.JSONException -> L22 android.database.sqlite.SQLiteException -> L56 java.lang.Throwable -> L93
            r1.<init>(r2)     // Catch: org.json.JSONException -> L22 android.database.sqlite.SQLiteException -> L56 java.lang.Throwable -> L93
            r9.put(r1)     // Catch: org.json.JSONException -> L22 android.database.sqlite.SQLiteException -> L56 java.lang.Throwable -> L93
            goto L22
        L4b:
            com.clevertap.android.sdk.db.DBAdapter$ag$a r12 = r11.isLogoutPending     // Catch: java.lang.Throwable -> La0
            r12.close()     // Catch: java.lang.Throwable -> La0
            if (r13 == 0) goto L85
            r13.close()     // Catch: java.lang.Throwable -> La0
            goto L85
        L56:
            r0 = move-exception
            goto L5d
        L58:
            r12 = move-exception
            goto L95
        L5a:
            r13 = move-exception
            r0 = r13
            r13 = r10
        L5d:
            o.setBoundsInScreen r1 = r11.extraCallback()     // Catch: java.lang.Throwable -> L93
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r2.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = "Could not fetch records out of database "
            r2.append(r3)     // Catch: java.lang.Throwable -> L93
            r2.append(r12)     // Catch: java.lang.Throwable -> L93
            java.lang.String r12 = "."
            r2.append(r12)     // Catch: java.lang.Throwable -> L93
            java.lang.String r12 = r2.toString()     // Catch: java.lang.Throwable -> L93
            r1.toString(r12, r0)     // Catch: java.lang.Throwable -> L93
            com.clevertap.android.sdk.db.DBAdapter$ag$a r12 = r11.isLogoutPending     // Catch: java.lang.Throwable -> La0
            r12.close()     // Catch: java.lang.Throwable -> La0
            if (r13 == 0) goto L84
            r13.close()     // Catch: java.lang.Throwable -> La0
        L84:
            r0 = r10
        L85:
            if (r0 == 0) goto L91
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> La0
            r12.<init>()     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> La0
            r12.put(r0, r9)     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> La0
            monitor-exit(r11)
            return r12
        L91:
            monitor-exit(r11)
            return r10
        L93:
            r12 = move-exception
            r10 = r13
        L95:
            com.clevertap.android.sdk.db.DBAdapter$ag$a r13 = r11.isLogoutPending     // Catch: java.lang.Throwable -> La0
            r13.close()     // Catch: java.lang.Throwable -> La0
            if (r10 == 0) goto L9f
            r10.close()     // Catch: java.lang.Throwable -> La0
        L9f:
            throw r12     // Catch: java.lang.Throwable -> La0
        La0:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.db.DBAdapter.valueOf(com.clevertap.android.sdk.db.DBAdapter$Table, int):org.json.JSONObject");
    }

    public void valueOf(String[] strArr) {
        synchronized (this) {
            if (strArr.length == 0) {
                return;
            }
            if (!ak$b()) {
                setBoundsInScreen.values("There is not enough space left on the device to store data, data discarded");
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.isLogoutPending.getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put("isRead", (Integer) 1);
                StringBuilder sb = new StringBuilder();
                sb.append("?");
                for (int i = 0; i < strArr.length - 1; i++) {
                    sb.append(", ?");
                }
                String name = Table.PUSH_NOTIFICATIONS.getName();
                writableDatabase.update(name, contentValues, "data IN ( " + sb.toString() + " )", strArr);
                this.a = false;
            } catch (SQLiteException unused) {
                setBoundsInScreen extraCallback = extraCallback();
                extraCallback.HaptikSDK$b("Error adding data to table " + Table.PUSH_NOTIFICATIONS.getName() + " Recreating DB");
                this.isLogoutPending.ag$a();
            }
            this.isLogoutPending.close();
        }
    }

    public int toString(JSONObject jSONObject, Table table) {
        synchronized (this) {
            if (!ak$b()) {
                setBoundsInScreen.values("There is not enough space left on the device to store data, data discarded");
                return -2;
            }
            String name = table.getName();
            long j = -1;
            try {
                SQLiteDatabase writableDatabase = this.isLogoutPending.getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put("data", jSONObject.toString());
                contentValues.put(StringSet.created_at, Long.valueOf(System.currentTimeMillis()));
                writableDatabase.insert(name, null, contentValues);
                j = writableDatabase.compileStatement("SELECT COUNT(*) FROM " + name).simpleQueryForLong();
            } catch (SQLiteException unused) {
                setBoundsInScreen extraCallback = extraCallback();
                extraCallback.HaptikSDK$b("Error adding data to table " + name + " Recreating DB");
                this.isLogoutPending.ag$a();
            }
            this.isLogoutPending.close();
            return (int) j;
        }
    }

    public void ag$a(Table table) {
        synchronized (this) {
            String name = table.getName();
            try {
                this.isLogoutPending.getWritableDatabase().delete(name, null, null);
            } catch (SQLiteException unused) {
                setBoundsInScreen extraCallback = extraCallback();
                extraCallback.HaptikSDK$b("Error removing all events from table " + name + " Recreating DB");
                ICustomTabsCallback();
            }
            this.isLogoutPending.close();
        }
    }

    private boolean ak$b() {
        return this.isLogoutPending.values();
    }

    private void toString(Table table, long j) {
        long currentTimeMillis = (System.currentTimeMillis() - j) / 1000;
        String name = table.getName();
        try {
            try {
                SQLiteDatabase writableDatabase = this.isLogoutPending.getWritableDatabase();
                writableDatabase.delete(name, "created_at <= " + currentTimeMillis, null);
            } catch (SQLiteException e) {
                setBoundsInScreen extraCallback = extraCallback();
                extraCallback.toString("Error removing stale event records from " + name + ". Recreating DB.", e);
                ICustomTabsCallback();
            }
        } finally {
            this.isLogoutPending.close();
        }
    }

    private void ICustomTabsCallback() {
        this.isLogoutPending.ag$a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (r10 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        if (r10 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
        r10.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String ah$a(java.lang.String r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            com.clevertap.android.sdk.db.DBAdapter$Table r0 = com.clevertap.android.sdk.db.DBAdapter.Table.PUSH_NOTIFICATIONS     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L86
            java.lang.String r9 = ""
            r10 = 0
            com.clevertap.android.sdk.db.DBAdapter$ag$a r1 = r11.isLogoutPending     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteException -> L51
            android.database.sqlite.SQLiteDatabase r1 = r1.getReadableDatabase()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteException -> L51
            r2 = 1
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteException -> L51
            r2 = 0
            r5[r2] = r12     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteException -> L51
            r3 = 0
            java.lang.String r4 = "data =?"
            r6 = 0
            r7 = 0
            r8 = 0
            r2 = r0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteException -> L51
            if (r10 == 0) goto L33
            boolean r12 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteException -> L51
            if (r12 == 0) goto L33
            java.lang.String r12 = "data"
            int r12 = r10.getColumnIndex(r12)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteException -> L51
            java.lang.String r9 = r10.getString(r12)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteException -> L51
        L33:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteException -> L51
            r12.<init>()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteException -> L51
            java.lang.String r1 = "Fetching PID for check - "
            r12.append(r1)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteException -> L51
            r12.append(r9)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteException -> L51
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteException -> L51
            o.setBoundsInScreen.values(r12)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteException -> L51
            com.clevertap.android.sdk.db.DBAdapter$ag$a r12 = r11.isLogoutPending     // Catch: java.lang.Throwable -> L86
            r12.close()     // Catch: java.lang.Throwable -> L86
            if (r10 == 0) goto L79
            goto L76
        L4f:
            r12 = move-exception
            goto L7b
        L51:
            r12 = move-exception
            o.setBoundsInScreen r1 = r11.extraCallback()     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r2.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = "Could not fetch records out of database "
            r2.append(r3)     // Catch: java.lang.Throwable -> L4f
            r2.append(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = "."
            r2.append(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L4f
            r1.toString(r0, r12)     // Catch: java.lang.Throwable -> L4f
            com.clevertap.android.sdk.db.DBAdapter$ag$a r12 = r11.isLogoutPending     // Catch: java.lang.Throwable -> L86
            r12.close()     // Catch: java.lang.Throwable -> L86
            if (r10 == 0) goto L79
        L76:
            r10.close()     // Catch: java.lang.Throwable -> L86
        L79:
            monitor-exit(r11)
            return r9
        L7b:
            com.clevertap.android.sdk.db.DBAdapter$ag$a r0 = r11.isLogoutPending     // Catch: java.lang.Throwable -> L86
            r0.close()     // Catch: java.lang.Throwable -> L86
            if (r10 == 0) goto L85
            r10.close()     // Catch: java.lang.Throwable -> L86
        L85:
            throw r12     // Catch: java.lang.Throwable -> L86
        L86:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.db.DBAdapter.ah$a(java.lang.String):java.lang.String");
    }

    private setBoundsInScreen extraCallback() {
        return this.onXdkEvent.HaptikSDK$c();
    }

    private static String ag$a(CleverTapInstanceConfig cleverTapInstanceConfig) {
        if (cleverTapInstanceConfig.a()) {
            return "clevertap";
        }
        return "clevertap_" + cleverTapInstanceConfig.valueOf();
    }
}

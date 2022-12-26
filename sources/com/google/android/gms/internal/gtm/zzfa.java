package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.google.android.gms.common.util.Clock;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzfa extends SQLiteOpenHelper {
    private boolean zzail;
    private long zzaim;
    private final /* synthetic */ zzey zzaom;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfa(zzey zzeyVar, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.zzaom = zzeyVar;
        this.zzaim = 0L;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private static boolean zza(String str, SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            boolean moveToFirst = cursor.moveToFirst();
            if (cursor != null) {
                cursor.close();
            }
            return moveToFirst;
        } catch (SQLiteException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        Clock clock;
        Context context;
        String str;
        Clock clock2;
        if (this.zzail) {
            long j = this.zzaim;
            clock2 = this.zzaom.zzsd;
            if (j + 3600000 > clock2.currentTimeMillis()) {
                throw new SQLiteException("Database creation failed");
            }
        }
        SQLiteDatabase sQLiteDatabase = null;
        this.zzail = true;
        clock = this.zzaom.zzsd;
        this.zzaim = clock.currentTimeMillis();
        try {
            sQLiteDatabase = super.getWritableDatabase();
        } catch (SQLiteException unused) {
            context = this.zzaom.zzrm;
            str = this.zzaom.zzaih;
            context.getDatabasePath(str).delete();
        }
        if (sQLiteDatabase == null) {
            sQLiteDatabase = super.getWritableDatabase();
        }
        this.zzail = false;
        return sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String str;
        String str2;
        String str3;
        String str4;
        if (Build.VERSION.SDK_INT < 15) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
            try {
                rawQuery.moveToFirst();
            } finally {
                rawQuery.close();
            }
        }
        if (zza("gtm_hit_unique_ids", sQLiteDatabase)) {
            zza(sQLiteDatabase, "gtm_hit_unique_ids", Arrays.asList("hit_unique_id"));
        } else {
            str4 = zzey.zzaog;
            sQLiteDatabase.execSQL(str4);
        }
        if (zza("gtm_hits", sQLiteDatabase)) {
            zza(sQLiteDatabase, "gtm_hits", Arrays.asList("hit_id", "hit_url", "hit_time", "hit_first_send_time", "hit_method", "hit_unique_id", "hit_headers", "hit_body"));
        } else {
            str3 = zzey.zzxj;
            sQLiteDatabase.execSQL(str3);
        }
        str = zzey.zzaoh;
        sQLiteDatabase.execSQL(str);
        str2 = zzey.zzaoi;
        sQLiteDatabase.execSQL(str2);
    }

    private static void zza(SQLiteDatabase sQLiteDatabase, String str, List<String> list) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" WHERE 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        HashSet hashSet = new HashSet();
        try {
            for (String str2 : rawQuery.getColumnNames()) {
                hashSet.add(str2);
            }
            rawQuery.close();
            for (String str3 : list) {
                if (!hashSet.remove(str3)) {
                    throw new SQLiteException(String.format("Database column %s missing in table %s.", str3, str));
                }
            }
            if (!hashSet.isEmpty()) {
                throw new SQLiteException(String.format("Database has extra columns in table %s.", str));
            }
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        if (zzeg.version() < 9) {
            return;
        }
        File file = new File(path);
        file.setReadable(false, false);
        file.setWritable(false, false);
        file.setReadable(true, true);
        file.setWritable(true, true);
    }
}

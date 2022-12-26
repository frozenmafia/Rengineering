package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzaz extends SQLiteOpenHelper {
    private final /* synthetic */ zzay zzxo;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaz(zzay zzayVar, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.zzxo = zzayVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        zzcv zzcvVar;
        zzcv zzcvVar2;
        String zzdt;
        zzcv zzcvVar3;
        zzcvVar = this.zzxo.zzxn;
        if (!zzcvVar.zzj(3600000L)) {
            throw new SQLiteException("Database open failed");
        }
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException unused) {
            zzcvVar2 = this.zzxo.zzxn;
            zzcvVar2.start();
            this.zzxo.zzu("Opening the database failed, dropping the table and recreating it");
            zzay zzayVar = this.zzxo;
            zzdt = zzay.zzdt();
            this.zzxo.getContext().getDatabasePath(zzdt).delete();
            try {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                zzcvVar3 = this.zzxo.zzxn;
                zzcvVar3.clear();
                return writableDatabase;
            } catch (SQLiteException e) {
                this.zzxo.zze("Failed to open freshly created database", e);
                throw e;
            }
        }
    }

    private final boolean zza(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                boolean moveToFirst = cursor.moveToFirst();
                if (cursor != null) {
                    cursor.close();
                }
                return moveToFirst;
            } catch (SQLiteException e) {
                this.zzxo.zzc("Error querying for table", str, e);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private static Set<String> zzb(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        try {
            for (String str2 : rawQuery.getColumnNames()) {
                hashSet.add(str2);
            }
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String str;
        if (Build.VERSION.SDK_INT < 15) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
            try {
                rawQuery.moveToFirst();
            } finally {
                rawQuery.close();
            }
        }
        if (zza(sQLiteDatabase, "hits2")) {
            Set<String> zzb = zzb(sQLiteDatabase, "hits2");
            String[] strArr = {"hit_id", "hit_string", "hit_time", "hit_url"};
            for (int i = 0; i < 4; i++) {
                String str2 = strArr[i];
                if (!zzb.remove(str2)) {
                    String valueOf = String.valueOf(str2);
                    throw new SQLiteException(valueOf.length() != 0 ? "Database hits2 is missing required column: ".concat(valueOf) : new String("Database hits2 is missing required column: "));
                }
            }
            boolean remove = zzb.remove("hit_app_id");
            if (!zzb.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            }
            if (!remove) {
                sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
            }
        } else {
            str = zzay.zzxj;
            sQLiteDatabase.execSQL(str);
        }
        if (!zza(sQLiteDatabase, "properties")) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
            return;
        }
        Set<String> zzb2 = zzb(sQLiteDatabase, "properties");
        String[] strArr2 = {"app_uid", "cid", "tid", "params", "adid", "hits_count"};
        for (int i2 = 0; i2 < 6; i2++) {
            String str3 = strArr2[i2];
            if (!zzb2.remove(str3)) {
                String valueOf2 = String.valueOf(str3);
                throw new SQLiteException(valueOf2.length() != 0 ? "Database properties is missing required column: ".concat(valueOf2) : new String("Database properties is missing required column: "));
            }
        }
        if (!zzb2.isEmpty()) {
            throw new SQLiteException("Database properties table has extra columns");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        if (zzbx.version() < 9) {
            return;
        }
        File file = new File(path);
        file.setReadable(false, false);
        file.setWritable(false, false);
        file.setReadable(true, true);
        file.setWritable(true, true);
    }
}

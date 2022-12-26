package o;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
/* loaded from: classes5.dex */
public class addMigration extends SQLiteOpenHelper {
    private static addMigration ag$a;
    private Context ah$a;
    private SQLiteDatabase toString;
    private long values;

    private addMigration(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.values = findUpMigrationPath.toString.longValue() * android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID * android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        this.ah$a = context;
    }

    public static addMigration valueOf(Context context) {
        if (ag$a == null) {
            ag$a = new addMigration(context.getApplicationContext());
        }
        return ag$a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != i2) {
            HaptikSDK$c();
            onCreate(sQLiteDatabase);
        }
    }

    public boolean valueOf() {
        synchronized (this) {
            SQLiteDatabase sQLiteDatabase = this.toString;
            if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                SQLiteException e = null;
                for (int i = 0; i < 2; i++) {
                    if (i > 0) {
                        try {
                            HaptikSDK$c();
                        } catch (SQLiteException e2) {
                            e = e2;
                            try {
                                Thread.sleep(30L);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                    this.toString = getWritableDatabase();
                }
                SQLiteDatabase sQLiteDatabase2 = this.toString;
                if (sQLiteDatabase2 == null) {
                    throw e;
                }
                sQLiteDatabase2.setMaximumSize(this.values);
                return true;
            }
            return true;
        }
    }

    public SQLiteDatabase ah$b() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this) {
            valueOf();
            sQLiteDatabase = this.toString;
        }
        return sQLiteDatabase;
    }

    public void values() throws RuntimeException {
        synchronized (this) {
            try {
                ah$a();
                ag$a();
                FragmentActivity.toString("ReactNative", "Cleaned RKStorage");
            } catch (Exception unused) {
                if (HaptikSDK$c()) {
                    FragmentActivity.toString("ReactNative", "Deleted Local Database RKStorage");
                    return;
                }
                throw new RuntimeException("Clearing and deleting database RKStorage failed");
            }
        }
    }

    public void ah$a() {
        synchronized (this) {
            ah$b().delete("catalystLocalStorage", null, null);
        }
    }

    private boolean HaptikSDK$c() {
        boolean deleteDatabase;
        synchronized (this) {
            ag$a();
            deleteDatabase = this.ah$a.deleteDatabase("RKStorage");
        }
        return deleteDatabase;
    }

    public void ag$a() {
        synchronized (this) {
            SQLiteDatabase sQLiteDatabase = this.toString;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                this.toString.close();
                this.toString = null;
            }
        }
    }
}

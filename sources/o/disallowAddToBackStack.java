package o;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
/* loaded from: classes4.dex */
public class disallowAddToBackStack extends SQLiteOpenHelper {
    private static disallowAddToBackStack values;
    private Context ah$a;
    private SQLiteDatabase toString;
    private long valueOf;

    private disallowAddToBackStack(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.valueOf = 6291456L;
        this.ah$a = context;
    }

    public static disallowAddToBackStack toString(Context context) {
        if (values == null) {
            values = new disallowAddToBackStack(context.getApplicationContext());
        }
        return values;
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

    public boolean ah$a() {
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
                sQLiteDatabase2.setMaximumSize(this.valueOf);
                return true;
            }
            return true;
        }
    }

    public SQLiteDatabase ag$a() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this) {
            ah$a();
            sQLiteDatabase = this.toString;
        }
        return sQLiteDatabase;
    }

    public void valueOf() throws RuntimeException {
        synchronized (this) {
            try {
                values();
                invoke();
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

    public void values() {
        synchronized (this) {
            ag$a().delete("catalystLocalStorage", null, null);
        }
    }

    private boolean HaptikSDK$c() {
        boolean deleteDatabase;
        synchronized (this) {
            invoke();
            deleteDatabase = this.ah$a.deleteDatabase("RKStorage");
        }
        return deleteDatabase;
    }

    private void invoke() {
        synchronized (this) {
            SQLiteDatabase sQLiteDatabase = this.toString;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                this.toString.close();
                this.toString = null;
            }
        }
    }
}

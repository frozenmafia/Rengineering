package o;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class setDefaultValue extends SQLiteOpenHelper {
    private static final toString HaptikSDK$b;
    private static final toString HaptikSDK$c;
    private static final List<toString> ah$a;
    private static final toString invoke;
    private static final toString valueOf;
    private static final toString values;
    private final int HaptikSDK$a;
    private boolean ah$b;
    private static final String toString = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";
    static int ag$a = 5;

    /* loaded from: classes7.dex */
    public interface toString {
        void ah$a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        setCopyingEnabled setcopyingenabled = setCopyingEnabled.valueOf;
        values = setcopyingenabled;
        setIconSpaceReserved seticonspacereserved = setIconSpaceReserved.values;
        valueOf = seticonspacereserved;
        setFragment setfragment = setFragment.valueOf;
        HaptikSDK$b = setfragment;
        setDependency setdependency = setDependency.toString;
        HaptikSDK$c = setdependency;
        setOnPreferenceClickListener setonpreferenceclicklistener = setOnPreferenceClickListener.toString;
        invoke = setonpreferenceclicklistener;
        ah$a = Arrays.asList(setcopyingenabled, seticonspacereserved, setfragment, setdependency, setonpreferenceclicklistener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void ag$a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void valueOf(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void toString(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void ah$a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(toString);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @setTopLeft
    public setDefaultValue(Context context, @centerCropMatrix(values = "SQLITE_DB_NAME") String str, @centerCropMatrix(values = "SCHEMA_VERSION") int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.ah$b = false;
        this.HaptikSDK$a = i;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.ah$b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    private void invoke(SQLiteDatabase sQLiteDatabase) {
        if (this.ah$b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        valueOf(sQLiteDatabase, this.HaptikSDK$a);
    }

    private void valueOf(SQLiteDatabase sQLiteDatabase, int i) {
        invoke(sQLiteDatabase);
        values(sQLiteDatabase, 0, i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        invoke(sQLiteDatabase);
        values(sQLiteDatabase, i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        valueOf(sQLiteDatabase, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        invoke(sQLiteDatabase);
    }

    private void values(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<toString> list = ah$a;
        if (i2 <= list.size()) {
            while (i < i2) {
                ah$a.get(i).ah$a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }
}

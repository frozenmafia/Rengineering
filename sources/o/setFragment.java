package o;

import android.database.sqlite.SQLiteDatabase;
import o.setDefaultValue;
/* loaded from: classes7.dex */
public final /* synthetic */ class setFragment implements setDefaultValue.toString {
    public static final /* synthetic */ setFragment valueOf = new setFragment();

    private /* synthetic */ setFragment() {
    }

    @Override // o.setDefaultValue.toString
    public final void ah$a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}

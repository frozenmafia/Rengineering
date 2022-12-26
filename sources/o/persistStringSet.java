package o;

import android.database.Cursor;
import o.getPreferenceDataStore;
/* loaded from: classes7.dex */
public final /* synthetic */ class persistStringSet implements getPreferenceDataStore.toString {
    public static final /* synthetic */ persistStringSet values = new persistStringSet();

    private /* synthetic */ persistStringSet() {
    }

    @Override // o.getPreferenceDataStore.toString
    public final Object ah$a(Object obj) {
        return getPreferenceDataStore.values((Cursor) obj);
    }
}

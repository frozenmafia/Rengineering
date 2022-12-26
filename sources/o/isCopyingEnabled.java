package o;

import android.database.Cursor;
import o.getPreferenceDataStore;
/* loaded from: classes7.dex */
public final /* synthetic */ class isCopyingEnabled implements getPreferenceDataStore.toString {
    public static final /* synthetic */ isCopyingEnabled toString = new isCopyingEnabled();

    private /* synthetic */ isCopyingEnabled() {
    }

    @Override // o.getPreferenceDataStore.toString
    public final Object ah$a(Object obj) {
        Boolean valueOf;
        Cursor cursor = (Cursor) obj;
        valueOf = Boolean.valueOf(r0.getCount() > 0);
        return valueOf;
    }
}

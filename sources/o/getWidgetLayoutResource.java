package o;

import android.database.Cursor;
import o.getPreferenceDataStore;
/* loaded from: classes7.dex */
public final /* synthetic */ class getWidgetLayoutResource implements getPreferenceDataStore.toString {
    public static final /* synthetic */ getWidgetLayoutResource ag$a = new getWidgetLayoutResource();

    private /* synthetic */ getWidgetLayoutResource() {
    }

    @Override // o.getPreferenceDataStore.toString
    public final Object ah$a(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}

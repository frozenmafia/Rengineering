package o;

import o.edit;
/* loaded from: classes3.dex */
public final /* synthetic */ class SharedPreferencesKt implements FrameworkSQLiteOpenHelper {
    public static final /* synthetic */ SharedPreferencesKt ah$a = new SharedPreferencesKt();

    private /* synthetic */ SharedPreferencesKt() {
    }

    @Override // o.FrameworkSQLiteOpenHelper
    public final Object apply(Object obj, Object obj2) {
        Boolean valueOf;
        valueOf = edit.Cdefault.valueOf((Boolean) obj, (Boolean) obj2);
        return valueOf;
    }
}

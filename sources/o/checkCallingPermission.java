package o;

import java.util.List;
/* loaded from: classes3.dex */
public final /* synthetic */ class checkCallingPermission implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ checkCallingPermission ah$a = new checkCallingPermission();

    private /* synthetic */ checkCallingPermission() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean ah$a2;
        ah$a2 = SharedPreferencesCompat.ah$a((List) obj);
        return ah$a2;
    }
}

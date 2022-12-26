package o;
/* loaded from: classes.dex */
public final /* synthetic */ class setScrollIndicators implements FrameworkSQLiteOpenHelper {
    public static final /* synthetic */ setScrollIndicators valueOf = new setScrollIndicators();

    private /* synthetic */ setScrollIndicators() {
    }

    @Override // o.FrameworkSQLiteOpenHelper
    public final Object apply(Object obj, Object obj2) {
        Boolean valueOf2;
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        valueOf2 = Boolean.valueOf(r0.booleanValue() && !r1.booleanValue());
        return valueOf2;
    }
}

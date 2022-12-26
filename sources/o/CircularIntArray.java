package o;
/* loaded from: classes3.dex */
public final /* synthetic */ class CircularIntArray implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ CircularIntArray ah$a = new CircularIntArray();

    private /* synthetic */ CircularIntArray() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean ah$b;
        ah$b = removeFromEnd.ah$b((valueAt) obj);
        return ah$b;
    }
}

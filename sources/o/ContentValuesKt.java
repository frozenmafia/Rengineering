package o;

import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes3.dex */
public final /* synthetic */ class ContentValuesKt implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ ContentValuesKt valueOf = new ContentValuesKt();

    private /* synthetic */ ContentValuesKt() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Iterable valueOf2;
        valueOf2 = ContentResolverCompat.valueOf((CopyOnWriteArrayList) obj);
        return valueOf2;
    }
}

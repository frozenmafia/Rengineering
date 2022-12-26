package o;

import com.google.common.base.Optional;
/* loaded from: classes3.dex */
public final /* synthetic */ class buildShadowCorners implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ buildShadowCorners valueOf = new buildShadowCorners();

    private /* synthetic */ buildShadowCorners() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Long valueOf2;
        valueOf2 = Long.valueOf(r2.isPresent() ? ((Long) ((Optional) obj).get()).longValue() : 0L);
        return valueOf2;
    }
}

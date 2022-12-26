package o;

import com.app.dream11.model.DynamicModel;
import com.google.common.base.Optional;
/* loaded from: classes3.dex */
public final /* synthetic */ class getMaxElevation implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getMaxElevation valueOf = new getMaxElevation();

    private /* synthetic */ getMaxElevation() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return (DynamicModel) ((Optional) obj).get();
    }
}

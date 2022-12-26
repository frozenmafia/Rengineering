package o;

import com.app.dream11.teampreviewnew.TeamPreviewVMModel;
import java.util.Date;
/* loaded from: classes3.dex */
public final /* synthetic */ class ensureServiceUnbound implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ ensureServiceUnbound ag$a = new ensureServiceUnbound();

    private /* synthetic */ ensureServiceUnbound() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Date warmup;
        warmup = checkPermission.warmup((TeamPreviewVMModel) obj);
        return warmup;
    }
}

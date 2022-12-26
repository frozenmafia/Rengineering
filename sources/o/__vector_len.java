package o;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
/* loaded from: classes7.dex */
public abstract class __vector_len<T> implements SupportSQLiteOpenHelper<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
    final AtomicReference<getSidecarVersion> HaptikSDK$a = new AtomicReference<>();

    @Override // o.SupportSQLiteOpenHelper, o.registerConfigurationChangeListener
    public final void onSubscribe(getSidecarVersion getsidecarversion) {
        if (canChildScrollUp.values(this.HaptikSDK$a, getsidecarversion, getClass())) {
            ag$a();
        }
    }

    protected void ag$a() {
        this.HaptikSDK$a.get().request(Long.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void valueOf() {
        dispose();
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public final boolean isDisposed() {
        return this.HaptikSDK$a.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public final void dispose() {
        SubscriptionHelper.cancel(this.HaptikSDK$a);
    }
}

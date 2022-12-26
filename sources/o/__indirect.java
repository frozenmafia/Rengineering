package o;
/* loaded from: classes5.dex */
public abstract class __indirect<T> implements SupportSQLiteOpenHelper<T> {
    getSidecarVersion HaptikSDK$a;

    @Override // o.SupportSQLiteOpenHelper, o.registerConfigurationChangeListener
    public final void onSubscribe(getSidecarVersion getsidecarversion) {
        if (canChildScrollUp.values(this.HaptikSDK$a, getsidecarversion, getClass())) {
            this.HaptikSDK$a = getsidecarversion;
            values();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void values(long j) {
        getSidecarVersion getsidecarversion = this.HaptikSDK$a;
        if (getsidecarversion != null) {
            getsidecarversion.request(j);
        }
    }

    protected void values() {
        values(Long.MAX_VALUE);
    }
}

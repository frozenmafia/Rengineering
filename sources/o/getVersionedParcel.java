package o;
/* loaded from: classes5.dex */
public final class getVersionedParcel {
    public static final getVersionedParcel values = new getVersionedParcel();
    private static final ThreadLocal<getTrimPathStart> valueOf = new ThreadLocal<>();

    private getVersionedParcel() {
    }

    public final getTrimPathStart ah$a() {
        ThreadLocal<getTrimPathStart> threadLocal = valueOf;
        getTrimPathStart gettrimpathstart = threadLocal.get();
        if (gettrimpathstart == null) {
            getTrimPathStart ah$a = setStrokeAlpha.ah$a();
            threadLocal.set(ah$a);
            return ah$a;
        }
        return gettrimpathstart;
    }

    public final getTrimPathStart valueOf() {
        return valueOf.get();
    }

    public final void values() {
        valueOf.set(null);
    }

    public final void values(getTrimPathStart gettrimpathstart) {
        valueOf.set(gettrimpathstart);
    }
}

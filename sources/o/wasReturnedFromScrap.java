package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class wasReturnedFromScrap extends dispatchAddFinished {
    private final sortAndDedup ag$a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wasReturnedFromScrap(sortAndDedup sortanddedup) {
        this.ag$a = sortanddedup;
    }

    @Override // o.dispatchAddFinished
    public boolean ah$a() {
        return this.ag$a.invoke() && (this.ag$a.HaptikSDK$b() > 0 || this.ag$a.valueOf() > 0 || (this.ag$a.HaptikSDK$c() && this.ag$a.ah$b().ag$a()));
    }
}

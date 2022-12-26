package o;
/* loaded from: classes3.dex */
public final /* synthetic */ class LruCacheKt implements getAlwaysExpand {
    public static final /* synthetic */ LruCacheKt ah$a = new LruCacheKt();

    private /* synthetic */ LruCacheKt() {
    }

    @Override // o.getAlwaysExpand
    public final void onItemBind(m mVar, int i, Object obj) {
        trimToSize.ag$a(mVar, i, (getKeySet) obj);
    }
}

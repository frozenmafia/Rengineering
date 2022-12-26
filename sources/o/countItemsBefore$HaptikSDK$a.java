package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class countItemsBefore$HaptikSDK$a<V> implements Runnable {
    final animateAddImpl<? extends V> ah$a;
    final countItemsBefore<V> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public countItemsBefore$HaptikSDK$a(countItemsBefore<V> countitemsbefore, animateAddImpl<? extends V> animateaddimpl) {
        this.values = countitemsbefore;
        this.ah$a = animateaddimpl;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object ag$a;
        if (this.values.HaptikSDK$a != this) {
            return;
        }
        ag$a = countItemsBefore.ag$a((animateAddImpl<?>) this.ah$a);
        if (countItemsBefore.valueOf.ah$a(this.values, this, ag$a)) {
            countItemsBefore.valueOf((countItemsBefore<?>) this.values);
        }
    }
}

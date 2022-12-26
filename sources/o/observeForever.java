package o;
/* loaded from: classes6.dex */
public final class observeForever extends upFrom {
    private final shouldBeActive valueOf;

    public observeForever(int i, int i2) {
        super(i);
        shouldBeActive shouldbeactive = new shouldBeActive();
        this.valueOf = shouldbeactive;
        shouldbeactive.ah$a(i2);
    }

    @Override // o.upFrom
    protected void ag$a(androidx.databinding.ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.setVariable(enforceMainThreadIfNeeded.isLogoutPending, this.valueOf);
        }
    }
}

package o;
/* loaded from: classes.dex */
public abstract class getActionItems {
    private final onActionViewExpanded ag$a;

    public abstract void ah$a();

    public abstract void invoke();

    public abstract void values();

    public getActionItems(onActionViewExpanded onactionviewexpanded) {
        runAnimators.ag$a(onactionviewexpanded, "device");
        this.ag$a = onactionviewexpanded;
    }

    public final onActionViewExpanded ag$a() {
        return this.ag$a;
    }

    public final void valueOf() {
        ah$a();
        values();
        invoke();
    }
}

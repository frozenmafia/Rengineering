package o;
/* loaded from: classes4.dex */
public abstract class collectChangedControllers$ag$a {
    private Object ag$a;
    final /* synthetic */ collectChangedControllers<CONTENT, RESULT> values;

    public abstract boolean ag$a(CONTENT content, boolean z);

    public abstract dispatchOnFragmentViewDestroyed ah$a(CONTENT content);

    public collectChangedControllers$ag$a(collectChangedControllers collectchangedcontrollers) {
        runAnimators.ag$a(collectchangedcontrollers, "this$0");
        this.values = collectchangedcontrollers;
        this.ag$a = collectChangedControllers.valueOf;
    }

    public Object ah$a() {
        return this.ag$a;
    }
}

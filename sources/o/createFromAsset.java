package o;
/* loaded from: classes5.dex */
public class createFromAsset {
    private static createFromAsset ah$a;
    private runInTransaction toString;
    private boolean values;

    private createFromAsset() {
    }

    public static createFromAsset ah$a() {
        createFromAsset createfromasset;
        synchronized (createFromAsset.class) {
            if (ah$a == null) {
                ah$a = new createFromAsset();
            }
            createfromasset = ah$a;
        }
        return createfromasset;
    }

    public runInTransaction ag$a() {
        return this.toString;
    }

    public void toString(runInTransaction runintransaction) {
        this.toString = runintransaction;
    }

    public void toString(boolean z) {
        this.values = z;
    }
}

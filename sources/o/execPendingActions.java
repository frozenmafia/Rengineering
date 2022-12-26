package o;
/* loaded from: classes4.dex */
public class execPendingActions {
    private int toString;
    private int valueOf;
    private boolean values;

    public execPendingActions() {
        values();
    }

    public void values() {
        this.values = false;
        this.valueOf = 4;
        ah$a();
    }

    public void ah$a() {
        this.toString = 0;
    }

    public void values(boolean z) {
        this.values = z;
    }

    public boolean ag$a() {
        return this.values && this.toString < this.valueOf;
    }

    public void valueOf() {
        this.toString++;
    }
}

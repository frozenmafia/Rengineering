package o;
/* loaded from: classes6.dex */
public final class setSelectionArgs extends executePendingTask {
    protected final setSelectionArgs HaptikSDK$a;
    protected String ag$a;
    protected int ah$b;
    protected int toString;
    protected abandon values;

    public setSelectionArgs(setSelectionArgs setselectionargs, abandon abandonVar, int i, int i2, int i3) {
        this.HaptikSDK$a = setselectionargs;
        this.values = abandonVar;
        this.valueOf = i;
        this.ah$b = i2;
        this.toString = i3;
        this.ah$a = -1;
    }

    public static setSelectionArgs ag$a(abandon abandonVar) {
        return new setSelectionArgs(null, abandonVar, 0, 1, 0);
    }

    @Override // o.executePendingTask
    public String ag$a() {
        return this.ag$a;
    }
}

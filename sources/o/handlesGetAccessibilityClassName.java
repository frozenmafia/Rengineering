package o;
/* loaded from: classes5.dex */
public abstract class handlesGetAccessibilityClassName<Array> {
    public abstract int ag$a();

    public abstract Array valueOf();

    public abstract void values(int i);

    public static /* synthetic */ void toString(handlesGetAccessibilityClassName handlesgetaccessibilityclassname, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i2 & 1) != 0) {
            i = handlesgetaccessibilityclassname.ag$a() + 1;
        }
        handlesgetaccessibilityclassname.values(i);
    }
}

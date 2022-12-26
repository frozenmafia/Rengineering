package o;
/* loaded from: classes5.dex */
public final class setPathMotion implements getMatchedTransitionValues {
    private final String ah$a;
    private final Class<?> values;

    public setPathMotion(Class<?> cls, String str) {
        runAnimators.ag$a(cls, "jClass");
        runAnimators.ag$a(str, "moduleName");
        this.values = cls;
        this.ah$a = str;
    }

    @Override // o.getMatchedTransitionValues
    public Class<?> valueOf() {
        return this.values;
    }

    public boolean equals(Object obj) {
        return (obj instanceof setPathMotion) && runAnimators.values(valueOf(), ((setPathMotion) obj).valueOf());
    }

    public int hashCode() {
        return valueOf().hashCode();
    }

    public String toString() {
        return valueOf().toString() + " (Kotlin reflection is not available)";
    }
}

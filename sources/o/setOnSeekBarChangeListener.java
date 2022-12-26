package o;
/* loaded from: classes4.dex */
public final class setOnSeekBarChangeListener {
    private final String toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setOnSeekBarChangeListener) && runAnimators.values((Object) this.toString, (Object) ((setOnSeekBarChangeListener) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        return "_Selected_Value_String_(value=" + this.toString + ')';
    }

    public setOnSeekBarChangeListener(String str) {
        runAnimators.ag$a(str, "value");
        this.toString = str;
    }

    public final String ag$a() {
        return this.toString;
    }
}

package o;
/* loaded from: classes4.dex */
public final class setCheckedButton {
    private final int ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setCheckedButton) && this.ag$a == ((setCheckedButton) obj).ag$a;
    }

    public int hashCode() {
        return this.ag$a;
    }

    public String toString() {
        return "_Request_count_Int(value=" + this.ag$a + ')';
    }

    public setCheckedButton(int i) {
        this.ag$a = i;
    }

    public final int valueOf() {
        return this.ag$a;
    }
}

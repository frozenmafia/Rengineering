package o;
/* loaded from: classes4.dex */
public final class copyCallbacks {
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof copyCallbacks) && runAnimators.values((Object) this.valueOf, (Object) ((copyCallbacks) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "_Bank_Message_String_(value=" + this.valueOf + ')';
    }

    public final String valueOf() {
        return this.valueOf;
    }
}

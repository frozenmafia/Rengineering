package o;
/* loaded from: classes4.dex */
public final class getBuildSdkInt {
    private final int toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getBuildSdkInt) && this.toString == ((getBuildSdkInt) obj).toString;
    }

    public int hashCode() {
        return this.toString;
    }

    public String toString() {
        return "_Invite_Count_Int_(value=" + this.toString + ')';
    }

    public getBuildSdkInt(int i) {
        this.toString = i;
    }

    public final int values() {
        return this.toString;
    }
}

package o;
/* loaded from: classes4.dex */
public final class emit {
    private final int toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof emit) && this.toString == ((emit) obj).toString;
    }

    public int hashCode() {
        return this.toString;
    }

    public String toString() {
        return "_No_Of_Channels_Int__(value=" + this.toString + ')';
    }

    public emit(int i) {
        this.toString = i;
    }

    public final int ag$a() {
        return this.toString;
    }
}

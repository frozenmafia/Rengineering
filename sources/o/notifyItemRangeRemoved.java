package o;
/* loaded from: classes5.dex */
public final class notifyItemRangeRemoved {
    private final long ag$a;

    public notifyItemRangeRemoved(long j) {
        this.ag$a = j;
    }

    public long valueOf() {
        return this.ag$a;
    }

    public String toString() {
        return "Tag{tagNumber=" + this.ag$a + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.ag$a == ((notifyItemRangeRemoved) obj).ag$a;
    }

    public int hashCode() {
        long j = this.ag$a;
        return (int) (j ^ (j >>> 32));
    }
}

package o;
/* loaded from: classes3.dex */
public final class skipTagBackward {
    public static final skipTagBackward ah$a = new skipTagBackward(0, 0);
    public final long ag$a;
    public final long valueOf;

    public skipTagBackward(long j, long j2) {
        this.ag$a = j;
        this.valueOf = j2;
    }

    public String toString() {
        return "[timeUs=" + this.ag$a + ", position=" + this.valueOf + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        skipTagBackward skiptagbackward = (skipTagBackward) obj;
        return this.ag$a == skiptagbackward.ag$a && this.valueOf == skiptagbackward.valueOf;
    }

    public int hashCode() {
        return (((int) this.ag$a) * 31) + ((int) this.valueOf);
    }
}

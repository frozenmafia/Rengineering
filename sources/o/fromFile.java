package o;
/* loaded from: classes4.dex */
public final class fromFile {
    private final int valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fromFile) && this.valueOf == ((fromFile) obj).valueOf;
    }

    public int hashCode() {
        return this.valueOf;
    }

    public String toString() {
        return "_Winning_Amount_Int_(value=" + this.valueOf + ')';
    }

    public fromFile(int i) {
        this.valueOf = i;
    }

    public final int ah$a() {
        return this.valueOf;
    }
}

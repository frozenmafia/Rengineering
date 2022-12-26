package o;
/* loaded from: classes4.dex */
public final class exists {
    private final int valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof exists) && this.valueOf == ((exists) obj).valueOf;
    }

    public int hashCode() {
        return this.valueOf;
    }

    public String toString() {
        return "__Contacts_On_Dream11_Int__(value=" + this.valueOf + ')';
    }

    public exists(int i) {
        this.valueOf = i;
    }

    public final int values() {
        return this.valueOf;
    }
}

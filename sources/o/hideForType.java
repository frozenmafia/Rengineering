package o;

import java.security.MessageDigest;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public final class hideForType implements getDescendants {
    private final Object ag$a;

    public hideForType(Object obj) {
        this.ag$a = WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(obj);
    }

    public String toString() {
        return "ObjectKey{object=" + this.ag$a + '}';
    }

    @Override // o.getDescendants
    public boolean equals(Object obj) {
        if (obj instanceof hideForType) {
            return this.ag$a.equals(((hideForType) obj).ag$a);
        }
        return false;
    }

    @Override // o.getDescendants
    public int hashCode() {
        return this.ag$a.hashCode();
    }

    @Override // o.getDescendants
    public void ag$a(MessageDigest messageDigest) {
        messageDigest.update(this.ag$a.toString().getBytes(valueOf));
    }
}

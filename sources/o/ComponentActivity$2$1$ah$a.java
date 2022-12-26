package o;

import o.ComponentActivity;
/* loaded from: classes.dex */
public final class ComponentActivity$2$1$ah$a {
    private final long ag$a;
    private final long ah$a;

    public ComponentActivity$2$1$ah$a(long j, long j2) {
        this.ag$a = j;
        this.ah$a = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ComponentActivity$2$1$ah$a) {
            ComponentActivity$2$1$ah$a componentActivity$2$1$ah$a = (ComponentActivity$2$1$ah$a) obj;
            return this.ag$a == componentActivity$2$1$ah$a.ag$a && this.ah$a == componentActivity$2$1$ah$a.ah$a;
        }
        return false;
    }

    public int hashCode() {
        return (ComponentActivity.AnonymousClass2.C03192.toString(this.ag$a) * 31) + ComponentActivity.AnonymousClass2.C03192.toString(this.ah$a);
    }
}

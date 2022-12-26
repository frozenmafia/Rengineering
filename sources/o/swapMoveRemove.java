package o;

import java.util.Objects;
/* loaded from: classes5.dex */
public final class swapMoveRemove {
    private final int ag$a;
    private final Class<?> ah$a;
    private final int valueOf;

    private swapMoveRemove(Class<?> cls, int i, int i2) {
        this.ah$a = (Class) Objects.requireNonNull(cls, "Null dependency anInterface.");
        this.ag$a = i;
        this.valueOf = i2;
    }

    @Deprecated
    public static swapMoveRemove valueOf(Class<?> cls) {
        return new swapMoveRemove(cls, 0, 0);
    }

    public static swapMoveRemove toString(Class<?> cls) {
        return new swapMoveRemove(cls, 0, 2);
    }

    public static swapMoveRemove ah$a(Class<?> cls) {
        return new swapMoveRemove(cls, 1, 0);
    }

    public static swapMoveRemove HaptikSDK$c(Class<?> cls) {
        return new swapMoveRemove(cls, 2, 0);
    }

    public static swapMoveRemove ag$a(Class<?> cls) {
        return new swapMoveRemove(cls, 0, 1);
    }

    public static swapMoveRemove values(Class<?> cls) {
        return new swapMoveRemove(cls, 1, 1);
    }

    public Class<?> valueOf() {
        return this.ah$a;
    }

    public boolean ag$a() {
        return this.ag$a == 1;
    }

    public boolean HaptikSDK$c() {
        return this.ag$a == 2;
    }

    public boolean values() {
        return this.valueOf == 0;
    }

    public boolean ah$a() {
        return this.valueOf == 2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof swapMoveRemove) {
            swapMoveRemove swapmoveremove = (swapMoveRemove) obj;
            if (this.ah$a == swapmoveremove.ah$a && this.ag$a == swapmoveremove.ag$a && this.valueOf == swapmoveremove.valueOf) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.ah$a.hashCode() ^ 1000003) * 1000003) ^ this.ag$a) * 1000003) ^ this.valueOf;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.ah$a);
        sb.append(", type=");
        int i = this.ag$a;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(toString(this.valueOf));
        sb.append("}");
        return sb.toString();
    }

    private static String toString(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i);
            }
            return "provider";
        }
        return "direct";
    }
}

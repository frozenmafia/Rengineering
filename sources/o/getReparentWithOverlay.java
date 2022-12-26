package o;
/* loaded from: classes7.dex */
public final class getReparentWithOverlay implements Comparable<getReparentWithOverlay> {
    public static final toString toString = new toString(null);
    private final byte ag$a;

    public static final /* synthetic */ getReparentWithOverlay ah$a(byte b2) {
        return new getReparentWithOverlay(b2);
    }

    public static byte toString(byte b2) {
        return b2;
    }

    public static int valueOf(byte b2) {
        return b2;
    }

    public static boolean values(byte b2, Object obj) {
        return (obj instanceof getReparentWithOverlay) && b2 == ((getReparentWithOverlay) obj).ag$a();
    }

    public final /* synthetic */ byte ag$a() {
        return this.ag$a;
    }

    public boolean equals(Object obj) {
        return values(this.ag$a, obj);
    }

    public int hashCode() {
        return valueOf(this.ag$a);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(getReparentWithOverlay getreparentwithoverlay) {
        return runAnimators.toString(ag$a() & 255, getreparentwithoverlay.ag$a() & 255);
    }

    private /* synthetic */ getReparentWithOverlay(byte b2) {
        this.ag$a = b2;
    }

    /* loaded from: classes7.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }
    }

    public static String ag$a(byte b2) {
        return String.valueOf(b2 & 255);
    }

    public String toString() {
        return ag$a(this.ag$a);
    }
}

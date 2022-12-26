package o;
/* loaded from: classes5.dex */
final class Slide$ag$a {
    public static final Slide$ag$a toString = new Slide$ag$a();
    public static final Integer valueOf;

    private Slide$ag$a() {
    }

    static {
        Integer num;
        Integer num2 = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            num = obj instanceof Integer ? (Integer) obj : null;
        } catch (Throwable unused) {
            num = null;
        }
        if (num != null) {
            if (num.intValue() > 0) {
                num2 = num;
            }
        }
        valueOf = num2;
    }
}

package o;

import kotlin.random.Random;
/* loaded from: classes5.dex */
public class getMaxDistance extends Slide {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class toString {
        public static final Integer ah$a;
        public static final toString toString = new toString();

        private toString() {
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
            ah$a = num2;
        }
    }

    private final boolean ag$a(int i) {
        return toString.ah$a == null || toString.ah$a.intValue() >= i;
    }

    @Override // o.setEnterAction
    public Random ah$a() {
        return ag$a(34) ? new sceneChangeRunTransition() : super.ah$a();
    }
}

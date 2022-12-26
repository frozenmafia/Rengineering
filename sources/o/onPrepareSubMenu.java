package o;

import java.util.Random;
/* loaded from: classes2.dex */
public final class onPrepareSubMenu implements onCreateActionView {
    public static final onPrepareSubMenu$ag$a valueOf = new onPrepareSubMenu$ag$a(null);
    private final Random toString = new Random();

    @Override // o.onCreateActionView
    public long ag$a(int i) {
        double d = 1000;
        return ((long) (d + (Math.pow(2.0d, i) * d))) + ah$a();
    }

    private final long ah$a() {
        return this.toString.nextInt(5000) + 1;
    }
}

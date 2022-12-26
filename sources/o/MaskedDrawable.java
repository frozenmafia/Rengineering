package o;

import java.util.Comparator;
import o.SplashScreen;
/* loaded from: classes3.dex */
public final /* synthetic */ class MaskedDrawable implements Comparator {
    public static final /* synthetic */ MaskedDrawable valueOf = new MaskedDrawable();

    private /* synthetic */ MaskedDrawable() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare;
        compare = Float.compare(((SplashScreen.values) obj).values, ((SplashScreen.values) obj2).values);
        return compare;
    }
}

package o;

import java.util.Comparator;
import o.SplashScreen;
/* loaded from: classes3.dex */
public final /* synthetic */ class access$install implements Comparator {
    public static final /* synthetic */ access$install valueOf = new access$install();

    private /* synthetic */ access$install() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return SplashScreen.valueOf((SplashScreen.values) obj, (SplashScreen.values) obj2);
    }
}

package o;

import android.content.res.Resources;
import android.graphics.Paint;
import com.sendbird.android.constant.StringSet;
import kotlin.random.Random;
/* loaded from: classes3.dex */
public final class getSystemIcon {
    public final float HaptikSDK$a;
    public computeVerticalScrollExtent HaptikSDK$b;
    public final float HaptikSDK$c;
    public final Paint HaptikSDK$d;
    public float HaptikSDK$e;
    public float HaptikWebView;
    public computeVerticalScrollExtent ag$a;
    public final computeHorizontalScrollOffset ah$a;
    public float ah$b;
    public float getInitSettings;
    public float getSignupData;
    public final boolean invoke;
    public int isLogoutPending;
    public computeVerticalScrollExtent toString;
    public final boolean valueOf;
    public long values;

    public getSystemIcon(computeVerticalScrollExtent computeverticalscrollextent, int i, computeHorizontalScrollRange computehorizontalscrollrange, computeHorizontalScrollOffset computehorizontalscrolloffset, long j, boolean z, computeVerticalScrollExtent computeverticalscrollextent2, computeVerticalScrollExtent computeverticalscrollextent3, boolean z2, boolean z3, float f) {
        runAnimators.ag$a(computeverticalscrollextent, "location");
        runAnimators.ag$a(computehorizontalscrollrange, StringSet.size);
        runAnimators.ag$a(computehorizontalscrolloffset, "shape");
        runAnimators.ag$a(computeverticalscrollextent2, "acceleration");
        runAnimators.ag$a(computeverticalscrollextent3, "velocity");
        this.toString = computeverticalscrollextent;
        this.ah$a = computehorizontalscrolloffset;
        this.values = j;
        this.valueOf = z;
        this.ag$a = computeverticalscrollextent2;
        this.HaptikSDK$b = computeverticalscrollextent3;
        this.invoke = z3;
        this.HaptikSDK$a = f;
        this.HaptikSDK$c = computehorizontalscrollrange.ah$a();
        this.ah$b = computehorizontalscrollrange.values();
        Paint paint = new Paint();
        this.HaptikSDK$d = paint;
        this.HaptikWebView = this.ah$b;
        this.getInitSettings = 60.0f;
        this.isLogoutPending = 255;
        float f2 = Resources.getSystem().getDisplayMetrics().density * 0.29f;
        float f3 = 3;
        if (z2) {
            this.getSignupData = (f3 * f2 * Random.Default.nextFloat()) + f2;
        }
        paint.setColor(i);
    }
}

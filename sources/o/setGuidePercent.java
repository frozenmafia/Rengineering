package o;

import android.text.Layout;
import android.view.View;
/* loaded from: classes3.dex */
public class setGuidePercent {
    String HaptikSDK$b;
    Layout.Alignment ag$a = Layout.Alignment.ALIGN_NORMAL;
    String ah$a;
    View ah$b;
    boolean toString;
    int valueOf;
    String values;

    private setGuidePercent(View view, int i, String str, String str2, boolean z, String str3) {
        this.valueOf = 1;
        this.toString = false;
        this.ah$b = view;
        this.valueOf = i;
        this.HaptikSDK$b = str;
        this.ah$a = str2;
        this.toString = z;
        this.values = str3;
    }

    public View HaptikSDK$b() {
        return this.ah$b;
    }

    public int ah$a() {
        return this.valueOf;
    }

    public String valueOf() {
        return this.HaptikSDK$b;
    }

    public String values() {
        return this.ah$a;
    }

    public boolean HaptikSDK$a() {
        return this.toString;
    }

    public String ag$a() {
        return this.values;
    }

    public static setGuidePercent ah$a(View view, int i, String str, String str2, boolean z, String str3) {
        return new setGuidePercent(view, i, str, str2, z, str3);
    }
}

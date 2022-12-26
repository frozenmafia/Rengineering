package o;

import android.graphics.Path;
import android.graphics.PointF;
import o.viewModels;
/* loaded from: classes.dex */
public class getRccTransportControlFlagsFromActions extends viewModels.Cdefault<PointF> {
    private Path HaptikSDK$b;
    private final viewModels.Cdefault<PointF> HaptikSDK$e;

    public getRccTransportControlFlagsFromActions(ensureClassLoader ensureclassloader, viewModels.Cdefault<PointF> cdefault) {
        super(ensureclassloader, cdefault.HaptikSDK$a, cdefault.values, cdefault.toString, cdefault.ah$b, cdefault.invoke, cdefault.HaptikSDK$c, cdefault.valueOf);
        this.HaptikSDK$e = cdefault;
        ag$a();
    }

    public void ag$a() {
        boolean z = (this.values == 0 || this.HaptikSDK$a == 0 || !((PointF) this.HaptikSDK$a).equals(((PointF) this.values).x, ((PointF) this.values).y)) ? false : true;
        if (this.HaptikSDK$a == 0 || this.values == 0 || z) {
            return;
        }
        this.HaptikSDK$b = ActivityViewModelLazyKt$viewModels$1.values((PointF) this.HaptikSDK$a, (PointF) this.values, this.HaptikSDK$e.ag$a, this.HaptikSDK$e.ah$a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path values() {
        return this.HaptikSDK$b;
    }
}

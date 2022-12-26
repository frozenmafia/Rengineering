package o;

import android.graphics.PointF;
import java.util.List;
import o.MediaSessionCompat;
import o.viewModels;
/* loaded from: classes.dex */
public class registerMediaButtonEventReceiver extends MediaSessionCompat.Callback.MediaSessionCallbackApi21<PointF> {
    private final PointF values;

    public registerMediaButtonEventReceiver(List<viewModels.Cdefault<PointF>> list) {
        super(list);
        this.values = new PointF();
    }

    @Override // o.onSkipToPrevious
    /* renamed from: ag$a */
    public PointF valueOf(viewModels.Cdefault<PointF> cdefault, float f) {
        return valueOf(cdefault, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.onSkipToPrevious
    /* renamed from: values */
    public PointF valueOf(viewModels.Cdefault<PointF> cdefault, float f, float f2, float f3) {
        PointF pointF;
        if (cdefault.HaptikSDK$a == null || cdefault.values == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = cdefault.HaptikSDK$a;
        PointF pointF3 = cdefault.values;
        if (this.valueOf == null || (pointF = (PointF) this.valueOf.toString(cdefault.HaptikSDK$c, cdefault.valueOf.floatValue(), pointF2, pointF3, f, ag$a(), ah$b())) == null) {
            this.values.set(pointF2.x + (f2 * (pointF3.x - pointF2.x)), pointF2.y + (f3 * (pointF3.y - pointF2.y)));
            return this.values;
        }
        return pointF;
    }
}

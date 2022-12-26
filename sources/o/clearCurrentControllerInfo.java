package o;

import java.util.List;
import o.MediaSessionCompat;
import o.viewModels;
/* loaded from: classes.dex */
public class clearCurrentControllerInfo extends MediaSessionCompat.Callback.MediaSessionCallbackApi21<Float> {
    public clearCurrentControllerInfo(List<viewModels.Cdefault<Float>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.onSkipToPrevious
    /* renamed from: ag$a */
    public Float valueOf(viewModels.Cdefault<Float> cdefault, float f) {
        return Float.valueOf(toString(cdefault, f));
    }

    float toString(viewModels.Cdefault<Float> cdefault, float f) {
        Float f2;
        if (cdefault.HaptikSDK$a == null || cdefault.values == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.valueOf != null && (f2 = (Float) this.valueOf.toString(cdefault.HaptikSDK$c, cdefault.valueOf.floatValue(), cdefault.HaptikSDK$a, cdefault.values, f, ag$a(), ah$b())) != null) {
            return f2.floatValue();
        }
        return viewModels.ag$a(cdefault.HaptikSDK$c(), cdefault.valueOf(), f);
    }

    public float HaptikSDK$b() {
        return toString(values(), ah$a());
    }
}

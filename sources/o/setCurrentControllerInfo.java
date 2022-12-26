package o;

import java.util.List;
import o.MediaSessionCompat;
import o.viewModels;
/* loaded from: classes.dex */
public class setCurrentControllerInfo extends MediaSessionCompat.Callback.MediaSessionCallbackApi21<Integer> {
    public setCurrentControllerInfo(List<viewModels.Cdefault<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.onSkipToPrevious
    /* renamed from: values */
    public Integer valueOf(viewModels.Cdefault<Integer> cdefault, float f) {
        return Integer.valueOf(toString(cdefault, f));
    }

    int toString(viewModels.Cdefault<Integer> cdefault, float f) {
        Integer num;
        if (cdefault.HaptikSDK$a == null || cdefault.values == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.valueOf != null && (num = (Integer) this.valueOf.toString(cdefault.HaptikSDK$c, cdefault.valueOf.floatValue(), cdefault.HaptikSDK$a, cdefault.values, f, ag$a(), ah$b())) != null) {
            return num.intValue();
        }
        return viewModels.valueOf(cdefault.ah$b(), cdefault.invoke(), f);
    }

    public int HaptikSDK$b() {
        return toString(values(), ah$a());
    }
}

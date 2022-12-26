package o;

import java.util.List;
import o.MediaSessionCompat;
import o.ResultReceiver;
import o.viewModels;
/* loaded from: classes.dex */
public class onSkipToQueueItem extends MediaSessionCompat.Callback.MediaSessionCallbackApi21<Integer> {
    public onSkipToQueueItem(List<viewModels.Cdefault<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.onSkipToPrevious
    /* renamed from: values */
    public Integer valueOf(viewModels.Cdefault<Integer> cdefault, float f) {
        return Integer.valueOf(toString(cdefault, f));
    }

    public int toString(viewModels.Cdefault<Integer> cdefault, float f) {
        float max;
        Integer num;
        if (cdefault.HaptikSDK$a == null || cdefault.values == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.valueOf != null && (num = (Integer) this.valueOf.toString(cdefault.HaptikSDK$c, cdefault.valueOf.floatValue(), cdefault.HaptikSDK$a, cdefault.values, f, ag$a(), ah$b())) != null) {
            return num.intValue();
        }
        max = Math.max(0.0f, Math.min(1.0f, f));
        return ResultReceiver.AnonymousClass1.valueOf(max, cdefault.HaptikSDK$a.intValue(), cdefault.values.intValue());
    }

    public int HaptikSDK$b() {
        return toString(values(), ah$a());
    }
}

package o;

import android.graphics.Path;
import java.util.List;
import o.viewModels;
/* loaded from: classes.dex */
public class unregisterMediaButtonEventReceiver extends onSkipToPrevious<getQueueItem, Path> {
    private final getQueueItem HaptikSDK$a;
    private final Path toString;
    private List<onSkipToNext> values;

    public unregisterMediaButtonEventReceiver(List<viewModels.Cdefault<getQueueItem>> list) {
        super(list);
        this.HaptikSDK$a = new getQueueItem();
        this.toString = new Path();
    }

    @Override // o.onSkipToPrevious
    /* renamed from: values */
    public Path valueOf(viewModels.Cdefault<getQueueItem> cdefault, float f) {
        this.HaptikSDK$a.ag$a(cdefault.HaptikSDK$a, cdefault.values, f);
        getQueueItem getqueueitem = this.HaptikSDK$a;
        List<onSkipToNext> list = this.values;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                getqueueitem = this.values.get(size).valueOf(getqueueitem);
            }
        }
        viewModels.ah$a(getqueueitem, this.toString);
        return this.toString;
    }

    public void values(List<onSkipToNext> list) {
        this.values = list;
    }
}

package o;

import java.util.List;
import o.MediaSessionCompat;
import o.viewModels;
/* loaded from: classes.dex */
public class getSessionImplIfCallbackIsSet extends MediaSessionCompat.Callback.MediaSessionCallbackApi21<onActiveChanged> {
    private final onActiveChanged values;

    public getSessionImplIfCallbackIsSet(List<viewModels.Cdefault<onActiveChanged>> list) {
        super(list);
        onActiveChanged onactivechanged = list.get(0).HaptikSDK$a;
        int ah$a = onactivechanged != null ? onactivechanged.ah$a() : 0;
        this.values = new onActiveChanged(new float[ah$a], new int[ah$a]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.onSkipToPrevious
    /* renamed from: toString */
    public onActiveChanged valueOf(viewModels.Cdefault<onActiveChanged> cdefault, float f) {
        this.values.toString(cdefault.HaptikSDK$a, cdefault.values, f);
        return this.values;
    }
}

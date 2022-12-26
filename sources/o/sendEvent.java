package o;

import android.graphics.PointF;
import java.util.List;
import o.MediaSessionCompat;
import o.viewModels;
/* loaded from: classes.dex */
public class sendEvent implements MediaSessionCompat.MediaSessionImplBase.AnonymousClass1<PointF, PointF> {
    private final List<viewModels.Cdefault<PointF>> valueOf;

    public sendEvent(List<viewModels.Cdefault<PointF>> list) {
        this.valueOf = list;
    }

    @Override // o.MediaSessionCompat.MediaSessionImplBase.AnonymousClass1
    public List<viewModels.Cdefault<PointF>> ah$a() {
        return this.valueOf;
    }

    @Override // o.MediaSessionCompat.MediaSessionImplBase.AnonymousClass1
    public boolean values() {
        return this.valueOf.size() == 1 && this.valueOf.get(0).HaptikSDK$a();
    }

    @Override // o.MediaSessionCompat.MediaSessionImplBase.AnonymousClass1
    public onSkipToPrevious<PointF, PointF> valueOf() {
        if (this.valueOf.get(0).HaptikSDK$a()) {
            return new registerMediaButtonEventReceiver(this.valueOf);
        }
        return new MediaSessionCompat.MediaSessionImpl(this.valueOf);
    }
}

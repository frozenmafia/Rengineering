package o;

import android.graphics.PointF;
import java.util.List;
import o.MediaSessionCompat;
import o.viewModels;
/* loaded from: classes.dex */
public class sendShuffleMode implements MediaSessionCompat.MediaSessionImplBase.AnonymousClass1<PointF, PointF> {
    private final sendExtras ag$a;
    private final sendExtras values;

    public sendShuffleMode(sendExtras sendextras, sendExtras sendextras2) {
        this.ag$a = sendextras;
        this.values = sendextras2;
    }

    @Override // o.MediaSessionCompat.MediaSessionImplBase.AnonymousClass1
    public List<viewModels.Cdefault<PointF>> ah$a() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // o.MediaSessionCompat.MediaSessionImplBase.AnonymousClass1
    public boolean values() {
        return this.ag$a.values() && this.values.values();
    }

    @Override // o.MediaSessionCompat.MediaSessionImplBase.AnonymousClass1
    public onSkipToPrevious<PointF, PointF> valueOf() {
        return new MediaSessionCompat.MediaSessionImplApi19(this.ag$a.valueOf(), this.values.valueOf());
    }
}

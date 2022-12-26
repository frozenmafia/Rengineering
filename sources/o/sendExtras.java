package o;

import java.util.List;
import o.viewModels;
/* loaded from: classes.dex */
public class sendExtras extends updateMbrAndRcc<Float, Float> {
    @Override // o.updateMbrAndRcc, o.MediaSessionCompat.MediaSessionImplBase.AnonymousClass1
    public /* bridge */ /* synthetic */ List ah$a() {
        return super.ah$a();
    }

    @Override // o.updateMbrAndRcc
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // o.updateMbrAndRcc, o.MediaSessionCompat.MediaSessionImplBase.AnonymousClass1
    public /* bridge */ /* synthetic */ boolean values() {
        return super.values();
    }

    public sendExtras(List<viewModels.Cdefault<Float>> list) {
        super(list);
    }

    @Override // o.MediaSessionCompat.MediaSessionImplBase.AnonymousClass1
    public onSkipToPrevious<Float, Float> valueOf() {
        return new clearCurrentControllerInfo(this.ag$a);
    }
}

package o;

import java.util.List;
import o.viewModels;
/* loaded from: classes.dex */
public class sendMetadata extends updateMbrAndRcc<Integer, Integer> {
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

    public sendMetadata(List<viewModels.Cdefault<Integer>> list) {
        super(list);
    }

    @Override // o.MediaSessionCompat.MediaSessionImplBase.AnonymousClass1
    public onSkipToPrevious<Integer, Integer> valueOf() {
        return new setCurrentControllerInfo(this.ag$a);
    }
}

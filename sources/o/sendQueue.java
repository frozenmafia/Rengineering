package o;

import java.util.List;
import o.viewModels;
/* loaded from: classes.dex */
public class sendQueue extends updateMbrAndRcc<onActiveChanged, onActiveChanged> {
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

    public sendQueue(List<viewModels.Cdefault<onActiveChanged>> list) {
        super(list);
    }

    @Override // o.MediaSessionCompat.MediaSessionImplBase.AnonymousClass1
    public onSkipToPrevious<onActiveChanged, onActiveChanged> valueOf() {
        return new getSessionImplIfCallbackIsSet(this.ag$a);
    }
}

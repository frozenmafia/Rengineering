package o;

import java.util.List;
import o.MediaSessionCompat;
import o.viewModels;
/* loaded from: classes.dex */
public class sendState extends updateMbrAndRcc<ComponentActivity, ComponentActivity> {
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

    public sendState(List<viewModels.Cdefault<ComponentActivity>> list) {
        super(list);
    }

    @Override // o.MediaSessionCompat.MediaSessionImplBase.AnonymousClass1
    public onSkipToPrevious<ComponentActivity, ComponentActivity> valueOf() {
        return new MediaSessionCompat.MediaSessionImplApi18(this.ag$a);
    }
}

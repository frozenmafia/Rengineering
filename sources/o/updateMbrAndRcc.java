package o;

import java.util.Arrays;
import java.util.List;
import o.MediaSessionCompat;
import o.viewModels;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class updateMbrAndRcc<V, O> implements MediaSessionCompat.MediaSessionImplBase.AnonymousClass1<V, O> {
    final List<viewModels.Cdefault<V>> ag$a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public updateMbrAndRcc(List<viewModels.Cdefault<V>> list) {
        this.ag$a = list;
    }

    @Override // o.MediaSessionCompat.MediaSessionImplBase.AnonymousClass1
    public List<viewModels.Cdefault<V>> ah$a() {
        return this.ag$a;
    }

    @Override // o.MediaSessionCompat.MediaSessionImplBase.AnonymousClass1
    public boolean values() {
        if (this.ag$a.isEmpty()) {
            return true;
        }
        return this.ag$a.size() == 1 && this.ag$a.get(0).HaptikSDK$a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.ag$a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.ag$a.toArray()));
        }
        return sb.toString();
    }
}

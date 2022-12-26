package o;

import java.util.Iterator;
import java.util.Map;
import o.clearView;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class clearView$ah$a extends clearView$HaptikSDK$b {
    final /* synthetic */ clearView valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private clearView$ah$a(clearView clearview) {
        super(clearview);
        this.valueOf = clearview;
    }

    @Override // o.clearView$HaptikSDK$b, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new clearView.valueOf();
    }
}

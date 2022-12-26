package arrow.core.extensions;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityCallback;
import o.Styleable;
import o.areNotificationsEnabled;
import o.fetchDrawMatrixField;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SortedMapKUnalign$unalign$1$2 extends Lambda implements Styleable.ChangeBounds<Map<K, ? extends A>, ITrustedWebActivityCallback.Default<K, A>> {
    public static final SortedMapKUnalign$unalign$1$2 INSTANCE = new SortedMapKUnalign$unalign$1$2();

    SortedMapKUnalign$unalign$1$2() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ITrustedWebActivityCallback.Default<K, A> invoke(Map<K, ? extends A> map) {
        runAnimators.valueOf(map, "it");
        return areNotificationsEnabled.ah$a(fetchDrawMatrixField.toString(map));
    }
}

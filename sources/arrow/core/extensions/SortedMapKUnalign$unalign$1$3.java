package arrow.core.extensions;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityCallback;
import o.Styleable;
import o.areNotificationsEnabled;
import o.fetchDrawMatrixField;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SortedMapKUnalign$unalign$1$3 extends Lambda implements Styleable.ChangeBounds<Map<K, ? extends B>, ITrustedWebActivityCallback.Default<K, B>> {
    public static final SortedMapKUnalign$unalign$1$3 INSTANCE = new SortedMapKUnalign$unalign$1$3();

    SortedMapKUnalign$unalign$1$3() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ITrustedWebActivityCallback.Default<K, B> invoke(Map<K, ? extends B> map) {
        runAnimators.valueOf(map, "it");
        return areNotificationsEnabled.ah$a(fetchDrawMatrixField.toString(map));
    }
}

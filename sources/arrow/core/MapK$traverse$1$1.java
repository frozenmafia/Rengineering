package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.fetchDrawMatrixField;
import o.getRatingStyle;
import o.requestPostMessageChannelWithExtras;
import o.updateVisuals;
/* loaded from: classes6.dex */
public final class MapK$traverse$1$1 extends Lambda implements Styleable.ArcMotion<ICustomTabsCallback.Default<? extends G, ? extends requestPostMessageChannelWithExtras<K, ? extends B>>> {
    final /* synthetic */ getRatingStyle $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapK$traverse$1$1(getRatingStyle getratingstyle) {
        super(0);
        this.$this_run = getratingstyle;
    }

    @Override // o.Styleable.ArcMotion
    public final ICustomTabsCallback.Default<G, requestPostMessageChannelWithExtras<K, B>> invoke() {
        return this.$this_run.values(updateVisuals.values(fetchDrawMatrixField.valueOf()));
    }
}

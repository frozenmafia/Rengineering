package o;

import java.lang.Comparable;
import o.IMediaControllerCallback;
import o.ITrustedWebActivityCallback;
/* loaded from: classes6.dex */
public interface applyOptions<K extends Comparable<? super K>, A> extends IMediaControllerCallback.Stub<ITrustedWebActivityCallback.Default<K, A>>, fromMediaDescription<K, A> {
    IMediaControllerCallback.Stub<A> ah$a();
}

package o;

import o.onRetainCustomNonConfigurationInstance;
/* loaded from: classes.dex */
public abstract class onRetainCustomNonConfigurationInstance$ag$a<W extends onRetainCustomNonConfigurationInstance<?, ?, ?, ?>> {
    protected getOnBackPressedDispatcher ag$a;

    public onRetainCustomNonConfigurationInstance$ag$a(getOnBackPressedDispatcher getonbackpresseddispatcher) {
        if (getonbackpresseddispatcher == null) {
            throw new IllegalArgumentException("A RequestContext is necessary for making interactive requests");
        }
        this.ag$a = getonbackpresseddispatcher;
    }
}

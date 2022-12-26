package io.reactivex.disposables;

import o.getSidecarVersion;
/* loaded from: classes7.dex */
final class SubscriptionDisposable extends ReferenceDisposable<getSidecarVersion> {
    private static final long serialVersionUID = -707001650852963139L;

    SubscriptionDisposable(getSidecarVersion getsidecarversion) {
        super(getsidecarversion);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.disposables.ReferenceDisposable
    public void onDisposed(getSidecarVersion getsidecarversion) {
        getsidecarversion.cancel();
    }
}

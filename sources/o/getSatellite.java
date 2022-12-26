package o;

import o.LocationManagerCompat;
/* loaded from: classes3.dex */
public final /* synthetic */ class getSatellite implements hasPendingUpdates {
    public static final /* synthetic */ getSatellite toString = new getSatellite();

    private /* synthetic */ getSatellite() {
    }

    @Override // o.hasPendingUpdates
    public final Object apply(Object obj) {
        return new LocationManagerCompat.InlineHandlerExecutor((hasEnrolledFingerprints) obj);
    }
}

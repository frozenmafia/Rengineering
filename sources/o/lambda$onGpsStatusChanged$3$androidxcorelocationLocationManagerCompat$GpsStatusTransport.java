package o;
/* renamed from: o.lambda$onGpsStatusChanged$3$androidx-core-location-LocationManagerCompat$GpsStatusTransport  reason: invalid class name */
/* loaded from: classes3.dex */
public final class lambda$onGpsStatusChanged$3$androidxcorelocationLocationManagerCompat$GpsStatusTransport {
    public static final lambda$onGpsStatusChanged$3$androidxcorelocationLocationManagerCompat$GpsStatusTransport ag$a;
    public static final lambda$onGpsStatusChanged$3$androidxcorelocationLocationManagerCompat$GpsStatusTransport ah$a;
    public static final lambda$onGpsStatusChanged$3$androidxcorelocationLocationManagerCompat$GpsStatusTransport toString;
    public static final lambda$onGpsStatusChanged$3$androidxcorelocationLocationManagerCompat$GpsStatusTransport valueOf;
    public static final lambda$onGpsStatusChanged$3$androidxcorelocationLocationManagerCompat$GpsStatusTransport values;
    public final long HaptikSDK$a;
    public final long ah$b;

    static {
        lambda$onGpsStatusChanged$3$androidxcorelocationLocationManagerCompat$GpsStatusTransport lambda_ongpsstatuschanged_3_androidxcorelocationlocationmanagercompat_gpsstatustransport = new lambda$onGpsStatusChanged$3$androidxcorelocationLocationManagerCompat$GpsStatusTransport(0L, 0L);
        ag$a = lambda_ongpsstatuschanged_3_androidxcorelocationlocationmanagercompat_gpsstatustransport;
        values = new lambda$onGpsStatusChanged$3$androidxcorelocationLocationManagerCompat$GpsStatusTransport(Long.MAX_VALUE, Long.MAX_VALUE);
        ah$a = new lambda$onGpsStatusChanged$3$androidxcorelocationLocationManagerCompat$GpsStatusTransport(Long.MAX_VALUE, 0L);
        toString = new lambda$onGpsStatusChanged$3$androidxcorelocationLocationManagerCompat$GpsStatusTransport(0L, Long.MAX_VALUE);
        valueOf = lambda_ongpsstatuschanged_3_androidxcorelocationlocationmanagercompat_gpsstatustransport;
    }

    public lambda$onGpsStatusChanged$3$androidxcorelocationLocationManagerCompat$GpsStatusTransport(long j, long j2) {
        FingerprintManagerCompat.toString(j >= 0);
        FingerprintManagerCompat.toString(j2 >= 0);
        this.ah$b = j;
        this.HaptikSDK$a = j2;
    }

    public long ag$a(long j, long j2, long j3) {
        long j4 = this.ah$b;
        if (j4 == 0 && this.HaptikSDK$a == 0) {
            return j;
        }
        long valueOf2 = getElevationDegrees.valueOf(j, j4, Long.MIN_VALUE);
        long values2 = getElevationDegrees.values(j, this.HaptikSDK$a, Long.MAX_VALUE);
        boolean z = false;
        boolean z2 = valueOf2 <= j2 && j2 <= values2;
        if (valueOf2 <= j3 && j3 <= values2) {
            z = true;
        }
        return (z2 && z) ? Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3 : z2 ? j2 : z ? j3 : valueOf2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lambda$onGpsStatusChanged$3$androidxcorelocationLocationManagerCompat$GpsStatusTransport lambda_ongpsstatuschanged_3_androidxcorelocationlocationmanagercompat_gpsstatustransport = (lambda$onGpsStatusChanged$3$androidxcorelocationLocationManagerCompat$GpsStatusTransport) obj;
        return this.ah$b == lambda_ongpsstatuschanged_3_androidxcorelocationlocationmanagercompat_gpsstatustransport.ah$b && this.HaptikSDK$a == lambda_ongpsstatuschanged_3_androidxcorelocationlocationmanagercompat_gpsstatustransport.HaptikSDK$a;
    }

    public int hashCode() {
        return (((int) this.ah$b) * 31) + ((int) this.HaptikSDK$a);
    }
}

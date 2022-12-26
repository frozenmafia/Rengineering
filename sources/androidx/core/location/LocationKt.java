package androidx.core.location;

import android.location.Location;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class LocationKt {
    public static final double component1(Location location) {
        runAnimators.ag$a(location, "<this>");
        return location.getLatitude();
    }

    public static final double component2(Location location) {
        runAnimators.ag$a(location, "<this>");
        return location.getLongitude();
    }
}

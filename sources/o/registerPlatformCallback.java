package o;

import kotlin.time.DurationUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class registerPlatformCallback {
    public static final long toString(long j, DurationUnit durationUnit, DurationUnit durationUnit2) {
        runAnimators.ag$a(durationUnit, "sourceUnit");
        runAnimators.ag$a(durationUnit2, "targetUnit");
        return durationUnit2.getTimeUnit$kotlin_stdlib().convert(j, durationUnit.getTimeUnit$kotlin_stdlib());
    }
}

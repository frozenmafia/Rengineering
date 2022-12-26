package o;

import o.getDeviceId;
import o.skipEntityForward;
/* loaded from: classes3.dex */
public class getDeviceId$ah$a implements skipEntityForward {
    private final long HaptikSDK$a;
    private final long ag$a;
    private final long ah$a;
    private final getDeviceId.valueOf invoke;
    private final long toString;
    private final long valueOf;
    private final long values;

    @Override // o.skipEntityForward
    public boolean ah$a() {
        return true;
    }

    public static /* synthetic */ long ag$a(getDeviceId$ah$a getdeviceid_ah_a) {
        return getdeviceid_ah_a.ag$a;
    }

    public static /* synthetic */ long ah$a(getDeviceId$ah$a getdeviceid_ah_a) {
        return getdeviceid_ah_a.ah$a;
    }

    public static /* synthetic */ long toString(getDeviceId$ah$a getdeviceid_ah_a) {
        return getdeviceid_ah_a.toString;
    }

    public static /* synthetic */ long valueOf(getDeviceId$ah$a getdeviceid_ah_a) {
        return getdeviceid_ah_a.values;
    }

    public static /* synthetic */ long values(getDeviceId$ah$a getdeviceid_ah_a) {
        return getdeviceid_ah_a.HaptikSDK$a;
    }

    public getDeviceId$ah$a(getDeviceId.valueOf valueof, long j, long j2, long j3, long j4, long j5, long j6) {
        this.invoke = valueof;
        this.valueOf = j;
        this.HaptikSDK$a = j2;
        this.values = j3;
        this.toString = j4;
        this.ag$a = j5;
        this.ah$a = j6;
    }

    @Override // o.skipEntityForward
    public skipEntityForward.toString ah$a(long j) {
        return new skipEntityForward.toString(new skipTagBackward(j, getDeviceId.toString.ag$a(this.invoke.values(j), this.HaptikSDK$a, this.values, this.toString, this.ag$a, this.ah$a)));
    }

    @Override // o.skipEntityForward
    public long ag$a() {
        return this.valueOf;
    }

    public long ag$a(long j) {
        return this.invoke.values(j);
    }
}

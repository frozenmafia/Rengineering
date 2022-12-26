package o;
/* loaded from: classes7.dex */
public final class onRemoved {
    private final long HaptikSDK$a;
    private final long ag$a;
    private final long ah$a;
    private final long toString;
    private final long valueOf;
    private final long values;

    public onRemoved(long j, long j2, long j3, long j4, long j5, long j6) {
        markViewHoldersUpdated.values(j >= 0);
        markViewHoldersUpdated.values(j2 >= 0);
        markViewHoldersUpdated.values(j3 >= 0);
        markViewHoldersUpdated.values(j4 >= 0);
        markViewHoldersUpdated.values(j5 >= 0);
        markViewHoldersUpdated.values(j6 >= 0);
        this.ag$a = j;
        this.toString = j2;
        this.ah$a = j3;
        this.valueOf = j4;
        this.HaptikSDK$a = j5;
        this.values = j6;
    }

    public long ag$a() {
        return this.ag$a;
    }

    public long HaptikSDK$c() {
        return this.toString;
    }

    public long valueOf() {
        return this.ah$a;
    }

    public long values() {
        return this.valueOf;
    }

    public long HaptikSDK$b() {
        return this.HaptikSDK$a;
    }

    public long ah$a() {
        return this.values;
    }

    public int hashCode() {
        return recycleUpdateOp.valueOf(Long.valueOf(this.ag$a), Long.valueOf(this.toString), Long.valueOf(this.ah$a), Long.valueOf(this.valueOf), Long.valueOf(this.HaptikSDK$a), Long.valueOf(this.values));
    }

    public boolean equals(Object obj) {
        if (obj instanceof onRemoved) {
            onRemoved onremoved = (onRemoved) obj;
            if (this.ag$a == onremoved.ag$a && this.toString == onremoved.toString && this.ah$a == onremoved.ah$a && this.valueOf == onremoved.valueOf && this.HaptikSDK$a == onremoved.HaptikSDK$a && this.values == onremoved.values) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return hasUpdates.valueOf(this).ag$a("hitCount", this.ag$a).ag$a("missCount", this.toString).ag$a("loadSuccessCount", this.ah$a).ag$a("loadExceptionCount", this.valueOf).ag$a("totalLoadTime", this.HaptikSDK$a).ag$a("evictionCount", this.values).toString();
    }
}

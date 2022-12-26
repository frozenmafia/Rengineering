package o;
/* loaded from: classes3.dex */
public final class startForegroundService {
    private Object ah$a;
    private getSystemServiceName valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof startForegroundService) {
            startForegroundService startforegroundservice = (startForegroundService) obj;
            return runAnimators.values(this.valueOf, startforegroundservice.valueOf) && runAnimators.values(this.ah$a, startforegroundservice.ah$a);
        }
        return false;
    }

    public int hashCode() {
        getSystemServiceName getsystemservicename = this.valueOf;
        int hashCode = getsystemservicename == null ? 0 : getsystemservicename.hashCode();
        Object obj = this.ah$a;
        return (hashCode * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        getSystemServiceName getsystemservicename = this.valueOf;
        Object obj = this.ah$a;
        return "SortingHeaderViewEvent(sortingItemVm=" + getsystemservicename + ", msg=" + obj + ")";
    }

    public startForegroundService(getSystemServiceName getsystemservicename, Object obj) {
        this.valueOf = getsystemservicename;
        this.ah$a = obj;
    }

    public final getSystemServiceName ag$a() {
        return this.valueOf;
    }

    public final Object valueOf() {
        return this.ah$a;
    }
}

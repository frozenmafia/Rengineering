package o;
/* loaded from: classes3.dex */
public final class setAlarmClock {
    private final int ag$a;
    private final int ah$a;
    private final String toString;
    private final String valueOf;
    private final String values;

    public String toString() {
        int i = this.ah$a;
        String str = this.toString;
        String str2 = this.valueOf;
        String str3 = this.values;
        int i2 = this.ag$a;
        return "Dream11Reaction(id=" + i + ", reactionUrl=" + str + ", reactionLabel=" + str2 + ", reactionKey=" + str3 + ", drawable=" + i2 + ")";
    }

    public setAlarmClock(int i, String str, String str2, String str3, int i2) {
        runAnimators.ag$a(str, "reactionUrl");
        runAnimators.ag$a(str2, "reactionLabel");
        runAnimators.ag$a(str3, "reactionKey");
        this.ah$a = i;
        this.toString = str;
        this.valueOf = str2;
        this.values = str3;
        this.ag$a = i2;
    }

    public final String HaptikSDK$a() {
        return this.toString;
    }

    public final int ah$a() {
        return this.ah$a;
    }

    public final String valueOf() {
        return this.valueOf;
    }

    public final String values() {
        return this.values;
    }

    public final int ag$a() {
        return this.ag$a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return super.equals(obj);
        }
        return (obj instanceof setAlarmClock) && ((setAlarmClock) obj).ah$a() == ah$a();
    }

    public int hashCode() {
        return this.ah$a;
    }
}

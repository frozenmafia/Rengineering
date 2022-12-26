package o;

import java.util.Objects;
import o.getChildItemId;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class getAccessibilityClassName extends getChildItemId.toString {
    private final String HaptikSDK$a;
    private final long HaptikSDK$b;
    private final String HaptikSDK$c;
    private final boolean ag$a;
    private final String ah$a;
    private final int ah$b;
    private final long toString;
    private final int valueOf;
    private final int values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getAccessibilityClassName(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.values = i;
        Objects.requireNonNull(str, "Null model");
        this.HaptikSDK$c = str;
        this.valueOf = i2;
        this.HaptikSDK$b = j;
        this.toString = j2;
        this.ag$a = z;
        this.ah$b = i3;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.ah$a = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.HaptikSDK$a = str3;
    }

    @Override // o.getChildItemId.toString
    public int valueOf() {
        return this.values;
    }

    @Override // o.getChildItemId.toString
    public String invoke() {
        return this.HaptikSDK$c;
    }

    @Override // o.getChildItemId.toString
    public int ag$a() {
        return this.valueOf;
    }

    @Override // o.getChildItemId.toString
    public long HaptikSDK$b() {
        return this.HaptikSDK$b;
    }

    @Override // o.getChildItemId.toString
    public long values() {
        return this.toString;
    }

    @Override // o.getChildItemId.toString
    public boolean ah$a() {
        return this.ag$a;
    }

    @Override // o.getChildItemId.toString
    public int HaptikSDK$a() {
        return this.ah$b;
    }

    @Override // o.getChildItemId.toString
    public String HaptikSDK$c() {
        return this.ah$a;
    }

    @Override // o.getChildItemId.toString
    public String ah$b() {
        return this.HaptikSDK$a;
    }

    public String toString() {
        return "DeviceData{arch=" + this.values + ", model=" + this.HaptikSDK$c + ", availableProcessors=" + this.valueOf + ", totalRam=" + this.HaptikSDK$b + ", diskSpace=" + this.toString + ", isEmulator=" + this.ag$a + ", state=" + this.ah$b + ", manufacturer=" + this.ah$a + ", modelClass=" + this.HaptikSDK$a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof getChildItemId.toString) {
            getChildItemId.toString tostring = (getChildItemId.toString) obj;
            return this.values == tostring.valueOf() && this.HaptikSDK$c.equals(tostring.invoke()) && this.valueOf == tostring.ag$a() && this.HaptikSDK$b == tostring.HaptikSDK$b() && this.toString == tostring.values() && this.ag$a == tostring.ah$a() && this.ah$b == tostring.HaptikSDK$a() && this.ah$a.equals(tostring.HaptikSDK$c()) && this.HaptikSDK$a.equals(tostring.ah$b());
        }
        return false;
    }

    public int hashCode() {
        int i = this.values;
        int hashCode = this.HaptikSDK$c.hashCode();
        int i2 = this.valueOf;
        long j = this.HaptikSDK$b;
        int i3 = (int) (j ^ (j >>> 32));
        long j2 = this.toString;
        int i4 = (int) (j2 ^ (j2 >>> 32));
        return ((((((((((((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ (this.ag$a ? 1231 : 1237)) * 1000003) ^ this.ah$b) * 1000003) ^ this.ah$a.hashCode()) * 1000003) ^ this.HaptikSDK$a.hashCode();
    }
}

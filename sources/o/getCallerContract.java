package o;

import com.sendbird.android.constant.StringSet;
import o.Visibility;
/* loaded from: classes6.dex */
public final class getCallerContract {
    private final String ah$a;
    private final String toString;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof getCallerContract) {
                getCallerContract getcallercontract = (getCallerContract) obj;
                return runAnimators.values((Object) this.ah$a, (Object) getcallercontract.ah$a) && runAnimators.values((Object) this.toString, (Object) getcallercontract.toString);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.ah$a;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.toString;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public getCallerContract(String str, String str2) {
        runAnimators.valueOf(str, StringSet.key);
        runAnimators.valueOf(str2, "record");
        this.ah$a = str;
        this.toString = str2;
    }

    public final String valueOf() {
        return this.ah$a;
    }

    public final String ag$a() {
        return this.toString;
    }

    public String toString() {
        return Visibility.Mode.ag$a("\n  |RecordForKey [\n  |  key: " + this.ah$a + "\n  |  record: " + this.toString + "\n  |]\n  ", (String) null, 1, (Object) null);
    }
}

package o;

import com.sendbird.android.constant.StringSet;
import o.Visibility;
/* loaded from: classes6.dex */
public final class getResultContract {
    private final String ah$a;
    private final String toString;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof getResultContract) {
                getResultContract getresultcontract = (getResultContract) obj;
                return runAnimators.values((Object) this.ah$a, (Object) getresultcontract.ah$a) && runAnimators.values((Object) this.toString, (Object) getresultcontract.toString);
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

    public getResultContract(String str, String str2) {
        runAnimators.valueOf(str, StringSet.key);
        runAnimators.valueOf(str2, "record");
        this.ah$a = str;
        this.toString = str2;
    }

    public final String values() {
        return this.ah$a;
    }

    public final String ah$a() {
        return this.toString;
    }

    public String toString() {
        return Visibility.Mode.ag$a("\n  |RecordsForKeys [\n  |  key: " + this.ah$a + "\n  |  record: " + this.toString + "\n  |]\n  ", (String) null, 1, (Object) null);
    }
}

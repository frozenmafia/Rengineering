package o;

import com.sendbird.android.constant.StringSet;
import o.ComponentActivity;
import o.Visibility;
/* loaded from: classes6.dex */
public final class getInput {
    private final String ag$a;
    private final long ah$a;
    private final String values;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof getInput) {
                getInput getinput = (getInput) obj;
                return this.ah$a == getinput.ah$a && runAnimators.values((Object) this.ag$a, (Object) getinput.ag$a) && runAnimators.values((Object) this.values, (Object) getinput.values);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int c03192 = ComponentActivity.AnonymousClass2.C03192.toString(this.ah$a);
        String str = this.ag$a;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.values;
        return (((c03192 * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public getInput(long j, String str, String str2) {
        runAnimators.valueOf(str, StringSet.key);
        runAnimators.valueOf(str2, "record");
        this.ah$a = j;
        this.ag$a = str;
        this.values = str2;
    }

    public String toString() {
        return Visibility.Mode.ag$a("\n  |Records [\n  |  _id: " + this.ah$a + "\n  |  key: " + this.ag$a + "\n  |  record: " + this.values + "\n  |]\n  ", (String) null, 1, (Object) null);
    }
}

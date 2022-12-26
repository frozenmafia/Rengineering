package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Arrays;
/* loaded from: classes5.dex */
final class defaultOnMeasure extends CrashlyticsReport.values.toString {
    private final String ag$a;
    private final byte[] ah$a;

    private defaultOnMeasure(String str, byte[] bArr) {
        this.ag$a = str;
        this.ah$a = bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.values.toString
    public String values() {
        return this.ag$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.values.toString
    public byte[] valueOf() {
        return this.ah$a;
    }

    public String toString() {
        return "File{filename=" + this.ag$a + ", contents=" + Arrays.toString(this.ah$a) + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.values.toString) {
            CrashlyticsReport.values.toString tostring = (CrashlyticsReport.values.toString) obj;
            if (this.ag$a.equals(tostring.values())) {
                if (Arrays.equals(this.ah$a, tostring instanceof defaultOnMeasure ? ((defaultOnMeasure) tostring).ah$a : tostring.valueOf())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.ag$a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.ah$a);
    }
}

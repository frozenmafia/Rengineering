package o;

import java.util.List;
/* loaded from: classes.dex */
public class onMetadataUpdate {
    private final double HaptikSDK$b;
    private final double ag$a;
    private final String ah$a;
    private final String toString;
    private final List<createQueueItem> valueOf;
    private final char values;

    public static int values(char c, String str, String str2) {
        return ((((c + 0) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public onMetadataUpdate(List<createQueueItem> list, char c, double d, double d2, String str, String str2) {
        this.valueOf = list;
        this.values = c;
        this.ag$a = d;
        this.HaptikSDK$b = d2;
        this.toString = str;
        this.ah$a = str2;
    }

    public List<createQueueItem> ag$a() {
        return this.valueOf;
    }

    public double ah$a() {
        return this.HaptikSDK$b;
    }

    public int hashCode() {
        return values(this.values, this.ah$a, this.toString);
    }
}

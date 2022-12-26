package o;

import java.util.Map;
/* loaded from: classes.dex */
public class putNext {
    private Map<String, Object> ag$a;
    private String ah$a;
    private long toString;
    private String valueOf;

    public putNext(long j, String str, String str2, Map<String, Object> map) {
        this.toString = j;
        this.valueOf = str;
        this.ah$a = str2;
        this.ag$a = map;
    }

    public long ag$a() {
        return this.toString;
    }

    public String ah$a() {
        return this.valueOf;
    }

    public Map<String, Object> valueOf() {
        return this.ag$a;
    }
}

package o;

import java.util.List;
import java.util.Map;
/* loaded from: classes7.dex */
public abstract class saveArgsToCache {
    private Map<String, List<String>> ag$a;
    private int ah$a;
    private int valueOf;
    private int values;

    public saveArgsToCache(int i, int i2, int i3) {
        valueOf(i);
        ah$a(i2);
        values(i3);
    }

    public int ag$a() {
        return this.values;
    }

    public void valueOf(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The connect timeout must not be negative");
        }
        this.values = i;
    }

    public int valueOf() {
        return this.ah$a;
    }

    public void ah$a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The read timeout must not be negative");
        }
        this.ah$a = i;
    }

    public int ah$a() {
        return this.valueOf;
    }

    public void values(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The size limit must not be negative");
        }
        this.valueOf = i;
    }

    public Map<String, List<String>> values() {
        return this.ag$a;
    }
}

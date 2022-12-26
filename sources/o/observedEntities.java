package o;
/* loaded from: classes7.dex */
public class observedEntities {
    private final String toString;
    private final String values;

    public observedEntities(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("The resource content must not be null");
        }
        this.toString = str;
        this.values = str2;
    }

    public String ag$a() {
        return this.toString;
    }
}

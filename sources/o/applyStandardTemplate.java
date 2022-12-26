package o;
/* loaded from: classes3.dex */
public final class applyStandardTemplate {
    private final int ag$a;
    private final String toString;
    private final String valueOf;
    private final values values;

    /* loaded from: classes3.dex */
    public interface values {
        void toString(int i);

        void values();

        void values(String str);
    }

    public applyStandardTemplate(int i, String str, String str2, values valuesVar) {
        runAnimators.ag$a(str, "userGuid");
        runAnimators.ag$a(str2, "teamName");
        runAnimators.ag$a(valuesVar, "handler");
        this.ag$a = i;
        this.valueOf = str;
        this.toString = str2;
        this.values = valuesVar;
    }

    public final int ag$a() {
        return this.ag$a;
    }

    public final values ah$a() {
        return this.values;
    }

    public final String valueOf() {
        return this.toString;
    }

    public final String values() {
        return this.valueOf;
    }
}

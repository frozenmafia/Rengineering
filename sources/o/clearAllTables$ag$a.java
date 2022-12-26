package o;

import java.util.Arrays;
/* loaded from: classes5.dex */
public final class clearAllTables$ag$a {
    private values ag$a;
    private values ah$a;
    private boolean toString;
    private final String values;

    private clearAllTables$ag$a(String str) {
        values valuesVar = new values();
        this.ag$a = valuesVar;
        this.ah$a = valuesVar;
        this.toString = false;
        this.values = (String) assertNotMainThread.valueOf(str);
    }

    public clearAllTables$ag$a valueOf(String str, Object obj) {
        return ah$a(str, obj);
    }

    public clearAllTables$ag$a toString(String str, int i) {
        return ah$a(str, String.valueOf(i));
    }

    public clearAllTables$ag$a toString(String str, long j) {
        return ah$a(str, String.valueOf(j));
    }

    public clearAllTables$ag$a values(Object obj) {
        return toString(obj);
    }

    public String toString() {
        boolean z = this.toString;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.values);
        sb.append('{');
        String str = "";
        for (values valuesVar = this.ag$a.toString; valuesVar != null; valuesVar = valuesVar.toString) {
            Object obj = valuesVar.values;
            if (!z || obj != null) {
                sb.append(str);
                if (valuesVar.ag$a != null) {
                    sb.append(valuesVar.ag$a);
                    sb.append('=');
                }
                if (obj != null && obj.getClass().isArray()) {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append(deepToString.substring(1, deepToString.length() - 1));
                } else {
                    sb.append(obj);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }

    private values values() {
        values valuesVar = new values();
        this.ah$a.toString = valuesVar;
        this.ah$a = valuesVar;
        return valuesVar;
    }

    private clearAllTables$ag$a toString(Object obj) {
        values().values = obj;
        return this;
    }

    private clearAllTables$ag$a ah$a(String str, Object obj) {
        values values2 = values();
        values2.values = obj;
        values2.ag$a = (String) assertNotMainThread.valueOf(str);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class values {
        String ag$a;
        values toString;
        Object values;

        private values() {
        }
    }
}

package o;

import java.util.Objects;
/* loaded from: classes5.dex */
public final class createVectorOfTables {
    static final addShort<Object, Object> valueOf = new addShort<Object, Object>() { // from class: o.createVectorOfTables$ag$a
        @Override // o.addShort
        public boolean ah$a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }
    };

    public static int ah$a(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }
}

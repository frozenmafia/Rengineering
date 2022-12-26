package o;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import java.io.IOException;
/* loaded from: classes7.dex */
public class findAnimation<K, V> {
    private final findAnimation$ah$a<K, V> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void values(CodedOutputStream codedOutputStream, findAnimation$ah$a<K, V> findanimation_ah_a, K k, V v) throws IOException {
        getSelectedDxDy.ag$a(codedOutputStream, findanimation_ah_a.valueOf, 1, k);
        getSelectedDxDy.ag$a(codedOutputStream, findanimation_ah_a.toString, 2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int toString(findAnimation$ah$a<K, V> findanimation_ah_a, K k, V v) {
        return getSelectedDxDy.toString(findanimation_ah_a.valueOf, 1, k) + getSelectedDxDy.toString(findanimation_ah_a.toString, 2, v);
    }

    public int values(int i, K k, V v) {
        return CodedOutputStream.ah$b(i) + CodedOutputStream.ah$a(toString(this.values, k, v));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public findAnimation$ah$a<K, V> valueOf() {
        return this.values;
    }
}

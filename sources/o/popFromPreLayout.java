package o;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.WireFormat;
import java.io.IOException;
/* loaded from: classes5.dex */
public class popFromPreLayout<K, V> {
    private final V ah$a;
    private final toString<K, V> toString;
    private final K valueOf;

    /* loaded from: classes5.dex */
    public static class toString<K, V> {
        public final V ah$a;
        public final K toString;
        public final WireFormat.FieldType valueOf;
        public final WireFormat.FieldType values;

        public toString(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
            this.valueOf = fieldType;
            this.toString = k;
            this.values = fieldType2;
            this.ah$a = v;
        }
    }

    private popFromPreLayout(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        this.toString = new toString<>(fieldType, k, fieldType2, v);
        this.valueOf = k;
        this.ah$a = v;
    }

    public static <K, V> popFromPreLayout<K, V> toString(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        return new popFromPreLayout<>(fieldType, k, fieldType2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void ag$a(CodedOutputStream codedOutputStream, toString<K, V> tostring, K k, V v) throws IOException {
        resetFlags.valueOf(codedOutputStream, tostring.valueOf, 1, k);
        resetFlags.valueOf(codedOutputStream, tostring.values, 2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int toString(toString<K, V> tostring, K k, V v) {
        return resetFlags.ag$a(tostring.valueOf, 1, k) + resetFlags.ag$a(tostring.values, 2, v);
    }

    public int valueOf(int i, K k, V v) {
        return CodedOutputStream.HaptikSDK$b(i) + CodedOutputStream.ah$a(toString(this.toString, k, v));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public toString<K, V> ag$a() {
        return this.toString;
    }
}

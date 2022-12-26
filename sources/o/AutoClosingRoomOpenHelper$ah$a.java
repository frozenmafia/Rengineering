package o;

import com.google.protobuf.Value;
import com.google.protobuf.WireFormat;
/* loaded from: classes7.dex */
final class AutoClosingRoomOpenHelper$ah$a {
    static final popFromPreLayout<String, Value> values;

    static {
        Value value;
        WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
        WireFormat.FieldType fieldType2 = WireFormat.FieldType.MESSAGE;
        value = Value.DEFAULT_INSTANCE;
        values = popFromPreLayout.toString(fieldType, "", fieldType2, value);
    }
}

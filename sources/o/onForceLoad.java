package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.Separators;
import java.io.IOException;
/* loaded from: classes6.dex */
public interface onForceLoad {
    public static final Separators ag$a = Separators.createDefaultInstance();
    public static final SerializedString ah$a = new SerializedString(com.dreampay.commons.constants.Constants.WHITE_SPACE);

    void writeEndArray(JsonGenerator jsonGenerator, int i) throws IOException;

    void writeEndObject(JsonGenerator jsonGenerator, int i) throws IOException;
}

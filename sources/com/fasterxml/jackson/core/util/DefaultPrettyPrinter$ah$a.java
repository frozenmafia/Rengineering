package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
/* loaded from: classes6.dex */
public interface DefaultPrettyPrinter$ah$a {
    boolean isInline();

    void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException;
}

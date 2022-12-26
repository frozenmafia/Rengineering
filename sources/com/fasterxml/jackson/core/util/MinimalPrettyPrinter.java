package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.io.Serializable;
import o.onForceLoad;
/* loaded from: classes6.dex */
public class MinimalPrettyPrinter implements onForceLoad, Serializable {
    private static final long serialVersionUID = 1;
    protected String _rootValueSeparator;
    protected Separators _separators;

    public void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException {
    }

    public void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException {
    }

    public MinimalPrettyPrinter() {
        this(ah$a.toString());
    }

    public MinimalPrettyPrinter(String str) {
        this._rootValueSeparator = str;
        this._separators = ag$a;
    }

    public void setRootValueSeparator(String str) {
        this._rootValueSeparator = str;
    }

    public MinimalPrettyPrinter setSeparators(Separators separators) {
        this._separators = separators;
        return this;
    }

    public void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        String str = this._rootValueSeparator;
        if (str != null) {
            jsonGenerator.valueOf(str);
        }
    }

    public void writeStartObject(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.ag$a('{');
    }

    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.ag$a(this._separators.getObjectFieldValueSeparator());
    }

    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.ag$a(this._separators.getObjectEntrySeparator());
    }

    @Override // o.onForceLoad
    public void writeEndObject(JsonGenerator jsonGenerator, int i) throws IOException {
        jsonGenerator.ag$a('}');
    }

    public void writeStartArray(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.ag$a('[');
    }

    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.ag$a(this._separators.getArrayValueSeparator());
    }

    @Override // o.onForceLoad
    public void writeEndArray(JsonGenerator jsonGenerator, int i) throws IOException {
        jsonGenerator.ag$a(']');
    }
}

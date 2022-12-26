package com.fasterxml.jackson.core.util;

import com.dreampay.commons.constants.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import java.io.IOException;
import java.io.Serializable;
import o.onForceLoad;
import o.setUpdateThrottle;
import org.apache.http.message.TokenParser;
/* loaded from: classes6.dex */
public class DefaultPrettyPrinter implements onForceLoad, Serializable {
    public static final SerializedString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(Constants.WHITE_SPACE);
    private static final long serialVersionUID = 1;
    protected DefaultPrettyPrinter$ah$a _arrayIndenter;
    protected transient int _nesting;
    protected String _objectFieldValueSeparatorWithSpaces;
    protected DefaultPrettyPrinter$ah$a _objectIndenter;
    protected final setUpdateThrottle _rootSeparator;
    protected Separators _separators;
    protected boolean _spacesInObjectEntries;

    /* loaded from: classes6.dex */
    public static class NopIndenter implements DefaultPrettyPrinter$ah$a, Serializable {
        public static final NopIndenter instance = new NopIndenter();

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter$ah$a
        public boolean isInline() {
            return true;
        }

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter$ah$a
        public void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException {
        }
    }

    public DefaultPrettyPrinter() {
        this(DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    public DefaultPrettyPrinter(String str) {
        this(str == null ? null : new SerializedString(str));
    }

    public DefaultPrettyPrinter(setUpdateThrottle setupdatethrottle) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        this._spacesInObjectEntries = true;
        this._rootSeparator = setupdatethrottle;
        withSeparators(ag$a);
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter) {
        this(defaultPrettyPrinter, defaultPrettyPrinter._rootSeparator);
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter, setUpdateThrottle setupdatethrottle) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        this._spacesInObjectEntries = true;
        this._arrayIndenter = defaultPrettyPrinter._arrayIndenter;
        this._objectIndenter = defaultPrettyPrinter._objectIndenter;
        this._spacesInObjectEntries = defaultPrettyPrinter._spacesInObjectEntries;
        this._nesting = defaultPrettyPrinter._nesting;
        this._separators = defaultPrettyPrinter._separators;
        this._objectFieldValueSeparatorWithSpaces = defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces;
        this._rootSeparator = setupdatethrottle;
    }

    public DefaultPrettyPrinter withRootSeparator(setUpdateThrottle setupdatethrottle) {
        setUpdateThrottle setupdatethrottle2 = this._rootSeparator;
        return (setupdatethrottle2 == setupdatethrottle || (setupdatethrottle != null && setupdatethrottle.equals(setupdatethrottle2))) ? this : new DefaultPrettyPrinter(this, setupdatethrottle);
    }

    public DefaultPrettyPrinter withRootSeparator(String str) {
        return withRootSeparator(str == null ? null : new SerializedString(str));
    }

    public void indentArraysWith(DefaultPrettyPrinter$ah$a defaultPrettyPrinter$ah$a) {
        if (defaultPrettyPrinter$ah$a == null) {
            defaultPrettyPrinter$ah$a = NopIndenter.instance;
        }
        this._arrayIndenter = defaultPrettyPrinter$ah$a;
    }

    public void indentObjectsWith(DefaultPrettyPrinter$ah$a defaultPrettyPrinter$ah$a) {
        if (defaultPrettyPrinter$ah$a == null) {
            defaultPrettyPrinter$ah$a = NopIndenter.instance;
        }
        this._objectIndenter = defaultPrettyPrinter$ah$a;
    }

    public DefaultPrettyPrinter withArrayIndenter(DefaultPrettyPrinter$ah$a defaultPrettyPrinter$ah$a) {
        if (defaultPrettyPrinter$ah$a == null) {
            defaultPrettyPrinter$ah$a = NopIndenter.instance;
        }
        if (this._arrayIndenter == defaultPrettyPrinter$ah$a) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._arrayIndenter = defaultPrettyPrinter$ah$a;
        return defaultPrettyPrinter;
    }

    public DefaultPrettyPrinter withObjectIndenter(DefaultPrettyPrinter$ah$a defaultPrettyPrinter$ah$a) {
        if (defaultPrettyPrinter$ah$a == null) {
            defaultPrettyPrinter$ah$a = NopIndenter.instance;
        }
        if (this._objectIndenter == defaultPrettyPrinter$ah$a) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._objectIndenter = defaultPrettyPrinter$ah$a;
        return defaultPrettyPrinter;
    }

    public DefaultPrettyPrinter withSpacesInObjectEntries() {
        return _withSpaces(true);
    }

    public DefaultPrettyPrinter withoutSpacesInObjectEntries() {
        return _withSpaces(false);
    }

    protected DefaultPrettyPrinter _withSpaces(boolean z) {
        if (this._spacesInObjectEntries == z) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._spacesInObjectEntries = z;
        return defaultPrettyPrinter;
    }

    public DefaultPrettyPrinter withSeparators(Separators separators) {
        this._separators = separators;
        this._objectFieldValueSeparatorWithSpaces = Constants.WHITE_SPACE + separators.getObjectFieldValueSeparator() + Constants.WHITE_SPACE;
        return this;
    }

    /* renamed from: createInstance */
    public DefaultPrettyPrinter m1105createInstance() {
        if (getClass() != DefaultPrettyPrinter.class) {
            throw new IllegalStateException("Failed `createInstance()`: " + getClass().getName() + " does not override method; it has to");
        }
        return new DefaultPrettyPrinter(this);
    }

    public void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        setUpdateThrottle setupdatethrottle = this._rootSeparator;
        if (setupdatethrottle != null) {
            jsonGenerator.ah$a(setupdatethrottle);
        }
    }

    public void writeStartObject(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.ag$a('{');
        if (this._objectIndenter.isInline()) {
            return;
        }
        this._nesting++;
    }

    public void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException {
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        if (this._spacesInObjectEntries) {
            jsonGenerator.valueOf(this._objectFieldValueSeparatorWithSpaces);
        } else {
            jsonGenerator.ag$a(this._separators.getObjectFieldValueSeparator());
        }
    }

    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.ag$a(this._separators.getObjectEntrySeparator());
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // o.onForceLoad
    public void writeEndObject(JsonGenerator jsonGenerator, int i) throws IOException {
        if (!this._objectIndenter.isInline()) {
            this._nesting--;
        }
        if (i > 0) {
            this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.ag$a(TokenParser.SP);
        }
        jsonGenerator.ag$a('}');
    }

    public void writeStartArray(JsonGenerator jsonGenerator) throws IOException {
        if (!this._arrayIndenter.isInline()) {
            this._nesting++;
        }
        jsonGenerator.ag$a('[');
    }

    public void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException {
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.ag$a(this._separators.getArrayValueSeparator());
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // o.onForceLoad
    public void writeEndArray(JsonGenerator jsonGenerator, int i) throws IOException {
        if (!this._arrayIndenter.isInline()) {
            this._nesting--;
        }
        if (i > 0) {
            this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.ag$a(TokenParser.SP);
        }
        jsonGenerator.ag$a(']');
    }

    /* loaded from: classes6.dex */
    public static class FixedSpaceIndenter extends NopIndenter {
        public static final FixedSpaceIndenter instance = new FixedSpaceIndenter();

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter$ah$a
        public boolean isInline() {
            return true;
        }

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter$ah$a
        public void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException {
            jsonGenerator.ag$a(TokenParser.SP);
        }
    }
}

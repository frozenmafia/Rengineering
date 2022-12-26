package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import o.onForceLoad;
import o.setUpdateThrottle;
/* loaded from: classes6.dex */
public abstract class JsonGenerator implements Closeable, Flushable {
    protected onForceLoad valueOf;

    public abstract void ag$a(char c) throws IOException;

    public JsonGenerator ah$a(int i) {
        return this;
    }

    public JsonGenerator valueOf(CharacterEscapes characterEscapes) {
        return this;
    }

    public abstract void valueOf(String str) throws IOException;

    public abstract void valueOf(char[] cArr, int i, int i2) throws IOException;

    /* loaded from: classes6.dex */
    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);
        
        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        public static int collectDefaults() {
            Feature[] values;
            int i = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i |= feature.getMask();
                }
            }
            return i;
        }

        Feature(boolean z) {
            this._defaultState = z;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (i & this._mask) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    public JsonGenerator valueOf(setUpdateThrottle setupdatethrottle) {
        throw new UnsupportedOperationException();
    }

    public void ah$a(setUpdateThrottle setupdatethrottle) throws IOException {
        valueOf(setupdatethrottle.getValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void toString(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str, this);
    }
}

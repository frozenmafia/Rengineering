package com.fasterxml.jackson.core;

import java.io.Closeable;
/* loaded from: classes6.dex */
public abstract class JsonParser implements Closeable {
    protected int ag$a;

    /* loaded from: classes6.dex */
    public enum NumberType {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    public abstract JsonLocation values();

    /* loaded from: classes6.dex */
    public enum Feature {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true);
        
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

    public JsonParser() {
    }

    public JsonParser(int i) {
        this.ag$a = i;
    }

    public boolean valueOf(Feature feature) {
        return feature.enabledIn(this.ag$a);
    }
}

package com.fasterxml.jackson.core.type;
/* loaded from: classes6.dex */
public class WritableTypeId {

    /* loaded from: classes6.dex */
    public enum Inclusion {
        WRAPPER_ARRAY,
        WRAPPER_OBJECT,
        METADATA_PROPERTY,
        PAYLOAD_PROPERTY,
        PARENT_PROPERTY;

        public boolean requiresObjectContext() {
            return this == METADATA_PROPERTY || this == PAYLOAD_PROPERTY;
        }
    }
}

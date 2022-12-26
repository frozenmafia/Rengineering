package com.fancode.core.type;

import o.ComponentActivity;
import o.getTargetTypes;
/* loaded from: classes6.dex */
public enum CustomType implements ComponentActivity.NonConfigurationInstances {
    ID { // from class: com.fancode.core.type.CustomType.ID
        @Override // o.ComponentActivity.NonConfigurationInstances
        public String className() {
            return "kotlin.String";
        }

        @Override // o.ComponentActivity.NonConfigurationInstances
        public String typeName() {
            return "ID";
        }
    };

    /* synthetic */ CustomType(getTargetTypes gettargettypes) {
        this();
    }
}

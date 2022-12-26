package com.app.dream11.core.service.graphql.api.type;

import o.ComponentActivity;
import o.getTargetTypes;
/* loaded from: classes2.dex */
public enum CustomType implements ComponentActivity.NonConfigurationInstances {
    DATE { // from class: com.app.dream11.core.service.graphql.api.type.CustomType.DATE
        @Override // o.ComponentActivity.NonConfigurationInstances
        public String className() {
            return "java.util.Date";
        }

        @Override // o.ComponentActivity.NonConfigurationInstances
        public String typeName() {
            return "Date";
        }
    },
    ID { // from class: com.app.dream11.core.service.graphql.api.type.CustomType.ID
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

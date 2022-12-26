package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$HaptikSDK$a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$HaptikSDK$a$ah$a;
import java.util.Objects;
/* loaded from: classes5.dex */
public abstract class CrashlyticsReport$toString$HaptikSDK$a {
    public abstract String valueOf();

    public static CrashlyticsReport$toString$HaptikSDK$a$ah$a ah$a() {
        return new CrashlyticsReport$toString$HaptikSDK$a$ah$a() { // from class: o.findChildViewUnder$ah$a
            private String toString;

            @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$HaptikSDK$a$ah$a
            public CrashlyticsReport$toString$HaptikSDK$a$ah$a ah$a(String str) {
                Objects.requireNonNull(str, "Null identifier");
                this.toString = str;
                return this;
            }

            @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$HaptikSDK$a$ah$a
            public CrashlyticsReport$toString$HaptikSDK$a ag$a() {
                String str = "";
                if (this.toString == null) {
                    str = " identifier";
                }
                if (!str.isEmpty()) {
                    throw new IllegalStateException("Missing required properties:" + str);
                }
                return new findChildViewUnder(this.toString);
            }
        };
    }
}

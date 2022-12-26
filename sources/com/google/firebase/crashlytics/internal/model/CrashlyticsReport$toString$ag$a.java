package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a;
import java.util.Objects;
import o.dispatchChildDetached;
/* loaded from: classes5.dex */
public abstract class CrashlyticsReport$toString$ag$a {

    /* loaded from: classes5.dex */
    public static abstract class valueOf {
        public abstract valueOf ag$a(CrashlyticsReport$toString$ag$a$ag$a crashlyticsReport$toString$ag$a$ag$a);

        public abstract valueOf ag$a(String str);

        public abstract valueOf ah$a(long j);

        public abstract valueOf ah$a(values valuesVar);

        public abstract valueOf toString(CrashlyticsReport$toString$ag$a$ah$a crashlyticsReport$toString$ag$a$ah$a);

        public abstract CrashlyticsReport$toString$ag$a valueOf();
    }

    public abstract String HaptikSDK$a();

    public abstract valueOf HaptikSDK$b();

    public abstract values ag$a();

    public abstract CrashlyticsReport$toString$ag$a$ag$a ah$a();

    public abstract long valueOf();

    public abstract CrashlyticsReport$toString$ag$a$ah$a values();

    public static valueOf ah$b() {
        return new dispatchChildDetached.values();
    }

    /* loaded from: classes5.dex */
    public static abstract class values {

        /* loaded from: classes5.dex */
        public static abstract class toString {
            public abstract values ag$a();

            public abstract toString ah$a(String str);
        }

        public abstract String ag$a();

        public static toString valueOf() {
            return new toString() { // from class: o.findViewHolderForAdapterPosition$ag$a
                private String values;

                @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.ag.a.values.toString
                public CrashlyticsReport$toString$ag$a.values.toString ah$a(String str) {
                    Objects.requireNonNull(str, "Null content");
                    this.values = str;
                    return this;
                }

                @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.ag.a.values.toString
                public CrashlyticsReport$toString$ag$a.values ag$a() {
                    String str = "";
                    if (this.values == null) {
                        str = " content";
                    }
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:" + str);
                    }
                    return new findViewHolderForAdapterPosition(this.values);
                }
            };
        }
    }
}

package o;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;
/* loaded from: classes5.dex */
public final class updateLayoutState {
    private final String HaptikSDK$b;
    private final String HaptikSDK$c;
    private final String ag$a;
    private final String ah$a;
    private final String toString;
    private final String valueOf;
    private final String values;

    /* loaded from: classes5.dex */
    public static final class toString {
        private String HaptikSDK$c;
        private String ag$a;
        private String ah$a;
        private String ah$b;
        private String toString;
        private String valueOf;
        private String values;

        public toString ah$a(String str) {
            this.values = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "ApiKey must be set.");
            return this;
        }

        public toString toString(String str) {
            this.ah$a = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "ApplicationId must be set.");
            return this;
        }

        public toString valueOf(String str) {
            this.toString = str;
            return this;
        }

        public toString values(String str) {
            this.ag$a = str;
            return this;
        }

        public updateLayoutState ag$a() {
            return new updateLayoutState(this.ah$a, this.values, this.toString, this.valueOf, this.ag$a, this.ah$b, this.HaptikSDK$c);
        }
    }

    private updateLayoutState(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        com.google.android.gms.common.internal.Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.toString = str;
        this.values = str2;
        this.ah$a = str3;
        this.ag$a = str4;
        this.valueOf = str5;
        this.HaptikSDK$c = str6;
        this.HaptikSDK$b = str7;
    }

    public static updateLayoutState ah$a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new updateLayoutState(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public String ah$a() {
        return this.values;
    }

    public String valueOf() {
        return this.toString;
    }

    public String ag$a() {
        return this.ah$a;
    }

    public String values() {
        return this.valueOf;
    }

    public String HaptikSDK$c() {
        return this.HaptikSDK$b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof updateLayoutState) {
            updateLayoutState updatelayoutstate = (updateLayoutState) obj;
            return Objects.equal(this.toString, updatelayoutstate.toString) && Objects.equal(this.values, updatelayoutstate.values) && Objects.equal(this.ah$a, updatelayoutstate.ah$a) && Objects.equal(this.ag$a, updatelayoutstate.ag$a) && Objects.equal(this.valueOf, updatelayoutstate.valueOf) && Objects.equal(this.HaptikSDK$c, updatelayoutstate.HaptikSDK$c) && Objects.equal(this.HaptikSDK$b, updatelayoutstate.HaptikSDK$b);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.toString, this.values, this.ah$a, this.ag$a, this.valueOf, this.HaptikSDK$c, this.HaptikSDK$b);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.toString).add("apiKey", this.values).add("databaseUrl", this.ah$a).add("gcmSenderId", this.valueOf).add("storageBucket", this.HaptikSDK$c).add("projectId", this.HaptikSDK$b).toString();
    }
}

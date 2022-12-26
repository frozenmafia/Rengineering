package o;

import com.sendbird.android.constant.StringSet;
import java.io.File;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class isDestroyed {
    public static final valueOf valueOf = new valueOf(null);
    private Long ah$a;
    private String toString;
    private String values;

    public isDestroyed(String str) {
        this.ah$a = Long.valueOf(System.currentTimeMillis() / 1000);
        this.values = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l = this.ah$a;
        Objects.requireNonNull(l, "null cannot be cast to non-null type kotlin.Long");
        stringBuffer.append(l.longValue());
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        runAnimators.ah$a(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
        this.toString = stringBuffer2;
    }

    public isDestroyed(File file) {
        runAnimators.ag$a(file, StringSet.file);
        String name = file.getName();
        runAnimators.ah$a(name, "file.name");
        this.toString = name;
        findFragmentById findfragmentbyid = findFragmentById.values;
        JSONObject values = findFragmentById.values(this.toString, true);
        if (values != null) {
            this.ah$a = Long.valueOf(values.optLong("timestamp", 0L));
            this.values = values.optString("error_message", null);
        }
    }

    public final int valueOf(isDestroyed isdestroyed) {
        runAnimators.ag$a(isdestroyed, "data");
        Long l = this.ah$a;
        if (l == null) {
            return -1;
        }
        long longValue = l.longValue();
        Long l2 = isdestroyed.ah$a;
        if (l2 == null) {
            return 1;
        }
        return runAnimators.values(l2.longValue(), longValue);
    }

    public final boolean ah$a() {
        return (this.values == null || this.ah$a == null) ? false : true;
    }

    public final void ag$a() {
        if (ah$a()) {
            findFragmentById findfragmentbyid = findFragmentById.values;
            findFragmentById.ag$a(this.toString, toString());
        }
    }

    public final void valueOf() {
        findFragmentById findfragmentbyid = findFragmentById.values;
        findFragmentById.values(this.toString);
    }

    public String toString() {
        JSONObject values = values();
        if (values == null) {
            return super.toString();
        }
        String jSONObject = values.toString();
        runAnimators.ah$a(jSONObject, "params.toString()");
        return jSONObject;
    }

    public final JSONObject values() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.ah$a;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            jSONObject.put("error_message", this.values);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }
    }
}

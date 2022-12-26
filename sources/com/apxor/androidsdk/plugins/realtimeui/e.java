package com.apxor.androidsdk.plugins.realtimeui;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.logging.type.LogSeverity;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class e extends d {
    private int D0;
    private int E0;
    private String A0 = TtmlNode.TEXT_EMPHASIS_MARK_DOT;
    private int B0 = 5;
    private int C0 = LogSeverity.ALERT_VALUE;
    private String F0 = "ripple";

    public String R0() {
        return this.F0;
    }

    public int S0() {
        return this.E0;
    }

    public int T0() {
        return this.B0;
    }

    public int U0() {
        return this.C0;
    }

    public int V0() {
        return this.D0;
    }

    public boolean W0() {
        return this.A0.equals(TtmlNode.TEXT_EMPHASIS_MARK_DOT);
    }

    @Override // com.apxor.androidsdk.plugins.realtimeui.d, com.apxor.androidsdk.plugins.realtimeui.b
    public boolean a(JSONObject jSONObject, String str, String str2) {
        if (super.a(jSONObject, str, str2)) {
            if (l().equals("")) {
                this.k = "right";
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("nudge_config");
            if (optJSONObject != null) {
                this.A0 = optJSONObject.getString("type");
                String optString = optJSONObject.optString("anim_type", "ripple");
                this.F0 = optString;
                if (optString.equals("ripple")) {
                    this.B0 = optJSONObject.optInt("repeat_count", 5);
                    this.C0 = optJSONObject.optInt("ripple_duration", LogSeverity.ALERT_VALUE);
                }
                this.D0 = optJSONObject.optInt("width", 0);
                this.E0 = optJSONObject.optInt("height", 0);
                return true;
            }
            return true;
        }
        return false;
    }
}

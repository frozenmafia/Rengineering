package o;

import org.apache.commons.codec.language.Soundex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
final class isAtLeastOMR1 {
    public static byte[] valueOf(byte[] bArr) {
        return getElevationDegrees.HaptikSDK$b >= 27 ? bArr : getElevationDegrees.ah$a(valueOf(getElevationDegrees.values(bArr)));
    }

    public static byte[] ag$a(byte[] bArr) {
        if (getElevationDegrees.HaptikSDK$b >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(getElevationDegrees.values(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(ag$a(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(ag$a(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return getElevationDegrees.ah$a(sb.toString());
        } catch (JSONException e) {
            SupportMenuItem.toString("ClearKeyUtil", "Failed to adjust response data: " + getElevationDegrees.values(bArr), e);
            return bArr;
        }
    }

    private static String valueOf(String str) {
        return str.replace('+', Soundex.SILENT_MARKER).replace('/', '_');
    }

    private static String ag$a(String str) {
        return str.replace(Soundex.SILENT_MARKER, '+').replace('_', '/');
    }
}

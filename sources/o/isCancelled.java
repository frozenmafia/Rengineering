package o;

import com.app.dream11.model.BaseCampaignRequest;
import java.util.Map;
/* loaded from: classes.dex */
public class isCancelled {
    private String ag$a;
    private Map<String, String> ah$a;
    private String toString;

    public isCancelled(Map<String, String> map, String str, String str2) {
        this.ah$a = map;
        this.toString = str;
        this.ag$a = str2;
    }

    public String HaptikSDK$b() {
        return HaptikSDK$e() ? this.ah$a.get("campaign") : BaseCampaignRequest.ORGANIC_VALUE;
    }

    public String ah$b() {
        return HaptikSDK$e() ? this.ah$a.get("media_source") : BaseCampaignRequest.ORGANIC_VALUE;
    }

    public String HaptikSDK$c() {
        Map<String, String> map = this.ah$a;
        if (map != null) {
            return map.get("install_time");
        }
        return null;
    }

    public boolean HaptikSDK$d() {
        return "true".equalsIgnoreCase(this.ah$a.get("is_first_launch"));
    }

    public String ah$a() {
        if (HaptikSDK$e()) {
            String str = this.ah$a.get("af_ad");
            String str2 = this.ah$a.get("adgroup");
            return (str == null || str.isEmpty()) ? (str2 == null || str2.isEmpty()) ? "" : str2 : str;
        }
        return BaseCampaignRequest.ORGANIC_VALUE;
    }

    public static String valueOf(Map<String, String> map) {
        String str = map.get("af_dp");
        return (str == null || str.isEmpty()) ? "" : str;
    }

    public String ag$a() {
        return values(this.ah$a);
    }

    public static String values(Map<String, String> map) {
        if (ah$a(map)) {
            String str = map.get("af_adset");
            String str2 = map.get("adset");
            return (str == null || str.isEmpty()) ? (str2 == null || str2.isEmpty()) ? "" : str2 : str;
        }
        return BaseCampaignRequest.ORGANIC_VALUE;
    }

    public String valueOf() {
        return this.ah$a.get("af_siteid");
    }

    public static boolean ah$a(Map<String, String> map) {
        return "Non-organic".equalsIgnoreCase(map.get("af_status"));
    }

    public boolean HaptikSDK$e() {
        return ah$a(this.ah$a);
    }

    public String invoke() {
        return toString(this.ah$a);
    }

    private String toString(Map<String, String> map) {
        if (map != null) {
            try {
                return map.get("af_status") + "&" + map.get("campaign") + "&" + map.get("agency") + "&" + map.get("media_source") + "&" + map.get("af_ad") + "&" + map.get("af_adset") + "&" + map.get("af_siteid") + "&" + map.get("adset") + "&" + map.get("adgroup");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public String HaptikSDK$a() {
        return this.toString;
    }

    public String values() {
        return this.ag$a;
    }
}

package o;

import android.net.Uri;
import android.text.TextUtils;
import com.google.ads.interactivemedia.v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.v3.api.StreamRequest;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class ViewModelStore {
    private String HaptikSDK$b;
    private String HaptikSDK$c;
    private String HaptikSDK$e;
    private String HaptikWebView;
    private String ag$a;
    private String ah$b;
    private String invoke;
    private String toString;
    private String values;
    private ImmutableMap<String, String> ah$a = ImmutableMap.of();
    private int HaptikSDK$a = 10000;
    public int valueOf = 4;

    public ViewModelStore ag$a(String str) {
        this.ag$a = str;
        return this;
    }

    public ViewModelStore ah$a(int i) {
        Assertions.checkArgument(i == 0 || i == 2);
        this.valueOf = i;
        return this;
    }

    public ViewModelStore toString(String str) {
        this.HaptikSDK$b = str;
        return this;
    }

    public ViewModelStore valueOf(String str) {
        this.HaptikSDK$c = str;
        return this;
    }

    public Uri valueOf() {
        Assertions.checkState(!(!TextUtils.isEmpty(this.ag$a) || TextUtils.isEmpty(this.invoke) || TextUtils.isEmpty(this.HaptikSDK$e)) || (!TextUtils.isEmpty(this.ag$a) && TextUtils.isEmpty(this.invoke) && TextUtils.isEmpty(this.HaptikSDK$e)));
        Assertions.checkState(this.valueOf != 4);
        String str = this.toString;
        if (str == null && (str = this.ag$a) == null) {
            str = (String) Assertions.checkNotNull(this.HaptikSDK$e);
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(C.SSAI_SCHEME);
        builder.authority("dai.google.com");
        builder.appendQueryParameter("adsId", str);
        int i = this.HaptikSDK$a;
        if (i != 10000) {
            builder.appendQueryParameter("loadVideoTimeoutMs", String.valueOf(i));
        }
        String str2 = this.ag$a;
        if (str2 != null) {
            builder.appendQueryParameter("assetKey", str2);
        }
        String str3 = this.values;
        if (str3 != null) {
            builder.appendQueryParameter("apiKey", str3);
        }
        String str4 = this.invoke;
        if (str4 != null) {
            builder.appendQueryParameter("contentSourceId", str4);
        }
        String str5 = this.HaptikSDK$e;
        if (str5 != null) {
            builder.appendQueryParameter("videoId", str5);
        }
        String str6 = this.HaptikSDK$b;
        if (str6 != null) {
            builder.appendQueryParameter("manifestSuffix", str6);
        }
        String str7 = this.HaptikSDK$c;
        if (str7 != null) {
            builder.appendQueryParameter("contentUrl", str7);
        }
        String str8 = this.ah$b;
        if (str8 != null) {
            builder.appendQueryParameter("authToken", str8);
        }
        String str9 = this.HaptikWebView;
        if (str9 != null) {
            builder.appendQueryParameter("streamActivityMonitorId", str9);
        }
        if (!this.ah$a.isEmpty()) {
            Uri.Builder builder2 = new Uri.Builder();
            removeViewIfHidden<Map.Entry<String, String>> it = this.ah$a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                builder2.appendQueryParameter(next.getKey(), next.getValue());
            }
            builder.appendQueryParameter("adTagParameters", builder2.build().toString());
        }
        builder.appendQueryParameter("format", String.valueOf(this.valueOf));
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean ag$a(Uri uri) {
        return !TextUtils.isEmpty(uri.getQueryParameter("assetKey"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String toString(Uri uri) {
        return (String) Assertions.checkNotNull(uri.getQueryParameter("adsId"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int ah$a(Uri uri) {
        String queryParameter = uri.getQueryParameter("loadVideoTimeoutMs");
        if (TextUtils.isEmpty(queryParameter)) {
            return 10000;
        }
        return Integer.parseInt(queryParameter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static StreamRequest values(Uri uri) {
        StreamRequest createVodStreamRequest;
        if (!C.SSAI_SCHEME.equals(uri.getScheme()) || !"dai.google.com".equals(uri.getAuthority())) {
            throw new IllegalArgumentException("Invalid URI scheme or authority.");
        }
        String queryParameter = uri.getQueryParameter("assetKey");
        String queryParameter2 = uri.getQueryParameter("apiKey");
        String queryParameter3 = uri.getQueryParameter("contentSourceId");
        String queryParameter4 = uri.getQueryParameter("videoId");
        if (!TextUtils.isEmpty(queryParameter)) {
            createVodStreamRequest = ImaSdkFactory.getInstance().createLiveStreamRequest(queryParameter, queryParameter2);
        } else {
            createVodStreamRequest = ImaSdkFactory.getInstance().createVodStreamRequest((String) Assertions.checkNotNull(queryParameter3), (String) Assertions.checkNotNull(queryParameter4), queryParameter2);
        }
        int parseInt = Integer.parseInt(uri.getQueryParameter("format"));
        if (parseInt == 0) {
            createVodStreamRequest.setFormat(StreamRequest.StreamFormat.DASH);
        } else if (parseInt != 2) {
            throw new IllegalArgumentException("Unsupported stream format:" + parseInt);
        } else {
            createVodStreamRequest.setFormat(StreamRequest.StreamFormat.HLS);
        }
        String queryParameter5 = uri.getQueryParameter("adTagParameters");
        if (!TextUtils.isEmpty(queryParameter5)) {
            HashMap hashMap = new HashMap();
            Uri parse = Uri.parse(queryParameter5);
            for (String str : parse.getQueryParameterNames()) {
                String queryParameter6 = parse.getQueryParameter(str);
                if (!TextUtils.isEmpty(queryParameter6)) {
                    hashMap.put(str, queryParameter6);
                }
            }
            createVodStreamRequest.setAdTagParameters(hashMap);
        }
        String queryParameter7 = uri.getQueryParameter("manifestSuffix");
        if (queryParameter7 != null) {
            createVodStreamRequest.setManifestSuffix(queryParameter7);
        }
        String queryParameter8 = uri.getQueryParameter("contentUrl");
        if (queryParameter8 != null) {
            createVodStreamRequest.setContentUrl(queryParameter8);
        }
        String queryParameter9 = uri.getQueryParameter("authToken");
        if (queryParameter9 != null) {
            createVodStreamRequest.setAuthToken(queryParameter9);
        }
        String queryParameter10 = uri.getQueryParameter("streamActivityMonitorId");
        if (queryParameter10 != null) {
            createVodStreamRequest.setStreamActivityMonitorId(queryParameter10);
        }
        return createVodStreamRequest;
    }
}

package o;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CheckBox;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import easypay.actions.EasypayBrowserFragment;
import java.util.Map;
import o.SidecarCompat;
import org.apache.http.message.TokenParser;
/* loaded from: classes5.dex */
public class parallaxOtherViews {
    private static int HaptikSDK$d = 1;
    private static int HaptikWebView = 0;
    private static long getInitSettings = -4077935031676274132L;
    EasypayBrowserFragment HaptikSDK$a;
    WebView HaptikSDK$b;
    String HaptikSDK$c;
    BroadcastReceiver ag$a;
    CheckBox ah$a;
    String ah$b;
    String invoke;
    CheckBox toString;
    Map<String, String> valueOf;
    Activity values;

    public void ag$a() {
        int i = HaptikWebView + 13;
        HaptikSDK$d = i % 128;
        int i2 = i % 2;
    }

    static /* synthetic */ void valueOf(parallaxOtherViews parallaxotherviews) {
        int i = HaptikWebView + 99;
        HaptikSDK$d = i % 128;
        int i2 = i % 2;
        parallaxotherviews.ah$a();
        int i3 = HaptikWebView + 61;
        HaptikSDK$d = i3 % 128;
        int i4 = i3 % 2;
    }

    public parallaxOtherViews(Activity activity, WebView webView, EasypayBrowserFragment easypayBrowserFragment, Map<String, String> map) {
        try {
            this.invoke = SessionDescription.SUPPORTED_SDP_VERSION;
            this.HaptikSDK$c = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            this.ag$a = new BroadcastReceiver() { // from class: o.parallaxOtherViews.1
                private static int HaptikSDK$a = 1;
                private static boolean ah$a = true;
                private static int ah$b = 0;
                private static char[] toString = {'p', 'k'};
                private static boolean valueOf = true;
                private static int values = 7;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Bundle extras = intent.getExtras();
                    String string = extras.getString("eventName");
                    string.hashCode();
                    int hashCode = string.hashCode();
                    char c = 65535;
                    if (hashCode != -891535336) {
                        if (hashCode != 1028005300) {
                            if (hashCode == 1476801686 && string.equals("activateRadioHelper")) {
                                c = 2;
                            }
                        } else if (string.equals("selectRadioOption")) {
                            c = 1;
                        }
                    } else if (string.equals("submit")) {
                        c = 0;
                    } else {
                        int i = HaptikSDK$a + 91;
                        ah$b = i % 128;
                        int i2 = i % 2;
                    }
                    if (c == 0) {
                        parallaxOtherViews.valueOf(parallaxOtherViews.this);
                    } else if (c == 1) {
                        parallaxOtherViews.this.values(extras.getString("data0"));
                        int i3 = ah$b + 71;
                        HaptikSDK$a = i3 % 128;
                        int i4 = i3 % 2;
                    } else if (c != 2) {
                        int i5 = ah$b + 119;
                        HaptikSDK$a = i5 % 128;
                        int i6 = i5 % 2;
                    } else {
                        parallaxOtherViews.this.ag$a();
                        parallaxOtherViews.this.HaptikSDK$a.logEvent("activated", parallaxOtherViews.this.valueOf.get(ag$a(null, null, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, new byte[]{-126, -127}).intern()));
                        int i7 = HaptikSDK$a + 87;
                        ah$b = i7 % 128;
                        int i8 = i7 % 2;
                    }
                }

                private static String ag$a(char[] cArr, int[] iArr, int i, byte[] bArr) {
                    synchronized (isLast.valueOf) {
                        char[] cArr2 = toString;
                        int i2 = values;
                        if (ah$a) {
                            int length = bArr.length;
                            isLast.values = length;
                            char[] cArr3 = new char[length];
                            isLast.toString = 0;
                            while (isLast.toString < isLast.values) {
                                cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                                isLast.toString++;
                            }
                            return new String(cArr3);
                        } else if (valueOf) {
                            int length2 = cArr.length;
                            isLast.values = length2;
                            char[] cArr4 = new char[length2];
                            isLast.toString = 0;
                            while (isLast.toString < isLast.values) {
                                cArr4[isLast.toString] = (char) (cArr2[cArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                                isLast.toString++;
                            }
                            return new String(cArr4);
                        } else {
                            int length3 = iArr.length;
                            isLast.values = length3;
                            char[] cArr5 = new char[length3];
                            isLast.toString = 0;
                            while (isLast.toString < isLast.values) {
                                cArr5[isLast.toString] = (char) (cArr2[iArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                                isLast.toString++;
                            }
                            return new String(cArr5);
                        }
                    }
                }
            };
            this.values = activity;
            this.HaptikSDK$a = easypayBrowserFragment;
            this.valueOf = map;
            this.HaptikSDK$b = webView;
            IntentFilter intentFilter = new IntentFilter("com.paytm.com.paytm.pgsdk.easypay.CUSTOM_EVENT");
            this.ah$b = webView.getUrl();
            this.values.registerReceiver(this.ag$a, intentFilter);
            this.values.runOnUiThread(new Runnable() { // from class: o.parallaxOtherViews.3
                @Override // java.lang.Runnable
                public void run() {
                }
            });
            this.valueOf.get("fields");
            getParallaxDistance.values("radiohelper", "inside radiohelper constructor");
            this.toString = (CheckBox) easypayBrowserFragment.getView().findViewById(SidecarCompat.DistinctElementCallback.valueOf.cb_do_not_send_otp);
            this.ah$a = (CheckBox) easypayBrowserFragment.getView().findViewById(SidecarCompat.DistinctElementCallback.valueOf.cb_send_otp);
        } catch (Exception e) {
            throw e;
        }
    }

    private void ah$a() {
        int i = HaptikSDK$d + 91;
        HaptikWebView = i % 128;
        int i2 = i % 2;
        if ((this.ah$a.isChecked() ? (char) 17 : '@') != '@') {
            try {
                int i3 = HaptikWebView + 57;
                HaptikSDK$d = i3 % 128;
                int i4 = i3 % 2;
                ag$a(SessionDescription.SUPPORTED_SDP_VERSION);
            } catch (Exception e) {
                throw e;
            }
        }
        if (this.toString.isChecked()) {
            int i5 = HaptikSDK$d + 85;
            HaptikWebView = i5 % 128;
            int i6 = i5 % 2;
            ag$a(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
    }

    private void ag$a(String str) {
        this.HaptikSDK$b.getSettings().setJavaScriptEnabled(true);
        this.HaptikSDK$b.getSettings().setDomStorageEnabled(true);
        this.HaptikSDK$b.loadUrl("javascript:(function (){(function (){return document.passwdForm.otpDestinationOption[" + str + "].checked=true ;})();return pwdBaseOtpChannelSelected(1); })();");
        this.HaptikSDK$b.setWebViewClient(new WebViewClient() { // from class: o.parallaxOtherViews.2
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str2) {
                return super.shouldOverrideUrlLoading(webView, str2);
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                super.onPageStarted(webView, str2, bitmap);
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str2) {
                if (!TextUtils.isEmpty(parallaxOtherViews.this.ah$b) && !str2.equals(parallaxOtherViews.this.ah$b)) {
                    parallaxOtherViews.this.values.runOnUiThread(new Runnable() { // from class: o.parallaxOtherViews.2.3
                        @Override // java.lang.Runnable
                        public void run() {
                        }
                    });
                }
                super.onPageFinished(webView, str2);
            }
        });
        try {
            int i = HaptikWebView + 43;
            try {
                HaptikSDK$d = i % 128;
                int i2 = i % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void values(String str) {
        String str2;
        if (!str.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
            str2 = this.valueOf.get("value2");
            this.HaptikSDK$a.logEvent("selectedOption2", this.valueOf.get(valueOf(new char[]{30958, 28149, 30855, 6077, 13926, 23043}, TextUtils.lastIndexOf("", '0') + 1).intern()));
            int i = HaptikSDK$d + 31;
            HaptikWebView = i % 128;
            int i2 = i % 2;
        } else {
            int i3 = HaptikSDK$d + 121;
            HaptikWebView = i3 % 128;
            int i4 = i3 % 2;
            str2 = this.valueOf.get("value1");
            this.HaptikSDK$a.logEvent("selectedOption1", this.valueOf.get(valueOf(new char[]{30958, 28149, 30855, 6077, 13926, 23043}, ViewConfiguration.getTapTimeout() >> 16).intern()));
        }
        this.HaptikSDK$b.loadUrl("javascript:" + ("if(typeof(autoSelectRadio) != 'undefined'){autoSelectRadio('" + str2 + "');}"));
    }

    public void values() {
        try {
            int i = HaptikWebView + 17;
            HaptikSDK$d = i % 128;
            int i2 = i % 2;
            try {
                Activity activity = this.values;
                if (activity != null) {
                    BroadcastReceiver broadcastReceiver = this.ag$a;
                    if ((broadcastReceiver != null ? 'I' : TokenParser.ESCAPE) != '\\') {
                        int i3 = HaptikSDK$d + 53;
                        HaptikWebView = i3 % 128;
                        if (i3 % 2 == 0) {
                            activity.unregisterReceiver(broadcastReceiver);
                        } else {
                            activity.unregisterReceiver(broadcastReceiver);
                            int i4 = 36 / 0;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Exception e) {
            throw e;
        }
    }

    private static String valueOf(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(getInitSettings, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * getInitSettings));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}

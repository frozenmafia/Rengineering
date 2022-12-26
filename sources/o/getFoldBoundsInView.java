package o;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import easypay.actions.EasypayBrowserFragment;
import java.util.Map;
/* loaded from: classes5.dex */
public class getFoldBoundsInView {
    BroadcastReceiver ag$a = new BroadcastReceiver() { // from class: o.getFoldBoundsInView.2
        private static int ag$a = 0;
        private static int[] toString = {-471810090, 10860113, 708141730, -455661214, 2118372249, 724439024, -1262682935, -379001269, -624833974, -1009626715, 99386659, -688569828, 1887948312, 2085751006, -597243407, 166214547, 1335667645, 1123587852};
        private static int values = 1;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i = ag$a + 35;
            values = i % 128;
            int i2 = i % 2;
            String string = intent.getExtras().getString("eventName");
            string.hashCode();
            if ((!string.equals("proceedProceedHelper") ? (char) 14 : 'B') == 14) {
                int i3 = values + 103;
                ag$a = i3 % 128;
                int i4 = i3 % 2;
                if (string.equals("activateProceedHelper")) {
                    getFoldBoundsInView.this.ah$a();
                    getFoldBoundsInView.this.values.logEvent("activated", getFoldBoundsInView.this.valueOf.get(values(new int[]{265592850, 80819585}, 2 - KeyEvent.getDeadChar(0, 0)).intern()));
                    return;
                }
                return;
            }
            getFoldBoundsInView.this.values();
            getFoldBoundsInView.this.values.logEvent("proceeded", getFoldBoundsInView.this.valueOf.get(values(new int[]{265592850, 80819585}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2).intern()));
        }

        private static String values(int[] iArr, int i) {
            String str;
            synchronized (getDouble.ag$a) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) toString.clone();
                getDouble.toString = 0;
                while (getDouble.toString < iArr.length) {
                    cArr[0] = (char) (iArr[getDouble.toString] >> 16);
                    cArr[1] = (char) iArr[getDouble.toString];
                    cArr[2] = (char) (iArr[getDouble.toString + 1] >> 16);
                    cArr[3] = (char) iArr[getDouble.toString + 1];
                    getDouble.valueOf = (cArr[0] << 16) + cArr[1];
                    getDouble.values = (cArr[2] << 16) + cArr[3];
                    getDouble.values(iArr2);
                    for (int i2 = 0; i2 < 16; i2++) {
                        int i3 = getDouble.valueOf ^ iArr2[i2];
                        getDouble.valueOf = i3;
                        getDouble.values = getDouble.toString(i3) ^ getDouble.values;
                        int i4 = getDouble.valueOf;
                        getDouble.valueOf = getDouble.values;
                        getDouble.values = i4;
                    }
                    int i5 = getDouble.valueOf;
                    getDouble.valueOf = getDouble.values;
                    getDouble.values = i5;
                    getDouble.values = i5 ^ iArr2[16];
                    getDouble.valueOf ^= iArr2[17];
                    int i6 = getDouble.valueOf;
                    int i7 = getDouble.values;
                    cArr[0] = (char) (getDouble.valueOf >>> 16);
                    cArr[1] = (char) getDouble.valueOf;
                    cArr[2] = (char) (getDouble.values >>> 16);
                    cArr[3] = (char) getDouble.values;
                    getDouble.values(iArr2);
                    cArr2[getDouble.toString << 1] = cArr[0];
                    cArr2[(getDouble.toString << 1) + 1] = cArr[1];
                    cArr2[(getDouble.toString << 1) + 2] = cArr[2];
                    cArr2[(getDouble.toString << 1) + 3] = cArr[3];
                    getDouble.toString += 2;
                }
                str = new String(cArr2, 0, i);
            }
            return str;
        }
    };
    WebView ah$a;
    Activity toString;
    Map<String, String> valueOf;
    EasypayBrowserFragment values;

    public getFoldBoundsInView(Activity activity, WebView webView, EasypayBrowserFragment easypayBrowserFragment, Map<String, String> map) {
        this.toString = activity;
        this.values = easypayBrowserFragment;
        this.valueOf = map;
        this.ah$a = webView;
        this.toString.registerReceiver(this.ag$a, new IntentFilter("com.paytm.com.paytm.pgsdk.easypay.CUSTOM_EVENT"));
        String str = this.valueOf.get("silent");
        String str2 = this.valueOf.get("autoproceed");
        str = str2 != null ? "true" : str;
        webView.loadUrl("javascript:" + this.valueOf.get("functionStart") + (this.valueOf.get("fields") + "Android.showLog('inside proceed helper'); var a=fields; if(!" + str + "){ Android.sendEvent('activateProceedHelper', 0, 0); } if(typeof(autoSubmitForm) == 'undefined'){ autoSubmitForm=function(){Android.showLog('activating proceedhelper1'); a[0]" + (this.valueOf.get("element").equals("input") ? ".click()" : this.valueOf.get("element").equals("form") ? ".submit()" : "") + "}; }  if(" + str2 + "){ autoSubmitForm();}") + this.valueOf.get("functionEnd"));
    }

    public void ah$a() {
        this.toString.runOnUiThread(new Runnable() { // from class: o.getFoldBoundsInView.3
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    public void values() {
        BroadcastReceiver broadcastReceiver = this.ag$a;
        if (broadcastReceiver != null) {
            this.toString.unregisterReceiver(broadcastReceiver);
        }
        this.ah$a.loadUrl("javascript:if(typeof(autoSubmitForm) != 'undefined'){Android.showLog('activating proceedhelper0'); autoSubmitForm();}");
    }

    public void valueOf() {
        try {
            BroadcastReceiver broadcastReceiver = this.ag$a;
            if (broadcastReceiver != null) {
                this.toString.unregisterReceiver(broadcastReceiver);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package o;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Process;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ExpandableListView;
import easypay.actions.EasypayBrowserFragment;
import java.util.Map;
/* loaded from: classes5.dex */
public class collect {
    private final TextWatcher HaptikSDK$e;
    private EditText ag$a;
    private Activity ah$a;
    private String ah$b;
    private WebView getSignupData;
    private EasypayBrowserFragment invoke;
    private String toString;
    private Map<String, String> valueOf;
    private String HaptikSDK$d = "";
    private Boolean HaptikSDK$b = false;
    private String HaptikSDK$c = "";
    private String HaptikSDK$a = "";
    BroadcastReceiver values = new BroadcastReceiver(this) { // from class: o.collect.5
        private static int HaptikSDK$a = 0;
        private static int ag$a = 1998507606;
        private static byte[] ah$a = {-60, 70};
        private static int ah$b = 1;
        private static short[] invoke = null;
        private static int toString = 62;
        private static int valueOf = -1031993536;
        final /* synthetic */ collect values;

        {
            try {
                this.values = this;
            } catch (Exception e) {
                throw e;
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i = ah$b + 47;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
            Bundle extras = intent.getExtras();
            String string = extras.getString("eventName");
            string.hashCode();
            int hashCode = string.hashCode();
            char c = 65535;
            if (hashCode != -1905225220) {
                if (hashCode != -1641265649) {
                    if (hashCode == 2104149715 && string.equals("submitPassword")) {
                        int i3 = HaptikSDK$a + 37;
                        ah$b = i3 % 128;
                        int i4 = i3 % 2;
                        c = 2;
                    }
                } else if (string.equals("togglePassword")) {
                    c = 1;
                }
            } else if (string.equals("activatePasswordHelper")) {
                c = 0;
            }
            if (c == 0) {
                this.values.toString(extras.getString("data0"));
                this.values.invoke.logEvent("activated", (String) this.values.valueOf.get(valueOf((byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-63) - View.getDefaultSize(0, 0), 1031993641 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) ((ViewConfiguration.getTouchSlop() >> 8) - 75), TextUtils.indexOf("", "", 0, 0) - 1998507606).intern()));
            } else if (c == 1) {
                this.values.values();
                this.values.invoke.logEvent("togglePassword", (String) this.values.valueOf.get(valueOf((byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (-64) - TextUtils.lastIndexOf("", '0', 0), 1031993641 - TextUtils.indexOf("", ""), (short) (TextUtils.indexOf((CharSequence) "", '0') - 74), ((Process.getThreadPriority(0) + 20) >> 6) - 1998507606).intern()));
            } else if (c != 2) {
            } else {
                this.values.HaptikSDK$b();
            }
        }

        private static String valueOf(byte b2, int i, int i2, short s, int i3) {
            String obj;
            synchronized (moveToLast.ah$a) {
                StringBuilder sb = new StringBuilder();
                int i4 = i + toString;
                boolean z = i4 == -1;
                if (z) {
                    if (ah$a != null) {
                        i4 = (byte) (ah$a[ag$a + i3] + toString);
                    } else {
                        i4 = (short) (invoke[ag$a + i3] + toString);
                    }
                }
                if (i4 > 0) {
                    moveToLast.values = ((i3 + i4) - 2) + ag$a + (z ? 1 : 0);
                    moveToLast.ag$a = (char) (i2 + valueOf);
                    sb.append(moveToLast.ag$a);
                    moveToLast.toString = moveToLast.ag$a;
                    moveToLast.valueOf = 1;
                    while (moveToLast.valueOf < i4) {
                        if (ah$a != null) {
                            byte[] bArr = ah$a;
                            int i5 = moveToLast.values;
                            moveToLast.values = i5 - 1;
                            moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                        } else {
                            short[] sArr = invoke;
                            int i6 = moveToLast.values;
                            moveToLast.values = i6 - 1;
                            moveToLast.ag$a = (char) (moveToLast.toString + (((short) (sArr[i6] + s)) ^ b2));
                        }
                        sb.append(moveToLast.ag$a);
                        moveToLast.toString = moveToLast.ag$a;
                        moveToLast.valueOf++;
                    }
                }
                obj = sb.toString();
            }
            return obj;
        }
    };

    public void toString(String str) {
    }

    public collect(Activity activity, WebView webView, EasypayBrowserFragment easypayBrowserFragment, Map<String, String> map, String str) {
        this.ah$a = activity;
        this.invoke = easypayBrowserFragment;
        this.valueOf = map;
        this.getSignupData = webView;
        this.ah$b = str;
        this.ah$a.registerReceiver(this.values, new IntentFilter("com.paytm.com.paytm.pgsdk.easypay.CUSTOM_EVENT"));
        this.toString = this.valueOf.get("fields");
        webView.loadUrl("javascript:" + this.valueOf.get("functionStart") + this.toString + (this.toString + "var a=fields; for(var i=0;i<a.length;i++){if(a[i].type=='password'){a[i].blur();Android.showLog(\"input type is password\");a[i].addEventListener('input', function(e){Android.logTempData(this.value)}); a[i].addEventListener('focus', function(){Android.sendEvent('activatePasswordHelper', true, 0);Android.logTempData(this.value);});}}") + this.valueOf.get("functionEnd"));
        TextWatcher textWatcher = new TextWatcher() { // from class: o.collect.1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                collect.this.HaptikSDK$d = "";
                String str2 = "javascript:" + ((String) collect.this.valueOf.get("functionStart"));
                collect.this.getSignupData.loadUrl((str2 + (collect.this.toString + "if(fields.length){fields[0].value='';};")) + ((String) collect.this.valueOf.get("functionEnd")));
            }
        };
        this.HaptikSDK$e = textWatcher;
        this.ag$a.addTextChangedListener(textWatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HaptikSDK$b() {
        this.getSignupData.loadUrl("javascript:" + (("(function(){l=document.getElementsByName('" + this.ah$b) + "');e=document.createEvent('HTMLEvents');e.initEvent('click',true,true);l[0].dispatchEvent(e);})()"));
        toString(com.facebook.hermes.intl.Constants.CASEFIRST_FALSE);
    }

    public void values() {
        this.HaptikSDK$b = Boolean.valueOf(!this.HaptikSDK$b.booleanValue());
        ah$a();
    }

    public void ah$a() {
        if (this.HaptikSDK$b.booleanValue()) {
            this.ag$a.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            this.HaptikSDK$c = this.HaptikSDK$d;
            this.HaptikSDK$a = "Hide";
            return;
        }
        this.ag$a.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.HaptikSDK$a = "Show";
    }

    public void valueOf() {
        try {
            BroadcastReceiver broadcastReceiver = this.values;
            if (broadcastReceiver != null) {
                this.ah$a.unregisterReceiver(broadcastReceiver);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.ag$a.setText("");
    }

    public void ag$a() {
        BroadcastReceiver broadcastReceiver;
        Activity activity = this.ah$a;
        if (activity == null || (broadcastReceiver = this.values) == null) {
            return;
        }
        activity.unregisterReceiver(broadcastReceiver);
    }
}

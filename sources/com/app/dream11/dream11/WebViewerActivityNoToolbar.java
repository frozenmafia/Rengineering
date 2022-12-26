package com.app.dream11.dream11;

import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.app.dream11Pro.R;
import o.isClosed;
/* loaded from: classes6.dex */
public class WebViewerActivityNoToolbar extends BaseActivity {
    private static int HaptikSDK$a = 1;
    private static char[] ag$a = {'0', 'g', 'i', 'k', 'p', 'l', 'f', 'e', 'm', 'p', 'l'};
    public static String ah$a = "url";
    private static int ah$b;
    ProgressBar toString;
    View valueOf;
    WebView values;

    @Override // com.app.dream11.dream11.BaseActivity
    protected boolean shouldShowDefaultToolbar() {
        try {
            int i = ah$b + 79;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
            int i3 = ah$b + 67;
            HaptikSDK$a = i3 % 128;
            if ((i3 % 2 == 0 ? '\t' : 'Z') != 'Z') {
                Object[] objArr = null;
                int length = objArr.length;
                return false;
            }
            return false;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.app.dream11.dream11.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.res_0x7f0d0495, (ViewGroup) null);
        this.valueOf = inflate;
        setChildsContent(inflate);
        Bundle extras = getIntent().getExtras();
        WebView webView = (WebView) this.valueOf.findViewById(R.id.res_0x7f0a1084);
        this.values = webView;
        webView.setWebViewClient(new WebViewerActivityNoToolbar$ag$a(this));
        this.values.getSettings().setAllowFileAccessFromFileURLs(false);
        this.values.getSettings().setAllowUniversalAccessFromFileURLs(false);
        this.values.getSettings().setAllowFileAccess(false);
        this.values.getSettings().setAllowContentAccess(false);
        ProgressBar progressBar = (ProgressBar) this.valueOf.findViewById(R.id.pBar);
        this.toString = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(getResources().getColor(R.color.colorPrimary), PorterDuff.Mode.MULTIPLY);
        if ((extras != null ? '%' : 'C') == 'C') {
            int i = ah$b + 5;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
            str = "";
        } else {
            int i3 = ah$b + 9;
            HaptikSDK$a = i3 % 128;
            if (i3 % 2 == 0) {
                str = extras.getString(ah$a);
                int i4 = 17 / 0;
            } else {
                str = extras.getString(ah$a);
            }
        }
        valueOf(this.values);
        this.values.loadUrl(Uri.parse(str).buildUpon().appendQueryParameter("appType", toString(false, new int[]{0, 11, 0, 0}, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0}).intern()).build().toString());
        this.values.getSettings().setBuiltInZoomControls(true);
        this.values.getSettings().setJavaScriptEnabled(true);
        this.values.requestFocusFromTouch();
        int i5 = HaptikSDK$a + 1;
        ah$b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if ((keyEvent.getAction() == 0 ? (char) 30 : '_') == 30) {
            try {
                try {
                    if (i == 4) {
                        if (!this.values.canGoBack()) {
                            onBackPressed();
                            return true;
                        }
                        int i2 = HaptikSDK$a + 75;
                        ah$b = i2 % 128;
                        int i3 = i2 % 2;
                        this.values.goBack();
                        int i4 = HaptikSDK$a + 13;
                        ah$b = i4 % 128;
                        int i5 = i4 % 2;
                        return true;
                    }
                    int i6 = ah$b + 119;
                    HaptikSDK$a = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        int i8 = ah$b + 55;
        HaptikSDK$a = i8 % 128;
        int i9 = i8 % 2;
        return onKeyDown;
    }

    private void valueOf(WebView webView) {
        try {
            int i = HaptikSDK$a + 121;
            ah$b = i % 128;
            int i2 = i % 2;
            webView.getSettings().setCacheMode(2);
            webView.clearCache(true);
            webView.clearFormData();
            webView.clearHistory();
            int i3 = ah$b + 99;
            HaptikSDK$a = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String toString(boolean z, int[] iArr, byte[] bArr) {
        String str;
        synchronized (isClosed.ah$a) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(ag$a, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                isClosed.ag$a = 0;
                char c = 0;
                while (isClosed.ag$a < i2) {
                    if (bArr[isClosed.ag$a] == 1) {
                        cArr2[isClosed.ag$a] = (char) (((cArr[isClosed.ag$a] << 1) + 1) - c);
                    } else {
                        cArr2[isClosed.ag$a] = (char) ((cArr[isClosed.ag$a] << 1) - c);
                    }
                    c = cArr2[isClosed.ag$a];
                    isClosed.ag$a++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr4[isClosed.ag$a] = cArr[(i2 - isClosed.ag$a) - 1];
                    isClosed.ag$a++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr[isClosed.ag$a] = (char) (cArr[isClosed.ag$a] - iArr[2]);
                    isClosed.ag$a++;
                }
            }
            str = new String(cArr);
        }
        return str;
    }
}

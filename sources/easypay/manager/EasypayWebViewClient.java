package easypay.manager;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import easypay.actions.EasypayBrowserFragment;
import easypay.utils.AssistInvokeException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import o.dispatchOnPanelClosed;
import o.getCoveredFadeColor;
/* loaded from: classes5.dex */
public class EasypayWebViewClient extends WebViewClient implements Serializable {
    public static long smsTrackingTime;
    private EasypayBrowserFragment fragment;
    private Activity mActivity;
    private ArrayList<dispatchOnPanelClosed> mWcListListener;

    public EasypayWebViewClient() {
    }

    public EasypayWebViewClient(Activity activity) {
        getCoveredFadeColor.ag$a("EasypayWebViewClient" + toString(), this);
        this.mActivity = activity;
        this.mWcListListener = PaytmAssist.getAssistInstance().getmWcListListener();
        smsTrackingTime = System.currentTimeMillis();
        this.fragment = PaytmAssist.getAssistInstance().getFragment();
    }

    public void addAssistWebClientListener(dispatchOnPanelClosed dispatchonpanelclosed) {
        ArrayList<dispatchOnPanelClosed> arrayList = this.mWcListListener;
        if (arrayList != null) {
            try {
                arrayList.listIterator().add(dispatchonpanelclosed);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        try {
            throw new AssistInvokeException(Constants.Assist_Invoke_Exception_Message);
        } catch (AssistInvokeException e2) {
            e2.printStackTrace();
            getCoveredFadeColor.ag$a("EXCEPTION", e2);
        }
    }

    public void removeAssistWebClientListener(dispatchOnPanelClosed dispatchonpanelclosed) {
        synchronized (this) {
            ArrayList<dispatchOnPanelClosed> arrayList = this.mWcListListener;
            if (arrayList != null) {
                try {
                    Iterator<dispatchOnPanelClosed> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next().equals(dispatchonpanelclosed)) {
                            it.remove();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    throw new AssistInvokeException(Constants.Assist_Invoke_Exception_Message);
                } catch (AssistInvokeException e2) {
                    e2.printStackTrace();
                    getCoveredFadeColor.ag$a("EXCEPTION", e2);
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        getCoveredFadeColor.ag$a("" + str, this);
        try {
            ArrayList<dispatchOnPanelClosed> arrayList = this.mWcListListener;
            if (arrayList != null) {
                Iterator<dispatchOnPanelClosed> it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().ah$a(webView, str);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            getCoveredFadeColor.ag$a("EXCEPTION", e);
        }
        try {
            if (this.fragment == null) {
                this.fragment = PaytmAssist.getAssistInstance().getFragment();
            }
            fireActions(webView, str);
            PaytmAssist.getAssistInstance().setLastLoadedUrl(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            getCoveredFadeColor.ag$a("EXCEPTION", e2);
        }
    }

    private void fireActions(final WebView webView, final String str) {
        if (this.fragment == null || PaytmAssist.getAssistInstance().getAssistEngineTerminatedStatus()) {
            return;
        }
        this.mActivity.runOnUiThread(new Runnable() { // from class: easypay.manager.EasypayWebViewClient.1
            @Override // java.lang.Runnable
            public void run() {
                if (EasypayWebViewClient.this.fragment != null) {
                    getCoveredFadeColor.ag$a("page finish: fire action:checkAssistFlow", this);
                    EasypayWebViewClient.this.fragment.valueOf(webView, str);
                }
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        synchronized (this) {
            try {
                ArrayList<dispatchOnPanelClosed> arrayList = this.mWcListListener;
                if (arrayList != null) {
                    Iterator<dispatchOnPanelClosed> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().ag$a(webView, sslErrorHandler, sslError);
                    }
                }
            } catch (AbstractMethodError unused) {
            }
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        getCoveredFadeColor.ag$a("onpage started-" + str, this);
        try {
            if (this.mWcListListener != null) {
                for (int i = 0; i < this.mWcListListener.size(); i++) {
                    this.mWcListListener.get(i).valueOf(webView, str, bitmap);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            getCoveredFadeColor.ag$a("EXCEPTION", e);
        }
        EasypayBrowserFragment easypayBrowserFragment = this.fragment;
        if (easypayBrowserFragment != null) {
            easypayBrowserFragment.getSignupData();
            try {
                this.fragment.getActivity().runOnUiThread(new Runnable() { // from class: easypay.manager.EasypayWebViewClient.2
                    @Override // java.lang.Runnable
                    public void run() {
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            ArrayList<dispatchOnPanelClosed> arrayList = this.mWcListListener;
            if (arrayList != null) {
                Iterator<dispatchOnPanelClosed> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().valueOf(webView, str);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            getCoveredFadeColor.ag$a("EXCEPTION", e);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            ArrayList<dispatchOnPanelClosed> arrayList = this.mWcListListener;
            if (arrayList != null) {
                Iterator<dispatchOnPanelClosed> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().valueOf(webView, webResourceRequest);
                }
            }
        } catch (Exception unused) {
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            ArrayList<dispatchOnPanelClosed> arrayList = this.mWcListListener;
            if (arrayList != null) {
                Iterator<dispatchOnPanelClosed> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().ag$a(webView, str);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.shouldInterceptRequest(webView, str);
    }
}

package easypay.manager;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.getCoveredFadeColor;
import o.getLockMode;
import o.invalidateSpanInfo;
import o.measureChildHeight;
/* loaded from: classes5.dex */
public class EasyPayHelper {
    private measureChildHeight bankResponse;
    private ArrayList<getLockMode> mJsCallListListener = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public EasyPayHelper() {
        PaytmAssist.getAssistInstance().getWebView().addJavascriptInterface(this, Constants.EASYPAY_JS_INTERFACE);
    }

    public measureChildHeight getBankResponse() {
        return this.bankResponse;
    }

    public void setBankResponse(measureChildHeight measurechildheight) {
        this.bankResponse = measurechildheight;
    }

    public void addJsCallListener(getLockMode getlockmode) {
        ArrayList<getLockMode> arrayList = this.mJsCallListListener;
        if (arrayList != null) {
            arrayList.add(getlockmode);
        }
    }

    @JavascriptInterface
    public void successEvent(int i, String str) {
        if (i != 100 && i != 101) {
            if (i == 107) {
                Iterator<getLockMode> it = this.mJsCallListListener.iterator();
                while (it.hasNext()) {
                    getLockMode next = it.next();
                    getCoveredFadeColor.ag$a("EasyPayHelper :Web success Ui callback" + next.toString(), this);
                    next.ah$a("", str, i);
                }
                return;
            }
            switch (i) {
                case 154:
                case 155:
                case 156:
                    break;
                default:
                    return;
            }
        }
        Iterator<getLockMode> it2 = this.mJsCallListListener.iterator();
        while (it2.hasNext()) {
            it2.next().values("", str, i);
        }
    }

    @JavascriptInterface
    public void NBWatcher(String str, String str2, int i) {
        if (str == null || str2 == null) {
            return;
        }
        if (i == 106) {
            Iterator<getLockMode> it = this.mJsCallListListener.iterator();
            while (it.hasNext()) {
                it.next().values("", str, i);
            }
        } else if (i != 156) {
            if (i != 157) {
                switch (i) {
                    case 151:
                    case 152:
                    case 153:
                        break;
                    default:
                        switch (i) {
                            case 159:
                            case 160:
                            case 161:
                                break;
                            default:
                                switch (i) {
                                    case 163:
                                    case 164:
                                        break;
                                    case 165:
                                        getCoveredFadeColor.ag$a("Bank Bage optimized called", this);
                                        if (PaytmAssist.getAssistInstance().getmEventMap() != null) {
                                            PaytmAssist.getAssistInstance().getmEventMap().put("isWebPageOptimized", true);
                                            getCoveredFadeColor.ag$a("Bank Bage optimized called" + PaytmAssist.getAssistInstance().getmEventMap(), this);
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                        }
                }
            }
            Iterator<getLockMode> it2 = this.mJsCallListListener.iterator();
            while (it2.hasNext()) {
                it2.next().ah$a(str2, str, i);
            }
        } else {
            Iterator<getLockMode> it3 = this.mJsCallListListener.iterator();
            while (it3.hasNext()) {
                it3.next().values(str, str2, i);
            }
        }
    }

    @JavascriptInterface
    public void OTPWatcher(String str, String str2, int i) {
        if (i != 108) {
            if (i == 158) {
                Iterator<getLockMode> it = this.mJsCallListListener.iterator();
                while (it.hasNext()) {
                    it.next().ah$a(str2, str, i);
                }
                return;
            } else if (i != 201) {
                if (i == 300) {
                    Iterator<getLockMode> it2 = this.mJsCallListListener.iterator();
                    while (it2.hasNext()) {
                        it2.next().values(str2, str, i);
                    }
                    return;
                } else if (i == 221) {
                    Iterator<getLockMode> it3 = this.mJsCallListListener.iterator();
                    while (it3.hasNext()) {
                        it3.next().ah$a(str2, str, i);
                    }
                    return;
                } else if (i != 222) {
                    return;
                } else {
                    Iterator<getLockMode> it4 = this.mJsCallListListener.iterator();
                    while (it4.hasNext()) {
                        it4.next().ah$a(str2, str, i);
                    }
                    return;
                }
            }
        }
        Iterator<getLockMode> it5 = this.mJsCallListListener.iterator();
        while (it5.hasNext()) {
            it5.next().ah$a(str2, str, i);
        }
    }

    @JavascriptInterface
    public void logError(String str) {
        Iterator<getLockMode> it = this.mJsCallListListener.iterator();
        while (it.hasNext()) {
            it.next().ah$a("", str, 110);
        }
        PaytmAssist.getAssistInstance().getmEventMap().put("JSError", str);
        if (TextUtils.isEmpty(PaytmAssist.getAssistInstance().getCardDetails())) {
            return;
        }
        Map<String, Object> map = PaytmAssist.getAssistInstance().getmEventMap();
        map.put("JSError", str + "bank Details" + PaytmAssist.getAssistInstance().getCardDetails());
    }

    @JavascriptInterface
    public void sendBnkDtlToApp(String str) {
        getCoveredFadeColor.ag$a("Json From UI:" + str, this);
        HashMap hashMap = (HashMap) new Gson().toString(str, new invalidateSpanInfo<HashMap<String, String>>() { // from class: easypay.manager.EasyPayHelper.1
        }.getType());
        String str2 = "";
        String obj = (hashMap == null || hashMap.get(Constants.EXTRA_BANK_CODE) == null) ? "" : hashMap.get(Constants.EXTRA_BANK_CODE).toString();
        String obj2 = (hashMap == null || hashMap.get(Constants.EXTRA_BANK_PAYTYPE) == null) ? "" : hashMap.get(Constants.EXTRA_BANK_PAYTYPE).toString();
        if (hashMap != null && hashMap.get(Constants.EXTRA_BANK_SCHEME) != null) {
            str2 = hashMap.get(Constants.EXTRA_BANK_SCHEME).toString();
        }
        PaytmAssist.getAssistInstance().setBankInfo(obj, obj2, str2);
    }

    @JavascriptInterface
    public void showLog(String str) {
        Iterator<getLockMode> it = this.mJsCallListListener.iterator();
        while (it.hasNext()) {
            it.next().ah$a("", str, 109);
        }
        PaytmAssist.getAssistInstance().setAssistEngineTerminatedStatus(true);
    }
}

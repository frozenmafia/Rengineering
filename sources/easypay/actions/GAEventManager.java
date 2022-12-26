package easypay.actions;

import android.text.TextUtils;
import easypay.manager.Constants;
import easypay.manager.PaytmAssist;
import java.io.Serializable;
import java.util.HashMap;
import o.getCoveredFadeColor;
/* loaded from: classes5.dex */
public class GAEventManager implements Serializable {
    private HashMap<String, Object> mEventMap = new HashMap<>();

    public void isNetBanking(boolean z) {
    }

    public void onOpenPasswordHelper() {
    }

    public void onOpenPaytmAssist(boolean z) {
    }

    public void onOpenProceedHelper() {
    }

    public void onOpenRadioHelper() {
    }

    public void onPasswordHelperURL(String str) {
    }

    public void onProceedHelperURL(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<String, Object> getEventMap() {
        return this.mEventMap;
    }

    public void midInfo(String str) {
        this.mEventMap.put(Constants.EXTRA_MID, str);
    }

    public void onOpenPaytmAssistURL(boolean z) {
        getCoveredFadeColor.ag$a("AssistAnalytics:isAssistPopped:" + z, this);
        this.mEventMap.put("isAssistPopped", Boolean.valueOf(z));
    }

    public void assistMerchantDetails(String str, String str2, String str3) {
        this.mEventMap.put("appName", str);
        this.mEventMap.put("orderId", str2);
        this.mEventMap.put("appVersion", str3);
        getCoveredFadeColor.ag$a("AssistAnalytics:" + str + str2 + str3, this);
    }

    public void isSmsPermission(boolean z) {
        this.mEventMap.put("smsPermission", Boolean.valueOf(z));
        getCoveredFadeColor.ag$a("AssistAnalytics:smsPermission:" + z, this);
    }

    public void smsSenderName(String str) {
        this.mEventMap.put("sender", str);
        getCoveredFadeColor.ag$a("AssistAnalytics:sender:" + str, this);
    }

    public void cardIssuer(String str) {
        this.mEventMap.put("cardIssuer", str);
        getCoveredFadeColor.ag$a("AssistAnalytics:cardIssuer:" + str, this);
    }

    public void onReadOTPByPaytmAssist(boolean z) {
        this.mEventMap.put("isSMSRead", true);
        this.mEventMap.put("otp", Boolean.valueOf(z));
        getCoveredFadeColor.ag$a("AssistAnalytics:isSMSRead:" + z, this);
    }

    public void cardType(String str) {
        this.mEventMap.put("cardType", str);
        getCoveredFadeColor.ag$a("AssistAnalytics:cardType:" + str, this);
    }

    public void onSubmitOtpPaytmAssist(boolean z) {
        this.mEventMap.put("isSubmitted", Boolean.valueOf(z));
        getCoveredFadeColor.ag$a("AssistAnalytics:isSubmitted:" + z, this);
    }

    public void isAssitEnabled(boolean z) {
        this.mEventMap.put("isAssistEnable", Boolean.valueOf(z));
        getCoveredFadeColor.ag$a("AssistAnalytics:isAssistEnabled:" + z, this);
    }

    public void assistAcsUrl(String str) {
        this.mEventMap.put("acsUrl", str);
        getCoveredFadeColor.ag$a("AssistAnalytics:acsUrl:" + str, this);
    }

    public void isNetBankingInvoked(boolean z) {
        this.mEventMap.put("isNetbanking", Boolean.valueOf(z));
        getCoveredFadeColor.ag$a("AssistAnalytics:isNetbanking:" + z, this);
    }

    public void NbUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mEventMap.put("NBPageUrl", str);
            this.mEventMap.put("acsUrl", str);
        } else {
            this.mEventMap.put("NBPageUrl", "URl Not supported|couldnot invoke netbaking asssist");
        }
        getCoveredFadeColor.ag$a("AssistAnalytics:NbPageUrl:" + str, this);
    }

    public void NBOtpSubmitted(boolean z) {
        this.mEventMap.put("NBOtpSubmitted", Boolean.valueOf(z));
        getCoveredFadeColor.ag$a("AssistAnalytics:NBOtpSubmitted:" + z, this);
    }

    public void isNbOtpSelected(boolean z) {
        this.mEventMap.put("NBIsotpSelected", Boolean.valueOf(z));
        getCoveredFadeColor.ag$a("AssistAnalytics:NbIsotpSelected:" + z, this);
    }

    public void OnBackPressClicked(Boolean bool) {
        getCoveredFadeColor.ag$a("AssistAnalytics:backPressClicked:" + bool, this);
        if (PaytmAssist.getAssistInstance().isFragmentResumed()) {
            if (TextUtils.isEmpty(PaytmAssist.getAssistInstance().getLastLoadedUrl()) || PaytmAssist.getAssistInstance().getLastLoadedUrl().contains("paytm")) {
                return;
            }
            this.mEventMap.put("isBackClickedOnAcsPage", bool);
        } else if (PaytmAssist.getAssistInstance().isFragmentPaused()) {
        } else {
            this.mEventMap.put("backPressClicked", bool);
        }
    }

    public void onAcsUrlRequested(String str) {
        this.mEventMap.put("acsUrlRequested", str);
    }

    public void onAcsUrlLoaded(String str) {
        this.mEventMap.put("acsUrlLoaded", str);
    }

    public void onOTPManuallyEntered(boolean z) {
        this.mEventMap.put("OTPManuallyEntered", Boolean.valueOf(z));
        getCoveredFadeColor.ag$a("AssistAnalytics:OTPManuallyEntered:" + z, this);
    }

    public void onNonOTPRequest(boolean z) {
        this.mEventMap.put("NonOTPRequest", Boolean.valueOf(z));
        getCoveredFadeColor.ag$a("AssistAnalytics:NonOTPRequest:" + z, this);
    }

    public void onsmsDetected(boolean z) {
        this.mEventMap.put("smsDetected", Boolean.valueOf(z));
        getCoveredFadeColor.ag$a("AssistAnalytics:smsDetected:" + z, this);
    }

    public void OnredirectUrls(StringBuilder sb) {
        this.mEventMap.put("redirectUrls", sb.toString());
        getCoveredFadeColor.ag$a("AssistAnalytics:redirectUrls:" + sb.toString(), this);
    }

    public void onExtraInfo(Object obj) {
        try {
            this.mEventMap.put("extendedInfo", (HashMap) obj);
            getCoveredFadeColor.ag$a("AssistAnalytics:extendedInfo:" + obj.toString(), this);
        } catch (Exception e) {
            e.printStackTrace();
            getCoveredFadeColor.ag$a("EXCEPTION", e);
        }
    }

    public void isSubmitButtonClicked(boolean z, int i) {
        PaytmAssist.getAssistInstance().getmEventMap().put("buttonClicked", Boolean.valueOf(z));
        PaytmAssist.getAssistInstance().getmEventMap().put("buttonClickedCount", Integer.valueOf(i));
        this.mEventMap.put("buttonClickedWithCount", PaytmAssist.getAssistInstance().getmEventMap());
        getCoveredFadeColor.ag$a("AssistAnalytics:buttonClickedWithCount:" + PaytmAssist.getAssistInstance().getmEventMap(), this);
    }

    public void isAutoSubmit(boolean z) {
        PaytmAssist.getAssistInstance().getmEventMap().put("autoSubmit", Boolean.valueOf(z));
        this.mEventMap.put("autoSubmitAssist", PaytmAssist.getAssistInstance().getmEventMap());
        getCoveredFadeColor.ag$a("AssistAnalytics:autoSubmitAssist:" + PaytmAssist.getAssistInstance().getmEventMap(), this);
    }

    public void isAutoFillSuccess(boolean z) {
        PaytmAssist.getAssistInstance().getmEventMap().put("isAutoFillSuccess", Boolean.valueOf(z));
        this.mEventMap.put("isAutoFillSuccess", Boolean.valueOf(z));
        getCoveredFadeColor.ag$a("AssistAnalytics:isAutoFillSuccess:" + z, this);
    }

    public void isBankEnabled(boolean z) {
        this.mEventMap.put("isBankEnabled", Boolean.valueOf(z));
        getCoveredFadeColor.ag$a("AssistAnalytics:isBankEnabled:" + z, this);
    }

    public void isRememberUserIdChecked(boolean z) {
        this.mEventMap.put("isRememberUserIdChecked", Boolean.valueOf(z));
        getCoveredFadeColor.ag$a("AssistAnalytics:isRememberUserIdChecked:" + z, this);
    }

    public void isPauseButtonTapped(boolean z) {
        this.mEventMap.put("isPauseButtonTapped", Boolean.valueOf(z));
        getCoveredFadeColor.ag$a("AssistAnalytics:isPauseButtonTapped:" + z, this);
    }

    public void isShowPasswordClicked(boolean z) {
        this.mEventMap.put("isShowPasswordClicked", Boolean.valueOf(z));
        getCoveredFadeColor.ag$a("AssistAnalytics:isShowPasswordClicked:" + z, this);
    }

    public void isAutoFillUserIdSuccess(boolean z) {
        this.mEventMap.put("isAutoFillUserIdSuccess", Boolean.valueOf(z));
        getCoveredFadeColor.ag$a("AssistAnalytics:isAutoFillUserIdSuccess:" + z, this);
    }

    public void isNbSubmitButtonClicked(boolean z) {
        this.mEventMap.put("isNbSubmitButtonClicked", Boolean.valueOf(z));
        getCoveredFadeColor.ag$a("AssistAnalytics:isNbSubmitButtonClicked:" + z, this);
    }

    public void isAssistMinimized(boolean z) {
        this.mEventMap.put("isAssistMinimized", Boolean.valueOf(z));
        getCoveredFadeColor.ag$a("AssistAnalytics:isAssistMinimized:" + z, this);
    }
}

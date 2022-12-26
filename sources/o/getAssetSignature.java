package o;

import com.dreampay.graphql.api.GetNetBankingConfigQuery;
import com.dreampay.graphql.api.GetOTPReadConfigQuery;
/* loaded from: classes4.dex */
public final class getAssetSignature {
    public static final onMetadataLoadFailed valueOf(GetOTPReadConfigQuery.PaymentPage paymentPage) {
        runAnimators.ag$a(paymentPage, "<this>");
        return new onMetadataLoadFailed(paymentPage.getIssuer(), paymentPage.getUrlRegex(), paymentPage.getOtpInput(), paymentPage.getSubmitButton(), paymentPage.getResendLink(), paymentPage.getSenderRegex(), paymentPage.getMessageBodyRegex(), paymentPage.getOtpRegex(), Boolean.valueOf(paymentPage.getShowResendButton()), Integer.valueOf(paymentPage.getTimer()), Boolean.valueOf(paymentPage.getDisableURLScan()), Integer.valueOf(paymentPage.getResendLimit()));
    }

    public static final onMetadataLoadFailed values(GetNetBankingConfigQuery.NetBankingPaymentPage netBankingPaymentPage) {
        runAnimators.ag$a(netBankingPaymentPage, "<this>");
        String bankName = netBankingPaymentPage.getBankName();
        String otpUrlRegex = netBankingPaymentPage.getOtpUrlRegex();
        String otpInputField = netBankingPaymentPage.getOtpInputField();
        String otpSubmitButton = netBankingPaymentPage.getOtpSubmitButton();
        String otpResendLink = netBankingPaymentPage.getOtpResendLink();
        String otpSenderRegex = netBankingPaymentPage.getOtpSenderRegex();
        String messageBodyRegex = netBankingPaymentPage.getMessageBodyRegex();
        String otpRegex = netBankingPaymentPage.getOtpRegex();
        boolean showResendButton = netBankingPaymentPage.getShowResendButton();
        Integer timer = netBankingPaymentPage.getTimer();
        boolean disableURLScan = netBankingPaymentPage.getDisableURLScan();
        return new onMetadataLoadFailed(bankName, otpUrlRegex, otpInputField, otpSubmitButton, otpResendLink, otpSenderRegex, messageBodyRegex, otpRegex, Boolean.valueOf(showResendButton), timer, Boolean.valueOf(disableURLScan), netBankingPaymentPage.getResendLimit());
    }
}

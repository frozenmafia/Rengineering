package com.dreampay.commons.constants;

import o.runAnimators;
import o.setIdentityTransforms;
/* loaded from: classes4.dex */
public final class Constants {
    public static final String AMAZON_IMG_URL = "https://dreampay.tech/public/imgs/Amazon+UPI.png";
    public static final String AMAZON_PACKAGE_NAME = "in.amazon.mShop.android.shopping";
    public static final String CARD_TYPE_VISA = "VISA";
    public static final String CODE = "code";
    public static final String CREDIT = "CREDIT";
    public static final String DEBIT = "DEBIT";
    public static final String ERROR = "error";
    public static final String ERRORS = "errors";
    public static final String FAILED = "Failed";
    public static final String FIELD_AMOUNT = "amount";
    public static final String FIELD_ORDER_ID = "orderId";
    public static final String FIELD_STATUS = "status";
    public static final String FIELD_TXN_REF_NO = "txnRefNo";
    public static final String MESSAGE = "message";
    public static final String MSG_ACTION_TITLE_KEY = "MsgActionTitle";
    public static final String MSG_CODE_KEY = "MsgCode";
    public static final String MSG_TEXT_KEY = "MsgText";
    public static final String MSG_TITLE_KEY = "MsgTitle";
    public static final String RESULT = "result";
    public static final String RESULT_CANCELED = "RESULT_CANCELED";
    public static final String RESULT_FIRST_USER = "RESULT_FIRST_USER";
    public static final String RESULT_OK = "RESULT_OK";
    public static final int STATUS_FAILURE = 2;
    public static final int STATUS_SUCCESS = 1;
    public static final String SUCCESS = "Success";
    public static final String TITLE_KEY = "title";
    public static final String TNC_URL = "https://dreampay.com/terms-and-conditions";
    public static final String TRANSACTION_STATUS = "transstatus";
    public static final String UPI_COLLECT_PAYMENT_INSTRUMENT = "UPI_COLLECT";
    public static final String UPI_INTENT_PAYMENT_INSTRUMENT = "UPI_INTENT";
    public static final String URL_KEY = "url";
    public static final String VISA_SAFE_CLICK_TNC_URL = "https://www.visa.co.in/legal/visa-checkout-lite/terms-of-service.html";
    public static final String WHITE_SPACE = " ";
    public static final Constants INSTANCE = new Constants();
    private static final setIdentityTransforms CURRENT_DATE$delegate = runAnimators.ag$a(Constants$CURRENT_DATE$2.INSTANCE, "initializer");

    private Constants() {
    }

    public final String getCURRENT_DATE() {
        Object value = CURRENT_DATE$delegate.getValue();
        runAnimators.ah$a(value, "<get-CURRENT_DATE>(...)");
        return (String) value;
    }

    /* loaded from: classes6.dex */
    public static final class Upi {
        public static final Upi INSTANCE = new Upi();
        public static final String PHONEPE_APP_NOT_INSTALLED = "PHONEPE_APP_NOT_INSTALLED";
        public static final String PHONEPE_APP_UPI_NOT_REGISTERED = "UPI_NOT_REGISTERED";
        public static final String PHONEPE_NO_VALID_INSTRUMENT = "NO_VALID_INSTRUMENT";
        public static final String PHONEPE_SUCCESS = "SUCCESS";

        private Upi() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class Navigation {
        public static final String AMOUNT = "amount";
        public static final String AUTO_SUBMIT_OTP = "asotp";
        public static final String BANK_CODE = "bank_code";
        public static final String BASE_64_OF_REQUEST = "base64_request";
        public static final String CARD_BRAND = "c_brand";
        public static final String CARD_DETAILS = "c_details";
        public static final String CARD_FLOW = "card_flow";
        public static final String CARD_ISSUER = "c_issuer";
        public static final String CARD_TOKEN = "card_token";
        public static final String CARD_TYPE = "c_type";
        public static final String CHECKSUM = "checksum";
        public static final String CONSENT_FLOW_ENUM = "consent_flow_enum";
        public static final String CONSENT_TYPE = "consent_type";
        public static final String CREDENTIAL_EDITABLE = "credential_editable";
        public static final String CVV = "cvv";
        public static final String ERROR_ID = "e_id";
        public static final String ERROR_MESSAGE = "e_message";
        public static final String ERROR_TYPE = "e_t";
        public static final String FLOW = "flow";
        public static final String HAS_SMS_PERMISSION = "has_sms_perm";
        public static final Navigation INSTANCE = new Navigation();
        public static final String IS_ENFORCED_TOKENISATION = "is_enforced_tokenisation";
        public static final String IS_NEW_CARD = "is_new_card";
        public static final String KNOW_MORE_BULLET_POINTERS = "bullet_pointers";
        public static final String KNOW_MORE_HEADER_TEXT = "header_text";
        public static final String KNOW_MORE_ICON = "know_more_icon";
        public static final String KNOW_MORE_LONG_MESSAGES = "long_messages";
        public static final String MESSAGE_KEY = "message";
        public static final String MESSAGE_REGEX = "MBR";
        public static final String MOBILE_NUMBER = "mobile_number";
        public static final String NAME = "name";
        public static final String OFFER_TAGS = "offer_tags";
        public static final String OTP_REGEX = "OTPR";
        public static final String OTP_SUBMIT_TIME = "otpst";
        public static final String PRIMARY_TITLE = "primary_title";
        public static final String REQ_CODE = "req_code";
        public static final String SECONDARY_TITLE = "secondary_title";
        public static final String SELECTED_UPI_APP = "upi_app_display_name";
        public static final String SENDER_REGEX = "SR";
        public static final String SFA_ELIGIBLE = "is_sfa_eligible";
        public static final String SFA_ENROLLED = "is_sfa_enrolled";
        public static final String SFA_MAX_ELIGIBLE_AMOUNT = "sfa_max_eligible_amount";
        public static final String SHOULD_RETRY = "s_r";
        public static final String SHOULD_SAVE_CARD = "should_save_card";
        public static final String TIME = "time";
        public static final String TITLE_KEY = "title";
        public static final String TOKENISATION_FINAL_APPEAL_ENABLED = "final_appeal_enabled";
        public static final String TRANSACTION_TYPE = "transaction_type";
        public static final String TYPE = "type";
        public static final String UPI_APP_LIST = "upi_apps";
        public static final String UPI_COLLECT_AVAILABILITY = "upi_collect_availability";
        public static final String UPI_TYPE = "upi_type";
        public static final String URL = "url";
        public static final String VALIDATE_TOKEN = "validate_token";
        public static final String VPA = "vpa";
        public static final String WALLET_BALANCE = "wallet_balance";
        public static final String WALLET_TYPE = "wallet_type";

        private Navigation() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class ErrorCodes {
        public static final String AMAZON_PAY_ERROR = "FE003";
        public static final ErrorCodes INSTANCE = new ErrorCodes();
        public static final String INVALID_UPI_ID = "GQL02";
        public static final String NO_INTERNET = "FE001";
        public static final String PAYTM_ERROR = "FE004";
        public static final String SAFETY_NET_ERROR = "FE006";
        public static final String UNSUPPORTED = "FE005";
        public static final String UPI_APP_NOT_AVAILABLE = "FE007";
        public static final String USER_CANCELLED = "FE002";

        private ErrorCodes() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class ErrorMessages {
        public static final ErrorMessages INSTANCE = new ErrorMessages();
        public static final String INVALID_UPI_ID = "Invalid UPI ID";
        public static final String NO_INTERNET = "No network connection";
        public static final String SAFETY_NET_ERROR = "Problem with safety net attestation";
        public static final String TRANSACTION_FAILED = "Transaction failed";
        public static final String UPI_INTENT_APP_UNAVAILABLE = "Upi App not available";
        public static final String USER_CANCELLED = "User Cancelled Request";

        private ErrorMessages() {
        }

        public final String unsupported(String str, String str2) {
            runAnimators.ag$a(str, "operationName");
            runAnimators.ag$a(str2, "unsupportedBy");
            return str + " operation is not supported by " + str2;
        }
    }

    /* loaded from: classes6.dex */
    public static final class ErrorIds {
        public static final int FETCH_CARD_DETAILS = 105;
        public static final int FETCH_SAVED_CARDS = 104;
        public static final int FETCH_UPI_APPS = 106;
        public static final int FETCH_WALLET_DETAILS = 101;
        public static final int FETCH_WALLET_LIST = 100;
        public static final ErrorIds INSTANCE = new ErrorIds();
        public static final int INSTRUMENT_LIST = 107;
        public static final int SEND_OTP = 102;
        public static final int VERIFY_OTP = 103;

        private ErrorIds() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class RequestCodes {
        public static final int ADD_CARD = 500;
        public static final int ADD_CARD_PAY = 501;
        public static final RequestCodes INSTANCE = new RequestCodes();
        public static final int PAYMENT_INSTRUMENT_LIST = 502;
        public static final int PAY_VIA_NETBANKING = 506;
        public static final int PAY_WITH_GPAY = 509;
        public static final int PAY_WITH_PHONE_PE = 510;
        public static final int PAY_WITH_SAVED_CARD = 503;
        public static final int PAY_WITH_UPI_APP = 504;
        public static final int PAY_WITH_UPI_COLLECT = 505;
        public static final int PAY_WITH_WALLET = 507;
        public static final int WALLET_LINK = 508;

        private RequestCodes() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class BackStacks {
        public static final BackStacks INSTANCE = new BackStacks();
        public static final String WALLET_LIST_BACKSTACK = "wallet_list_bs";

        private BackStacks() {
        }
    }
}

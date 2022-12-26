package com.app.dream11.model;

import com.app.dream11.dream11.DreamApplication;
import com.app.dream11Pro.R;
import com.dreampay.commons.constants.Constants;
import java.util.Map;
import o.isFullSpan;
import o.loadFont;
/* loaded from: classes.dex */
public class ErrorModel extends Exception {
    private Error error;

    public ErrorModel() {
        this.error = new Error("Something went wrong, please try again");
    }

    public ErrorModel(String str) {
        this.error = new Error(str);
    }

    public ErrorModel(String str, String str2) {
        this.error = new Error(str, "", str2);
    }

    public ErrorModel(String str, String str2, String str3) {
        this.error = new Error(str, str2, str3);
    }

    public ErrorModel(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this.error = new Error(str, str2, str3, str4, str3, i, str5, str6);
    }

    public ErrorModel(Map<String, Object> map, int i, String str) {
        String obj = map.containsKey(Constants.MSG_CODE_KEY) ? map.get(Constants.MSG_CODE_KEY).toString() : "";
        String obj2 = map.containsKey(Constants.MSG_TEXT_KEY) ? map.get(Constants.MSG_TEXT_KEY).toString() : DreamApplication.values().getString(R.string.res_0x7f120433);
        this.error = new Error(obj, map.containsKey(Constants.MSG_TITLE_KEY) ? map.get(Constants.MSG_TITLE_KEY).toString() : "", obj2, map.containsKey("code") ? map.get("code").toString() : "", map.containsKey("message") ? map.get("message").toString() : "", i, str, map.containsKey(Constants.MSG_ACTION_TITLE_KEY) ? map.get(Constants.MSG_ACTION_TITLE_KEY).toString() : "");
    }

    public Error getError() {
        return this.error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    /* loaded from: classes.dex */
    public static class Error {
        @isFullSpan(valueOf = Constants.MSG_ACTION_TITLE_KEY)
        private String MsgActionTitle;
        @isFullSpan(valueOf = Constants.MSG_CODE_KEY)
        private String MsgCode;
        @isFullSpan(valueOf = Constants.MSG_TEXT_KEY)
        private String MsgText;
        @isFullSpan(valueOf = Constants.MSG_TITLE_KEY)
        private String MsgTitle;
        private String apiEndPoint;
        @isFullSpan(valueOf = "code")
        private String code;
        private int httpCode;
        private Throwable innerException;
        @isFullSpan(valueOf = "message")
        private String message;

        public Error(String str) {
            this.code = "";
            this.message = "";
            this.httpCode = 0;
            this.MsgCode = "";
            this.MsgTitle = "";
            this.MsgText = str;
            this.MsgActionTitle = "";
        }

        public Error(String str, String str2, String str3) {
            this.code = "";
            this.message = "";
            this.httpCode = 0;
            this.MsgCode = str;
            this.MsgText = str3;
            this.MsgTitle = str2;
        }

        public Error(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7) {
            this.code = "";
            this.message = "";
            this.httpCode = 0;
            this.MsgCode = str;
            this.MsgText = str3;
            this.MsgTitle = str2;
            this.message = str5;
            this.code = str4;
            this.httpCode = i;
            this.apiEndPoint = str6;
            setMsgActionTitle(str7);
        }

        public String getMsgCode() {
            if (loadFont.ak(getCode())) {
                return this.MsgCode;
            }
            return getCode();
        }

        public void setMsgCode(String str) {
            this.MsgCode = str;
        }

        public String getMsgText() {
            if (loadFont.ak(this.message)) {
                return this.MsgText;
            }
            return this.message;
        }

        public void setMsgText(String str) {
            this.MsgText = str;
        }

        public String getMsgTitle() {
            return this.MsgTitle;
        }

        public void setMsgTitle(String str) {
            this.MsgTitle = str;
        }

        public Throwable getInnerException() {
            return this.innerException;
        }

        public void setInnerException(Throwable th) {
            this.innerException = th;
        }

        public String getMsgActionTitle() {
            return this.MsgActionTitle;
        }

        public void setMsgActionTitle(String str) {
            this.MsgActionTitle = str;
        }

        public int getHttpCode() {
            return this.httpCode;
        }

        public void setHttpCode(int i) {
            this.httpCode = i;
        }

        public String getApiEndPoint() {
            return this.apiEndPoint;
        }

        public void setApiEndPoint(String str) {
            this.apiEndPoint = str;
        }

        public String getCode() {
            return this.code;
        }

        public void setCode(String str) {
            this.code = str;
        }

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String str) {
            this.message = str;
        }
    }
}

package com.app.dream11.core;

import java.io.Serializable;
/* loaded from: classes.dex */
public class ApiErrorPolicy implements Serializable {
    private static final long serialVersionUID = 1;
    private ErrorActionEnum actionEnum;
    private String apiUrl;
    private HttpCodeRange codeRange;
    private String msgCode;

    public String getApiUrl() {
        return this.apiUrl;
    }

    public String getMsgCode() {
        return this.msgCode;
    }

    public HttpCodeRange getCodeRange() {
        return this.codeRange;
    }

    public ErrorActionEnum getActionEnum() {
        return this.actionEnum;
    }

    /* loaded from: classes.dex */
    public class HttpCodeRange implements Serializable {
        private static final long serialVersionUID = 1;
        private int lowerBound;
        private int upperBound;

        public HttpCodeRange() {
        }

        public int getLowerBound() {
            return this.lowerBound;
        }

        public int getUpperBound() {
            return this.upperBound;
        }
    }
}

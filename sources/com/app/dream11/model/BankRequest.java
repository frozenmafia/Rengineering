package com.app.dream11.model;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class BankRequest extends CommonRequest {
    private String AccountNumber;
    private String BankBranch;
    private String BankName;
    private String IFSCCode;
    private String IsBankApiVerified;
    private String State;

    public BankRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
        this.IsBankApiVerified = SessionDescription.SUPPORTED_SDP_VERSION;
    }

    public void setAccountNumber(String str) {
        this.AccountNumber = str;
    }

    public void setBankBranch(String str) {
        this.BankBranch = str;
    }

    public void setBankName(String str) {
        this.BankName = str;
    }

    public void setIFSCCode(String str) {
        this.IFSCCode = str;
    }

    public void setIsBankApiVerified(boolean z) {
        if (z) {
            this.IsBankApiVerified = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        } else {
            this.IsBankApiVerified = SessionDescription.SUPPORTED_SDP_VERSION;
        }
    }

    public void setState(String str) {
        this.State = str;
    }
}

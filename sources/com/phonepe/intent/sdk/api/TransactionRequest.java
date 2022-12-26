package com.phonepe.intent.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.HashMap;
import java.util.Map;
import o.ChangeBounds;
import o.beginAsyncSectionFallback;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class TransactionRequest implements Parcelable {
    public static final Parcelable.Creator<TransactionRequest> CREATOR = new irjuc();
    public String chmha;
    public String cqqlq;

    /* renamed from: irjuc  reason: collision with root package name */
    public String f1399irjuc;
    public String jmjou;
    public Map<String, String> rmqfk;

    /* loaded from: classes5.dex */
    public static class TransactionRequestBuilder {
        public String chmha;
        public String cqqlq;

        /* renamed from: irjuc  reason: collision with root package name */
        public String f1400irjuc;
        public String jmjou;
        public HashMap<String, String> rmqfk;

        public TransactionRequest build() {
            if (beginAsyncSectionFallback.toString(this.chmha)) {
                beginAsyncSectionFallback.ah$a("TrxRequestBuilder", "Setting data is mandatory.");
                throw new RuntimeException("Setting data is mandatory.");
            } else if (beginAsyncSectionFallback.toString(this.f1400irjuc)) {
                beginAsyncSectionFallback.ah$a("TrxRequestBuilder", "Setting checksum is mandatory.");
                throw new RuntimeException("Setting checksum is mandatory.");
            } else if (beginAsyncSectionFallback.toString(this.cqqlq)) {
                beginAsyncSectionFallback.ah$a("TrxRequestBuilder", "Setting Url is mandatory.");
                throw new RuntimeException("Setting Url is mandatory.");
            } else {
                TransactionRequest transactionRequest = new TransactionRequest();
                String str = this.chmha;
                transactionRequest.chmha = str;
                transactionRequest.f1399irjuc = this.f1400irjuc;
                transactionRequest.cqqlq = this.cqqlq;
                transactionRequest.jmjou = this.jmjou;
                try {
                    PhonePe.getObjectFactory().ag$a("transactionId", new JSONObject(new String(Base64.decode(str, 0))).get("transactionId"));
                } catch (PhonePeInitException | JSONException unused) {
                    beginAsyncSectionFallback.ah$a("Utils", "Error getting txnId from data");
                }
                HashMap<String, String> hashMap = this.rmqfk;
                if (hashMap != null && !hashMap.isEmpty()) {
                    transactionRequest.rmqfk.putAll(this.rmqfk);
                }
                try {
                    ChangeBounds.AnonymousClass2 anonymousClass2 = (ChangeBounds.AnonymousClass2) PhonePe.getObjectFactory().values(ChangeBounds.AnonymousClass2.class);
                    anonymousClass2.ag$a(anonymousClass2.ag$a("SDK_TRANSACTION_REQUEST_CREATED"));
                } catch (PhonePeInitException e) {
                    beginAsyncSectionFallback.valueOf("TrxRequestBuilder", e.getMessage(), e);
                }
                return transactionRequest;
            }
        }

        public TransactionRequestBuilder setChecksum(String str) {
            this.f1400irjuc = str;
            return this;
        }

        public TransactionRequestBuilder setData(String str) {
            this.chmha = str;
            return this;
        }

        public TransactionRequestBuilder setHeaders(HashMap<String, String> hashMap) {
            this.rmqfk = hashMap;
            return this;
        }

        public TransactionRequestBuilder setRedirectUrl(String str) {
            this.jmjou = str;
            return this;
        }

        public TransactionRequestBuilder setUrl(String str) {
            this.cqqlq = str;
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public static final class irjuc implements Parcelable.Creator<TransactionRequest> {
        @Override // android.os.Parcelable.Creator
        public TransactionRequest createFromParcel(Parcel parcel) {
            return new TransactionRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public TransactionRequest[] newArray(int i) {
            return new TransactionRequest[i];
        }
    }

    public TransactionRequest() {
        this.rmqfk = new HashMap();
    }

    public TransactionRequest(Parcel parcel) {
        this.f1399irjuc = parcel.readString();
        this.cqqlq = parcel.readString();
        this.chmha = parcel.readString();
        this.jmjou = parcel.readString();
        this.rmqfk = parcel.readHashMap(TransactionRequest.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAPIUrl() {
        return this.cqqlq;
    }

    public String getChecksum() {
        return this.f1399irjuc;
    }

    public String getData() {
        return this.chmha;
    }

    public Map<String, String> getHeaderMap() {
        this.rmqfk.put("X-VERIFY", this.f1399irjuc);
        return this.rmqfk;
    }

    public String getRedirectUrl() {
        return this.jmjou;
    }

    public boolean isDebitRequest() {
        return this.cqqlq.contains("debit");
    }

    public String toString() {
        return "TransactionRequest{checksum='" + this.f1399irjuc + "', apiUrl='" + this.cqqlq + "', data='" + this.chmha + "', redirectUrl='" + this.jmjou + "', headers=" + this.rmqfk + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1399irjuc);
        parcel.writeString(this.cqqlq);
        parcel.writeString(this.chmha);
        parcel.writeString(this.jmjou);
        parcel.writeMap(this.rmqfk);
    }
}

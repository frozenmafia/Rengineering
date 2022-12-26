package com.phonepe.intent.sdk.api;

import irjuc.irjuc.cqqlq.irjuc.rmqfk.jmjou;
import java.util.HashMap;
import java.util.Map;
import o.beginAsyncSectionFallback;
/* loaded from: classes5.dex */
public class AvailabilityCheckRequest extends jmjou {
    public String chmha;
    public String jmjou;
    public Map<String, String> rmqfk = new HashMap();

    /* loaded from: classes5.dex */
    public static class AvailabilityCheckRequestBuilder {
        public String cqqlq;

        /* renamed from: irjuc  reason: collision with root package name */
        public String f1393irjuc;

        public AvailabilityCheckRequest build() {
            if (beginAsyncSectionFallback.toString(this.cqqlq)) {
                beginAsyncSectionFallback.ah$a("AvailabilityCheckRequest", "Setting checksum is mandatory.");
                throw new RuntimeException("Setting checksum is mandatory.");
            } else if (!beginAsyncSectionFallback.toString(this.f1393irjuc)) {
                AvailabilityCheckRequest availabilityCheckRequest = new AvailabilityCheckRequest();
                availabilityCheckRequest.chmha = this.cqqlq;
                availabilityCheckRequest.jmjou = this.f1393irjuc;
                return availabilityCheckRequest;
            } else {
                beginAsyncSectionFallback.ah$a("AvailabilityCheckRequest", "Setting data is mandatory.");
                throw new RuntimeException("Setting data is mandatory.");
            }
        }

        public AvailabilityCheckRequestBuilder setChecksum(String str) {
            this.cqqlq = str;
            return this;
        }

        public AvailabilityCheckRequestBuilder setData(String str) {
            this.f1393irjuc = str;
            return this;
        }
    }

    public String getChecksum() {
        return this.chmha;
    }

    public String getData() {
        return this.jmjou;
    }

    public Map<String, String> getHeaderMap() {
        this.rmqfk.put("X-VERIFY", this.chmha);
        return this.rmqfk;
    }
}

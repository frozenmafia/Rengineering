package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;
import o.StaggeredGridLayoutManager;
/* loaded from: classes5.dex */
public enum ToNumberPolicy implements StaggeredGridLayoutManager.AnchorInfo {
    DOUBLE { // from class: com.google.gson.ToNumberPolicy.1
        @Override // o.StaggeredGridLayoutManager.AnchorInfo
        public Double readNumber(StaggeredGridLayoutManager.SavedState.AnonymousClass1 anonymousClass1) throws IOException {
            return Double.valueOf(anonymousClass1.ah$b());
        }
    },
    LAZILY_PARSED_NUMBER { // from class: com.google.gson.ToNumberPolicy.2
        @Override // o.StaggeredGridLayoutManager.AnchorInfo
        public Number readNumber(StaggeredGridLayoutManager.SavedState.AnonymousClass1 anonymousClass1) throws IOException {
            return new LazilyParsedNumber(anonymousClass1.HaptikSDK$d());
        }
    },
    LONG_OR_DOUBLE { // from class: com.google.gson.ToNumberPolicy.3
        @Override // o.StaggeredGridLayoutManager.AnchorInfo
        public Number readNumber(StaggeredGridLayoutManager.SavedState.AnonymousClass1 anonymousClass1) throws IOException, JsonParseException {
            String HaptikSDK$d = anonymousClass1.HaptikSDK$d();
            try {
                try {
                    return Long.valueOf(Long.parseLong(HaptikSDK$d));
                } catch (NumberFormatException e) {
                    throw new JsonParseException("Cannot parse " + HaptikSDK$d + "; at path " + anonymousClass1.HaptikSDK$c(), e);
                }
            } catch (NumberFormatException unused) {
                Double valueOf = Double.valueOf(HaptikSDK$d);
                if ((valueOf.isInfinite() || valueOf.isNaN()) && !anonymousClass1.isLogoutPending()) {
                    throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + anonymousClass1.HaptikSDK$c());
                }
                return valueOf;
            }
        }
    },
    BIG_DECIMAL { // from class: com.google.gson.ToNumberPolicy.4
        @Override // o.StaggeredGridLayoutManager.AnchorInfo
        public BigDecimal readNumber(StaggeredGridLayoutManager.SavedState.AnonymousClass1 anonymousClass1) throws IOException {
            String HaptikSDK$d = anonymousClass1.HaptikSDK$d();
            try {
                return new BigDecimal(HaptikSDK$d);
            } catch (NumberFormatException e) {
                throw new JsonParseException("Cannot parse " + HaptikSDK$d + "; at path " + anonymousClass1.HaptikSDK$c(), e);
            }
        }
    }
}

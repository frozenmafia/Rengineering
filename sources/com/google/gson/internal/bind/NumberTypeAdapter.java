package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import o.StaggeredGridLayoutManager;
import o.invalidateSpanInfo;
import o.offsetFullSpansForAddition;
/* loaded from: classes5.dex */
public final class NumberTypeAdapter extends StaggeredGridLayoutManager.LayoutParams<Number> {
    private static final offsetFullSpansForAddition ag$a = toString(ToNumberPolicy.LAZILY_PARSED_NUMBER);
    private final StaggeredGridLayoutManager.AnchorInfo valueOf;

    private NumberTypeAdapter(StaggeredGridLayoutManager.AnchorInfo anchorInfo) {
        this.valueOf = anchorInfo;
    }

    private static offsetFullSpansForAddition toString(StaggeredGridLayoutManager.AnchorInfo anchorInfo) {
        return new offsetFullSpansForAddition() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // o.offsetFullSpansForAddition
            public <T> StaggeredGridLayoutManager.LayoutParams<T> create(Gson gson, invalidateSpanInfo<T> invalidatespaninfo) {
                if (invalidatespaninfo.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    public static offsetFullSpansForAddition ag$a(StaggeredGridLayoutManager.AnchorInfo anchorInfo) {
        if (anchorInfo == ToNumberPolicy.LAZILY_PARSED_NUMBER) {
            return ag$a;
        }
        return toString(anchorInfo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.bind.NumberTypeAdapter$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] ag$a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            ag$a = iArr;
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ag$a[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ag$a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // o.StaggeredGridLayoutManager.LayoutParams
    /* renamed from: toString */
    public Number read(StaggeredGridLayoutManager.SavedState.AnonymousClass1 anonymousClass1) throws IOException {
        JsonToken aj$a = anonymousClass1.aj$a();
        int i = AnonymousClass4.ag$a[aj$a.ordinal()];
        if (i == 1) {
            anonymousClass1.HaptikSDK$e();
            return null;
        } else if (i == 2 || i == 3) {
            return this.valueOf.readNumber(anonymousClass1);
        } else {
            throw new JsonSyntaxException("Expecting number, got: " + aj$a);
        }
    }

    @Override // o.StaggeredGridLayoutManager.LayoutParams
    /* renamed from: toString */
    public void write(StaggeredGridLayoutManager.Span span, Number number) throws IOException {
        span.valueOf(number);
    }
}

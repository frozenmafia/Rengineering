package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import o.StaggeredGridLayoutManager;
import o.invalidateSpanInfo;
import o.offsetFullSpansForAddition;
/* loaded from: classes5.dex */
public final class ObjectTypeAdapter extends StaggeredGridLayoutManager.LayoutParams<Object> {
    private static final offsetFullSpansForAddition toString = values(ToNumberPolicy.DOUBLE);
    private final StaggeredGridLayoutManager.AnchorInfo ag$a;
    private final Gson ah$a;

    private ObjectTypeAdapter(Gson gson, StaggeredGridLayoutManager.AnchorInfo anchorInfo) {
        this.ah$a = gson;
        this.ag$a = anchorInfo;
    }

    private static offsetFullSpansForAddition values(final StaggeredGridLayoutManager.AnchorInfo anchorInfo) {
        return new offsetFullSpansForAddition() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // o.offsetFullSpansForAddition
            public <T> StaggeredGridLayoutManager.LayoutParams<T> create(Gson gson, invalidateSpanInfo<T> invalidatespaninfo) {
                if (invalidatespaninfo.getRawType() == Object.class) {
                    return new ObjectTypeAdapter(gson, StaggeredGridLayoutManager.AnchorInfo.this);
                }
                return null;
            }
        };
    }

    public static offsetFullSpansForAddition valueOf(StaggeredGridLayoutManager.AnchorInfo anchorInfo) {
        if (anchorInfo == ToNumberPolicy.DOUBLE) {
            return toString;
        }
        return values(anchorInfo);
    }

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$2  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] ag$a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            ag$a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ag$a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ag$a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ag$a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ag$a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ag$a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // o.StaggeredGridLayoutManager.LayoutParams
    public Object read(StaggeredGridLayoutManager.SavedState.AnonymousClass1 anonymousClass1) throws IOException {
        switch (AnonymousClass2.ag$a[anonymousClass1.aj$a().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                anonymousClass1.valueOf();
                while (anonymousClass1.HaptikSDK$a()) {
                    arrayList.add(read(anonymousClass1));
                }
                anonymousClass1.values();
                return arrayList;
            case 2:
                LinkedTreeMap linkedTreeMap = new LinkedTreeMap();
                anonymousClass1.ag$a();
                while (anonymousClass1.HaptikSDK$a()) {
                    linkedTreeMap.put(anonymousClass1.HaptikWebView(), read(anonymousClass1));
                }
                anonymousClass1.ah$a();
                return linkedTreeMap;
            case 3:
                return anonymousClass1.HaptikSDK$d();
            case 4:
                return this.ag$a.readNumber(anonymousClass1);
            case 5:
                return Boolean.valueOf(anonymousClass1.invoke());
            case 6:
                anonymousClass1.HaptikSDK$e();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // o.StaggeredGridLayoutManager.LayoutParams
    public void write(StaggeredGridLayoutManager.Span span, Object obj) throws IOException {
        if (obj == null) {
            span.HaptikSDK$b();
            return;
        }
        StaggeredGridLayoutManager.LayoutParams ag$a = this.ah$a.ag$a((Class) obj.getClass());
        if (ag$a instanceof ObjectTypeAdapter) {
            span.values();
            span.ag$a();
            return;
        }
        ag$a.write(span, obj);
    }
}

package com.google.gson.internal;

import com.google.gson.Gson;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import o.StaggeredGridLayoutManager;
import o.addFullSpanItem;
import o.findFirstCompletelyVisibleItemPositions;
import o.findFirstVisibleItemPositions;
import o.invalidateFullSpansAfter;
import o.invalidateSpanInfo;
import o.offsetFullSpansForAddition;
/* loaded from: classes5.dex */
public final class Excluder implements offsetFullSpansForAddition, Cloneable {
    public static final Excluder ag$a = new Excluder();
    private boolean values;
    private double ah$b = -1.0d;
    private int ah$a = 136;
    private boolean HaptikSDK$c = true;
    private List<findFirstCompletelyVisibleItemPositions> valueOf = Collections.emptyList();
    private List<findFirstCompletelyVisibleItemPositions> toString = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ag$a */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // o.offsetFullSpansForAddition
    public <T> StaggeredGridLayoutManager.LayoutParams<T> create(final Gson gson, final invalidateSpanInfo<T> invalidatespaninfo) {
        Class<? super T> rawType = invalidatespaninfo.getRawType();
        boolean valueOf = valueOf(rawType);
        final boolean z = valueOf || toString(rawType, true);
        final boolean z2 = valueOf || toString(rawType, false);
        if (z || z2) {
            return new StaggeredGridLayoutManager.LayoutParams<T>() { // from class: com.google.gson.internal.Excluder.1
                private StaggeredGridLayoutManager.LayoutParams<T> HaptikSDK$b;

                /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
                @Override // o.StaggeredGridLayoutManager.LayoutParams
                public T read(StaggeredGridLayoutManager.SavedState.AnonymousClass1 anonymousClass1) throws IOException {
                    if (z2) {
                        anonymousClass1.onXdkEvent();
                        return null;
                    }
                    return values().read(anonymousClass1);
                }

                @Override // o.StaggeredGridLayoutManager.LayoutParams
                public void write(StaggeredGridLayoutManager.Span span, T t) throws IOException {
                    if (z) {
                        span.HaptikSDK$b();
                    } else {
                        values().write(span, t);
                    }
                }

                private StaggeredGridLayoutManager.LayoutParams<T> values() {
                    StaggeredGridLayoutManager.LayoutParams<T> layoutParams = this.HaptikSDK$b;
                    if (layoutParams != 0) {
                        return layoutParams;
                    }
                    StaggeredGridLayoutManager.LayoutParams<T> gson2 = gson.toString(Excluder.this, invalidatespaninfo);
                    this.HaptikSDK$b = gson2;
                    return gson2;
                }
            };
        }
        return null;
    }

    public boolean ah$a(Field field, boolean z) {
        invalidateFullSpansAfter invalidatefullspansafter;
        if ((this.ah$a & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.ah$b == -1.0d || values((StaggeredGridLayoutManager.LazySpanLookup) field.getAnnotation(StaggeredGridLayoutManager.LazySpanLookup.class), (addFullSpanItem) field.getAnnotation(addFullSpanItem.class))) && !field.isSynthetic()) {
            if (!this.values || ((invalidatefullspansafter = (invalidateFullSpansAfter) field.getAnnotation(invalidateFullSpansAfter.class)) != null && (!z ? !invalidatefullspansafter.values() : !invalidatefullspansafter.ah$a()))) {
                if ((this.HaptikSDK$c || !ag$a(field.getType())) && !ah$a(field.getType())) {
                    List<findFirstCompletelyVisibleItemPositions> list = z ? this.valueOf : this.toString;
                    if (list.isEmpty()) {
                        return false;
                    }
                    findFirstVisibleItemPositions findfirstvisibleitempositions = new findFirstVisibleItemPositions(field);
                    for (findFirstCompletelyVisibleItemPositions findfirstcompletelyvisibleitempositions : list) {
                        if (findfirstcompletelyvisibleitempositions.toString(findfirstvisibleitempositions)) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    private boolean valueOf(Class<?> cls) {
        if (this.ah$b == -1.0d || values((StaggeredGridLayoutManager.LazySpanLookup) cls.getAnnotation(StaggeredGridLayoutManager.LazySpanLookup.class), (addFullSpanItem) cls.getAnnotation(addFullSpanItem.class))) {
            return (!this.HaptikSDK$c && ag$a(cls)) || ah$a(cls);
        }
        return true;
    }

    public boolean valueOf(Class<?> cls, boolean z) {
        return valueOf(cls) || toString(cls, z);
    }

    private boolean toString(Class<?> cls, boolean z) {
        for (findFirstCompletelyVisibleItemPositions findfirstcompletelyvisibleitempositions : z ? this.valueOf : this.toString) {
            if (findfirstcompletelyvisibleitempositions.ah$a(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean ah$a(Class<?> cls) {
        return (Enum.class.isAssignableFrom(cls) || toString(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) ? false : true;
    }

    private boolean ag$a(Class<?> cls) {
        return cls.isMemberClass() && !toString(cls);
    }

    private boolean toString(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean values(StaggeredGridLayoutManager.LazySpanLookup lazySpanLookup, addFullSpanItem addfullspanitem) {
        return ah$a(lazySpanLookup) && ag$a(addfullspanitem);
    }

    private boolean ah$a(StaggeredGridLayoutManager.LazySpanLookup lazySpanLookup) {
        return lazySpanLookup == null || lazySpanLookup.valueOf() <= this.ah$b;
    }

    private boolean ag$a(addFullSpanItem addfullspanitem) {
        return addfullspanitem == null || addfullspanitem.ah$a() > this.ah$b;
    }
}

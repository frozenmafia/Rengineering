package com.google.ads.interactivemedia.v3.internal;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class ahb implements aha {
    private final /* synthetic */ int a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f554b;

    public ahb(int i) {
        this.a = i;
        this.f554b = new int[2];
    }

    public ahb(aha ahaVar, int i) {
        this.a = i;
        this.f554b = ahaVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aha
    public final JSONObject a(View view) {
        if (this.a != 0) {
            return ahh.b(0, 0, 0, 0);
        }
        if (view == null) {
            return ahh.b(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen((int[]) this.f554b);
        int[] iArr = (int[]) this.f554b;
        return ahh.b(iArr[0], iArr[1], width, height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, com.google.ads.interactivemedia.v3.internal.aha] */
    @Override // com.google.ads.interactivemedia.v3.internal.aha
    public final void b(View view, JSONObject jSONObject, agz agzVar, boolean z) {
        int i = 0;
        if (this.a == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!z || Build.VERSION.SDK_INT < 21) {
                    while (i < viewGroup.getChildCount()) {
                        agzVar.a(viewGroup.getChildAt(i), this, jSONObject);
                        i++;
                    }
                    return;
                }
                HashMap hashMap = new HashMap();
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                    }
                    arrayList.add(childAt);
                }
                ArrayList arrayList2 = new ArrayList(hashMap.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i3));
                    int size2 = arrayList3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        agzVar.a((View) arrayList3.get(i4), this, jSONObject);
                    }
                }
                return;
            }
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        ags a = ags.a();
        if (a != null) {
            Collection<agm> b2 = a.b();
            int size3 = b2.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size3 + size3 + 3);
            for (agm agmVar : b2) {
                View g = agmVar.g();
                if (g != null && (Build.VERSION.SDK_INT < 19 || g.isAttachedToWindow())) {
                    if (g.isShown()) {
                        View view2 = g;
                        while (true) {
                            if (view2 != null) {
                                if (view2.getAlpha() != 0.0f) {
                                    ViewParent parent = view2.getParent();
                                    view2 = parent instanceof View ? (View) parent : null;
                                }
                            } else {
                                View rootView = g.getRootView();
                                if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                    identityHashMap.put(rootView, rootView);
                                    float b3 = com.google.ads.interactivemedia.v3.impl.data.i.b(rootView);
                                    int size4 = arrayList4.size();
                                    while (size4 > 0) {
                                        int i5 = size4 - 1;
                                        if (com.google.ads.interactivemedia.v3.impl.data.i.b((View) arrayList4.get(i5)) <= b3) {
                                            break;
                                        }
                                        size4 = i5;
                                    }
                                    arrayList4.add(size4, rootView);
                                }
                            }
                        }
                    }
                }
            }
        }
        int size5 = arrayList4.size();
        while (i < size5) {
            agzVar.a((View) arrayList4.get(i), this.f554b, jSONObject);
            i++;
        }
    }
}

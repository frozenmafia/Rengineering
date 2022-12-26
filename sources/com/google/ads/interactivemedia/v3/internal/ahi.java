package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;
/* loaded from: classes4.dex */
public final class ahi {
    private final HashMap a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap f560b = new HashMap();
    private final HashMap c = new HashMap();
    private final HashSet d = new HashSet();
    private final HashSet e = new HashSet();
    private final HashSet f = new HashSet();
    private final HashMap g = new HashMap();
    private boolean h;

    public final View a(String str) {
        return (View) this.c.get(str);
    }

    public final String b(String str) {
        return (String) this.g.get(str);
    }

    public final String c(View view) {
        if (this.a.size() == 0) {
            return null;
        }
        String str = (String) this.a.get(view);
        if (str != null) {
            this.a.remove(view);
        }
        return str;
    }

    public final HashSet d() {
        return this.f;
    }

    public final HashSet e() {
        return this.e;
    }

    public final void f() {
        this.a.clear();
        this.f560b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h = false;
    }

    public final void g() {
        this.h = true;
    }

    public final void h() {
        String str;
        ags a = ags.a();
        if (a != null) {
            for (agm agmVar : a.b()) {
                View g = agmVar.g();
                if (agmVar.k()) {
                    String i = agmVar.i();
                    if (g != null) {
                        if (g.hasWindowFocus()) {
                            HashSet hashSet = new HashSet();
                            View view = g;
                            while (true) {
                                if (view != null) {
                                    String c = com.google.ads.interactivemedia.v3.impl.data.i.c(view);
                                    if (c != null) {
                                        str = c;
                                        break;
                                    }
                                    hashSet.add(view);
                                    ViewParent parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                } else {
                                    this.d.addAll(hashSet);
                                    str = null;
                                    break;
                                }
                            }
                        } else {
                            str = "noWindowFocus";
                        }
                        if (str == null) {
                            this.e.add(i);
                            this.a.put(g, i);
                            for (lu luVar : agmVar.j()) {
                                View view2 = (View) luVar.j().get();
                                if (view2 != null) {
                                    ael aelVar = (ael) this.f560b.get(view2);
                                    if (aelVar != null) {
                                        aelVar.f(agmVar.i());
                                    } else {
                                        this.f560b.put(view2, new ael(luVar, agmVar.i(), null));
                                    }
                                }
                            }
                        } else {
                            this.f.add(i);
                            this.c.put(i, g);
                            this.g.put(i, str);
                        }
                    } else {
                        this.f.add(i);
                        this.g.put(i, "noAdView");
                    }
                }
            }
        }
    }

    public final int i(View view) {
        if (this.d.contains(view)) {
            return 1;
        }
        return this.h ? 2 : 3;
    }

    public final ael j(View view) {
        ael aelVar = (ael) this.f560b.get(view);
        if (aelVar != null) {
            this.f560b.remove(view);
        }
        return aelVar;
    }
}

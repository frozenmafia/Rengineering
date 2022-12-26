package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public class bqa {
    protected volatile bqq a;

    /* renamed from: b  reason: collision with root package name */
    private volatile bnz f938b;

    static {
        boy.a();
    }

    public final int a() {
        if (this.f938b != null) {
            return this.f938b.d();
        }
        if (this.a != null) {
            return this.a.ax();
        }
        return 0;
    }

    public final bnz b() {
        if (this.f938b != null) {
            return this.f938b;
        }
        synchronized (this) {
            if (this.f938b != null) {
                return this.f938b;
            }
            if (this.a == null) {
                this.f938b = bnz.f907b;
            } else {
                this.f938b = this.a.au();
            }
            return this.f938b;
        }
    }

    public final bqq d(bqq bqqVar) {
        bqq bqqVar2 = this.a;
        this.f938b = null;
        this.a = bqqVar;
        return bqqVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bqa) {
            bqa bqaVar = (bqa) obj;
            bqq bqqVar = this.a;
            bqq bqqVar2 = bqaVar.a;
            if (bqqVar == null && bqqVar2 == null) {
                return b().equals(bqaVar.b());
            }
            if (bqqVar == null || bqqVar2 == null) {
                if (bqqVar != null) {
                    return bqqVar.equals(bqaVar.c(bqqVar.aZ()));
                }
                return c(bqqVar2.aZ()).equals(bqqVar2);
            }
            return bqqVar.equals(bqqVar2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public final bqq c(bqq bqqVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = bqqVar;
                        this.f938b = bnz.f907b;
                    } catch (bpt unused) {
                        this.a = bqqVar;
                        this.f938b = bnz.f907b;
                    }
                }
            }
        }
        return this.a;
    }
}

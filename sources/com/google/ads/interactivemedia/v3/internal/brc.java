package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayDeque;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class brc {
    private final ArrayDeque a = new ArrayDeque();

    private brc() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ bnz a(brc brcVar, bnz bnzVar, bnz bnzVar2) {
        brcVar.b(bnzVar);
        brcVar.b(bnzVar2);
        bnz bnzVar3 = (bnz) brcVar.a.pop();
        while (!brcVar.a.isEmpty()) {
            bnzVar3 = new bre((bnz) brcVar.a.pop(), bnzVar3, null);
        }
        return bnzVar3;
    }

    private final void b(bnz bnzVar) {
        if (bnzVar.h()) {
            int c = c(bnzVar.d());
            int c2 = bre.c(c + 1);
            if (this.a.isEmpty() || ((bnz) this.a.peek()).d() >= c2) {
                this.a.push(bnzVar);
                return;
            }
            int c3 = bre.c(c);
            bnz bnzVar2 = (bnz) this.a.pop();
            while (!this.a.isEmpty() && ((bnz) this.a.peek()).d() < c3) {
                bnzVar2 = new bre((bnz) this.a.pop(), bnzVar2, null);
            }
            bre breVar = new bre(bnzVar2, bnzVar, null);
            while (!this.a.isEmpty()) {
                if (((bnz) this.a.peek()).d() >= bre.c(c(breVar.d()) + 1)) {
                    break;
                }
                breVar = new bre((bnz) this.a.pop(), breVar, null);
            }
            this.a.push(breVar);
        } else if (bnzVar instanceof bre) {
            bre breVar2 = (bre) bnzVar;
            b(bre.g(breVar2));
            b(bre.E(breVar2));
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(bnzVar.getClass()))));
        }
    }

    private static final int c(int i) {
        int binarySearch = Arrays.binarySearch(bre.a, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ brc(byte[] bArr) {
    }
}

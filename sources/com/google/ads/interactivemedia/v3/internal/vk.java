package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes4.dex */
public final /* synthetic */ class vk implements Comparator {
    private final /* synthetic */ int i;
    public static final /* synthetic */ vk h = new vk(7);
    public static final /* synthetic */ vk g = new vk(6);
    public static final /* synthetic */ vk f = new vk(5);
    public static final /* synthetic */ vk e = new vk(4);
    public static final /* synthetic */ vk d = new vk(3);
    public static final /* synthetic */ vk c = new vk(2);

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ vk f1314b = new vk(1);
    public static final /* synthetic */ vk a = new vk(0);

    private /* synthetic */ vk(int i) {
        this.i = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((vm) Collections.max((List) obj)).compareTo((vm) Collections.max((List) obj2));
            case 1:
                return ((s) obj2).h - ((s) obj).h;
            case 2:
                List list = (List) obj;
                List list2 = (List) obj2;
                aug j = aug.j();
                vk vkVar = g;
                aug b2 = j.c((vx) Collections.max(list, vkVar), (vx) Collections.max(list2, vkVar), vkVar).b(list.size(), list2.size());
                vk vkVar2 = h;
                return b2.c((vx) Collections.max(list, vkVar2), (vx) Collections.max(list2, vkVar2), vkVar2).a();
            case 3:
                return ((vu) ((List) obj).get(0)).compareTo((vu) ((List) obj2).get(0));
            case 4:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                int i = vy.a;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                } else if (num2.intValue() == -1) {
                    return 1;
                } else {
                    return num.intValue() - num2.intValue();
                }
            case 5:
                Integer num3 = (Integer) obj;
                Integer num4 = (Integer) obj2;
                int i2 = vy.a;
                return 0;
            case 6:
                return vx.d((vx) obj, (vx) obj2);
            default:
                return vx.a((vx) obj, (vx) obj2);
        }
    }
}

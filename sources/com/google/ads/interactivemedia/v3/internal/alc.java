package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public final /* synthetic */ class alc implements Continuation {
    public final /* synthetic */ Object a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f617b;

    public /* synthetic */ alc(alg algVar, int i) {
        this.f617b = i;
        this.a = algVar;
    }

    public /* synthetic */ alc(List list, int i) {
        this.f617b = i;
        this.a = list;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i = this.f617b;
        if (i == 0) {
            Object obj = this.a;
            List<alb> list = (List) task.getResult();
            ArrayList arrayList = new ArrayList(list.size());
            for (final alb albVar : list) {
                Task c = albVar.c();
                final alg algVar = (alg) obj;
                c.addOnFailureListener(new OnFailureListener() { // from class: com.google.ads.interactivemedia.v3.internal.ale
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        alg.this.e(albVar, exc);
                    }
                });
                arrayList.add(c);
            }
            return arrayList;
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    List<Task> list2 = (List) task.getResult();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (Task task2 : list2) {
                        if (task2.isSuccessful()) {
                            arrayList2.add(task2.getResult());
                        }
                    }
                    return arrayList2;
                } else if (i == 4) {
                    r7.c.trySetResult(((alg) this.a).a);
                    return null;
                } else {
                    Object obj2 = this.a;
                    List<alb> list3 = (List) task.getResult();
                    ArrayList arrayList3 = new ArrayList(list3.size());
                    for (final alb albVar2 : list3) {
                        final alg algVar2 = (alg) obj2;
                        arrayList3.add(albVar2.b().addOnFailureListener(new OnFailureListener() { // from class: com.google.ads.interactivemedia.v3.internal.alf
                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public final void onFailure(Exception exc) {
                                alg.this.d(albVar2, exc);
                            }
                        }));
                    }
                    return arrayList3;
                }
            }
            return alg.a((alg) this.a, task);
        } else {
            return this.a;
        }
    }
}

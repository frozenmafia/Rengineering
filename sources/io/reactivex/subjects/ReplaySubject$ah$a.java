package io.reactivex.subjects;

import io.reactivex.subjects.ReplaySubject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public interface ReplaySubject$ah$a<T> {
    void add(T t);

    void addFinal(Object obj);

    boolean compareAndSet(Object obj, Object obj2);

    void replay(ReplaySubject.ReplayDisposable<T> replayDisposable);
}

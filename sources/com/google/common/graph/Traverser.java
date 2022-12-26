package com.google.common.graph;

import java.util.Deque;
/* loaded from: classes7.dex */
public abstract class Traverser<N> {

    /* renamed from: com.google.common.graph.Traverser$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    class AnonymousClass1 extends Traverser<N> {
    }

    /* loaded from: classes7.dex */
    enum InsertionOrder {
        FRONT { // from class: com.google.common.graph.Traverser.InsertionOrder.1
            @Override // com.google.common.graph.Traverser.InsertionOrder
            <T> void insertInto(Deque<T> deque, T t) {
                deque.addFirst(t);
            }
        },
        BACK { // from class: com.google.common.graph.Traverser.InsertionOrder.2
            @Override // com.google.common.graph.Traverser.InsertionOrder
            <T> void insertInto(Deque<T> deque, T t) {
                deque.addLast(t);
            }
        };

        abstract <T> void insertInto(Deque<T> deque, T t);

        /* synthetic */ InsertionOrder(AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}

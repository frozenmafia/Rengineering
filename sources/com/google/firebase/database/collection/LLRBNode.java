package com.google.firebase.database.collection;

import java.util.Comparator;
/* loaded from: classes5.dex */
public interface LLRBNode<K, V> {

    /* loaded from: classes5.dex */
    public enum Color {
        RED,
        BLACK
    }

    /* loaded from: classes5.dex */
    public static abstract class values<K, V> {
        public abstract void values(K k, V v);
    }

    LLRBNode<K, V> HaptikSDK$a();

    LLRBNode<K, V> HaptikSDK$b();

    LLRBNode<K, V> HaptikSDK$c();

    boolean ag$a();

    LLRBNode<K, V> ah$a(K k, V v, Color color, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2);

    K ah$a();

    void ah$a(values<K, V> valuesVar);

    V ah$b();

    boolean getSignupData();

    LLRBNode<K, V> invoke();

    LLRBNode<K, V> valueOf(K k, V v, Comparator<K> comparator);

    LLRBNode<K, V> valueOf(K k, Comparator<K> comparator);

    int values();
}

package com.google.gson;

import o.StaggeredGridLayoutManager;
import o.invalidateSpanAssignments;
import o.setGapStrategy;
/* loaded from: classes5.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public invalidateSpanAssignments serialize(Long l) {
            if (l == null) {
                return setGapStrategy.values;
            }
            return new StaggeredGridLayoutManager.AnonymousClass1(l);
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public invalidateSpanAssignments serialize(Long l) {
            if (l == null) {
                return setGapStrategy.values;
            }
            return new StaggeredGridLayoutManager.AnonymousClass1(l.toString());
        }
    };

    public abstract invalidateSpanAssignments serialize(Long l);
}

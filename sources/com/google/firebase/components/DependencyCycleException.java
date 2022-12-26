package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;
import o.MessageThreadUtil;
/* loaded from: classes5.dex */
public class DependencyCycleException extends DependencyException {
    private final List<MessageThreadUtil.SyncQueueItem<?>> componentsInCycle;

    public DependencyCycleException(List<MessageThreadUtil.SyncQueueItem<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.componentsInCycle = list;
    }

    public List<MessageThreadUtil.SyncQueueItem<?>> getComponentsInCycle() {
        return this.componentsInCycle;
    }
}

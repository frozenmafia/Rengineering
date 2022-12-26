package com.apxor.androidsdk.core;

import com.apxor.androidsdk.core.models.BaseApxorEvent;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class b {
    private final ConcurrentHashMap<String, LinkedBlockingQueue<EventListener>> a = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, EventListener eventListener) {
        if (this.a.containsKey(str)) {
            LinkedBlockingQueue<EventListener> linkedBlockingQueue = this.a.get(str);
            linkedBlockingQueue.remove(eventListener);
            this.a.put(str, linkedBlockingQueue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str, EventListener eventListener) {
        LinkedBlockingQueue<EventListener> linkedBlockingQueue;
        if (this.a.containsKey(str)) {
            linkedBlockingQueue = this.a.get(str);
        } else {
            linkedBlockingQueue = new LinkedBlockingQueue<>();
        }
        if (linkedBlockingQueue.contains(eventListener)) {
            return;
        }
        linkedBlockingQueue.add(eventListener);
        this.a.put(str, linkedBlockingQueue);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(BaseApxorEvent baseApxorEvent) {
        LinkedBlockingQueue<EventListener> linkedBlockingQueue;
        String eventType = baseApxorEvent.getEventType();
        if (!this.a.containsKey(eventType) || (linkedBlockingQueue = this.a.get(eventType)) == null) {
            return;
        }
        Iterator<EventListener> it = linkedBlockingQueue.iterator();
        while (it.hasNext()) {
            try {
                it.next().onEvent(baseApxorEvent);
            } catch (Exception unused) {
            }
        }
    }
}

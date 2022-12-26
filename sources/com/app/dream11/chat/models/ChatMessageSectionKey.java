package com.app.dream11.chat.models;

import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatMessageSectionKey implements Comparable<ChatMessageSectionKey> {
    private final long sectionDate;

    public ChatMessageSectionKey(long j) {
        this.sectionDate = j;
    }

    public final long getSectionDate() {
        return this.sectionDate;
    }

    @Override // java.lang.Comparable
    public int compareTo(ChatMessageSectionKey chatMessageSectionKey) {
        runAnimators.ag$a(chatMessageSectionKey, "other");
        int i = (this.sectionDate > chatMessageSectionKey.sectionDate ? 1 : (this.sectionDate == chatMessageSectionKey.sectionDate ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        return i < 0 ? -1 : 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ChatMessageSectionKey) && ((ChatMessageSectionKey) obj).sectionDate == this.sectionDate;
    }

    public int hashCode() {
        return ChatMessageSectionKey$$ExternalSyntheticBackport0.m(this.sectionDate);
    }
}

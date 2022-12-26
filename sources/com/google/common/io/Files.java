package com.google.common.io;

import com.google.common.collect.Lists;
import java.io.File;
import java.util.List;
import o.ensureNext;
import o.findViewHolder;
/* loaded from: classes7.dex */
public final class Files {
    private static final ensureNext<File> ag$a = new ensureNext<File>() { // from class: com.google.common.io.Files.2
    };

    /* renamed from: com.google.common.io.Files$4  reason: invalid class name */
    /* loaded from: classes7.dex */
    class AnonymousClass4 {
        final List<String> values = Lists.ag$a();

        AnonymousClass4() {
        }
    }

    /* loaded from: classes7.dex */
    enum FilePredicate implements findViewHolder<File> {
        IS_DIRECTORY { // from class: com.google.common.io.Files.FilePredicate.1
            @Override // java.lang.Enum
            public String toString() {
                return "Files.isDirectory()";
            }

            @Override // o.findViewHolder
            public boolean apply(File file) {
                return file.isDirectory();
            }
        },
        IS_FILE { // from class: com.google.common.io.Files.FilePredicate.2
            @Override // java.lang.Enum
            public String toString() {
                return "Files.isFile()";
            }

            @Override // o.findViewHolder
            public boolean apply(File file) {
                return file.isFile();
            }
        };

        /* synthetic */ FilePredicate(AnonymousClass4 anonymousClass4) {
            this();
        }
    }
}

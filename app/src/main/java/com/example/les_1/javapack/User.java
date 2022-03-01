package com.example.les_1.javapack;

import android.os.Build;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import org.jetbrains.annotations.NotNull;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

public final class User {
    @NotNull
    private final Lazy startTime$delegate;
    private final int id;
    @NotNull
    private final String name;
    private final int age;
    @NotNull
    private final Type type;
    public User(int id, @NotNull String name, int age, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.startTime$delegate = LazyKt.lazy(null);
        this.id = id;
        this.name = name;
        this.age = age;
        this.type = type;
    }

    @NotNull
    public final String getStartTime() {
        Lazy var1 = this.startTime$delegate;
        Object var3 = null;
        return (String)var1.getValue();
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getAge() {
        return this.age;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }


}
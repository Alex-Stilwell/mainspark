package com.mainspark;

import mainspark.proto.ExampleOneOuterClass;

public class Main {
    public static void main(String[] args) {
        byte[] data = ExampleOneOuterClass
                .ExampleOne
                .newBuilder()
                .setDesignName("New Design")
                .setOwner(5323)
                .addNumericHashCode(5934203L)
                .build().toByteArray();
    }
}

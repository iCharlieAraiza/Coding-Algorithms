package org.course;

import java.util.function.Consumer;

public class _Consumer {
    public Consumer<String> greeting = person -> System.out.println("Hello " + person + "! Nice to see you here");
}

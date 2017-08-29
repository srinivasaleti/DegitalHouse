package com.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ConsoleIOTest {

    private IO consoleIO;
    private PrintStream out;

    @BeforeEach
    void beforeEach() {
        this.out = mock(System.out.getClass());
        this.consoleIO = new ConsoleIO(this.out);
    }

    @Test
    void displayHello() {
        String hello = "Hello";

        this.consoleIO.print(hello);

        verify(this.out).print(hello);
    }

    @Test
    void displayHi() {
        String hi = "Hi";

        this.consoleIO.print(hi);

        verify(this.out).print(hi);
    }

    @Test
    void displayHelloWithNewLine() {
        String hello = "Hello";

        this.consoleIO.println(hello);

        verify(this.out).println(hello);
    }

    @Test
    void displayHiWithNewLine() {
        String hi = "Hi";

        this.consoleIO.println(hi);

        verify(this.out).println(hi);
    }

}

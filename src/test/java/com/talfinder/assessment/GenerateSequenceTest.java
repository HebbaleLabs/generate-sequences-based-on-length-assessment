package com.talfinder.assessment;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RunWith(Parameterized.class)
public class GenerateSequenceTest {
    String input;
    int inputLength;
    Set<String> expected;

    public GenerateSequenceTest(String input, int inputLength, Set<String> expected) {
        this.input = input;
        this.inputLength = inputLength;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {"abc", 2, Stream.of("ab", "bc").collect(Collectors.toSet())},
                {"abcd", 2, Stream.of("ab", "bc", "cd").collect(Collectors.toSet())},
                {"abcde", 3, Stream.of("abc", "bcd", "cde").collect(Collectors.toSet())},
                {"abcdef", 6, Stream.of("abcdef").collect(Collectors.toSet())},
                {"abcde", 1, Stream.of("a", "b", "c", "d", "e").collect(Collectors.toSet())},
                {"aaab", 2, Stream.of("aa", "ab").collect(Collectors.toSet())},
                {"abcabc", 3, Stream.of("abc", "bca", "cab").collect(Collectors.toSet())}
        });
    }

    @Test
    public void testgenerateSequence() {
        Set<String> methodOutput = GenerateSequence.generateSequences(input, inputLength);
        Assert.assertEquals("input:String as '" + input + "and length as " + inputLength + "", expected, methodOutput);
    }
}

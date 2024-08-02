package com.katas;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Named;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;


@DisplayName("solution tests")
public class SolutionTest {
    private static Solution solution;

    @BeforeAll
    static void setup() {
      solution = new Solution();
    }

    @ParameterizedTest(name = "{0} is {1}")
    @MethodSource("scenarios")
    public void test(final boolean input, final boolean expected) {
        assertThat(solution.kata(input)).isEqualTo(expected);
    }


    static Stream<Arguments> scenarios() {
        return Stream.of(
            Arguments.of(
                Named.of("true", true),
                Named.of("true", true)
            )
        );
    }
}

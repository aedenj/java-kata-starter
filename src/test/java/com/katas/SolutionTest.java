package com.katas;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;


@DisplayName("solution tests")
public class SolutionTest {

  @ParameterizedTest(name = "{index} - description ....")
  @MethodSource("scenarios")
  public void test() {
    assertThat(Solution.solution()).isEqualTo(true);
  }


  static Stream<Arguments> scenarios() {
      return Stream.of(
        Arguments.of()
      );
  }
}

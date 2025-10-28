import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("Set의 크기를 확인하는 테스트")
    void size() {
        // when
        int result = numbers.size();

        // then
        assertThat(result).isEqualTo(3);
    }


    /**
     * 아래 테스트 메서드 개선하기
     *
     * void contains() {
     * assertThat(numbers.contains(1)).isTrue();
     * assertThat(numbers.contains(2)).isTrue();
     * assertThat(numbers.contains(3)).isTrue();
     * }
     */
    @DisplayName("Set에 특정 값이 존재하는지 확인하는 테스트")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void contains(int number) {
        assertThat(numbers.contains(number)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({"1,true", "2,true", "3,true", "4,false", "5,false"})
    void contains2(int number, boolean expected) {
        boolean actual = numbers.contains(number);
        assertEquals(expected, actual);
    }
}

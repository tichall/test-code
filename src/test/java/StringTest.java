
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    @DisplayName("\"1\"를 \",\"로 split 했을 때 \"1\"과 \"2\"로 잘 분리되는지 확인하는 테스트")
    void split_commaSeperatedValue_returnTwoElements() {
        // given
        String input = "1,2";

        // when
        String[] result = input.split(",");

        // then
        assertThat(result).containsExactly("1", "2");
    }

    @Test
    @DisplayName("\"1\"을 \",\"로 split 했을 때 \"1\"만 포함된 배열이 반환되는지 확인하는 테스트")
    void split_singleValue_returnSingleElement() {
        // given
        String input = "1";

        // when
        String[] result = input.split(",");

        // then
        assertThat(result).containsExactly("1");
    }
}

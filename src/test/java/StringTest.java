
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

    @Test
    @DisplayName("괄호 사이에 있는 문자열 반환 테스트")
    void substring() {
        // given
        String input = "(1,2)";
        int beginIndex = input.indexOf("(") + 1;
        int lastIndex = input.indexOf(")");

        // when
        String result = input.substring(beginIndex, lastIndex);

        // then
        assertThat(result).isEqualTo("1,2");
    }
}

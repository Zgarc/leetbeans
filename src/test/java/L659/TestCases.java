package L659;

import org.junit.Test;

import java.util.List;

public class TestCases {
    @Test
    public void test1() {
        List<String> strings = List.of("Hey", "There", "My", "Name", "Is", "Jon");
        final String encodedString = Solution.encode(strings);
        assert Solution.decode(encodedString).equals(strings);
    }
}

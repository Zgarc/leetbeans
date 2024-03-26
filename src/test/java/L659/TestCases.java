package L659;

import java.util.List;

public class TestCases {
    @org.junit.Test
    public void test1() {
        final String encodedString = Solution.encode(List.of("Hey", "There", "My", "Name", "Is", "Jon"));
        assert encodedString.isEmpty();
    }
}

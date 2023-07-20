import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void asteroidCollisionTest1() {
        int[] asteroids = {5, 10, -5};
        int[] expected = {5, 10};
        int[] actual = new Solution().asteroidCollision(asteroids);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void asteroidCollisionTest2() {
        int[] asteroids = {8, -8};
        int[] expected = {};
        int[] actual = new Solution().asteroidCollision(asteroids);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void asteroidCollisionTest3() {
        int[] asteroids = {10, 2, -5};
        int[] expected = {10};
        int[] actual = new Solution().asteroidCollision(asteroids);

        Assertions.assertArrayEquals(expected, actual);
    }
}

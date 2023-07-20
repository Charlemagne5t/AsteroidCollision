import java.util.*;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else if (asteroids[i] < 0) {
                boolean currentAlive = true;
                if (!stack.isEmpty()) {
                    int currentAsteroid = Math.abs(asteroids[i]);
                    while (!stack.isEmpty()) {
                        if (stack.peek() > currentAsteroid) {
                            break;
                        }
                        if (stack.peek() < currentAsteroid) {
                            stack.pop();
                        } else if (stack.peek() == currentAsteroid) {
                            stack.pop();
                            currentAlive = false;
                            break;
                        }
                    }
                }
                if (stack.isEmpty() && currentAlive) {
                    list.add(asteroids[i]);
                }
            }
        }
        if (!stack.isEmpty()) {
            list.addAll(stack);
        }

        int size = list.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}



package baseball.util;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class NumbersValidator {

    public static boolean isSize3(List<Integer> numbers) {
        // 검증: randomNumbers가 null이 아니고, 길이가 3인지 확인
        if (numbers == null || numbers.size() != 3) {
            throw new IllegalArgumentException("numbers must not be null and must have exactly 3 elements.");
        }
        return true;
    }
    public static boolean isDistinct(List<Integer> numbers) {


        // 검증: 각 Integer가 null이 아니고, 모두 다른 수인지 확인
        Set<Integer> uniqueNumbers = numbers.stream()
                .filter(Objects::nonNull) // null이 아닌 숫자만 필터링
                .collect(Collectors.toSet()); // Set으로 수집하여 중복 제거

        // 3개면 조건 만족
        return uniqueNumbers.size() == 3;
    }
}

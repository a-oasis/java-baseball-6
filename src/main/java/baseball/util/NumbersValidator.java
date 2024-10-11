package baseball.util;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class NumbersValidator {

    public static boolean isSize3AndDistinct(List<Integer> numbers) {
        // 검증: randomNumbers가 null이 아니고, 길이가 3인지 확인
        if (numbers == null || numbers.size() != 3) {
            throw new IllegalArgumentException("numbers must not be null and must have exactly 3 elements.");
        }

        // 검증: 각 Integer가 null이 아니고, 모두 다른 수인지 확인
        Set<Integer> uniqueNumbers = numbers.stream()
                .filter(Objects::nonNull) // null이 아닌 숫자만 필터링
                .collect(Collectors.toSet()); // Set으로 수집하여 중복 제거

        // 중복이 없고, null이 아닌 숫자가 3개인 경우
        if (uniqueNumbers.size() == 3) {
            // 저장 로직을 여기에 추가
            computers.put(uniqueNumbers.iterator().next(), randomNumbers);
            return uniqueNumbers.iterator().next(); // 저장 성공
        } else {
            throw new IllegalArgumentException("All numbers must be non-null and distinct.");
        }

    }
}

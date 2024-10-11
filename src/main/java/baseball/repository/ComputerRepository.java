package baseball.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ComputerRepository {
    private static final HashMap<Integer,List<Integer>> computers=new HashMap<>();

    private static final ComputerRepository instance=new ComputerRepository();

    public static ComputerRepository callComputerRepository() {
        return instance;
    }

    private ComputerRepository() {
    }

    public int save(List<Integer> randomNumbers) {

        //검증 하고나서

        computers.put(uniqueNumbers.iterator().next(), randomNumbers);
        return uniqueNumbers.iterator().next(); // 저장 성공
    }

}

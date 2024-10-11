package baseball.repository;

import baseball.util.NumbersValidator;

import java.util.HashMap;
import java.util.List;

public class ComputerRepository {
    private static final HashMap<Integer,List<Integer>> computers=new HashMap<>();

    private static final ComputerRepository instance=new ComputerRepository();

    public static ComputerRepository callComputerRepository() {
        return instance;
    }

    private ComputerRepository() {
    }

    public int save(List<Integer> randomNumbers) {
        if(NumbersValidator.isDistinct(randomNumbers)){
            final int autoIncrementKey=computers.size();
            computers.put(autoIncrementKey, randomNumbers);
            return randomNumbers.iterator().next();
        }else{
            throw new IllegalArgumentException("");
        }
    }

}

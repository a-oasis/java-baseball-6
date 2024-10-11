package baseball.service;

import baseball.repository.ComputerRepository;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class ComputerService {
    private final ComputerRepository computerRepository=ComputerRepository.callComputerRepository();

    public int addNewComputer() {
        List<Integer> randomNumbers = new ArrayList<>();
        while (randomNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }
        return computerRepository.save(randomNumbers);
    }
}

package lotto;

import lotto.InputOutput.GameOutputHandler;
import lotto.InputOutput.UserInputHandler;
import lotto.controller.GeneratingLottoNumbers;
import lotto.controller.Lotto;
import lotto.controller.LottoCounting;

import java.util.Map;

public class Application {

    static UserInputHandler inputHandler;
    static GameOutputHandler outputHandler;
    static GeneratingLottoNumbers lottoNumbers;
    static LottoCounting lottoCounter;

    public static void main(String[] args) {
        Application lottoApplication = new Application();

        inputHandler = new UserInputHandler();
        outputHandler = new GameOutputHandler();
        lottoNumbers = new GeneratingLottoNumbers();
        lottoCounter = new LottoCounting();

        lottoApplication.start();
    }

    void start(){

    }
}

package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class UserInputHandler {

    static final int moneyOfOneTicket = 1000;
    static final int numbersOfLotto = 6;

    public int getHowMuchTickets(){
        int money = Integer.parseInt(Console.readLine());
        validateMoney(money);
        return money / moneyOfOneTicket;
    }

    public List<Integer> getWinningNumbers(){
        String usersInput = Console.readLine();
        return convertToLottoNumbers(usersInput);
    }

    public int getBonusNumbers(){
        String userInput = Console.readLine();
        return validateLottoNumbers(userInput);
    }

    private List<Integer> convertToLottoNumbers(String input){
        List<Integer> lottoNumbers = new ArrayList<>();
        String[] lottoNumbersBeforeValidate = input.split(",");

        for(int lottoIndex = 0; lottoIndex < numbersOfLotto; lottoIndex++){
            lottoNumbers.add(validateLottoNumbers(lottoNumbersBeforeValidate[lottoIndex]));
        }
        return lottoNumbers;
    }

    private void validateMoney(int money){
        if(money % moneyOfOneTicket != 0){
            throw new IllegalArgumentException("[ERROR] 로또는 1,000원 단위로 구입할 수 있습니다.\n");
        }
    }

    private int validateLottoNumbers(String lottoNumberInput){
        try{
            return Integer.parseInt(lottoNumberInput);
        }catch(NumberFormatException ex){
            throw new IllegalArgumentException("[ERROR] 콤마(,) 와 정수 이외의 다른 값을 당첨 값 입력할 수 없습니다.\n");
        }
    }
}

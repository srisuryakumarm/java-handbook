package modernjava;

import java.util.ArrayList;
import java.util.List;

public class ValidatorExecutor{
    public static void main(String[] args){
        Validator<String> stringValidator = value -> value != null && !value.isBlank();
        Validator<Integer> integerValidator = value -> value != null && value > 0;

        List<String> words = List.of("Functional Interfaces", " ", "", "Lambda");
        List<Integer> numbers = List.of(10, 20, 30);

        System.out.println(isValid(words, stringValidator));
        System.out.println(isValid(numbers, integerValidator));
    }

    public static <T> List<T> isValid(List<T> list, Validator<T> validator){
        List<T> result = new ArrayList<>();
        for(T value: list){
            if(validator.isValid(value)){
                result.add(value);
            }
        }
        return result;
    }
}
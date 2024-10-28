package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.util.Direction;

class CarTest {

    private final Car car = new Car();
    private final Car testCar = new Car("testCar");

    @Test
    @DisplayName("경주 자동차 이름 입력 중 영어가 아닌 다른 문자가 포함된 경우 IllegalArgumentException")
    void 자동차_이름_입력에_미지원언어가_포함된_경우() {
        Assertions.assertThatThrownBy(() ->
                        car.splitByDelimiter("happy,for허")
                )
                .isInstanceOf(IllegalArgumentException.class);

        Assertions.assertThatThrownBy(() ->
                        car.splitByDelimiter("happy,for\n")
                )
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("경주 자동차 이름 입력 중 맨_앞뒤에_공백이_포함된_경우 IllegalArgumentException")
    void 자동차_이름_맨_앞뒤에_공백이_포함된_경우() {
        Assertions.assertThatThrownBy(() ->
                        car.splitByDelimiter(" happy,for ")
                )
                .isInstanceOf(IllegalArgumentException.class);

        Assertions.assertThatThrownBy(() ->
                        car.splitByDelimiter(" happy,for ")
                )
                .isInstanceOf(IllegalArgumentException.class);
    }


    @Test
    @DisplayName("자동차 이름이 5글자 이하인 경우 이름 리스트 반환")
    void 이름_수_제한_통과_테스트() {
        Assertions.assertThat(car.splitByDelimiter("four,fivee"))
                .hasSize(2)
                .extracting(Car::getName)
                .contains("four", "fivee");
    }

    @Test
    @DisplayName("자동차 이름이 5글자 초과인 경우 IllegalException 반환")
    void 이름_수_제한_초과_테스트() {
        Assertions.assertThatThrownBy(() -> {
            car.splitByDelimiter("forky,eundeang");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("자동차는 전진 상태일때 자신의 이동 현황에 -를 추가한다.")
    void 전진_상태_일때_저장값_검증_테스트() {
        testCar.moveToOrientedDirection(Direction.FORWARD);
        Assertions.assertThat(testCar.getMoveStatus())
                .isEqualTo("-");
    }

}

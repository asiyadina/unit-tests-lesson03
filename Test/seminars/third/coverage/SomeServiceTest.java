package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
class SomeServiceTest {
        private SomeService someService;

        @BeforeEach
        void setUp() {
            someService = new SomeService();
        }

//        @Test
//        void testReturnFizz(){
//            assertThat(someService.fizzBuzz(3)).isEqualTo("Fizz");
//    }
//         @Test
//         void testReturnBuzz(){
//            assertThat(someService.fizzBuzz(5)).isEqualTo("Buzz");
//    }
//        @Test
//        void testReturnFizzBuzz(){
//            assertThat(someService.fizzBuzz(15)).isEqualTo("FizzBuzz");
//    }
//    @Test
//    void testReturnEcho(){
//        assertThat(someService.fizzBuzz(14)).isEqualTo(""+14);
//
//    }
//
//
//
//
//    @Test
//    void firstSixElement(){
//        assertTrue(someService.firstLast6(new int[]{6,1,2,3}));
//    }
//    @Test
//    void LastSixElement(){
//        assertTrue(someService.firstLast6(new int[]{1,2,3,6}));
//    }
//    @Test
//    void firstLastNoSixElement(){
//        assertFalse(someService.firstLast6(new int[]{1,2,3}));
//    }
//    @Test
//    void luckySumA(){
//            assertThat(someService.luckySum(13,2,3)).isEqualTo(5);
//    }
//    @Test
//    void luckySumB(){
//        assertThat(someService.luckySum(2,13,3)).isEqualTo(5);
//    }
//    @Test
//    void luckySumC(){
//        assertThat(someService.luckySum(3,2,13)).isEqualTo(5);
//    }
//    @Test
//    void luckySumNot13(){
//        assertThat(someService.luckySum(1,2,3)).isEqualTo(6);
//    }
//
//
//
//
//    }
//    @Test
//    void  evenOddNumber(){
//        @Test
//        void  evenOddNumber   firstSixElement(){
//            assertTrue(someService.firstLast6(new int[]{6,1,2,3}));
//        }
//        @Test
//        void  evenOddNumber   LastSixElement(){
//            assertTrue(someService.firstLast6(new int[]{1,2,3,6}));
//        }
//        @Test
//        void  evenOddNumber   firstLastNoSixElement(){
//            assertFalse(someService.firstLast6(new int[]{1,2,3}));
//        }
//
//
//
////   // домашка 3.3
//   @Test
//   void insufficientCoverageTest(){
//
//       System.out.println(someService.calculatingDiscount(2000.0, 10));
//       assertThat(someService.calculatingDiscount(2000.0, 50))
//               .isEqualTo(1000); // обычная скидка
//       assertThat(someService.calculatingDiscount(2000.0, 100))
//               .isEqualTo(0); // обычная скидка
//       assertThat(someService.calculatingDiscount(2000.0, 0))
//               .isEqualTo(2000); // обычная скидка
//
//
//       assertThatThrownBy(() ->
//               someService.calculatingDiscount(2000.0, 110))
//               .isInstanceOf(ArithmeticException.class)
//               .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки больше 100%
//
//       assertThatThrownBy(() ->
//               someService.calculatingDiscount(2000.0, -10))
//               .isInstanceOf(ArithmeticException.class)
//               .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки меньше 0
//
//   }
//
//
//
//}
//
//    @Test
//    void calculatingDiscount() {
//            assertThatThrownBy(() ->
//            Calculator.calculatingDiscount(-1000, 50))
//            .isInstanceOf(ArithmeticException.class)
//                .hasMessage("Сумма покупки не может быть отрицательной");
//
//    assertThatThrownBy(() ->
//            Calculator.calculatingDiscount(1000, -10))
//            .isInstanceOf(ArithmeticException.class)
//                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
//
//    assertThatThrownBy(() ->
//            Calculator.calculatingDiscount(1000, 101))
//            .isInstanceOf(ArithmeticException.class)
//                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
//
//    assertThat(Calculator.calculatingDiscount(1000, 25)).isEqualTo(750);
//    assertThat(Calculator.calculatingDiscount(1000, 100)).isEqualTo(0);
//    assertThat(Calculator.calculatingDiscount(1000, 0)).isEqualTo(1000);
//}


    }
    public class OddEvenTest {

        @Test
        public void testEvenNum() {
            OddEven oddEven = new OddEven();
            assertTrue(oddEven.evenNum(6));
            assertFalse(oddEven.evenNum(5));

    }
